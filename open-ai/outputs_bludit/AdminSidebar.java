```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSidebar {

    public WebDriver driver;

    @FindBy(css = "button.navbar-toggler")
    private WebElement toggleButton;

    @FindBy(css = "a[href='/admin/dashboard']")
    private WebElement dashboardLink;

    @FindBy(css = "a[href='/']")
    private WebElement websiteLink;

    @FindBy(css = "a[href='/admin/new-content']")
    private WebElement newContentLink;

    @FindBy(css = "a[href='/admin/content']")
    private WebElement contentLink;

    @FindBy(css = "a[href='/admin/categories']")
    private WebElement categoriesLink;

    @FindBy(css = "a[href='/admin/users']")
    private WebElement usersLink;

    @FindBy(css = "a[href='/admin/settings']")
    private WebElement settingsLink;

    @FindBy(css = "a[href='/admin/plugins']")
    private WebElement pluginsLink;

    @FindBy(css = "a[href='/admin/themes']")
    private WebElement themesLink;

    @FindBy(css = "a[href='/admin/about']")
    private WebElement aboutLink;

    @FindBy(css = "a[href='/admin/logout']")
    private WebElement logoutLink;

    public Adminsidebar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickToggleButton() {
        toggleButton.click();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickWebsiteLink() {
        websiteLink.click();
    }

    public void clickNewContentLink() {
        newContentLink.click();
    }

    public void clickContentLink() {
        contentLink.click();
    }

    public void clickCategoriesLink() {
        categoriesLink.click();
    }

    public void clickUsersLink() {
        usersLink.click();
    }

    public void clickSettingsLink() {
        settingsLink.click();
    }

    public void clickPluginsLink() {
        pluginsLink.click();
    }

    public void clickThemesLink() {
        themesLink.click();
    }

    public void clickAboutLink() {
        aboutLink.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }
}
```