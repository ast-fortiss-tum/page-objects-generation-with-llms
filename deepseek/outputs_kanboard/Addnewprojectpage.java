Here's the `Addnewprojectpage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewprojectpage {
    public WebDriver driver;

    // Modal elements
    @FindBy(id = "modal-close-button")
    public WebElement modalCloseButton;

    // Form elements
    @FindBy(id = "form-name")
    public WebElement nameInput;

    @FindBy(id = "form-identifier")
    public WebElement identifierInput;

    @FindBy(css = "input[name='per_swimlane_task_limits']")
    public WebElement swimlaneTaskLimitsCheckbox;

    @FindBy(id = "form-task_limit")
    public WebElement taskLimitInput;

    @FindBy(id = "form-src_project_id")
    public WebElement sourceProjectSelect;

    // Project creation options (visible when source project is selected)
    @FindBy(css = "input[name='projectPermissionModel']")
    public WebElement permissionsCheckbox;

    @FindBy(css = "input[name='projectRoleModel']")
    public WebElement customRolesCheckbox;

    @FindBy(css = "input[name='categoryModel']")
    public WebElement categoriesCheckbox;

    @FindBy(css = "input[name='tagDuplicationModel']")
    public WebElement tagsCheckbox;

    @FindBy(css = "input[name='actionModel']")
    public WebElement actionsCheckbox;

    @FindBy(css = "input[name='customFilterModel']")
    public WebElement customFiltersCheckbox;

    @FindBy(css = "input[name='projectMetadataModel']")
    public WebElement metadataCheckbox;

    @FindBy(css = "input[name='projectTaskDuplicationModel']")
    public WebElement tasksCheckbox;

    // Form actions
    @FindBy(css = "button.btn.btn-blue")
    public WebElement saveButton;

    @FindBy(css = "div.form-actions a")
    public WebElement cancelLink;

    // Alert/error elements
    @FindBy(css = "p.alert")
    public WebElement alertMessage;

    public Addnewprojectpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void clickModalCloseButton() {
        modalCloseButton.click();
    }

    public void setName(String name) {
        nameInput.sendKeys(name);
    }

    public void setIdentifier(String identifier) {
        identifierInput.sendKeys(identifier);
    }

    public void toggleSwimlaneTaskLimits() {
        swimlaneTaskLimitsCheckbox.click();
    }

    public void setTaskLimit(String limit) {
        taskLimitInput.sendKeys(limit);
    }

    public void selectSourceProject(String value) {
        sourceProjectSelect.sendKeys(value);
    }

    public void togglePermissions() {
        permissionsCheckbox.click();
    }

    public void toggleCustomRoles() {
        customRolesCheckbox.click();
    }

    public void toggleCategories() {
        categoriesCheckbox.click();
    }

    public void toggleTags() {
        tagsCheckbox.click();
    }

    public void toggleActions() {
        actionsCheckbox.click();
    }

    public void toggleCustomFilters() {
        customFiltersCheckbox.click();
    }

    public void toggleMetadata() {
        metadataCheckbox.click();
    }

    public void toggleTasks() {
        tasksCheckbox.click();
    }

    public ProjectSummaryPage clickSaveButton() {
        saveButton.click();
        return new ProjectSummaryPage(driver);
    }

    public void clickCancelLink() {
        cancelLink.click();
    }

    public String getAlertMessage() {
        return alertMessage.getText();
    }
}
```

Note: I've made the following assumptions based on the requirements:
1. The save button leads to a `ProjectSummaryPage` (as per requirement #6)
2. All field names are generic and structural as required
3. All required elements from the HTML are included
4. The constructor includes the required `PageFactory.initElements` call
5. Methods return appropriate types (void for simple actions, new page objects for navigation)
6. Error/alert message handling is included with `getAlertMessage()`

The class follows all the specified naming conventions and structural requirements.