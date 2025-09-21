```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlockUserPage {

    public WebDriver driver;

    @FindBy(id = "ooui-php-2")
    private WebElement usernameIpInput;

    @FindBy(id = "ooui-php-12")
    private WebElement accountCreationCheckbox;

    @FindBy(id = "ooui-php-13")
    private WebElement editOwnTalkPageCheckbox;

    @FindBy(name = "wpExpiry")
    private WebElement expiryDropdown;

    @FindBy(name = "wpExpiry-other")
    private WebElement expiryOtherInput;

    @FindBy(name = "wpReason")
    private WebElement reasonDropdown;

    @FindBy(name = "wpReason-other")
    private WebElement reasonOtherInput;

    @FindBy(id = "mw-input-wpAutoBlock")
    private WebElement autoBlockCheckbox;

    @FindBy(id = "mw-input-wpWatch")
    private WebElement watchUserPagesCheckbox;

    @FindBy(id = "mw-input-wpHardBlock")
    private WebElement hardBlockCheckbox;

    @FindBy(id = "mw-input-wpConfirm")
    private WebElement confirmBlockCheckbox;

    @FindBy(xpath = "//span[@class='oo-ui-labelElement-label' and text()='Block this user']")
    private WebElement blockUserButton;

    @FindBy(xpath = "//div[@role='alert']//span[@class='oo-ui-labelElement-label']")
    private WebElement errorMessage;

    public BlockUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsernameOrIp(String usernameOrIp) {
        usernameIpInput.clear();
        usernameIpInput.sendKeys(usernameOrIp);
    }

    public void toggleAccountCreationCheckbox(boolean shouldCheck) {
        if (accountCreationCheckbox.isSelected() != shouldCheck) {
            accountCreationCheckbox.click();
        }
    }

    public void toggleEditOwnTalkPageCheckbox(boolean shouldCheck) {
        if (editOwnTalkPageCheckbox.isSelected() != shouldCheck) {
            editOwnTalkPageCheckbox.click();
        }
    }

    public void selectExpiry(String expiry) {
        expiryDropdown.sendKeys(expiry);
    }

    public void enterExpiryOther(String expiryOther) {
        expiryOtherInput.clear();
        expiryOtherInput.sendKeys(expiryOther);
    }

    public void selectReason(String reason) {
        reasonDropdown.sendKeys(reason);
    }

    public void enterReasonOther(String reasonOther) {
        reasonOtherInput.clear();
        reasonOtherInput.sendKeys(reasonOther);
    }

    public void toggleAutoBlockCheckbox(boolean shouldCheck) {
        if (autoBlockCheckbox.isSelected() != shouldCheck) {
            autoBlockCheckbox.click();
        }
    }

    public void toggleWatchUserPagesCheckbox(boolean shouldCheck) {
        if (watchUserPagesCheckbox.isSelected() != shouldCheck) {
            watchUserPagesCheckbox.click();
        }
    }

    public void toggleHardBlockCheckbox(boolean shouldCheck) {
        if (hardBlockCheckbox.isSelected() != shouldCheck) {
            hardBlockCheckbox.click();
        }
    }

    public void toggleConfirmBlockCheckbox(boolean shouldCheck) {
        if (confirmBlockCheckbox.isSelected() != shouldCheck) {
            confirmBlockCheckbox.click();
        }
    }

    public void clickBlockUserButton() {
        blockUserButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new NextPage(driver);
    }

    public void clickBlockUserButton(){
        return errorMessage.getText();
    }
}
```

This Java class represents a Selenium Page Object Model for the "Block User" page. It includes fields for interacting with various elements on the page, such as input fields, checkboxes, and buttons. Methods are provided to perform actions on these elements, and an error message retrieval method is included to handle potential error messages displayed on the page.