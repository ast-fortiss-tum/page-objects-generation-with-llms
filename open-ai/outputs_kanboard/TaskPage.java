```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public WebDriver driver;

    // Task summary elements
    @FindBy(xpath = "//div[@class='task-summary-column'][1]//li[1]/span")
    private WebElement statusLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][1]//li[2]/span")
    private WebElement priorityLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][2]//li[1]/span")
    private WebElement swimlaneLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][2]//li[2]/span")
    private WebElement columnLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][2]//li[3]/span")
    private WebElement positionLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][3]//li[1]/span")
    private WebElement assigneeLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][3]//li[2]/span")
    private WebElement creatorLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][4]//li[1]/span/a")
    private WebElement startNowLink;

    @FindBy(xpath = "//div[@class='task-summary-column'][4]//li[2]/span")
    private WebElement createdLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][4]//li[3]/span")
    private WebElement modifiedLabel;

    @FindBy(xpath = "//div[@class='task-summary-column'][4]//li[4]/span")
    private WebElement movedLabel;

    // Comment section elements
    @FindBy(xpath = "//textarea[@name='comment']")
    private WebElement commentTextArea;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'btn-blue')]")
    private WebElement saveButton;

    @FindBy(xpath = "//a[contains(@href, 'toggleSorting')]")
    private WebElement changeSortingLink;

    @FindBy(xpath = "//a[contains(@href, 'CommentMailController')]")
    private WebElement sendByEmailLink;

    public TaskPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods

    public String getStatus() {
        return statusLabel.getText();
    }

    public String getPriority() {
        return priorityLabel.getText();
    }

    public String getSwimlane() {
        return swimlaneLabel.getText();
    }

    public String getColumn() {
        return columnLabel.getText();
    }

    public String getPosition() {
        return positionLabel.getText();
    }

    public String getAssignee() {
        return assigneeLabel.getText();
    }

    public String getCreator() {
        return creatorLabel.getText();
    }

    public String getCreatedDate() {
        return createdLabel.getText();
    }

    public String getModifiedDate() {
        return modifiedLabel.getText();
    }

    public String getMovedDate() {
        return movedLabel.getText();
    }

    public void typeComment(String comment) {
        commentTextArea.clear();
        commentTextArea.sendKeys(comment);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickChangeSortingLink() {
        changeSortingLink.click();
    }

    public void clickSendByEmailLink() {
        sendByEmailLink.click();
    }

    public void clickStartNowLink() {
        startNowLink.click();
    }
}
```

This Java class represents a Selenium Page Object Model for the given HTML content. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The class is named `TaskPage` as specified, and it includes a constructor to initialize the elements using `PageFactory`.