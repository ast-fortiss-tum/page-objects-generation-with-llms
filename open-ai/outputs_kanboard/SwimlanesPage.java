```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwimlanesPage {

    public WebDriver driver;

    // Constructor
    public SwimlanesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Elements
    @FindBy(css = "a[href*='action=create']")
    private WebElement addNewSwimlaneLink;

    @FindBy(css = "a[href*='action=edit']")
    private WebElement editSwimlaneLink;

    @FindBy(css = "a[href*='action=disable']")
    private WebElement disableSwimlaneLink;

    @FindBy(id = "form-name")
    private WebElement nameInputField;

    @FindBy(name = "description")
    private WebElement descriptionTextArea;

    @FindBy(id = "form-task_limit")
    private WebElement taskLimitInputField;

    @FindBy(css = "button[type='submit']")
    private WebElement saveButton;

    @FindBy(css = "a[href='#']")
    private WebElement cancelButton;

    // Interaction Methods

    public void clickAddNewSwimlane() {
        addNewSwimlaneLink.click();
        // Assuming a modal opens, no page navigation
    }

    public void clickEditSwimlane() {
        editSwimlaneLink.click();
        // Assuming a modal opens, no page navigation
    }

    public void clickDisableSwimlane() {
        disableSwimlaneLink.click();
        // Assuming a modal opens, no page navigation
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void enterDescription(String description) {
        descriptionTextArea.clear();
        descriptionTextArea.sendKeys(description);
    }

    public void enterTaskLimit(String taskLimit) {
        taskLimitInputField.clear();
        taskLimitInputField.sendKeys(taskLimit);
    }

    public void clickSaveButton() {
        saveButton.click();
        // Assuming a modal closes, no page navigation
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming a modal closes, no page navigation
    }
}
```

This Java class represents a Selenium Page Object Model for the "Swimlanes" page. It includes WebElements for key elements on the page and methods to interact with them. The class assumes that clicking certain links or buttons opens modals rather than navigating to new pages, as inferred from the HTML structure provided.