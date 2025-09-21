```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage {

    public WebDriver driver;

    @FindBy(id = "customer_address_customer_email")
    private WebElement emailInput;

    @FindBy(id = "customer_address_dni")
    private WebElement identificationNumberInput;

    @FindBy(id = "customer_address_alias")
    private WebElement addressAliasInput;

    @FindBy(id = "customer_address_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "customer_address_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "customer_address_company")
    private WebElement companyInput;

    @FindBy(id = "customer_address_vat_number")
    private WebElement vatNumberInput;

    @FindBy(id = "customer_address_address1")
    private WebElement addressInput;

    @FindBy(id = "customer_address_address2")
    private WebElement address2Input;

    @FindBy(id = "customer_address_postcode")
    private WebElement postalCodeInput;

    @FindBy(id = "customer_address_city")
    private WebElement cityInput;

    @FindBy(id = "customer_address_id_country")
    private WebElement countrySelect;

    @FindBy(id = "customer_address_id_state")
    private WebElement stateSelect;

    @FindBy(id = "customer_address_phone")
    private WebElement phoneInput;

    @FindBy(id = "customer_address_phone_mobile")
    private WebElement mobilePhoneInput;

    @FindBy(id = "customer_address_other")
    private WebElement otherTextarea;

    @FindBy(id = "save-button")
    private WebElement saveButton;

    @FindBy(xpath = "//a[contains(@href, 'sell/addresses')]")
    private WebElement cancelButton;

    public AddAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterIdentificationNumber(String idNumber) {
        identificationNumberInput.sendKeys(idNumber);
    }

    public void enterAddressAlias(String alias) {
        addressAliasInput.sendKeys(alias);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterCompany(String company) {
        companyInput.sendKeys(company);
    }

    public void enterVatNumber(String vatNumber) {
        vatNumberInput.sendKeys(vatNumber);
    }

    public void enterAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void enterAddress2(String address2) {
        address2Input.sendKeys(address2);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeInput.sendKeys(postalCode);
    }

    public void enterCity(String city) {
        cityInput.sendKeys(city);
    }

    public void selectCountry(String country) {
        countrySelect.sendKeys(country);
    }

    public void selectState(String state) {
        stateSelect.sendKeys(state);
    }

    public void enterPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void enterMobilePhone(String mobilePhone) {
        mobilePhoneInput.sendKeys(mobilePhone);
    }

    public void enterOtherInformation(String otherInfo) {
        otherTextarea.sendKeys(otherInfo);
    }

    public NextPage clickSaveButton() {
        saveButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new NextPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new PreviousPage(driver);
    }
}
```

This Java class follows the Page Object Model pattern for the given HTML structure. It defines WebElement fields for each input, button, and link, and provides methods to interact with these elements. The `clickSaveButton` and `clickCancelButton` methods assume navigation to another page, so you would replace the comments with the actual POM class return statements when those classes are available.