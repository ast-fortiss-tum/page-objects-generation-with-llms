Here's the Selenium Page Object Model (POM) class for the provided HTML content, following all your specified rules:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addressespage {
    public WebDriver driver;

    // Header elements
    @FindBy(id = "address-grid-actions-button")
    public WebElement settingsButton;

    @FindBy(id = "address_grid_action_common_refresh_list")
    public WebElement refreshListButton;

    @FindBy(id = "address_grid_action_common_show_query")
    public WebElement showSqlQueryButton;

    @FindBy(id = "address_grid_action_common_export_sql_manager")
    public WebElement exportSqlManagerButton;

    // Bulk actions
    @FindBy(className = "js-bulk-actions-btn")
    public WebElement bulkActionsButton;

    @FindBy(id = "address_grid_bulk_action_select_all")
    public WebElement bulkSelectAllCheckbox;

    @FindBy(id = "address_grid_bulk_action_delete_selection")
    public WebElement bulkDeleteSelectedButton;

    // Filter form inputs
    @FindBy(id = "address_id_address")
    public WebElement idInputField;

    @FindBy(id = "address_firstname")
    public WebElement firstNameInputField;

    @FindBy(id = "address_lastname")
    public WebElement lastNameInputField;

    @FindBy(id = "address_address1")
    public WebElement addressInputField;

    @FindBy(id = "address_postcode")
    public WebElement postcodeInputField;

    @FindBy(id = "address_city")
    public WebElement cityInputField;

    @FindBy(id = "address_id_country")
    public WebElement countryDropdown;

    @FindBy(css = "button[name='address[actions][search]']")
    public WebElement searchButton;

    // Table actions
    @FindBy(css = ".grid-edit-row-link")
    public WebElement firstEditLink;

    @FindBy(css = ".grid-delete-row-link")
    public WebElement firstDeleteLink;

    // Required fields section
    @FindBy(css = "button[data-target='#addressRequiredFieldsContainer']")
    public WebElement setRequiredFieldsButton;

    @FindBy(id = "required_fields_address_required_fields_0")
    public WebElement companyRequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_1")
    public WebElement address2RequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_2")
    public WebElement postcodeRequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_3")
    public WebElement otherRequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_4")
    public WebElement phoneRequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_5")
    public WebElement phoneMobileRequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_6")
    public WebElement vatNumberRequiredCheckbox;

    @FindBy(id = "required_fields_address_required_fields_7")
    public WebElement dniRequiredCheckbox;

    @FindBy(css = "#addressRequiredFieldsContainer .btn-primary")
    public WebElement saveRequiredFieldsButton;

    // Modal elements
    @FindBy(id = "address_grid_common_show_query_modal")
    public WebElement sqlQueryModal;

    @FindBy(css = "#address_grid_common_show_query_modal .close")
    public WebElement closeModalButton;

    @FindBy(css = "#address_grid_common_show_query_modal .btn-sql-submit")
    public WebElement exportToSqlManagerModalButton;

    // Confirmation message
    @FindBy(id = "ajax_confirmation")
    public WebElement confirmationMessage;

    public Addressespage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods for settings dropdown
    public void clickSettingsButton() {
        settingsButton.click();
    }

    public void clickRefreshListButton() {
        refreshListButton.click();
    }

    public void clickShowSqlQueryButton() {
        showSqlQueryButton.click();
    }

    public void clickExportSqlManagerButton() {
        exportSqlManagerButton.click();
    }

    // Interaction methods for bulk actions
    public void clickBulkActionsButton() {
        bulkActionsButton.click();
    }

    public void selectAllItems() {
        bulkSelectAllCheckbox.click();
    }

    public void deleteSelectedItems() {
        bulkDeleteSelectedButton.click();
    }

    // Interaction methods for filter form
    public void enterId(String id) {
        idInputField.sendKeys(id);
    }

    public void enterFirstName(String firstName) {
        firstNameInputField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInputField.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        addressInputField.sendKeys(address);
    }

    public void enterPostcode(String postcode) {
        postcodeInputField.sendKeys(postcode);
    }

    public void enterCity(String city) {
        cityInputField.sendKeys(city);
    }

    public void selectCountry(String country) {
        // Implementation for selecting a country from dropdown
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    // Interaction methods for table actions
    public void clickFirstEditLink() {
        firstEditLink.click();
    }

    public void clickFirstDeleteLink() {
        firstDeleteLink.click();
    }

    // Interaction methods for required fields section
    public void clickSetRequiredFieldsButton() {
        setRequiredFieldsButton.click();
    }

    public void toggleCompanyRequired() {
        companyRequiredCheckbox.click();
    }

    public void toggleAddress2Required() {
        address2RequiredCheckbox.click();
    }

    public void togglePostcodeRequired() {
        postcodeRequiredCheckbox.click();
    }

    public void toggleOtherRequired() {
        otherRequiredCheckbox.click();
    }

    public void togglePhoneRequired() {
        phoneRequiredCheckbox.click();
    }

    public void togglePhoneMobileRequired() {
        phoneMobileRequiredCheckbox.click();
    }

    public void toggleVatNumberRequired() {
        vatNumberRequiredCheckbox.click();
    }

    public void toggleDniRequired() {
        dniRequiredCheckbox.click();
    }

    public void clickSaveRequiredFieldsButton() {
        saveRequiredFieldsButton.click();
    }

    // Interaction methods for modal
    public void closeSqlQueryModal() {
        closeModalButton.click();
    }

    public void exportToSqlManagerFromModal() {
        exportToSqlManagerModalButton.click();
    }

    // Method to get confirmation message
    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}
```

This P