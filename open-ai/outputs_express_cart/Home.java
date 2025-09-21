```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    private WebDriver driver;

    // Search form elements
    @FindBy(id = "frm_search")
    private WebElement searchInputField;

    @FindBy(id = "btn_search")
    private WebElement searchButton;

    // Product elements
    @FindBy(xpath = "(//a[contains(@href, '/product/')])[1]")
    private WebElement firstProductLink;

    @FindBy(xpath = "(//a[contains(@href, '/product/')])[2]")
    private WebElement secondProductLink;

    @FindBy(xpath = "(//a[contains(@href, '/product/')])[3]")
    private WebElement thirdProductLink;

    @FindBy(xpath = "(//a[contains(@href, '/product/')])[4]")
    private WebElement fourthProductLink;

    @FindBy(xpath = "(//a[contains(@href, '/product/')])[5]")
    private WebElement fifthProductLink;

    @FindBy(xpath = "(//a[contains(@href, '/product/')])[6]")
    private WebElement sixthProductLink;

    // Add to cart buttons
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[1]")
    private WebElement firstAddToCartButton;

    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[2]")
    private WebElement secondAddToCartButton;

    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[3]")
    private WebElement thirdAddToCartButton;

    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[4]")
    private WebElement fourthAddToCartButton;

    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[5]")
    private WebElement fifthAddToCartButton;

    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[6]")
    private WebElement sixthAddToCartButton;

    // Constructor
    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        searchInputField.clear();
        searchInputField.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickFirstProductLink() {
        firstProductLink.click();
    }

    public void clickSecondProductLink() {
        secondProductLink.click();
    }

    public void clickThirdProductLink() {
        thirdProductLink.click();
    }

    public void clickFourthProductLink() {
        fourthProductLink.click();
    }

    public void clickFifthProductLink() {
        fifthProductLink.click();
    }

    public void clickSixthProductLink() {
        sixthProductLink.click();
    }

    public void clickFirstAddToCartButton() {
        firstAddToCartButton.click();
    }

    public void clickSecondAddToCartButton() {
        secondAddToCartButton.click();
    }

    public void clickThirdAddToCartButton() {
        thirdAddToCartButton.click();
    }

    public void clickFourthAddToCartButton() {
        fourthAddToCartButton.click();
    }

    public void clickFifthAddToCartButton() {
        fifthAddToCartButton.click();
    }

    public void clickSixthAddToCartButton() {
        sixthAddToCartButton.click();
    }
}
```