```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {

    @FindBy(xpath = "//h1")
    private WebElement headerLabel;

    @FindBy(xpath = "//div[@class='product-item']//a")
    private WebElement firstProductLink;

    @FindBy(xpath = "//div[@class='product-item']//h3")
    private WebElement firstProductTitle;

    @FindBy(xpath = "//div[@class='product-item']//h4")
    private WebElement firstProductPrice;

    @FindBy(xpath = "//div[@class='product-item']//a[@class='btn btn-primary add-to-cart']")
    private WebElement firstAddToCartButton;

    private WebDriver driver;

    public SearchResults(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }

    public String getFirstProductTitle() {
        return firstProductTitle.getText();
    }

    public String getFirstProductPrice() {
        return firstProductPrice.getText();
    }

    public void clickFirstProductLink() {
        firstProductLink.click();
        // Assuming a ProductPage class exists
        // return new ProductPage(driver);
    }

    public void clickFirstAddToCartButton() {
        firstAddToCartButton.click();
    }
}
```

This Java class, `Searchresults`, is a Selenium Page Object Model representation of the provided HTML content. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The class includes a constructor that initializes the elements using `PageFactory.initElements(driver, this);`.