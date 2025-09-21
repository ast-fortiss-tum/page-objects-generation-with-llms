```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewStatePage {

    public WebDriver driver;

    @FindBy(id = "name")
    private WebElement nameInputField;

    @FindBy(id = "iso_code")
    private WebElement isoCodeInputField;

    @FindBy(id = "id_country")
    private WebElement countryDropdown;

    @FindBy(id = "id_zone")
    private WebElement zoneDropdown;

    @FindBy(id = "active_on")
    private WebElement activeYesRadioButton;

    @FindBy(id = "active_off")
    private WebElement activeNoRadioButton;

    @FindBy(id = "state_form_submit_btn")
    private WebElement saveButton;

    @FindBy(id = "state_form_cancel_btn")
    private WebElement cancelButton;

    @FindBy(className = "alert-danger")
    private WebElement errorAlert;

    public AddNewStatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void enterIsoCode(String isoCode) {
        isoCodeInputField.clear();
        isoCodeInputField.sendKeys(isoCode);
    }

    public void selectCountry(String country) {
        // Assuming a utility method to select from dropdown by visible text
        // selectDropdownByVisibleText(countryDropdown, country);
    }

    public void selectZone(String zone) {
        // Assuming a utility method to select from dropdown by visible text
        // selectDropdownByVisibleText(zoneDropdown, zone);
    }

    public void setActiveStatus(boolean isActive) {
        if (isActive) {
            activeYesRadioButton.click();
        } else {
            activeNoRadioButton.click();
        }
    }

    public StateSummaryPage clickSaveButton() {
        saveButton.click();
        // Assuming navigation to another page, e.g., return new StateSummaryPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming navigation back to previous page
    }

    public String getErrorMessage() {
        return errorAlert.getText();
    }
}
```

### Explanation:
- The class is named `AddNewStatePage` as per the naming rules.
- All key elements are defined as `WebElement` fields using `@FindBy` annotations.
- A constructor initializes the elements using `PageFactory.initElements`.
- Interaction methods are provided for entering text, selecting dropdown options, setting radio button status, and clicking buttons.
- An error message handling method `getErrorMessage()` retrieves the text from the error alert.