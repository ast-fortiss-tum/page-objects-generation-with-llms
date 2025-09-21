```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingsPage {

    public WebDriver driver;

    @FindBy(id = "jstitle")
    private WebElement siteTitleInput;

    @FindBy(id = "jsslogan")
    private WebElement siteSloganInput;

    @FindBy(id = "jsdescription")
    private WebElement siteDescriptionInput;

    @FindBy(id = "jsfooter")
    private WebElement footerTextInput;

    public Generalsettingspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSiteTitle(String title) {
        siteTitleInput.clear();
        siteTitleInput.sendKeys(title);
    }

    public void enterSiteSlogan(String slogan) {
        siteSloganInput.clear();
        siteSloganInput.sendKeys(slogan);
    }

    public void enterSiteDescription(String description) {
        siteDescriptionInput.clear();
        siteDescriptionInput.sendKeys(description);
    }

    public void enterFooterText(String footerText) {
        footerTextInput.clear();
        footerTextInput.sendKeys(footerText);
    }

    public String getSiteTitle() {
        return siteTitleInput.getAttribute("value");
    }

    public String getSiteSlogan() {
        return siteSloganInput.getAttribute("value");
    }

    public String getSiteDescription() {
        return siteDescriptionInput.getAttribute("value");
    }

    public String getFooterText() {
        return footerTextInput.getAttribute("value");
    }
}
```

This Java class, `Generalsettingspage`, is a Selenium Page Object Model representation of the HTML content provided. It includes fields for each input element on the page, methods to interact with these elements, and a constructor to initialize the page elements using Selenium's `PageFactory`.