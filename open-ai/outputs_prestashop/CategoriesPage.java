```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {

    public WebDriver driver;

    @FindBy(id = "page-header-desc-configuration-add")
    private WebElement addNewCategoryButton;

    @FindBy(id = "product_form_open_help")
    private WebElement helpButton;

    @FindBy(css = ".btn-floating .btn-primary")
    private WebElement floatingAddButton;

    @FindBy(id = "box-disabled-categories")
    private WebElement disabledCategoriesBox;

    @FindBy(id = "box-empty-categories")
    private WebElement emptyCategoriesBox;

    @FindBy(id = "box-top-category")
    private WebElement topCategoryBox;

    @FindBy(id = "box-products-per-category")
    private WebElement productsPerCategoryBox;

    @FindBy(css = ".refresh-kpis")
    private WebElement refreshKpisButton;

    @FindBy(id = "category_grid_actions_button")
    private WebElement settingsButton;

    @FindBy(id = "category_grid_action_import")
    private WebElement importLink;

    @FindBy(id = "category_grid_action_export")
    private WebElement exportLink;

    @FindBy(id = "category_grid_action_common_refresh_list")
    private WebElement refreshListButton;

    @FindBy(id = "category_grid_action_common_show_query")
    private WebElement showSqlQueryButton;

    @FindBy(id = "category_grid_action_common_export_sql_manager")
    private WebElement exportToSqlManagerButton;

    @FindBy(id = "category_grid_bulk_action_select_all")
    private WebElement selectAllCheckbox;

    @FindBy(id = "category_id_category")
    private WebElement searchIdInput;

    @FindBy(id = "category_name")
    private WebElement searchNameInput;

    @FindBy(id = "category_description")
    private WebElement searchDescriptionInput;

    @FindBy(id = "category_position")
    private WebElement searchPositionInput;

    @FindBy(id = "category_active")
    private WebElement searchActiveSelect;

    @FindBy(css = ".grid-search-button")
    private WebElement searchButton;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewCategory() {
        addNewCategoryButton.click();
    }

    public void clickHelp() {
        helpButton.click();
    }

    public void clickFloatingAddButton() {
        floatingAddButton.click();
    }

    public String getDisabledCategoriesValue() {
        return disabledCategoriesBox.findElement(By.cssSelector(".value")).getText();
    }

    public String getEmptyCategoriesValue() {
        return emptyCategoriesBox.findElement(By.cssSelector(".value")).getText();
    }

    public String getTopCategoryValue() {
        return topCategoryBox.findElement(By.cssSelector(".value")).getText();
    }

    public String getProductsPerCategoryValue() {
        return productsPerCategoryBox.findElement(By.cssSelector(".value")).getText();
    }

    public void clickRefreshKpis() {
        refreshKpisButton.click();
    }

    public void clickSettings() {
        settingsButton.click();
    }

    public void clickImport() {
        importLink.click();
    }

    public void clickExport() {
        exportLink.click();
    }

    public void clickRefreshList() {
        refreshListButton.click();
    }

    public void clickShowSqlQuery() {
        showSqlQueryButton.click();
    }

    public void clickExportToSqlManager() {
        exportToSqlManagerButton.click();
    }

    public void selectAllCategories() {
        selectAllCheckbox.click();
    }

    public void searchById(String id) {
        searchIdInput.sendKeys(id);
        searchButton.click();
    }

    public void searchByName(String name) {
        searchNameInput.sendKeys(name);
        searchButton.click();
    }

    public void searchByDescription(String description) {
        searchDescriptionInput.sendKeys(description);
        searchButton.click();
    }

    public void searchByPosition(String position) {
        searchPositionInput.sendKeys(position);
        searchButton.click();
    }

    public void searchByActiveStatus(String status) {
        searchActiveSelect.sendKeys(status);
        searchButton.click();
    }
}
```