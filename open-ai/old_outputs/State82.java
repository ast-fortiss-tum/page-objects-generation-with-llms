To create a Selenium Page Object Model (POM) class in Java for the given HTML page, we will define the essential elements such as buttons, navigation links, and forms. We will use the `@FindBy` annotation to locate these elements and provide methods for interacting with them.

Here's a sample `CrawlOverviewPage` class:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrawlOverviewPage {
    
    private WebDriver driver;

    // Navigation Links
    @FindBy(linkText = "State inspector")
    private WebElement stateInspectorLink;

    // Buttons
    @FindBy(id = "pauseButton")
    private WebElement pauseButton;

    @FindBy(id = "toggleND")
    private WebElement toggleNearDuplicatesButton;

    @FindBy(id = "clusterBtn")
    private WebElement clusterButton;

    @FindBy(css = "a[href='result.json']")
    private WebElement downloadJsonButton;

    // Tabs
    @FindBy(linkText = "Screenshot")
    private WebElement screenshotTab;

    @FindBy(linkText = "Captured DOM")
    private WebElement capturedDomTab;

    @FindBy(linkText = "Interactions")
    private WebElement interactionsTab;

    // Constructor
    public CrawlOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements

    public void clickStateInspectorLink() {
        stateInspectorLink.click();
    }

    public void clickPauseButton() {
        pauseButton.click();
    }

    public void clickToggleNearDuplicatesButton() {
        toggleNearDuplicatesButton.click();
    }

    public void clickClusterButton() {
        clusterButton.click();
    }

    public void clickDownloadJsonButton() {
        downloadJsonButton.click();
    }

    public void switchToScreenshotTab() {
        screenshotTab.click();
    }

    public void switchToCapturedDomTab() {
        capturedDomTab.click();
    }

    public void switchToInteractionsTab() {
        interactionsTab.click();
    }

    // Navigation methods
    public void navigateToState15() {
        driver.get("state15.html");
    }

    public void navigateToState26() {
        driver.get("state26.html");
    }

    public void navigateToState99() {
        driver.get("state99.html");
    }

    public void navigateToState105() {
        driver.get("state105.html");
    }

    public void navigateToState113() {
        driver.get("state113.html");
    }

    public void navigateToState103() {
        driver.get("state103.html");
    }

    public void navigateToState108() {
        driver.get("state108.html");
    }

    public void navigateToState123() {
        driver.get("state123.html");
    }

    public void navigateToState106() {
        driver.get("state106.html");
    }
}
```

### Explanation:

1. **WebDriver and PageFactory**: The `PageFactory.initElements(driver, this)` method initializes the WebElement fields with the `@FindBy` annotations when the page class is instantiated.

2. **@FindBy Annotations**: These annotations specify how to locate the elements on the page. For example, `@FindBy(linkText = "State inspector")` locates a link with the visible text "State inspector".

3. **Interaction Methods**: Methods such as `clickPauseButton()` allow you to interact with the page elements. These methods encapsulate the WebDriver operations and make the test easier to read and maintain.

4. **Navigation Methods**: The navigation methods use `driver.get("URL")` to navigate to different states/pages.

This POM class provides a structured way to interact with the page and is ready for use in your Selenium test cases.