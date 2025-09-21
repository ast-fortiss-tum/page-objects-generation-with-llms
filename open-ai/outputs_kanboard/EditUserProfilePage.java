```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserProfilePage {

    public WebDriver driver;

    @FindBy(id = "form-username")
    private WebElement usernameInput;

    @FindBy(id = "form-name")
    private WebElement nameInput;

    @FindBy(id = "form-email")
    private WebElement emailInput;

    @FindBy(id = "form-timezone")
    private WebElement timezoneSelect;

    @FindBy(id = "form-language")
    private WebElement languageSelect;

    @FindBy(id = "form-filter")
    private WebElement filterInput;

    @FindBy(id = "form-role")
    private WebElement roleSelect;

    @FindBy(css = "button.btn.btn-blue")
    private WebElement saveButton;

    public EditUserProfilePage(WebDriver driver) {
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

    public void selectRole(String role) {
        roleSelect.sendKeys(role);
    }

    public SummaryPage clickSaveButton() {
        saveButton.click();
        return new SummaryPage(driver);
    }
}
```

This Java class represents a Selenium Page Object Model for the "Edit User Profile" page. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The `clickSaveButton` method assumes that clicking the "Save" button navigates to a `SummaryPage`, which is a separate POM class.