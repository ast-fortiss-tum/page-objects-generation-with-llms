```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    @FindBy(id = "form-username")
    private WebElement usernameInput;

    @FindBy(id = "form-password")
    private WebElement passwordInput;

    @FindBy(name = "remember_me")
    private WebElement rememberMeCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@href='/forgot-password']")
    private WebElement forgotPasswordLink;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void toggleRememberMe() {
        rememberMeCheckbox.click();
    }

    public HomePage clickSignInButton() {
        signInButton.click();
        return new HomePage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        forgotPasswordLink.click();
        return new ForgotPasswordPage(driver);
    }
}
```

### Explanation:
- **WebDriver Field**: The `driver` field is declared as instructed.
- **WebElement Fields**: Each key element in the HTML is defined as a `WebElement` with `@FindBy` annotations.
- **Constructor**: Initializes the elements using `PageFactory.initElements(driver, this);`.
- **Interaction Methods**:
  - `enterUsername(String username)`: Clears and types into the username input field.
  - `enterPassword(String password)`: Clears and types into the password input field.
  - `toggleRememberMe()`: Clicks the remember me checkbox.
  - `clickSignInButton()`: Clicks the sign-in button and returns a new `HomePage` object.
  - `clickForgotPasswordLink()`: Clicks the forgot password link and returns a new `ForgotPasswordPage` object.
- **Navigation**: Clicking the sign-in button or forgot password link returns a new page object, assuming those classes exist.