```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRightsPage {

    public WebDriver driver;

    // Constructor
    public UserRightsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements for the first form
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@value='Load user groups']")
    private WebElement loadUserGroupsButton;

    // WebElements for the second form
    @FindBy(id = "wpGroup-bot")
    private WebElement botCheckbox;

    @FindBy(id = "wpGroup-sysop")
    private WebElement sysopCheckbox;

    @FindBy(id = "wpGroup-interface-admin")
    private WebElement interfaceAdminCheckbox;

    @FindBy(id = "wpGroup-bureaucrat")
    private WebElement bureaucratCheckbox;

    @FindBy(id = "wpGroup-suppress")
    private WebElement suppressCheckbox;

    @FindBy(id = "wpGroup-push-subscription-manager")
    private WebElement pushSubscriptionManagerCheckbox;

    @FindBy(id = "wpReason")
    private WebElement reasonInput;

    @FindBy(xpath = "//input[@value='Save user groups']")
    private WebElement saveUserGroupsButton;

    // WebElement for warning message
    @FindBy(className = "mw-warning-logempty")
    private WebElement warningLogEmpty;

    // Methods to interact with the elements

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void clickLoadUserGroupsButton() {
        loadUserGroupsButton.click();
    }

    public void toggleBotCheckbox() {
        botCheckbox.click();
    }

    public void toggleSysopCheckbox() {
        sysopCheckbox.click();
    }

    public void toggleInterfaceAdminCheckbox() {
        interfaceAdminCheckbox.click();
    }

    public void toggleBureaucratCheckbox() {
        bureaucratCheckbox.click();
    }

    public void toggleSuppressCheckbox() {
        suppressCheckbox.click();
    }

    public void togglePushSubscriptionManagerCheckbox() {
        pushSubscriptionManagerCheckbox.click();
    }

    public void enterReason(String reason) {
        reasonInput.clear();
        reasonInput.sendKeys(reason);
    }

    public void clickSaveUserGroupsButton() {
        saveUserGroupsButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new AnotherPage(driver);
    }

    public String getWarningMessage() {
        return warningLogEmpty.getText();
    }
}
```

This Java class represents a Selenium Page Object Model for the User Rights page. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The class includes a constructor to initialize the elements using `PageFactory`.