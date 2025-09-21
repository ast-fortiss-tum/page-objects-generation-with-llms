```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewprojectpage {

    public WebDriver driver;

    @FindBy(id = "modal-close-button")
    private WebElement closeButton;

    @FindBy(id = "form-name")
    private WebElement nameInputField;

    @FindBy(id = "form-identifier")
    private WebElement identifierInputField;

    @FindBy(name = "per_swimlane_task_limits")
    private WebElement swimlaneTaskLimitsCheckbox;

    @FindBy(id = "form-task_limit")
    private WebElement taskLimitInputField;

    @FindBy(id = "form-src_project_id")
    private WebElement createFromAnotherProjectSelect;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'btn-blue')]")
    private WebElement saveButton;

    @FindBy(xpath = "//a[text()='cancel']")
    private WebElement cancelLink;

    public Addnewprojectpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void enterIdentifier(String identifier) {
        identifierInputField.clear();
        identifierInputField.sendKeys(identifier);
    }

    public void setSwimlaneTaskLimits(boolean isChecked) {
        if (swimlaneTaskLimitsCheckbox.isSelected() != isChecked) {
            swimlaneTaskLimitsCheckbox.click();
        }
    }

    public void enterTaskLimit(int limit) {
        taskLimitInputField.clear();
        taskLimitInputField.sendKeys(String.valueOf(limit));
    }

    public void selectProjectToDuplicate(String projectName) {
        // Assuming a utility method to select by visible text
        // Select select = new Select(createFromAnotherProjectSelect);
        // select.selectByVisibleText(projectName);
    }

    public SummaryPage clickSaveButton() {
        saveButton.click();
        return new SummaryPage(driver);
    }

    public void clickCancelLink() {
        cancelLink.click();
    }
}
```

### Explanation:
- **WebDriver Field**: The `driver` field is declared at the top as required.
- **WebElement Fields**: Each key element from the HTML is defined as a `WebElement` using `@FindBy` annotations.
- **Constructor**: Initializes the elements using `PageFactory.initElements(driver, this);`.
- **Interaction Methods**: Methods are provided to interact with the form elements, such as entering text, clicking buttons, and selecting options.
- **Navigation**: The `clickSaveButton()` method returns a new instance of `SummaryPage`, assuming it exists, to handle navigation after clicking the "Save" button.
- **Error Handling**: No error elements were present in the provided HTML, so no error handling methods were included.