```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reviewform {

    private WebDriver driver;

    @FindBy(id = "review-title")
    private WebElement titleInputField;

    @FindBy(id = "review-description")
    private WebElement descriptionTextArea;

    @FindBy(id = "review-rating")
    private WebElement ratingInputField;

    @FindBy(xpath = "//button[@data-dismiss='modal' and contains(text(), 'Cancel')]")
    private WebElement cancelButton;

    @FindBy(id = "addReview")
    private WebElement addReviewButton;

    public Reviewform(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTitle(String title) {
        titleInputField.clear();
        titleInputField.sendKeys(title);
    }

    public void enterDescription(String description) {
        descriptionTextArea.clear();
        descriptionTextArea.sendKeys(description);
    }

    public void enterRating(String rating) {
        ratingInputField.clear();
        ratingInputField.sendKeys(rating);
    }

    public void clickCancelButton() {
        cancelButton.click();
    }

    public void clickAddReviewButton() {
        addReviewButton.click();
    }
}
```