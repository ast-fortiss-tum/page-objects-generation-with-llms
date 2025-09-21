To create a Selenium Page Object Model (POM) class for the provided HTML page in Java, we will identify key elements such as buttons, links, and tabs and define them using `@FindBy` annotations. We will also provide methods to interact with these elements.

Here's a possible implementation:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrawlOverviewPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public CrawlOverviewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    // Elements in the navigation bar
    @FindBy(linkText = "State inspector")
    private WebElement stateInspectorLink;

    @FindBy(id = "pauseButton")
    private WebElement pauseButton;

    @FindBy(id = "toggleND")
    private WebElement toggleNearDuplicatesButton;

    @FindBy(id = "clusterBtn")
    private WebElement clusterButton;

    @FindBy(xpath = "//a[@title='Download result as JSON']")
    private WebElement downloadJsonButton;

    // Tabs
    @FindBy(linkText = "Screenshot")
    private WebElement screenshotTab;

    @FindBy(linkText = "Captured DOM")
    private WebElement capturedDomTab;

    @FindBy(linkText = "Interactions")
    private WebElement interactionsTab;

    // Methods to interact with the elements
    public void clickStateInspector() {
        stateInspectorLink.click();
    }

    public void clickPauseButton() {
        pauseButton.click();
    }

    public void clickToggleNearDuplicates() {
        toggleNearDuplicatesButton.click();
    }

    public void clickClusterButton() {
        clusterButton.click();
    }

    public void clickDownloadJsonButton() {
        downloadJsonButton.click();
    }

    public void selectScreenshotTab() {
        screenshotTab.click();
        wait.until(ExpectedConditions.attributeToBe(screenshotTab, "class", "active"));
    }

    public void selectCapturedDomTab() {
        capturedDomTab.click();
        wait.until(ExpectedConditions.attributeToBe(capturedDomTab, "class", "active"));
    }

    public void selectInteractionsTab() {
        interactionsTab.click();
        wait.until(ExpectedConditions.attributeToBe(interactionsTab, "class", "active"));
    }
}
```

### Explanation:
1. **WebDriver and WebDriverWait**: The class initializes WebDriver and WebDriverWait to facilitate interactions and waiting conditions.

2. **@FindBy Annotations**: These are used to locate elements on the web page. For instance, `@FindBy(id = "pauseButton")` locates the pause button by its ID.

3. **Methods to Interact with Elements**: Methods like `clickPauseButton()` and `selectScreenshotTab()` are defined to perform actions on the elements.

4. **PageFactory Initialization**: The `PageFactory.initElements(driver, this);` call initializes WebElement fields annotated with `@FindBy`.

This POM class allows for easy interaction with the webpage elements by encapsulating the web element details and providing clear methods for interaction.