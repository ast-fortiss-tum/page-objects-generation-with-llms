```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyPage {

    public WebDriver driver;

    @FindBy(id = "page-header-desc-configuration-add")
    private WebElement addNewCurrencyButton;

    @FindBy(id = "product_form_open_help")
    private WebElement helpLink;

    public CurrencyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NewCurrencyPage clickAddNewCurrencyButton() {
        addNewCurrencyButton.click();
        return new NewCurrencyPage(driver);
    }

    public void clickHelpLink() {
        helpLink.click();
    }
}
```

### Explanation:
- The class is named `CurrencyPage` as per the naming rules.
- The `WebDriver` field is declared as `public WebDriver driver;`.
- The `@FindBy` annotations are used to locate the `addNewCurrencyButton` and `helpLink`.
- The constructor initializes the page elements using `PageFactory.initElements(driver, this);`.
- The `clickAddNewCurrencyButton()` method clicks the button and returns a new instance of `NewCurrencyPage`, assuming this is the page navigated to after clicking.
- The `clickHelpLink()` method clicks the help link, which does not navigate away from the current page, so it returns `void`.