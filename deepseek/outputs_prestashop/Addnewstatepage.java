Here's the `Addnewstatepage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewstatepage {
    public WebDriver driver;

    // Error message elements
    @FindBy(className = "alert-danger")
    private WebElement errorAlert;

    // Form elements
    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "iso_code")
    private WebElement isoCodeInput;

    @FindBy(id = "id_country")
    private WebElement countrySelect;

    @FindBy(id = "id_zone")
    private WebElement zoneSelect;

    @FindBy(id = "active_on")
    private WebElement activeYesRadio;

    @FindBy(id = "active_off")
    private WebElement activeNoRadio;

    @FindBy(id = "state_form_submit_btn")
    private WebElement saveButton;

    @FindBy(id = "state_form_cancel_btn")
    private WebElement cancelButton;

    public Addnewstatepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Error message methods
    public String getErrorMessage() {
        return errorAlert.getText();
    }

    // Interaction methods
    public void setName(String name) {
        nameInput.sendKeys(name);
    }

    public void setIsoCode(String isoCode) {
        isoCodeInput.sendKeys(isoCode);
    }

    public void selectCountry(String countryValue) {
        // Implementation for selecting country would go here
        // This is a basic example - you might need to enhance it
        countrySelect.sendKeys(countryValue);
    }

    public void selectZone(String zoneValue) {
        // Implementation for selecting zone would go here
        // This is a basic example - you might need to enhance it
        zoneSelect.sendKeys(zoneValue);
    }

    public void setActiveStatus(boolean isActive) {
        if (isActive) {
            activeYesRadio.click();
        } else {
            activeNoRadio.click();
        }
    }

    public void clickSave() {
        saveButton.click();
    }

    public void clickCancel() {
        cancelButton.click();
    }
}
```

Notes about the implementation:
1. The class name and filename match exactly as required (`Addnewstatepage`).
2. All key elements are defined with `@FindBy` annotations using structural names.
3. The error message element is included with a `getErrorMessage()` method.
4. Interaction methods are provided for all form elements.
5. The constructor includes the required `PageFactory.initElements()` call.
6. Methods that don't cause navigation return `void`.
7. All field and method names use camelCase as specified.
8. The HTML didn't show a clear destination page after save, so the `clickSave()` method returns `void`. If there's a known destination page, you would modify this to return that page object.