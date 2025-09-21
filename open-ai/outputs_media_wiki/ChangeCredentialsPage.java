```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeCredentialsPage {

    public WebDriver driver;

    @FindBy(id = "ooui-php-1")
    private WebElement newPasswordInput;

    @FindBy(id = "ooui-php-2")
    private WebElement retypePasswordInput;

    @FindBy(id = "ooui-php-3")
    private WebElement usernameInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement changeCredentialsButton;

    @FindBy(xpath = "//a[@href='/index.php/Main_Page']")
    private WebElement cancelButton;

    public ChangeCredentialsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

    public NextPage clickChangeCredentialsButton() {
        changeCredentialsButton.click();
        return new NextPage(driver); // Assume NextPage is the next page class
    }

    public MainPage clickCancelButton() {
        cancelButton.click();
        return new MainPage(driver); // Assume MainPage is the main page class
    }
}
```

In this code, I've created a `ChangeCredentialsPage` class following the Page Object Model pattern. The class includes WebElements for the new password input, retype password input, username input, change credentials button, and cancel button. Interaction methods are provided to enter passwords, retrieve the username, and click the buttons, with appropriate return types for navigation actions.