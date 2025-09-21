```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserPage {

    public WebDriver driver;

    @FindBy(id = "modal-close-button")
    private WebElement closeButton;

    @FindBy(id = "form-username")
    private WebElement usernameInput;

    @FindBy(id = "form-name")
    private WebElement nameInput;

    @FindBy(id = "form-email")
    private WebElement emailInput;

    @FindBy(name = "is_ldap_user")
    private WebElement remoteUserCheckbox;

    @FindBy(id = "form-password")
    private WebElement passwordInput;

    @FindBy(id = "form-confirmation")
    private WebElement confirmationInput;

    @FindBy(id = "form-role")
    private WebElement roleSelect;

    @FindBy(name = "disable_login_form")
    private WebElement disableLoginFormCheckbox;

    @FindBy(id = "form-timezone")
    private WebElement timezoneSelect;

    @FindBy(id = "form-language")
    private WebElement languageSelect;

    @FindBy(id = "form-filter")
    private WebElement filterInput;

    @FindBy(name = "notifications_enabled")
    private WebElement notificationsEnabledCheckbox;

    @FindBy(id = "form-project_id")
    private WebElement projectSelect;

    @FindBy(css = "button.btn.btn-blue")
    private WebElement saveButton;

    @FindBy(linkText = "cancel")
    private WebElement cancelLink;

    public NewUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void enterConfirmation(String confirmation) {
        confirmationInput.clear();
        confirmationInput.sendKeys(confirmation);
    }

    public void selectRole(String role) {
        roleSelect.sendKeys(role);
    }

    public void selectTimezone(String timezone) {
        timezoneSelect.sendKeys(timezone);
    }

    public void selectLanguage(String language) {
        languageSelect.sendKeys(language);
    }

    public void enterFilter(String filter) {
        filterInput.clear();
        filterInput.sendKeys(filter);
    }

    public void toggleRemoteUserCheckbox() {
        remoteUserCheckbox.click();
    }

    public void toggleDisableLoginFormCheckbox() {
        disableLoginFormCheckbox.click();
    }

    public void toggleNotificationsEnabledCheckbox() {
        notificationsEnabledCheckbox.click();
    }

    public void selectProject(String project) {
        projectSelect.sendKeys(project);
    }

    public SummaryPage clickSaveButton() {
        saveButton.click();
        return new SummaryPage(driver);
    }

    public void clickCancelLink() {
        cancelLink.click();
    }
}
```

This Java class represents a Selenium Page Object Model for the "New User" page. It includes WebElement fields for each interactive element on the page, such as input fields, checkboxes, and buttons. The class provides methods to interact with these elements, such as entering text, selecting options, and clicking buttons. The `clickSaveButton` method assumes navigation to a `SummaryPage`, which should be another POM class.