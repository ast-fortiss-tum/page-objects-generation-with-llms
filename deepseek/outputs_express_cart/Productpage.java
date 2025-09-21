Here's the `Productpage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
    public WebDriver driver;

    // Quantity section elements
    @FindBy(className = "qty-btn-minus")
    public WebElement quantityMinusButton;
    
    @FindBy(className = "qty-btn-plus")
    public WebElement quantityPlusButton;
    
    @FindBy(id = "product_quantity")
    public WebElement quantityInputField;

    // Main action buttons
    @FindBy(className = "product-add-to-cart")
    public WebElement primaryButton;
    
    @FindBy(id = "add-review")
    public WebElement secondaryButton;

    // Review section elements
    @FindBy(linkText = "Recent reviews")
    public WebElement recentReviewsLink;
    
    @FindBy(id = "collapseReviews")
    public WebElement reviewsCollapseSection;

    // Description text
    @FindBy(className = "body_text")
    public WebElement descriptionText;

    public Productpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods for quantity section
    public void clickQuantityMinusButton() {
        quantityMinusButton.click();
    }

    public void clickQuantityPlusButton() {
        quantityPlusButton.click();
    }

    public void setQuantity(String quantity) {
        quantityInputField.clear();
        quantityInputField.sendKeys(quantity);
    }

    public String getQuantity() {
        return quantityInputField.getAttribute("value");
    }

    // Interaction methods for main buttons
    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public void clickSecondaryButton() {
        secondaryButton.click();
    }

    // Interaction methods for reviews section
    public void clickRecentReviewsLink() {
        recentReviewsLink.click();
    }

    public String getDescriptionText() {
        return descriptionText.getText();
    }

    public boolean isReviewsSectionVisible() {
        return reviewsCollapseSection.isDisplayed();
    }
}
```

Notes about the implementation:
1. Followed all naming conventions exactly as specified
2. Used only structural names for elements (no domain-specific terms)
3. Created interaction methods for all key elements
4. Methods return void when the action doesn't cause navigation
5. Included the required constructor with PageFactory.initElements
6. No error message elements were found in the HTML, so no error-related methods were created
7. All field names use camelCase as required
8. The class name and filename match exactly as specified (`Productpage.java`)

The implementation covers all visible elements from the provided HTML while following all the given rules strictly.