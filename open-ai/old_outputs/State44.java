Below is a Java class using the Selenium Page Object Model (POM) pattern for the provided HTML. This class captures the key elements and interactions on the page.

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrawlOverviewPage {

    private WebDriver driver;

    // Navigation bar links and buttons
    @FindBy(css = "a.brand")
    private WebElement crawlOverviewLink;

    @FindBy(css = "a#pauseButton")
    private WebElement pauseButton;

    @FindBy(css = "a#toggleND")
    private WebElement toggleNearDuplicatesButton;

    @FindBy(css = "a#clusterBtn")
    private WebElement clusterButton;

    @FindBy(css = "a[title='Download result as JSON']")
    private WebElement downloadJsonButton;

    // Tabs
    @FindBy(css = "a[href='#screenshot']")
    private WebElement screenshotTab;

    @FindBy(css = "a[href='#dom']")
    private WebElement domTab;

    @FindBy(css = "a[href='#interactions']")
    private WebElement interactionsTab;

    // Links in the content table
    @FindBy(xpath = "//table/tbody/tr[1]/td/a")
    private WebElement addressBookLink;

    // Constructor to initialize elements
    public CrawlOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page

    public void clickPauseButton() {
        pauseButton.click();
    }

    public void toggleNearDuplicates() {
        toggleNearDuplicatesButton.click();
    }

    public void showClusters() {
        clusterButton.click();
    }

    public void downloadJson() {
        downloadJsonButton.click();
    }

    public void goToScreenshotTab() {
        screenshotTab.click();
    }

    public void goToDomTab() {
        domTab.click();
    }

    public void goToInteractionsTab() {
        interactionsTab.click();
    }

    public void navigateToAddressBook() {
        addressBookLink.click();
        // Return a new page object if necessary
    }

    public void navigateToStateInspector() {
        // Since the link is just '#', we assume it opens a modal or similar
        // Add logic here if this results in a navigation that requires a new page object
    }

    public void goToCrawlOverview() {
        crawlOverviewLink.click();
        // Return a new page object if necessary
    }
}
```

### Key Points:
- **WebElement Fields**: Each interactive element or link is represented as a `WebElement` field, annotated with `@FindBy` to locate it.
- **Methods**: Methods are provided to interact with the elements, like clicking buttons or navigating tabs. These methods can be expanded to handle more complex interactions.
- **Navigation**: Some methods might return new page objects if they lead to a new page, but the current HTML does not indicate such behavior.
- **Initialization**: The `PageFactory.initElements` is used to initialize the elements in the constructor. This is standard for POM in Selenium.

This class provides a base for interacting with the given HTML page using Selenium. Adjustments might be necessary based on actual application behavior and additional elements.