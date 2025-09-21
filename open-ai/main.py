from openai import OpenAI
import os
from bs4 import BeautifulSoup
import re

client = OpenAI(api_key="KEY")


def read_html_from_file(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.read()


def to_pascal_case(s):
    return ''.join(word.capitalize() for word in re.split(r'[\W_]+', s) if word)


def generate_pom_code_with_open_ai(html_content, class_name):
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

    response = client.chat.completions.create(
        model="gpt-4o",
        messages=[
            {"role": "system", "content": "You are a helpful assistant."},
            {"role": "user", "content": prompt}
        ],
        temperature=0.1
    )

    return response.choices[0].message.content.strip()


def save_java_class(file_name, java_code, output_folder):
    output_path = os.path.join(output_folder, f"{file_name}.java")
    with open(output_path, 'w', encoding='utf-8') as file:
        file.write(java_code)
    print(f"✅ Saved {file_name}.java to {output_folder}")


def extract_class_name(file_name):
    base_name = os.path.splitext(os.path.basename(file_name))[0]
    return to_pascal_case(base_name)


def process_html_folder(input_folder, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    for file_name in os.listdir(input_folder):
        if file_name.endswith('.html'):
            html_file_path = os.path.join(input_folder, file_name)
            print(f"🔍 Processing {file_name}...")

            html_content = read_html_from_file(html_file_path)
            class_name = extract_class_name(file_name)
            java_code = generate_pom_code_with_open_ai(html_content, class_name)
            save_java_class(class_name, java_code, output_folder)


if __name__ == "__main__":
    input_folder = './inputs_prestashop'
    output_folder = './outputs_prestashop'

    process_html_folder(input_folder, output_folder)
