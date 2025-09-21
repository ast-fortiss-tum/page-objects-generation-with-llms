Below is the generated Selenium Page Object Model (POM) class in Java for the provided HTML content. The class is named `SupplierPage`, and it includes fields for key elements and methods for interactions based on the HTML structure.

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierPage {

    public WebDriver driver;

    // Constructor
    public SupplierPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(id = "page-header-desc-configuration-add")
    private WebElement addNewSupplierButton;

    @FindBy(id = "product_form_open_help")
    private WebElement helpButton;

    @FindBy(id = "subtab-AdminManufacturers")
    private WebElement brandsTab;

    @FindBy(id = "subtab-AdminSuppliers")
    private WebElement suppliersTab;

    @FindBy(id = "supplier-grid-actions-button")
    private WebElement settingsButton;

    @FindBy(id = "supplier-grid-action-import")
    private WebElement importLink;

    @FindBy(id = "supplier-grid-action-export")
    private WebElement exportLink;

    @FindBy(id = "supplier_grid_action_common_refresh_list")
    private WebElement refreshListButton;

    @FindBy(id = "supplier_grid_action_common_show_query")
    private WebElement showSqlQueryButton;

    @FindBy(id = "supplier_grid_action_common_export_sql_manager")
    private WebElement exportToSqlManagerButton;

    @FindBy(id = "supplier_grid_bulk_action_select_all")
    private WebElement selectAllCheckbox;

    @FindBy(id = "supplier_id_supplier")
    private WebElement idInputField;

    @FindBy(id = "supplier_name")
    private WebElement nameInputField;

    @FindBy(id = "supplier_products_count")
    private WebElement productsCountInputField;

    @FindBy(id = "supplier_active")
    private WebElement activeSelect;

    @FindBy(css = ".grid-search-button")
    private WebElement searchButton;

    @FindBy(css = ".alert.alert-info .alert-text")
    private WebElement infoAlertText;

    // Interaction Methods
    public AddSupplierPage clickAddNewSupplierButton() {
        addNewSupplierButton.click();
        // Assuming this leads to a new page, return the appropriate POM class
        // return new AddSupplierPage(driver);
    }

    public void clickHelpButton() {
        helpButton.click();
    }

    public void clickBrandsTab() {
        brandsTab.click();
        // Assuming this leads to a new page, return the appropriate POM class
        // return new BrandsPage(driver);
    }

    public void clickSuppliersTab() {
        suppliersTab.click();
    }

    public void clickSettingsButton() {
        settingsButton.click();
    }

    public void clickImportLink() {
        importLink.click();
        // Assuming this leads to a new page, return the appropriate POM class
        // return new ImportPage(driver);
    }

    public void clickExportLink() {
        exportLink.click();
        // Assuming this leads to a new page, return the appropriate POM class
        // return new ExportPage(driver);
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

    public void selectAllCheckbox() {
        selectAllCheckbox.click();
    }

    public void enterId(String id) {
        idInputField.sendKeys(id);
    }

    public void enterName(String name) {
        nameInputField.sendKeys(name);
    }

    public void enterProductsCount(String count) {
        productsCountInputField.sendKeys(count);
    }

    public void selectActive(String value) {
        // Assuming value is either "1" for Yes or "0" for No
        activeSelect.sendKeys(value);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getInfoAlertText() {
        return infoAlertText.getText();
    }
}
```

This class captures the key elements and interactions based on the provided HTML structure. Note that for methods that would lead to a new page, you would typically return a new instance of the corresponding POM class, but since those classes are not defined here, I've commented out those lines.