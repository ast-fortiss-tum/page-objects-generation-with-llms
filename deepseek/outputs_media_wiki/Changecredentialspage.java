Here's the `Changecredentialspage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Changecredentialspage {
    public WebDriver driver;

    // Form elements
    @FindBy(id = "ooui-php-1")
    private WebElement newPasswordInput;

    @FindBy(id = "ooui-php-2")
    private WebElement retypePasswordInput;

    @FindBy(id = "ooui-php-3")
    private WebElement usernameInput;

    @FindBy(id = "change_credentials_submit")
    private WebElement changeCredentialsButton;

    @FindBy(css = ".mw-htmlform-submit-buttons a[href*='Main_Page']")
    private WebElement cancelButton;

    // Error message elements (assuming they might appear)
    @FindBy(css = ".oo-ui-flaggedElement-invalid .oo-ui-inputWidget-input")
    private WebElement invalidInputError;

    public Changecredentialspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void enterNewPassword(String password) {
        newPasswordInput.clear();
        newPasswordInput.sendKeys(password);
    }

    public void enterRetypePassword(String password) {
        retypePasswordInput.clear();
        retypePasswordInput.sendKeys(password);
    }

    public String getUsername() {
        return usernameInput.getAttribute("value");
    }

    public void clickChangeCredentials() {
        changeCredentialsButton.click();
    }

    public void clickCancel() {
        cancelButton.click();
    }

    // Error message method
    public String getErrorMessage() {
        return invalidInputError.getAttribute("validationMessage");
    }
}
```

Notes about the implementation:
1. The class name and filename match exactly as `Changecredentialspage`.
2. All required fields are included with `@FindBy` annotations.
3. Field names are generic and structural (e.g., `newPasswordInput`, `retypePasswordInput`).
4. Interaction methods are provided for all key actions.
5. The constructor includes the required `PageFactory.initElements` call.
6. An error message method is included since there's an invalid input indicator in the HTML.
7. Methods that don't cause navigation return `void`, while those that might navigate would return appropriate POM classes (though none are shown in the HTML).
8. All naming follows camelCase convention.

The implementation assumes that clicking the change credentials button might navigate to another page, but since we don't know the target page from the given HTML, the method returns void. In a real implementation, you would replace void with the appropriate page object return type if known.