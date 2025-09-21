```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaLogin {

    public WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailInputField;

    @FindBy(id = "passwd")
    private WebElement passwordInputField;

    @FindBy(id = "submit_login")
    private WebElement passwordInputField;

    @FindBy(id = "stay_logged_in")
    private WebElement stayLoggedInCheckbox;

    @FindBy(id = "forgot-password-link")
    private WebElement forgotPasswordLink;

    public PrestaLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public DashboardPage clickLoginButton() {
        loginButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new DashboardPage(driver); // Uncomment and replace with actual class
    }

    public void toggleStayLoggedInCheckbox() {
        stayLoggedInCheckbox.click();
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new ForgotPasswordPage(driver); // Uncomment and replace with actual class
    }
}
```

### Explanation:
- **Web Elements**: Defined using `@FindBy` annotations for each key element in the HTML.
- **Constructor**: Initializes the elements using `PageFactory.initElements(driver, this);`.
- **Interaction Methods**: Created methods for interacting with the elements, such as entering text, clicking buttons, and toggling checkboxes.
- **Navigation**: Placeholder comments are included for returning new page objects after navigation actions, assuming those classes exist.