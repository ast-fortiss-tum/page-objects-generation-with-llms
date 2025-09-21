```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public WebDriver driver;

    // Constructor
    public EmployeesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(id = "page-header-desc-configuration-add")
    private WebElement addNewEmployeeLink;

    @FindBy(id = "product_form_open_help")
    private WebElement helpLink;

    @FindBy(id = "employee-grid-actions-button")
    private WebElement settingsButton;

    @FindBy(id = "employee_grid_action_common_refresh_list")
    private WebElement refreshListButton;

    @FindBy(id = "employee_grid_action_common_show_query")
    private WebElement showSqlQueryButton;

    @FindBy(id = "employee_grid_action_common_export_sql_manager")
    private WebElement exportToSqlManagerButton;

    @FindBy(id = "employee_grid_bulk_action_select_all")
    private WebElement selectAllCheckbox;

    @FindBy(id = "employee_id_employee")
    private WebElement searchIdInput;

    @FindBy(id = "employee_firstname")
    private WebElement searchFirstNameInput;

    @FindBy(id = "employee_lastname")
    private WebElement searchLastNameInput;

    @FindBy(id = "employee_email")
    private WebElement searchEmailInput;

    @FindBy(id = "employee_profile")
    private WebElement searchProfileSelect;

    @FindBy(id = "employee_active")
    private WebElement searchActiveSelect;

    @FindBy(css = ".grid-search-button")
    private WebElement searchButton;

    @FindBy(css = ".btn-sql-submit")
    private WebElement exportToSqlManagerModalButton;

    // Interaction Methods
    public AddEmployeePage clickAddNewEmployee() {
        addNewEmployeeLink.click();
        // Assuming this navigates to a new page, return the appropriate POM class
        // return new AddEmployeePage(driver);
    }

    public void clickHelp() {
        helpLink.click();
        // Assuming this opens a sidebar or modal, no page navigation
    }

    public void clickSettings() {
        settingsButton.click();
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

    public void selectAllEmployees() {
        selectAllCheckbox.click();
    }

    public void searchById(String id) {
        searchIdInput.clear();
        searchIdInput.sendKeys(id);
    }

    public void searchByFirstName(String firstName) {
        searchFirstNameInput.clear();
        searchFirstNameInput.sendKeys(firstName);
    }

    public void searchByLastName(String lastName) {
        searchLastNameInput.clear();
        searchLastNameInput.sendKeys(lastName);
    }

    public void searchByEmail(String email) {
        searchEmailInput.clear();
        searchEmailInput.sendKeys(email);
    }

    public void selectProfile(String profile) {
        searchProfileSelect.sendKeys(profile);
    }

    public void selectActiveStatus(String status) {
        searchActiveSelect.sendKeys(status);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void clickExportToSqlManagerModal() {
        exportToSqlManagerModalButton.click();
    }
}
```

This Java class `EmployeesPage` is a Selenium Page Object Model (POM) class that represents the Employees page of a web application. It includes WebElements for key elements on the page and interaction methods to perform actions on these elements. The class follows the naming conventions and rules specified in the instructions.