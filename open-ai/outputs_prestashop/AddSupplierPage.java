```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSupplierPage {

    public WebDriver driver;

    @FindBy(id = "supplier_name")
    private WebElement nameInputField;

    @FindBy(id = "supplier_description_1_ifr")
    private WebElement descriptionIframe;

    @FindBy(id = "supplier_phone")
    private WebElement phoneInputField;

    @FindBy(id = "supplier_mobile_phone")
    private WebElement mobilePhoneInputField;

    @FindBy(id = "supplier_address")
    private WebElement addressInputField;

    @FindBy(id = "supplier_address2")
    private WebElement address2InputField;

    @FindBy(id = "supplier_post_code")
    private WebElement postCodeInputField;

    @FindBy(id = "supplier_city")
    private WebElement cityInputField;

    @FindBy(id = "supplier_id_country")
    private WebElement countrySelect;

    @FindBy(id = "supplier_id_state")
    private WebElement stateSelect;

    @FindBy(id = "supplier_dni")
    private WebElement dniInputField;

    @FindBy(id = "supplier_logo")
    private WebElement logoFileInput;

    @FindBy(id = "supplier_meta_title_1")
    private WebElement metaTitleInputField;

    @FindBy(id = "supplier_meta_description_1")
    private WebElement metaDescriptionTextArea;

    @FindBy(id = "supplier_meta_keyword_1-tokenfield")
    private WebElement metaKeywordsInputField;

    @FindBy(id = "supplier_is_enabled_0")
    private WebElement enabledNoRadioButton;

    @FindBy(id = "supplier_is_enabled_1")
    private WebElement enabledYesRadioButton;

    @FindBy(xpath = "//a[contains(@class, 'btn-outline-secondary')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    private WebElement saveButton;

    public AddSupplierPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.sendKeys(name);
    }

    public void enterPhone(String phone) {
        phoneInputField.sendKeys(phone);
    }

    public void enterMobilePhone(String mobilePhone) {
        mobilePhoneInputField.sendKeys(mobilePhone);
    }

    public void enterAddress(String address) {
        addressInputField.sendKeys(address);
    }

    public void enterAddress2(String address2) {
        address2InputField.sendKeys(address2);
    }

    public void enterPostCode(String postCode) {
        postCodeInputField.sendKeys(postCode);
    }

    public void enterCity(String city) {
        cityInputField.sendKeys(city);
    }

    public void selectCountry(String country) {
        // Implement selection logic
    }

    public void selectState(String state) {
        // Implement selection logic
    }

    public void enterDni(String dni) {
        dniInputField.sendKeys(dni);
    }

    public void uploadLogo(String filePath) {
        logoFileInput.sendKeys(filePath);
    }

    public void enterMetaTitle(String metaTitle) {
        metaTitleInputField.sendKeys(metaTitle);
    }

    public void enterMetaDescription(String metaDescription) {
        metaDescriptionTextArea.sendKeys(metaDescription);
    }

    public void enterMetaKeywords(String metaKeywords) {
        metaKeywordsInputField.sendKeys(metaKeywords);
    }

    public void setEnabled(boolean isEnabled) {
        if (isEnabled) {
            enabledYesRadioButton.click();
        } else {
            enabledNoRadioButton.click();
        }
    }

    public void clickCancel() {
        cancelButton.click();
        // Assuming it navigates to a different page
        // return new SomeOtherPage(driver);
    }

    public ProjectSummaryPage clickSave() {
        saveButton.click();
        // Assuming it navigates to a different page
        // return new ProjectSummaryPage(driver);
    }
}
```

This Java class represents a Selenium Page Object Model for the "Add Supplier" page. It includes WebElement fields for each key element on the page, interaction methods for performing actions on these elements, and a constructor to initialize the elements using PageFactory.