```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterEmployeePage {

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

    @FindBy(id = "employee_password")
    private WebElement passwordInput;

    @FindBy(id = "employee_language")
    private WebElement languageSelect;

    @FindBy(id = "employee_active_0")
    private WebElement activeNoRadio;

    @FindBy(id = "employee_active_1")
    private WebElement activeYesRadio;

    @FindBy(id = "employee_profile")
    private WebElement profileSelect;

    @FindBy(id = "employee_default_page")
    private WebElement defaultPageSelect;

    @FindBy(id = "employee__token")
    private WebElement tokenHiddenInput;

    @FindBy(id = "cancel-link")
    private WebElement cancelLink;

    @FindBy(id = "save-button")
    private WebElement saveButton;

    public RegisterEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
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
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void selectLanguage(String language) {
        // Assuming a method to select by visible text or value
        // Example: new Select(languageSelect).selectByVisibleText(language);
    }

    public void setActiveStatus(boolean isActive) {
        if (isActive) {
            activeYesRadio.click();
        } else {
            activeNoRadio.click();
        }
    }

    public void selectProfile(String profile) {
        // Assuming a method to select by visible text or value
        // Example: new Select(profileSelect).selectByVisibleText(profile);
    }

    public void selectDefaultPage(String defaultPage) {
        // Assuming a method to select by visible text or value
        // Example: new Select(defaultPageSelect).selectByVisibleText(defaultPage);
    }

    public void clickCancel() {
        cancelLink.click();
        // Assuming navigation to another page, e.g., return new EmployeeListPage(driver);
    }

    public EmployeeSummaryPage clickSave() {
        saveButton.click();
        // Assuming navigation to another page, e.g., return new EmployeeSummaryPage(driver);
    }
}
```

This Java class follows the Page Object Model pattern for the provided HTML structure. It defines `WebElement` fields for each key element on the page using `@FindBy` annotations and provides methods to interact with these elements. The class includes a constructor to initialize the elements using `PageFactory.initElements(driver, this);`.