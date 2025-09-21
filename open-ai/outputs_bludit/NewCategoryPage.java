```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCategoryPage {

    public WebDriver driver;

    @FindBy(id = "jsname")
    private WebElement nameInputField;

    @FindBy(id = "jsdescription")
    private WebElement descriptionTextArea;

    @FindBy(name = "save")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@href='/admin/categories']")
    private WebElement cancelButton;

    public Newcategorypage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void enterDescription(String description) {
        descriptionTextArea.clear();
        descriptionTextArea.sendKeys(description);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }
}
```

### Explanation:
- The class is named `Newcategorypage` as specified.
- The `WebDriver` field is declared at the top.
- Web elements are defined using `@FindBy` annotations with generic names based on their function or position.
- Interaction methods are provided for entering text into the input fields and clicking the buttons.
- The constructor initializes the page elements using `PageFactory.initElements`.