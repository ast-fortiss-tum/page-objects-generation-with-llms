```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {

    public WebDriver driver;

    @FindBy(xpath = "//a[contains(@href, 'UserCreationController') and contains(@class, 'js-modal-medium')]")
    private WebElement newUserLink;

    @FindBy(xpath = "//a[contains(@href, 'UserInviteController') and contains(@class, 'js-modal-medium')]")
    private WebElement invitePeopleLink;

    @FindBy(xpath = "//a[contains(@href, 'UserImportController') and contains(@class, 'js-modal-medium')]")
    private WebElement importLink;

    @FindBy(xpath = "//a[contains(@href, '/groups')]")
    private WebElement viewAllGroupsLink;

    @FindBy(id = "form-search")
    private WebElement searchInputField;

    @FindBy(xpath = "//a[contains(@href, 'order=users.id')]")
    private WebElement sortByIdLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.username')]")
    private WebElement sortByUsernameLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.name')]")
    private WebElement sortByNameLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.email')]")
    private WebElement sortByEmailLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.is_ldap_user')]")
    private WebElement sortByAccountTypeLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.role')]")
    private WebElement sortByRoleLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.twofactor_activated')]")
    private WebElement sortByTwoFactorLink;

    @FindBy(xpath = "//a[contains(@href, 'order=users.is_active')]")
    private WebElement sortByStatusLink;

    @FindBy(xpath = "//a[contains(@href, '/user/show/1')]")
    private WebElement viewProfileLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/edit')]")
    private WebElement editLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/avatar')]")
    private WebElement avatarLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/password')]")
    private WebElement changePasswordLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/2fa')]")
    private WebElement twoFactorAuthenticationLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/share')]")
    private WebElement publicAccessLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/notifications')]")
    private WebElement notificationsLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/accounts')]")
    private WebElement externalAccountsLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/integrations')]")
    private WebElement integrationsLink;

    @FindBy(xpath = "//a[contains(@href, '/user/1/api')]")
    private WebElement apiAccessLink;

    @FindBy(xpath = "//a[contains(@href, '/dashboard/1')]")
    private WebElement userDashboardLink;

    @FindBy(xpath = "//a[contains(@href, '/user/show/1/timesheet')]")
    private WebElement timeTrackingLink;

    @FindBy(xpath = "//a[contains(@href, '/user/show/1/last-logins')]")
    private WebElement lastLoginsLink;

    @FindBy(xpath = "//a[contains(@href, '/user/show/1/sessions')]")
    private WebElement persistentConnectionsLink;

    @FindBy(xpath = "//a[contains(@href, 'UserViewController') and contains(@href, 'passwordReset')]")
    private WebElement passwordResetHistoryLink;

    public UserManagementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public UserCreationPage clickNewUserLink() {
        newUserLink.click();
        return new UserCreationPage(driver);
    }

    public void clickInvitePeopleLink() {
        invitePeopleLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserInvitePage(driver);
    }

    public void clickImportLink() {
        importLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserImportPage(driver);
    }

    public void clickViewAllGroupsLink() {
        viewAllGroupsLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new GroupsPage(driver);
    }

    public void enterSearchText(String text) {
        searchInputField.clear();
        searchInputField.sendKeys(text);
    }

    public void clickSortByIdLink() {
        sortByIdLink.click();
    }

    public void clickSortByUsernameLink() {
        sortByUsernameLink.click();
    }

    public void clickSortByNameLink() {
        sortByNameLink.click();
    }

    public void clickSortByEmailLink() {
        sortByEmailLink.click();
    }

    public void clickSortByAccountTypeLink() {
        sortByAccountTypeLink.click();
    }

    public void clickSortByRoleLink() {
        sortByRoleLink.click();
    }

    public void clickSortByTwoFactorLink() {
        sortByTwoFactorLink.click();
    }

    public void clickSortByStatusLink() {
        sortByStatusLink.click();
    }

    public UserProfilePage clickViewProfileLink() {
        viewProfileLink.click();
        return new UserProfilePage(driver);
    }

    public UserEditPage clickEditLink() {
        editLink.click();
        return new UserEditPage(driver);
    }

    public void clickAvatarLink() {
        avatarLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserAvatarPage(driver);
    }

    public void clickChangePasswordLink() {
        changePasswordLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserChangePasswordPage(driver);
    }

    public void clickTwoFactorAuthenticationLink() {
        twoFactorAuthenticationLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserTwoFactorPage(driver);
    }

    public void clickPublicAccessLink() {
        publicAccessLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserPublicAccessPage(driver);
    }

    public void clickNotificationsLink() {
        notificationsLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserNotificationsPage(driver);
    }

    public void clickExternalAccountsLink() {
        externalAccountsLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserExternalAccountsPage(driver);
    }

    public void clickIntegrationsLink() {
        integrationsLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserIntegrationsPage(driver);
    }

    public void clickApiAccessLink() {
        apiAccessLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserApiAccessPage(driver);
    }

    public void clickUserDashboardLink() {
        userDashboardLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserDashboardPage(driver);
    }

    public void clickTimeTrackingLink() {
        timeTrackingLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserTimeTrackingPage(driver);
    }

    public void clickLastLoginsLink() {
        lastLoginsLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserLastLoginsPage(driver);
    }

    public void clickPersistentConnectionsLink() {
        persistentConnectionsLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserPersistentConnectionsPage(driver);
    }

    public void clickPasswordResetHistoryLink() {
        passwordResetHistoryLink.click();
        // Assuming a new page is opened, return the appropriate POM class
        // return new UserPasswordResetHistoryPage(driver);
    }
}
```

This Java class follows the Page Object Model pattern for the given HTML content. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The class assumes that clicking on certain links will navigate to new pages, which would be represented by other POM classes (commented out in the code).