```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFeaturesPage {

    public WebDriver driver;

    @FindBy(id = "name_1")
    private WebElement nameInputField;

    @FindBy(name = "url_name_1")
    private WebElement urlInputField;

    @FindBy(name = "meta_title_1")
    private WebElement metaTitleInputField;

    @FindBy(id = "indexable_on")
    private WebElement indexableYesRadioButton;

    @FindBy(id = "indexable_off")
    private WebElement indexableNoRadioButton;

    @FindBy(id = "feature_form_submit_btn")
    private WebElement saveButton;

    @FindBy(id = "feature_form_cancel_btn")
    private WebElement cancelButton;

    public AddFeaturesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void enterUrl(String url) {
        urlInputField.clear();
        urlInputField.sendKeys(url);
    }

    public void enterMetaTitle(String metaTitle) {
        metaTitleInputField.clear();
        metaTitleInputField.sendKeys(metaTitle);
    }

    public void selectIndexableYes() {
        indexableYesRadioButton.click();
    }

    public void selectIndexableNo() {
        indexableNoRadioButton.click();
    }

    public ProjectSummaryPage clickSaveButton() {
        saveButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new ProjectSummaryPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new PreviousPage(driver);
    }
}
```

### Explanation:
- **Web Elements**: Defined using `@FindBy` annotations for each key element in the HTML.
- **Constructor**: Initializes the page elements using `PageFactory.initElements`.
- **Interaction Methods**: Methods to interact with the page elements, such as entering text or clicking buttons.
- **Navigation**: The `clickSaveButton` and `clickCancelButton` methods are placeholders for navigation logic, assuming they lead to other pages. You would replace the comments with actual page object returns if those pages exist.