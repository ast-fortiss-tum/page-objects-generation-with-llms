import os
import json
from openai import OpenAI

# Initialize client
client = OpenAI(api_key="KEY")  # Replace with your actual API key


# Reads HTML content
def read_file_content(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.read()


# Builds class name from file name (e.g. state10.html -> State10Page)
def get_class_name_from_filename(file_name):
    base = os.path.splitext(file_name)[0]
    return ''.join(word.capitalize() for word in base.split('_')) + "Page"


def build_prompt(html_content, relations_json, class_name):
    prompt = f"""
    You are generating Selenium Page Object Model (POM) classes in Java for a multi-page web application.

    Each HTML file represents a separate page, and each associated JSON file describes that page’s interactive navigation elements (e.g., buttons or links and their destination pages).
    
    For each HTML + JSON pair:
    1. Generate a Java class named `{class_name}`, using PascalCase and the base of the HTML filename (e.g., `state3.html` → `State3Page.java`).
    2. Define all key elements (input fields, forms, buttons, navigation links) as `WebElement` fields with `@FindBy` annotations.
    3. Add interaction methods that:
       - Perform actions like clicking or sending keys
       - If an interaction leads to another page (as described in the JSON), return the appropriate POM class (e.g., `clickLogin()` returning `State10Page`).
    4. Use camelCase for field and method names.
    5. Add a constructor with `PageFactory.initElements(driver, this);`
    6. If any outbound navigation is present in the JSON, assume the target POM class exists and return it from the relevant method.
    7. You do not need to generate the target page classes unless specifically requested.
    8. Assume this class represents the source page (not the targets of navigation).
    
    ### HTML:
    {html_content}
    
    ### Relations JSON (describes elements that navigate FROM this page to others):
    {relations_json if relations_json else 'None'}
    """
    return prompt


# Calls OpenAI to generate Java POM code
def generate_pom_code(html_content, relations_json, class_name):
    prompt = build_prompt(html_content, relations_json, class_name)
    response = client.chat.completions.create(
        model="gpt-4o",
        messages=[
            {"role": "system", "content": "You are a helpful assistant."},
            {"role": "user", "content": prompt}
        ],
        temperature=0.1,
    )
    return response.choices[0].message.content.strip()


# Saves Java class to output folder
def save_java_class(class_name, java_code, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    output_path = os.path.join(output_folder, f"{class_name}.java")
    with open(output_path, 'w', encoding='utf-8') as f:
        f.write(java_code)
    print(f"✅ Saved {class_name}.java")


# Main loop
def process_files(input_html_folder, input_json_folder, output_folder):
    for file in os.listdir(input_html_folder):
        if file.endswith(".html"):
            base_name = os.path.splitext(file)[0]
            html_path = os.path.join(input_html_folder, file)
            json_path = os.path.join(input_json_folder, f"{base_name}.json")

            print(f"\n🔍 Processing: {file}")
            html_content = read_file_content(html_path)

            relations_json = None
            if os.path.exists(json_path):
                relations_json = read_file_content(json_path)

            try:
                class_name = get_class_name_from_filename(file)
                java_code = generate_pom_code(html_content, relations_json, class_name)
                save_java_class(class_name, java_code, output_folder)
            except Exception as e:
                print(f"❌ Failed to process {file}: {e}")


# Entry point
if __name__ == "__main__":
    process_files(
        input_html_folder="./inputs/html",
        input_json_folder="./inputs/json",
        output_folder="./outputs_with_relations_given"
    )
