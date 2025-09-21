```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RevisionHistoryPage {

    public WebDriver driver;

    @FindBy(id = "mw-history-searchform")
    private WebElement historySearchForm;

    @FindBy(id = "ooui-php-2")
    private WebElement toDateInput;

    @FindBy(id = "ooui-php-4")
    private WebElement tagFilterInput;

    @FindBy(id = "ooui-php-5")
    private WebElement revisionDeletedCheckbox;

    @FindBy(xpath = "//button[@type='submit' and @value='Show revisions']")
    private WebElement showRevisionsButton;

    @FindBy(xpath = "//input[@type='submit' and @value='Compare selected revisions']")
    private WebElement compareSelectedRevisionsButton;

    public RevisionHistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setToDate(String date) {
        toDateInput.clear();
        toDateInput.sendKeys(date);
    }

    public void setTagFilter(String tag) {
        tagFilterInput.clear();
        tagFilterInput.sendKeys(tag);
    }

    public void toggleRevisionDeletedCheckbox() {
        revisionDeletedCheckbox.click();
    }

    public void clickShowRevisionsButton() {
        showRevisionsButton.click();
    }

    public void clickCompareSelectedRevisionsButton() {
        compareSelectedRevisionsButton.click();
    }
}
```

This Java class, `RevisionHistoryPage`, is a Selenium Page Object Model (POM) class that represents the revision history page of a web application. It includes WebElement fields for key elements on the page, such as the date input, tag filter input, and buttons for showing revisions and comparing selected revisions. The class provides methods to interact with these elements, such as setting input values and clicking buttons. The constructor initializes the elements using Selenium's `PageFactory`.