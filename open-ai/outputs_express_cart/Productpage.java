```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {

    private WebDriver driver;

    @FindBy(className = "qty-btn-minus")
    private WebElement decrementButton;

    @FindBy(id = "product_quantity")
    private WebElement quantityInputField;

    @FindBy(className = "qty-btn-plus")
    private WebElement incrementButton;

    @FindBy(className = "product-add-to-cart")
    private WebElement addToCartButton;

    @FindBy(id = "add-review")
    private WebElement addReviewButton;

    @FindBy(css = "a[href='#collapseReviews']")
    private WebElement recentReviewsLink;

    @FindBy(id = "collapseReviews")
    private WebElement reviewsSection;

    public Productpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDecrementButton() {
        decrementButton.click();
    }

    public void setQuantity(String quantity) {
        quantityInputField.clear();
        quantityInputField.sendKeys(quantity);
    }

    public void clickIncrementButton() {
        incrementButton.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickAddReviewButton() {
        addReviewButton.click();
    }

    public void clickRecentReviewsLink() {
        recentReviewsLink.click();
    }

    public boolean isReviewsSectionDisplayed() {
        return reviewsSection.isDisplayed();
    }
}
```

This Java class, `Productpage`, is a Selenium Page Object Model representation of the provided HTML content. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The class is initialized with a WebDriver instance, and `PageFactory.initElements(driver, this);` is used to initialize the web elements.