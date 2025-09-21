```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public WebDriver driver;

    @FindBy(id = "page-header-desc-configuration-add")
    private WebElement firstButton;

    @FindBy(id = "recommended-modules-button")
    private WebElement secondButton;

    @FindBy(id = "product_form_open_help")
    private WebElement firstLink;

    @FindBy(id = "catalog-tools-button")
    private WebElement thirdButton;

    @FindBy(id = "product_catalog_category_tree_filter_expand")
    private WebElement firstDropdownLink;

    @FindBy(id = "product_catalog_category_tree_filter_collapse")
    private WebElement secondDropdownLink;

    @FindBy(id = "product_catalog_category_tree_filter_reset")
    private WebElement thirdDropdownLink;

    @FindBy(id = "product_bulk_menu")
    private WebElement fourthButton;

    @FindBy(id = "bulk_action_select_all")
    private WebElement firstCheckbox;

    @FindBy(id = "filter_column_id_product_min")
    private WebElement firstInputField;

    @FindBy(id = "filter_column_id_product_max")
    private WebElement secondInputField;

    @FindBy(name = "filter_column_name")
    private WebElement thirdInputField;

    @FindBy(name = "filter_column_reference")
    private WebElement fourthInputField;

    @FindBy(name = "filter_column_name_category")
    private WebElement fifthInputField;

    @FindBy(id = "filter_column_price_min")
    private WebElement sixthInputField;

    @FindBy(id = "filter_column_price_max")
    private WebElement seventhInputField;

    @FindBy(id = "filter_column_sav_quantity_min")
    private WebElement eighthInputField;

    @FindBy(id = "filter_column_sav_quantity_max")
    private WebElement ninthInputField;

    @FindBy(name = "filter_column_active")
    private WebElement firstSelect;

    @FindBy(name = "products_filter_submit")
    private WebElement fifthButton;

    @FindBy(name = "products_filter_reset")
    private WebElement sixthButton;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstButton() {
        firstButton.click();
        // Assuming this leads to a new page, return the appropriate POM class
        // return new NewProductPage(driver);
    }

    public void clickSecondButton() {
        secondButton.click();
        // Assuming this leads to a new page, return the appropriate POM class
        // return new OptimizeCatalogPage(driver);
    }

    public void clickFirstLink() {
        firstLink.click();
        // Assuming this opens a sidebar or help section, no page navigation
    }

    public void clickThirdButton() {
        thirdButton.click();
        // Assuming this opens a dropdown, no page navigation
    }

    public void clickFirstDropdownLink() {
        firstDropdownLink.click();
        // Assuming this expands a category tree, no page navigation
    }

    public void clickSecondDropdownLink() {
        secondDropdownLink.click();
        // Assuming this collapses a category tree, no page navigation
    }

    public void clickThirdDropdownLink() {
        thirdDropdownLink.click();
        // Assuming this resets a category tree, no page navigation
    }

    public void clickFourthButton() {
        fourthButton.click();
        // Assuming this opens a dropdown, no page navigation
    }

    public void clickFirstCheckbox() {
        firstCheckbox.click();
        // Assuming this selects all checkboxes, no page navigation
    }

    public void typeInFirstInputField(String text) {
        firstInputField.sendKeys(text);
    }

    public void typeInSecondInputField(String text) {
        secondInputField.sendKeys(text);
    }

    public void typeInThirdInputField(String text) {
        thirdInputField.sendKeys(text);
    }

    public void typeInFourthInputField(String text) {
        fourthInputField.sendKeys(text);
    }

    public void typeInFifthInputField(String text) {
        fifthInputField.sendKeys(text);
    }

    public void typeInSixthInputField(String text) {
        sixthInputField.sendKeys(text);
    }

    public void typeInSeventhInputField(String text) {
        seventhInputField.sendKeys(text);
    }

    public void typeInEighthInputField(String text) {
        eighthInputField.sendKeys(text);
    }

    public void typeInNinthInputField(String text) {
        ninthInputField.sendKeys(text);
    }

    public void selectFirstSelectOption(String value) {
        // Assuming a method to select an option by value
        // new Select(firstSelect).selectByValue(value);
    }

    public void clickFifthButton() {
        fifthButton.click();
        // Assuming this performs a search, no page navigation
    }

    public void clickSixthButton() {
        sixthButton.click();
        // Assuming this resets filters, no page navigation
    }
}
```

This Java class follows the Page Object Model pattern for the provided HTML content, defining web elements and interaction methods as specified.