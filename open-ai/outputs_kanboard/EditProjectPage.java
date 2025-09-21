```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProjectPage {

    public WebDriver driver;

    @FindBy(id = "form-name")
    private WebElement nameInput;

    @FindBy(id = "form-email")
    private WebElement emailInput;

    @FindBy(id = "form-identifier")
    private WebElement identifierInput;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement descriptionTextarea;

    @FindBy(xpath = "//input[@name='per_swimlane_task_limits']")
    private WebElement taskLimitsCheckbox;

    @FindBy(id = "form-task_limit")
    private WebElement taskLimitInput;

    @FindBy(xpath = "//input[@name='is_private']")
    private WebElement personalProjectCheckbox;

    @FindBy(id = "form-owner_id")
    private WebElement projectOwnerSelect;

    @FindBy(id = "form-start_date")
    private WebElement startDateInput;

    @FindBy(id = "form-end_date")
    private WebElement endDateInput;

    @FindBy(id = "form-priority_default")
    private WebElement defaultPriorityInput;

    @FindBy(id = "form-priority_start")
    private WebElement lowestPriorityInput;

    @FindBy(id = "form-priority_end")
    private WebElement highestPriorityInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    public EditProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterIdentifier(String identifier) {
        identifierInput.clear();
        identifierInput.sendKeys(identifier);
    }

    public void enterDescription(String description) {
        descriptionTextarea.clear();
        descriptionTextarea.sendKeys(description);
    }

    public void setTaskLimitsCheckbox(boolean isChecked) {
        if (taskLimitsCheckbox.isSelected() != isChecked) {
            taskLimitsCheckbox.click();
        }
    }

    public void enterTaskLimit(String taskLimit) {
        taskLimitInput.clear();
        taskLimitInput.sendKeys(taskLimit);
    }

    public void setPersonalProjectCheckbox(boolean isChecked) {
        if (personalProjectCheckbox.isSelected() != isChecked) {
            personalProjectCheckbox.click();
        }
    }

    public void selectProjectOwner(String owner) {
        // Assuming a utility method to select from dropdown by visible text
        // selectDropdownByVisibleText(projectOwnerSelect, owner);
    }

    public void enterStartDate(String startDate) {
        startDateInput.clear();
        startDateInput.sendKeys(startDate);
    }

    public void enterEndDate(String endDate) {
        endDateInput.clear();
        endDateInput.sendKeys(endDate);
    }

    public void enterDefaultPriority(String priority) {
        defaultPriorityInput.clear();
        defaultPriorityInput.sendKeys(priority);
    }

    public void enterLowestPriority(String priority) {
        lowestPriorityInput.clear();
        lowestPriorityInput.sendKeys(priority);
    }

    public void enterHighestPriority(String priority) {
        highestPriorityInput.clear();
        highestPriorityInput.sendKeys(priority);
    }

    public SummaryPage clickSaveButton() {
        saveButton.click();
        return new SummaryPage(driver);
    }
}
```

This Java class represents a Selenium Page Object Model for the "Edit Project" page. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The `clickSaveButton` method assumes navigation to a `SummaryPage`, which should be defined elsewhere in your project.