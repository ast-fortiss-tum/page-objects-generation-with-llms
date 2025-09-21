```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAttributePage {

    public WebDriver driver;

    @FindBy(id = "name_1")
    private WebElement nameInputField;

    @FindBy(id = "public_name_1")
    private WebElement publicNameInputField;

    @FindBy(name = "url_name_1")
    private WebElement urlInputField;

    @FindBy(name = "meta_title_1")
    private WebElement metaTitleInputField;

    @FindBy(id = "indexable_on")
    private WebElement indexableYesRadioButton;

    @FindBy(id = "indexable_off")
    private WebElement indexableNoRadioButton;

    @FindBy(id = "group_type")
    private WebElement attributeTypeDropdown;

    @FindBy(id = "attribute_group_form_submit_btn")
    private WebElement saveButton;

    @FindBy(id = "attribute_group_form_cancel_btn")
    private WebElement cancelButton;

    public AddAttributePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void enterPublicName(String publicName) {
        publicNameInputField.clear();
        publicNameInputField.sendKeys(publicName);
    }

    public void enterUrl(String url) {
        urlInputField.clear();
        urlInputField.sendKeys(url);
    }

    public void enterMetaTitle(String metaTitle) {
        metaTitleInputField.clear();
        metaTitleInputField.sendKeys(metaTitle);
    }

    public void selectIndexable(boolean isIndexable) {
        if (isIndexable) {
            indexableYesRadioButton.click();
        } else {
            indexableNoRadioButton.click();
        }
    }

    public void selectAttributeType(String type) {
        attributeTypeDropdown.sendKeys(type);
    }

    public NextPage clickSaveButton() {
        saveButton.click();
        // Assuming this action leads to another page, replace with the actual page class
        // return new NextPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming this action leads to another page, replace with the actual page class
        // return new PreviousPage(driver);
    }
}
```

This Java class represents a Selenium Page Object Model for the "Add Attribute" page. It includes fields for interacting with the form elements and methods to perform actions on those elements. The `clickSaveButton` and `clickCancelButton` methods assume navigation to another page, so you should replace the comments with the actual page class if needed.