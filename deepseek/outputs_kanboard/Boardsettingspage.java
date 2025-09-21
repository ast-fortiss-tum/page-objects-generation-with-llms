Here's the `Boardsettingspage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Boardsettingspage {
    public WebDriver driver;

    // Input fields
    @FindBy(id = "form-board_highlight_period")
    private WebElement highlightPeriodInput;

    @FindBy(id = "form-board_public_refresh_interval")
    private WebElement publicRefreshIntervalInput;

    @FindBy(id = "form-board_private_refresh_interval")
    private WebElement privateRefreshIntervalInput;

    // Form help texts
    @FindBy(xpath = "//input[@id='form-board_highlight_period']/following-sibling::p")
    private WebElement highlightPeriodHelpText;

    @FindBy(xpath = "//input[@id='form-board_public_refresh_interval']/following-sibling::p")
    private WebElement publicRefreshIntervalHelpText;

    @FindBy(xpath = "//input[@id='form-board_private_refresh_interval']/following-sibling::p")
    private WebElement privateRefreshIntervalHelpText;

    // Buttons
    @FindBy(css = "button.btn.btn-blue")
    private WebElement saveButton;

    public Boardsettingspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Input field methods
    public void setHighlightPeriod(String value) {
        highlightPeriodInput.clear();
        highlightPeriodInput.sendKeys(value);
    }

    public void setPublicRefreshInterval(String value) {
        publicRefreshIntervalInput.clear();
        publicRefreshIntervalInput.sendKeys(value);
    }

    public void setPrivateRefreshInterval(String value) {
        privateRefreshIntervalInput.clear();
        privateRefreshIntervalInput.sendKeys(value);
    }

    // Help text methods
    public String getHighlightPeriodHelpText() {
        return highlightPeriodHelpText.getText();
    }

    public String getPublicRefreshIntervalHelpText() {
        return publicRefreshIntervalHelpText.getText();
    }

    public String getPrivateRefreshIntervalHelpText() {
        return privateRefreshIntervalHelpText.getText();
    }

    // Assuming clicking Save button navigates to another page
    public BoardPage clickSaveButton() {
        saveButton.click();
        return new BoardPage(driver);
    }
}
```

Note: I made the following assumptions based on the requirements:
1. The save button navigation leads to a `BoardPage` (you'll need to create this class)
2. There were no error message elements in the provided HTML, so no error-related methods were included
3. All field names are generic and structural as required
4. The class name and file name match exactly as specified
5. All methods follow camelCase naming convention
6. The constructor includes the required PageFactory initialization

If the actual navigation after save goes to a different page, you should replace `BoardPage` with the appropriate page object class name.