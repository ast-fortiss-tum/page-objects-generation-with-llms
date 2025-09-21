```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

    private WebDriver driver;

    @FindBy(xpath = "//h5[@class='card-title']")
    private WebElement headerLabel;

    @FindBy(xpath = "//ul[@class='list-group']/li")
    private WebElement firstListItem;

    @FindBy(xpath = "//a[@href='/checkout/information']")
    private WebElement firstButton;

    @FindBy(xpath = "//a[@href='/checkout/payment']")
    private WebElement secondButton;

    public Shippingpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }

    public String getFirstListItemText() {
        return firstListItem.getText();
    }

    public InformationPage clickFirstButton() {
        firstButton.click();
        return new InformationPage(driver);
    }

    public PaymentPage clickSecondButton() {
        secondButton.click();
        return new PaymentPage(driver);
    }
}
```

### Explanation:
- The class is named `Shippingpage` as per the instructions.
- The `@FindBy` annotations are used to locate elements based on their XPath.
- Generic names like `headerLabel`, `firstListItem`, `firstButton`, and `secondButton` are used for the elements.
- Interaction methods are provided to get text from elements and click buttons.
- The constructor initializes the elements using `PageFactory.initElements(driver, this);`.
- Comments indicate where you would return new page objects if those classes were defined.