```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {

    public WebDriver driver;

    @FindBy(id = "address-grid-actions-button")
    private WebElement settingsButton;

    @FindBy(id = "address_grid_action_common_refresh_list")
    private WebElement refreshListButton;

    @FindBy(id = "address_grid_action_common_show_query")
    private WebElement showSqlQueryButton;

    @FindBy(id = "address_grid_action_common_export_sql_manager")
    private WebElement exportToSqlManagerButton;

    @FindBy(id = "address_grid_bulk_action_select_all")
    private WebElement selectAllCheckbox;

    @FindBy(id = "address_id_address")
    private WebElement searchIdInput;

    @FindBy(id = "address_firstname")
    private WebElement searchFirstNameInput;

    @FindBy(id = "address_lastname")
    private WebElement searchLastNameInput;

    @FindBy(id = "address_address1")
    private WebElement searchAddressInput;

    @FindBy(id = "address_postcode")
    private WebElement searchPostcodeInput;

    @FindBy(id = "address_city")
    private WebElement searchCityInput;

    @FindBy(id = "address_id_country")
    private WebElement searchCountrySelect;

    @FindBy(css = ".grid-search-button")
    private WebElement searchButton;

    @FindBy(css = ".js-bulk-actions-btn")
    private WebElement bulkActionsButton;

    @FindBy(id = "address_grid_bulk_action_delete_selection")
    private WebElement deleteSelectedButton;

    @FindBy(css = ".btn-primary[data-toggle='collapse']")
    private WebElement setRequiredFieldsButton;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSettingsButton() {
        settingsButton.click();
    }

    public void clickRefreshListButton() {
        refreshListButton.click();
    }

    public void clickShowSqlQueryButton() {
        showSqlQueryButton.click();
    }

    public void clickExportToSqlManagerButton() {
        exportToSqlManagerButton.click();
    }

    public void selectAllAddresses() {
        selectAllCheckbox.click();
    }

    public void enterSearchId(String id) {
        searchIdInput.clear();
        searchIdInput.sendKeys(id);
    }

    public void enterSearchFirstName(String firstName) {
        searchFirstNameInput.clear();
        searchFirstNameInput.sendKeys(firstName);
    }

    public void enterSearchLastName(String lastName) {
        searchLastNameInput.clear();
        searchLastNameInput.sendKeys(lastName);
    }

    public void enterSearchAddress(String address) {
        searchAddressInput.clear();
        searchAddressInput.sendKeys(address);
    }

    public void enterSearchPostcode(String postcode) {
        searchPostcodeInput.clear();
        searchPostcodeInput.sendKeys(postcode);
    }

    public void enterSearchCity(String city) {
        searchCityInput.clear();
        searchCityInput.sendKeys(city);
    }

    public void selectSearchCountry(String country) {
        searchCountrySelect.sendKeys(country);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickBulkActionsButton() {
        bulkActionsButton.click();
    }

    public void clickDeleteSelectedButton() {
        deleteSelectedButton.click();
    }

    public void clickSetRequiredFieldsButton() {
        setRequiredFieldsButton.click();
    }
}
```