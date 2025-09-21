import requests
import os
from bs4 import BeautifulSoup
import re

# Load DeepSeek API key from environment variables
DEEPSEEK_API_KEY = "DEEPSEEK_API_KEY"
DEEPSEEK_API_URL = "https://api.deepseek.com/v1/chat/completions"

# Function to read the HTML file from the specified folder
def read_html_from_file(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.read()


def generate_pom_code_with_deepseek(html_content, class_name):
    prompt = f"""
    You are generating a Selenium Page Object Model (POM) class in Java for a web application.
    
    ### File Naming Rules:
    - The Java class must be named **exactly**: {class_name}
        - This name must be used:
            - As the Java **filename** (`{class_name}.java`) **(must match exactly)**
            - As the Java **class name** (`public class {class_name}`) **(must match exactly)**
        - Do not infer or modify the class name based on page content.
    
    ### Generation Instructions:
    1. You must define all key elements (inputs, buttons, links, text fields, etc.) as `WebElement` fields using `@FindBy` annotations.
    2. At the top of the class, you must include this field:
        `public WebDriver driver;`
    3. You must use **only generic, structural field names**, based on structure or position:
        - Examples: `firstButton`, `mainInputField`, `headerLabel`, `secondaryLink`
        - You must **not** use domain-specific terms like "product", "cart", "price", etc.
    4. If multiple similar elements are present (like multiple buttons or links), you should use **ordinal names**: `firstButton`, `secondButton`, etc. (optional unless needed for clarity).
    5. You must use **camelCase** for all field and method names.
    6. Create interaction methods that:
        - Perform actions like clicking, typing, or retrieving text.
        - If clicking an element clearly leads to another page (e.g., a link, a save button after form submission), **the method must return the appropriate POM class** (assume it already exists).
            - Example: after clicking a save button, return `new ProjectSummaryPage(driver);`
        - If the action does not cause page navigation (typing into inputs, basic clicks), the method must return `void` or the appropriate text (`String`) if retrieving values.
    7. You must add a constructor with:
        `PageFactory.initElements(driver, this);`
    8. You must not generate any other classes unless explicitly instructed.
    9. You must only use information available in the provided HTML — do not assume additional logic or elements.
    
    ### Error Message Handling Rules:
    - If the HTML contains elements indicating errors, validation messages, or warnings (e.g., classes or IDs like `error`, `form-errors`, `validation-error`, `alert-danger`):
        - You must create a `WebElement` field for each error message.
        - You must create a method named `getErrorMessage()` that returns the visible error text (`element.getText()`).
        - If multiple error messages exist, you must create methods like `getFirstErrorMessage()`, `getSecondErrorMessage()`, etc., or alternatively return a list of error texts if appropriate.

    ### HTML Content:
    {html_content}
        """

    headers = {
        "Authorization": f"Bearer {DEEPSEEK_API_KEY}",
        "Content-Type": "application/json"
    }

    payload = {
        "model": "deepseek-coder",
        "messages": [
            {"role": "system", "content": "You are a helpful AI assistant."},
            {"role": "user", "content": prompt}
        ],
        "max_tokens": 1500,
        "temperature": 0.1
    }

    response = requests.post(DEEPSEEK_API_URL, headers=headers, json=payload)
    response_json = response.json()

    return response_json["choices"][0]["message"]["content"].strip()


# Function to save the generated Java POM class to a file
def save_java_class(file_name, java_code, output_folder):
    output_path = os.path.join(output_folder, f"{file_name}.java")
    with open(output_path, 'w', encoding='utf-8') as file:
        file.write(java_code)
    print(f"Saved {file_name}.java to {output_folder}")

def to_pascal_case(s):
    return ''.join(word.capitalize() for word in re.split(r'[\W_]+', s) if word)



# Function to extract the name of the class based on HTML file name
def extract_class_name(file_name):
    base_name = os.path.basename(file_name)
    class_name = os.path.splitext(base_name)[0]  # Remove file extension
    return to_pascal_case(class_name)  # Ensure the class name starts with a capital letter


# Function to process the HTML files in the folder and generate POM classes
def process_html_folder(input_folder, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    for file_name in os.listdir(input_folder):
        if file_name.endswith('.html'):
            html_file_path = os.path.join(input_folder, file_name)
            html_content = read_html_from_file(html_file_path)
            class_name = extract_class_name(file_name)

            # Generate the POM class using DeepSeek API
            java_code = generate_pom_code_with_deepseek(html_content, class_name)

            # Save the generated Java code as a class file
            save_java_class(class_name, java_code, output_folder)


# Main entry point
if __name__ == "__main__":
    input_folder = './inputs_prestashop'  # Change to your folder containing HTML files
    output_folder = './outputs_prestashop'  # Change to your desired output folder

    # Process the HTML files and generate the POM classes
    process_html_folder(input_folder, output_folder)
