```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {

    public WebDriver driver;

    // WebElements
    @FindBy(id = "page-header-desc-configuration-add")
    private WebElement addNewOrderLink;

    @FindBy(id = "recommended-modules-button")
    private WebElement boostSalesLink;

    @FindBy(id = "product_form_open_help")
    private WebElement helpLink;

    @FindBy(css = ".btn-floating .btn-primary")
    private WebElement floatingAddButton;

    @FindBy(id = "page-header-desc-floating-configuration-add")
    private WebElement floatingAddNewOrderLink;

    @FindBy(css = ".btn-floating-item.btn-help")
    private WebElement floatingHelpLink;

    // Constructor
    public OrdersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction Methods
    public NewOrderPage clickAddNewOrderLink() {
        addNewOrderLink.click();
        return new NewOrderPage(driver);
    }

    public BoostSalesPage clickBoostSalesLink() {
        boostSalesLink.click();
        return new BoostSalesPage(driver);
    }

    public void clickHelpLink() {
        helpLink.click();
    }

    public void clickFloatingAddButton() {
        floatingAddButton.click();
    }

    public NewOrderPage clickFloatingAddNewOrderLink() {
        floatingAddNewOrderLink.click();
        return new NewOrderPage(driver);
    }

    public void clickFloatingHelpLink() {
        floatingHelpLink.click();
    }
}
```

### Explanation:
- **WebDriver Field**: The `driver` field is declared as instructed.
- **WebElements**: All key elements are defined using `@FindBy` annotations with generic names based on their structure or position.
- **Constructor**: Initializes the page elements using `PageFactory.initElements`.
- **Interaction Methods**: Methods are created to interact with the elements, returning appropriate POM classes when navigation is expected.