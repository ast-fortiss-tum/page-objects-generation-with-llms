Here's the `Blockuserpage.java` file following all the specified rules:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blockuserpage {
    public WebDriver driver;

    // Main form elements
    @FindBy(id = "ooui-php-2")
    private WebElement targetInputField;

    @FindBy(id = "ooui-php-27")
    private WebElement confirmCheckbox;

    @FindBy(css = ".mw-htmlform-submit button")
    private WebElement submitButton;

    // Block type radio buttons
    @FindBy(css = "input[value='sitewide']")
    private WebElement sitewideRadio;

    @FindBy(css = "input[value='partial']")
    private WebElement partialRadio;

    // Block details checkboxes
    @FindBy(id = "ooui-php-12")
    private WebElement accountCreationCheckbox;

    @FindBy(id = "ooui-php-13")
    private WebElement editTalkPageCheckbox;

    // Expiration dropdown
    @FindBy(name = "wpExpiry")
    private WebElement expiryDropdown;

    @FindBy(name = "wpExpiry-other")
    private WebElement expiryOtherInput;

    // Reason dropdown and input
    @FindBy(name = "wpReason")
    private WebElement reasonDropdown;

    @FindBy(name = "wpReason-other")
    private WebElement reasonOtherInput;

    // Additional options checkboxes
    @FindBy(id = "ooui-php-20")
    private WebElement autoBlockCheckbox;

    @FindBy(id = "ooui-php-21")
    private WebElement watchPagesCheckbox;

    // Error message
    @FindBy(css = ".oo-ui-messageWidget.oo-ui-flaggedElement-error")
    private WebElement errorMessage;

    public Blockuserpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTarget(String target) {
        targetInputField.clear();
        targetInputField.sendKeys(target);
    }

    public void selectSitewideBlock() {
        sitewideRadio.click();
    }

    public void selectPartialBlock() {
        partialRadio.click();
    }

    public void toggleAccountCreationBlock(boolean enable) {
        if (accountCreationCheckbox.isSelected() != enable) {
            accountCreationCheckbox.click();
        }
    }

    public void toggleEditTalkPageBlock(boolean enable) {
        if (editTalkPageCheckbox.isSelected() != enable) {
            editTalkPageCheckbox.click();
        }
    }

    public void setExpiry(String expiry) {
        expiryDropdown.sendKeys(expiry);
    }

    public void setCustomExpiry(String expiry) {
        expiryOtherInput.clear();
        expiryOtherInput.sendKeys(expiry);
    }

    public void setReason(String reason) {
        reasonDropdown.sendKeys(reason);
    }

    public void setCustomReason(String reason) {
        reasonOtherInput.clear();
        reasonOtherInput.sendKeys(reason);
    }

    public void toggleAutoBlock(boolean enable) {
        if (autoBlockCheckbox.isSelected() != enable) {
            autoBlockCheckbox.click();
        }
    }

    public void toggleWatchPages(boolean enable) {
        if (watchPagesCheckbox.isSelected() != enable) {
            watchPagesCheckbox.click();
        }
    }

    public void confirmBlock() {
        confirmCheckbox.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void submitBlock() {
        submitButton.click();
    }
}
```

This implementation:

1. Follows the exact class name requirement (`Blockuserpage`)
2. Includes all required WebElement fields with @FindBy annotations
3. Uses generic, structural field names as specified
4. Implements interaction methods for all key elements
5. Includes the error message handling method (`getErrorMessage()`)
6. Has the required constructor with PageFactory.initElements
7. Follows camelCase naming convention
8. Only includes elements present in the provided HTML
9. Methods return void when they don't cause navigation
10. Includes all form fields and controls from the HTML

The methods are designed to interact with the page elements while maintaining the structural naming convention and following all the specified rules.