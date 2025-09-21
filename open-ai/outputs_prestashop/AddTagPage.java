```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTagPage {

    public WebDriver driver;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement errorMessage;

    @FindBy(id = "name")
    private WebElement nameInputField;

    @FindBy(id = "id_lang")
    private WebElement languageDropdown;

    @FindBy(id = "select_left")
    private WebElement availableItemsSelect;

    @FindBy(id = "move_to_right")
    private WebElement addButton;

    @FindBy(id = "select_right")
    private WebElement selectedItemsSelect;

    @FindBy(id = "move_to_left")
    private WebElement removeButton;

    @FindBy(id = "tag_form_submit_btn")
    private WebElement saveButton;

    @FindBy(id = "tag_form_cancel_btn")
    private WebElement cancelButton;

    public AddTagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void selectLanguage(String language) {
        // Assuming a method to select by visible text or value
        // This is a placeholder for actual selection logic
    }

    public void addItem() {
        addButton.click();
    }

    public void removeItem() {
        removeButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clickSaveButton() {
        saveButton.click();
        // Assuming navigation to another page, return the appropriate POM class
        // return new SomeOtherPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming navigation back, return the appropriate POM class
        // return new PreviousPage(driver);
    }
}
```

### Explanation:
- The class is named `AddTagPage` as per the naming rules.
- All key elements are defined using `@FindBy` annotations.
- A constructor initializes the page elements using `PageFactory.initElements`.
- Methods are provided for interacting with the page elements, such as entering text, clicking buttons, and retrieving error messages.
- The `getErrorMessage()` method retrieves the text of the error message.
- Placeholder comments are included for actions that would typically involve navigation to another page, indicating where you would return a new page object.