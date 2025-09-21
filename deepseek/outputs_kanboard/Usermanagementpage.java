Here's the `Usermanagementpage.java` file following all the specified rules:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Usermanagementpage {
    public WebDriver driver;

    // Header links
    @FindBy(linkText = "New user")
    private WebElement newUserLink;

    @FindBy(linkText = "Invite people")
    private WebElement invitePeopleLink;

    @FindBy(linkText = "Import")
    private WebElement importLink;

    @FindBy(linkText = "View all groups")
    private WebElement viewAllGroupsLink;

    // Search elements
    @FindBy(id = "form-search")
    private WebElement searchInputField;

    // Sort dropdown elements
    @FindBy(css = ".table-list-header-menu .dropdown-menu")
    private WebElement sortDropdown;

    @FindBy(linkText = "User ID")
    private WebElement sortByUserIdLink;

    @FindBy(linkText = "Username")
    private WebElement sortByUsernameLink;

    @FindBy(linkText = "Name")
    private WebElement sortByNameLink;

    @FindBy(linkText = "Email")
    private WebElement sortByEmailLink;

    @FindBy(linkText = "Account type")
    private WebElement sortByAccountTypeLink;

    @FindBy(linkText = "Role")
    private WebElement sortByRoleLink;

    @FindBy(linkText = "Two Factor")
    private WebElement sortByTwoFactorLink;

    @FindBy(linkText = "Status")
    private WebElement sortByStatusLink;

    // User row elements
    @FindBy(css = ".table-list-row .dropdown-menu")
    private WebElement userActionsDropdown;

    @FindBy(linkText = "View profile")
    private WebElement viewProfileLink;

    @FindBy(linkText = "Edit")
    private WebElement editLink;

    @FindBy(linkText = "Avatar")
    private WebElement avatarLink;

    @FindBy(linkText = "Change password")
    private WebElement changePasswordLink;

    @FindBy(linkText = "Two factor authentication")
    private WebElement twoFactorAuthLink;

    @FindBy(linkText = "Public access")
    private WebElement publicAccessLink;

    @FindBy(linkText = "Notifications")
    private WebElement notificationsLink;

    @FindBy(linkText = "External accounts")
    private WebElement externalAccountsLink;

    @FindBy(linkText = "Integrations")
    private WebElement integrationsLink;

    @FindBy(linkText = "API Access")
    private WebElement apiAccessLink;

    @FindBy(linkText = "User dashboard")
    private WebElement userDashboardLink;

    @FindBy(linkText = "Time tracking")
    private WebElement timeTrackingLink;

    @FindBy(linkText = "Last logins")
    private WebElement lastLoginsLink;

    @FindBy(linkText = "Persistent connections")
    private WebElement persistentConnectionsLink;

    @FindBy(linkText = "Password reset history")
    private WebElement passwordResetHistoryLink;

    // User details
    @FindBy(css = ".table-list-title a")
    private WebElement usernameLink;

    @FindBy(css = ".table-list-category")
    private WebElement userRoleLabel;

    public Usermanagementpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Header link methods
    public void clickNewUserLink() {
        newUserLink.click();
    }

    public void clickInvitePeopleLink() {
        invitePeopleLink.click();
    }

    public void clickImportLink() {
        importLink.click();
    }

    public void clickViewAllGroupsLink() {
        viewAllGroupsLink.click();
    }

    // Search methods
    public void enterSearchText(String text) {
        searchInputField.sendKeys(text);
    }

    public void clearSearchField() {
        searchInputField.clear();
    }

    // Sort dropdown methods
    public void clickSortDropdown() {
        sortDropdown.click();
    }

    public void clickSortByUserId() {
        sortByUserIdLink.click();
    }

    public void clickSortByUsername() {
        sortByUsernameLink.click();
    }

    public void clickSortByName() {
        sortByNameLink.click();
    }

    public void clickSortByEmail() {
        sortByEmailLink.click();
    }

    public void clickSortByAccountType() {
        sortByAccountTypeLink.click();
    }

    public void clickSortByRole() {
        sortByRoleLink.click();
    }

    public void clickSortByTwoFactor() {
        sortByTwoFactorLink.click();
    }

    public void clickSortByStatus() {
        sortByStatusLink.click();
    }

    // User actions methods
    public void clickUserActionsDropdown() {
        userActionsDropdown.click();
    }

    public void clickViewProfile() {
        viewProfileLink.click();
    }

    public void clickEdit() {
        editLink.click();
    }

    public void clickAvatar() {
        avatarLink.click();
    }

    public void clickChangePassword() {
        changePasswordLink.click();
    }

    public void clickTwoFactorAuth() {
        twoFactorAuthLink.click();
    }

    public void clickPublicAccess() {
        publicAccessLink.click();
    }

    public void clickNotifications() {
        notificationsLink.click();
    }

    public void clickExternalAccounts() {
        externalAccountsLink.click();
    }

    public void clickIntegrations() {
        integrationsLink.click();
    }

    public void clickApiAccess() {
        apiAccessLink.click();
    }

    public void clickUserDashboard() {
        userDashboardLink.click();
    }

    public void clickTimeTracking() {
        timeTrackingLink.click();
    }

    public void clickLastLogins() {
        lastLoginsLink.click();
    }

    public void clickPersistentConnections() {
        persistentConnectionsLink.click();
    }

    public void clickPasswordResetHistory() {
        passwordResetHistoryLink.click();
    }

    // User info methods
    public String getUsernameText() {
        return usernameLink.getText();
    }

    public String getUserRoleText() {
        return userRoleLabel.getText();
    }

    public void clickUsername() {
        usernameLink.click();
    }
}
```

Note: I've created methods that return void for actions that don't clearly lead to a new page (based on the HTML provided). If any of these actions should navigate to another page (and you have corresponding Page Object classes), you should modify the return type accordingly (e.g., change `void` to return `new SomeOtherPage(driver)`). The class follows all the specified naming conventions and structural requirements.