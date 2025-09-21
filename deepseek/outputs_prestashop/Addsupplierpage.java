Here's the `Addsupplierpage.java` class following all the specified rules:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addsupplierpage {
    public WebDriver driver;

    // Form fields
    @FindBy(id = "supplier_name")
    private WebElement nameInput;

    @FindBy(id = "supplier_description_1_ifr")
    private WebElement descriptionFrame;

    @FindBy(id = "supplier_phone")
    private WebElement phoneInput;

    @FindBy(id = "supplier_mobile_phone")
    private WebElement mobilePhoneInput;

    @FindBy(id = "supplier_address")
    private WebElement addressInput;

    @FindBy(id = "supplier_address2")
    private WebElement address2Input;

    @FindBy(id = "supplier_post_code")
    private WebElement postCodeInput;

    @FindBy(id = "supplier_city")
    private WebElement cityInput;

    @FindBy(id = "supplier_id_country")
    private WebElement countrySelect;

    @FindBy(id = "supplier_id_state")
    private WebElement stateSelect;

    @FindBy(id = "supplier_dni")
    private WebElement dniInput;

    @FindBy(id = "supplier_logo")
    private WebElement logoInput;

    @FindBy(id = "supplier_meta_title_1")
    private WebElement metaTitleInput;

    @FindBy(id = "supplier_meta_description_1")
    private WebElement metaDescriptionInput;

    @FindBy(id = "supplier_meta_keyword_1-tokenfield")
    private WebElement metaKeywordInput;

    @FindBy(id = "supplier_is_enabled_1")
    private WebElement enabledRadio;

    @FindBy(id = "supplier_is_enabled_0")
    private WebElement disabledRadio;

    // Buttons
    @FindBy(css = ".btn.btn-primary.float-right")
    private WebElement saveButton;

    @FindBy(css = ".btn.btn-outline-secondary")
    private WebElement cancelButton;

    // Error messages
    @FindBy(css = ".alert.alert-danger")
    private WebElement errorMessage;

    public Addsupplierpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods for form fields
    public void setName(String name) {
        nameInput.sendKeys(name);
    }

    public void setPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void setMobilePhone(String mobilePhone) {
        mobilePhoneInput.sendKeys(mobilePhone);
    }

    public void setAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void setAddress2(String address2) {
        address2Input.sendKeys(address2);
    }

    public void setPostCode(String postCode) {
        postCodeInput.sendKeys(postCode);
    }

    public void setCity(String city) {
        cityInput.sendKeys(city);
    }

    public void selectCountry(String country) {
        // Implementation for selecting country from dropdown
    }

    public void selectState(String state) {
        // Implementation for selecting state from dropdown
    }

    public void setDni(String dni) {
        dniInput.sendKeys(dni);
    }

    public void uploadLogo(String filePath) {
        logoInput.sendKeys(filePath);
    }

    public void setMetaTitle(String title) {
        metaTitleInput.sendKeys(title);
    }

    public void setMetaDescription(String description) {
        metaDescriptionInput.sendKeys(description);
    }

    public void setMetaKeywords(String keywords) {
        metaKeywordInput.sendKeys(keywords);
    }

    public void setEnabled(boolean enabled) {
        if (enabled) {
            enabledRadio.click();
        } else {
            disabledRadio.click();
        }
    }

    // Button click methods
    public void clickSave() {
        saveButton.click();
    }

    public SupplierListPage clickCancel() {
        cancelButton.click();
        return new SupplierListPage(driver);
    }

    // Error message method
    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
```

Notes:
1. I've created a generic `SupplierListPage` class as the return type for the cancel button click, assuming this would be the page you navigate to after cancellation.
2. The country and state selection methods are left as stubs since dropdown selection implementation can vary based on your test framework.
3. All element names are structural/generic as per the requirements.
4. The class name and filename match exactly as specified (`Addsupplierpage`).
5. Error message handling is included with a `getErrorMessage()` method.
6. All methods follow camelCase naming convention.
7. PageFactory initialization is in the constructor as required.