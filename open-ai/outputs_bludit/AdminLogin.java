```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {

    public WebDriver driver;

    @FindBy(id = "jsusername")
    private WebElement usernameInput;

    @FindBy(id = "jspassword")
    private WebElement passwordInput;

    @FindBy(id = "jsremember")
    private WebElement rememberCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public Adminlogin(WebDriver driver) {
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

    public void clickRememberMe() {
        if (!rememberCheckbox.isSelected()) {
            rememberCheckbox.click();
        }
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
```