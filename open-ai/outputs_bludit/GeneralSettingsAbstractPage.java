```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingsAbstractPage {

    public WebDriver driver;

    @FindBy(id = "nav-general-tab")
    private WebElement generalTab;

    @FindBy(id = "nav-advanced-tab")
    private WebElement advancedTab;

    @FindBy(id = "nav-seo-tab")
    private WebElement seoTab;

    @FindBy(id = "nav-social-tab")
    private WebElement socialNetworksTab;

    @FindBy(id = "nav-images-tab")
    private WebElement imagesTab;

    @FindBy(id = "nav-language-tab")
    private WebElement languageTab;

    @FindBy(id = "nav-custom-fields-tab")
    private WebElement customFieldsTab;

    @FindBy(id = "nav-logo-tab")
    private WebElement logoTab;

    public Generalsettingsabstractpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickGeneralTab() {
        generalTab.click();
    }

    public void clickAdvancedTab() {
        advancedTab.click();
    }

    public void clickSeoTab() {
        seoTab.click();
    }

    public void clickSocialNetworksTab() {
        socialNetworksTab.click();
    }

    public void clickImagesTab() {
        imagesTab.click();
    }

    public void clickLanguageTab() {
        languageTab.click();
    }

    public void clickCustomFieldsTab() {
        customFieldsTab.click();
    }

    public void clickLogoTab() {
        logoTab.click();
    }
}
```

This Java class, `Generalsettingsabstractpage`, is a Selenium Page Object Model (POM) class that represents a page with several tabs. Each tab is represented by a `WebElement` field, and there are methods to click each tab. The class uses the `@FindBy` annotation to locate elements by their `id` attribute. The constructor initializes the elements using `PageFactory.initElements`.