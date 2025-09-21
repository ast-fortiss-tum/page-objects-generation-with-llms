```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageProjectPage {

    public WebDriver driver;

    @FindBy(id = "ooui-php-1")
    private WebElement editDropdown;

    @FindBy(id = "ooui-php-2")
    private WebElement editExpiryDropdown;

    @FindBy(id = "ooui-php-3")
    private WebElement otherTimeInput;

    @FindBy(id = "ooui-5")
    private WebElement unlockFurtherOptionsCheckbox;

    @FindBy(id = "ooui-php-7")
    private WebElement moveDropdown;

    @FindBy(id = "ooui-php-8")
    private WebElement moveExpiryDropdown;

    @FindBy(id = "ooui-php-9")
    private WebElement moveOtherTimeInput;

    @FindBy(id = "ooui-php-13")
    private WebElement cascadeProtectionCheckbox;

    @FindBy(id = "ooui-php-14")
    private WebElement reasonDropdown;

    @FindBy(id = "ooui-php-15")
    private WebElement additionalReasonInput;

    @FindBy(id = "ooui-php-16")
    private WebElement watchPageCheckbox;

    @FindBy(id = "mw-Protect-submit")
    private WebElement confirmButton;

    public PageProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectEditProtectionLevel(String level) {
        editDropdown.sendKeys(level);
    }

    public void selectEditExpiry(String expiry) {
        editExpiryDropdown.sendKeys(expiry);
    }

    public void enterOtherTime(String time) {
        otherTimeInput.clear();
        otherTimeInput.sendKeys(time);
    }

    public void toggleUnlockFurtherOptions() {
        unlockFurtherOptionsCheckbox.click();
    }

    public void selectMoveProtectionLevel(String level) {
        moveDropdown.sendKeys(level);
    }

    public void selectMoveExpiry(String expiry) {
        moveExpiryDropdown.sendKeys(expiry);
    }

    public void enterMoveOtherTime(String time) {
        moveOtherTimeInput.clear();
        moveOtherTimeInput.sendKeys(time);
    }

    public void toggleCascadeProtection() {
        cascadeProtectionCheckbox.click();
    }

    public void selectReason(String reason) {
        reasonDropdown.sendKeys(reason);
    }

    public void enterAdditionalReason(String reason) {
        additionalReasonInput.clear();
        additionalReasonInput.sendKeys(reason);
    }

    public void toggleWatchPage() {
        watchPageCheckbox.click();
    }

    public void clickConfirmButton() {
        confirmButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new NextPage(driver);
    }
}
```

This Java class represents a Selenium Page Object Model for the page protection settings form. It includes WebElements for each interactive element on the page, such as dropdowns, checkboxes, and buttons, and provides methods to interact with these elements. The class is named `PageProjectPage` as specified, and it includes a constructor to initialize the elements using `PageFactory`.