```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardSettingsP age {

    public WebDriver driver;

    // Web elements
    @FindBy(id = "form-board_highlight_period")
    private WebElement taskHighlightPeriodInput;

    @FindBy(id = "form-board_public_refresh_interval")
    private WebElement publicBoardRefreshIntervalInput;

    @FindBy(id = "form-board_private_refresh_interval")
    private WebElement privateBoardRefreshIntervalInput;

    @FindBy(css = ".btn.btn-blue")
    private WebElement saveButton;

    // Constructor
    public BoardSettingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void setTaskHighlightPeriod(String period) {
        taskHighlightPeriodInput.clear();
        taskHighlightPeriodInput.sendKeys(period);
    }

    public void setPublicBoardRefreshInterval(String interval) {
        publicBoardRefreshIntervalInput.clear();
        publicBoardRefreshIntervalInput.sendKeys(interval);
    }

    public void setPrivateBoardRefreshInterval(String interval) {
        privateBoardRefreshIntervalInput.clear();
        privateBoardRefreshIntervalInput.sendKeys(interval);
    }

    public void clickSaveButton() {
        saveButton.click();
        // Assuming the save button navigates to a new page, return the appropriate POM class
        // return new SummaryPage(driver); // Uncomment and replace with actual page class
    }
}
```

### Explanation:
- **Web Elements**: Defined using `@FindBy` annotations for each input field and the save button.
- **Constructor**: Initializes the page elements using `PageFactory.initElements`.
- **Interaction Methods**: 
  - Methods to set values for each input field (`setTaskHighlightPeriod`, `setPublicBoardRefreshInterval`, `setPrivateBoardRefreshInterval`).
  - A method to click the save button (`clickSaveButton`). This method should return a new page object if the button leads to a different page, but since the target page is not specified, the return statement is commented out.