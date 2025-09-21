Here's the `Adduserpage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adduserpage {
    public WebDriver driver;

    // Form elements
    @FindBy(id = "jsnew_username")
    private WebElement usernameInput;

    @FindBy(id = "jsnew_password")
    private WebElement passwordInput;

    @FindBy(id = "jsconfirm_password")
    private WebElement confirmPasswordInput;

    @FindBy(id = "jsrole")
    private WebElement roleSelect;

    @FindBy(id = "jsemail")
    private WebElement emailInput;

    // Buttons
    @FindBy(name = "save")
    private WebElement saveButton;

    @FindBy(linkText = "Cancel")
    private WebElement cancelLink;

    // Constructor
    public Adduserpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods for form fields
    public void setUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void setConfirmPassword(String password) {
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(password);
    }

    public void selectRole(String role) {
        roleSelect.sendKeys(role);
    }

    public void setEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    // Navigation methods
    public void clickSave() {
        saveButton.click();
    }

    public void clickCancel() {
        cancelLink.click();
    }
}
```

Notes about the implementation:
1. The class name and filename match exactly as `Adduserpage`.
2. All WebElements are defined using `@FindBy` annotations with structural names.
3. The constructor includes the required `PageFactory.initElements` call.
4. Interaction methods are provided for all form fields (void return type).
5. Navigation methods are provided for buttons/links (void return type as we don't know the target pages).
6. No error message elements were found in the HTML, so no error-related methods were created.
7. All naming follows camelCase convention.
8. Only the elements present in the provided HTML are included.