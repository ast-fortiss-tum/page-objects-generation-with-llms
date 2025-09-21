```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {

    public WebDriver driver;

    @FindBy(id = "jsnew_username")
    private WebElement usernameInputField;

    @FindBy(id = "jsnew_password")
    private WebElement passwordInputField;

    @FindBy(id = "jsconfirm_password")
    private WebElement confirmPasswordInputField;

    @FindBy(id = "jsrole")
    private WebElement roleDropdown;

    @FindBy(id = "jsemail")
    private WebElement emailInputField;

    @FindBy(name = "save")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@href='/admin/users']")
    private WebElement cancelButton;

    public Adduserpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInputField.clear();
        confirmPasswordInputField.sendKeys(confirmPassword);
    }

    public void selectRole(String role) {
        roleDropdown.sendKeys(role);
    }

    public void enterEmail(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }
}
```

This Java class, `Adduserpage`, is a Selenium Page Object Model (POM) representation of the HTML form provided. It includes WebElement fields for each interactive element on the page, such as input fields, buttons, and a dropdown. The class also provides methods to interact with these elements, such as entering text, selecting options, and clicking buttons. The constructor initializes the elements using the `PageFactory.initElements` method.