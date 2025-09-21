Here's the `Swimlanespage.java` file following all the specified rules:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swimlanespage {
    public WebDriver driver;

    // Header elements
    @FindBy(tagName = "h2")
    public WebElement headerLabel;

    @FindBy(className = "js-modal-medium")
    public WebElement addNewSwimlaneLink;

    // Active swimlanes section
    @FindBy(tagName = "h3")
    public WebElement activeSwimlanesLabel;

    // Table elements
    @FindBy(className = "swimlanes-table")
    public WebElement swimlanesTable;

    @FindBy(className = "draggable-row-handle")
    public WebElement dragHandle;

    @FindBy(className = "dropdown-menu-link-icon")
    public WebElement settingsDropdown;

    @FindBy(linkText = "Edit")
    public WebElement editLink;

    @FindBy(linkText = "Disable")
    public WebElement disableLink;

    // Modal elements
    @FindBy(id = "modal-overlay")
    public WebElement modalOverlay;

    @FindBy(id = "modal-close-button")
    public WebElement modalCloseButton;

    @FindBy(id = "form-name")
    public WebElement nameInput;

    @FindBy(name = "description")
    public WebElement descriptionTextarea;

    @FindBy(id = "form-task_limit")
    public WebElement taskLimitInput;

    @FindBy(className = "btn-blue")
    public WebElement saveButton;

    @FindBy(linkText = "cancel")
    public WebElement cancelLink;

    // Error elements
    @FindBy(className = "form-required")
    public WebElement requiredFieldIndicator;

    public Swimlanespage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewSwimlane() {
        addNewSwimlaneLink.click();
    }

    public void clickSettingsDropdown() {
        settingsDropdown.click();
    }

    public void clickEditLink() {
        editLink.click();
    }

    public void clickDisableLink() {
        disableLink.click();
    }

    public void clickModalCloseButton() {
        modalCloseButton.click();
    }

    public void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public void enterDescription(String description) {
        descriptionTextarea.sendKeys(description);
    }

    public void enterTaskLimit(String limit) {
        taskLimitInput.sendKeys(limit);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickCancelLink() {
        cancelLink.click();
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }

    public String getActiveSwimlanesText() {
        return activeSwimlanesLabel.getText();
    }

    public String getRequiredFieldIndicatorText() {
        return requiredFieldIndicator.getText();
    }
}
```

Notes about the implementation:
1. Followed all naming conventions exactly as specified
2. Used structural/positional names for all elements
3. Included all required elements from the HTML
4. Created interaction methods for all key elements
5. Added the constructor with PageFactory initialization
6. Included error message element (required field indicator)
7. Methods return void when they don't navigate to a new page
8. Used camelCase consistently for all names
9. The class name and filename match exactly as specified (`Swimlanespage`)

The methods are designed to perform basic interactions with the elements. Since the HTML doesn't show clear navigation to other pages from most actions, the methods return void. If navigation was expected, the methods would return the appropriate Page Object.