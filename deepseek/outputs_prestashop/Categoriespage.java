Here's the `Categoriespage.java` file following the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categoriespage {
    public WebDriver driver;

    // Header elements
    @FindBy(id = "page-header-desc-configuration-add")
    public WebElement addNewCategoryButton;

    @FindBy(id = "product_form_open_help")
    public WebElement helpButton;

    // Floating button elements
    @FindBy(css = ".btn-floating .btn-primary")
    public WebElement floatingButton;

    @FindBy(id = "page-header-desc-floating-configuration-add")
    public WebElement floatingAddNewCategoryButton;

    @FindBy(css = ".btn-floating-item.btn-help")
    public WebElement floatingHelpButton;

    // KPI elements
    @FindBy(id = "box-disabled-categories")
    public WebElement disabledCategoriesKpi;

    @FindBy(id = "box-empty-categories")
    public WebElement emptyCategoriesKpi;

    @FindBy(id = "box-top-category")
    public WebElement topCategoryKpi;

    @FindBy(id = "box-products-per-category")
    public WebElement productsPerCategoryKpi;

    @FindBy(css = ".refresh-kpis")
    public WebElement refreshKpisButton;

    // Grid elements
    @FindBy(id = "category_grid_panel")
    public WebElement gridPanel;

    @FindBy(id = "category-grid-actions-button")
    public WebElement gridActionsButton;

    @FindBy(id = "category-grid-action-import")
    public WebElement importAction;

    @FindBy(id = "category-grid-action-export")
    public WebElement exportAction;

    @FindBy(id = "category_grid_action_common_refresh_list")
    public WebElement refreshListAction;

    @FindBy(id = "category_grid_action_common_show_query")
    public WebElement showQueryAction;

    @FindBy(id = "category_grid_action_common_export_sql_manager")
    public WebElement exportSqlManagerAction;

    // Bulk actions
    @FindBy(css = ".js-bulk-actions-btn")
    public WebElement bulkActionsButton;

    @FindBy(id = "category_grid_bulk_action_select_all")
    public WebElement selectAllCheckbox;

    @FindBy(id = "category_grid_bulk_action_enable_selection")
    public WebElement enableSelectionAction;

    @FindBy(id = "category_grid_bulk_action_disable_selection")
    public WebElement disableSelectionAction;

    @FindBy(id = "category_grid_bulk_action_delete_selection")
    public WebElement deleteSelectionAction;

    // Filter elements
    @FindBy(id = "category_id_category")
    public WebElement idFilterInput;

    @FindBy(id = "category_name")
    public WebElement nameFilterInput;

    @FindBy(id = "category_description")
    public WebElement descriptionFilterInput;

    @FindBy(id = "category_position")
    public WebElement positionFilterInput;

    @FindBy(id = "category_active")
    public WebElement displayedFilterSelect;

    @FindBy(css = ".grid-search-button")
    public WebElement searchButton;

    // Modal elements
    @FindBy(id = "category_grid_delete_categories_modal")
    public WebElement deleteCategoriesModal;

    @FindBy(id = "delete_categories_delete_mode_0")
    public WebElement associateAndDisableRadio;

    @FindBy(id = "delete_categories_delete_mode_1")
    public WebElement associateOnlyRadio;

    @FindBy(id = "delete_categories_delete_mode_2")
    public WebElement removeAssociatedRadio;

    @FindBy(css = ".js-submit-delete-categories")
    public WebElement deleteModalSubmitButton;

    public Categoriespage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void clickAddNewCategory() {
        addNewCategoryButton.click();
    }

    public void clickHelpButton() {
        helpButton.click();
    }

    public void clickFloatingButton() {
        floatingButton.click();
    }

    public void clickFloatingAddNewCategory() {
        floatingAddNewCategoryButton.click();
    }

    public void clickFloatingHelpButton() {
        floatingHelpButton.click();
    }

    public void clickRefreshKpis() {
        refreshKpisButton.click();
    }

    public void clickGridActionsButton() {
        gridActionsButton.click();
    }

    public void clickImportAction() {
        importAction.click();
    }

    public void clickExportAction() {
        exportAction.click();
    }

    public void clickRefreshListAction() {
        refreshListAction.click();
    }

    public void clickShowQueryAction() {
        showQueryAction.click();
    }

    public void clickExportSqlManagerAction() {
        exportSqlManagerAction.click();
    }

    public void clickBulkActionsButton() {
        bulkActionsButton.click();
    }

    public void selectAllItems() {
        selectAllCheckbox.click();
    }

    public void clickEnableSelection() {
        enableSelectionAction.click();
    }

    public void clickDisableSelection() {
        disableSelectionAction.click();
    }

    public void clickDeleteSelection() {
        deleteSelectionAction.click();
    }

    public void filterById(String id) {
        idFilterInput.sendKeys(id);
    }

    public void filterByName(String name) {
        nameFilterInput.sendKeys(name);
    }

    public void filterByDescription(String description) {
        descriptionFilterInput.sendKeys(description);
    }

    public void filterByPosition(String position) {
        positionFilterInput.sendKeys(position);
    }

    public void filterByDisplayed(String option) {
        // Implementation depends on how you want to handle the select
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void selectAssociateAndDisableOption() {
        associateAndDisableRadio.click();
    }

    public void selectAssociateOnlyOption() {
        associateOnlyRadio.click();
    }

    public void selectRemoveAssociatedOption() {
        removeAssociatedRadio.click();
    }

    public void confirmDelete() {
        deleteModalSubmitButton.click();
    }

    // Getter methods for text values
    public String getDisabledCategoriesValue() {
        return disabledCategoriesKpi.findElement(By.cssSelector(".value")).getText();
    }

    public String getEmptyCategoriesValue() {
        return emptyCategoriesKpi.findElement(By.cssSelector(".value")).getText();
    }

    public String getTopCategoryValue() {
        return topCategoryKpi.findElement(By.cssSelector(".value")).getText();
    }

    public String getProductsPerCategoryValue() {
        return productsPerCategoryKpi.findElement(By.cssSelector(".value")).getText();
    }
}
```

Note: I noticed a missing import for `By` class which is needed for the getter methods at the bottom