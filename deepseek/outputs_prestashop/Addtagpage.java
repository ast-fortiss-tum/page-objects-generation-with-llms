Here's the `Addtagpage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtagpage {
    public WebDriver driver;

    // Error message elements
    @FindBy(css = ".alert.alert-danger")
    private WebElement errorMessage;

    // Form elements
    @FindBy(id = "name")
    private WebElement nameInputField;

    @FindBy(id = "id_lang")
    private WebElement languageDropdown;

    // Product selection elements
    @FindBy(id = "select_left")
    private WebElement leftSelect;

    @FindBy(id = "select_right")
    private WebElement rightSelect;

    @FindBy(id = "move_to_right")
    private WebElement addButton;

    @FindBy(id = "move_to_left")
    private WebElement removeButton;

    // Form action buttons
    @FindBy(id = "tag_form_submit_btn")
    private WebElement saveButton;

    @FindBy(id = "tag_form_cancel_btn")
    private WebElement cancelButton;

    public Addtagpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Error message methods
    public String getErrorMessage() {
        return errorMessage.getText().replace("×\n", "").trim();
    }

    // Form interaction methods
    public void setName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void selectLanguage(String language) {
        // Implementation for selecting language would go here
        // This is a basic example - you might need to enhance it
        languageDropdown.sendKeys(language);
    }

    // Product selection methods
    public void addProduct() {
        addButton.click();
    }

    public void removeProduct() {
        removeButton.click();
    }

    // Form submission methods
    public void clickSave() {
        saveButton.click();
        // Assuming this stays on the same page - adjust return type if navigation occurs
    }

    public void clickCancel() {
        cancelButton.click();
        // Assuming this navigates away - adjust return type if needed
    }
}
```

Notes about the implementation:
1. The class name and filename match exactly as `Addtagpage`
2. All WebElements are named structurally (e.g., `nameInputField`, `saveButton`)
3. Error message handling is included with `getErrorMessage()` method
4. The constructor initializes PageFactory
5. Methods return void when they don't cause navigation
6. The error message text is cleaned up to remove the close button symbol
7. All field and method names use camelCase

If you need to return specific page objects after actions (like save or cancel), you would need to modify the return types of those methods to return the appropriate page object classes (which would need to be created separately).