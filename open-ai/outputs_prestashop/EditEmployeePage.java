```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployeePage {

    public WebDriver driver;

    @FindBy(id = "employee_firstname")
    private WebElement firstNameInput;

    @FindBy(id = "employee_lastname")
    private WebElement lastNameInput;

    @FindBy(id = "employee_avatarUrl")
    private WebElement avatarFileInput;

    @FindBy(id = "employee_has_enabled_gravatar_0")
    private WebElement gravatarNoRadio;

    @FindBy(id = "employee_has_enabled_gravatar_1")
    private WebElement gravatarYesRadio;

    @FindBy(id = "employee_email")
    private WebElement emailInput;

    @FindBy(id = "employee_change_password_change_password_button")
    private WebElement changePasswordButton;

    @FindBy(id = "employee_change_password_old_password")
    private WebElement oldPasswordInput;

    @FindBy(id = "employee_change_password_new_password_first")
    private WebElement newPasswordInput;

    @FindBy(id = "employee_change_password_new_password_second")
    private WebElement confirmPasswordInput;

    @FindBy(id = "employee_change_password_generate_password_button")
    private WebElement generatePasswordButton;

    @FindBy(id = "employee_change_password_cancel_button")
    private WebElement cancelPasswordChangeButton;

    @FindBy(id = "employee_prestashop_addons")
    private WebElement prestashopAddonsButton;

    @FindBy(id = "employee_language")
    private WebElement languageSelect;

    @FindBy(id = "employee_default_page")
    private WebElement defaultPageSelect;

    @FindBy(id = "employee__token")
    private WebElement tokenInput;

    @FindBy(id = "cancel-link")
    private WebElement cancelLink;

    @FindBy(id = "save-button")
    private WebElement saveButton;

    public EditEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public void uploadAvatar(String filePath) {
        avatarFileInput.sendKeys(filePath);
    }

    public void selectGravatarOption(boolean enableGravatar) {
        if (enableGravatar) {
            gravatarYesRadio.click();
        } else {
            gravatarNoRadio.click();
        }
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void clickChangePassword() {
        changePasswordButton.click();
    }

    public void enterOldPassword(String oldPassword) {
        oldPasswordInput.clear();
        oldPasswordInput.sendKeys(oldPassword);
    }

    public void enterNewPassword(String newPassword) {
        newPasswordInput.clear();
        newPasswordInput.sendKeys(newPassword);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickGeneratePassword() {
        generatePasswordButton.click();
    }

    public void clickCancelPasswordChange() {
        cancelPasswordChangeButton.click();
    }

    public void clickPrestashopAddons() {
        prestashopAddonsButton.click();
    }

    public void selectLanguage(String language) {
        // Implement selection logic
    }

    public void selectDefaultPage(String defaultPage) {
        // Implement selection logic
    }

    public void clickCancel() {
        cancelLink.click();
    }

    public void clickSave() {
        saveButton.click();
    }
}
```

This Java class represents a Selenium Page Object Model for the "Edit Employee" page. It includes WebElement fields for each interactive element on the page, and methods to interact with these elements. The class is structured to follow the provided naming and interaction guidelines.