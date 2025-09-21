```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserPage {

    public WebDriver driver;

    @FindBy(id = "nav-profile-tab")
    private WebElement profileTab;

    @FindBy(id = "nav-picture-tab")
    private WebElement pictureTab;

    @FindBy(id = "nav-security-tab")
    private WebElement securityTab;

    @FindBy(id = "nav-social-tab")
    private WebElement socialTab;

    public Edituserpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProfileTab() {
        profileTab.click();
    }

    public void clickPictureTab() {
        pictureTab.click();
    }

    public void clickSecurityTab() {
        securityTab.click();
    }

    public void clickSocialTab() {
        socialTab.click();
    }
}
```

This Java class, `Edituserpage`, is a Selenium Page Object Model (POM) representation of the HTML content provided. It includes WebElements for each tab in the navigation bar and methods to interact with them.