```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {

    public WebDriver driver;

    @FindBy(id = "category_name_1")
    private WebElement nameInputField;

    @FindBy(id = "category_active_0")
    private WebElement displayedNoRadioButton;

    @FindBy(id = "category_active_1")
    private WebElement displayedYesRadioButton;

    @FindBy(id = "category_description_1_ifr")
    private WebElement descriptionIframe;

    @FindBy(id = "category_cover_image")
    private WebElement coverImageInput;

    @FindBy(id = "category_thumbnail_image")
    private WebElement thumbnailImageInput;

    @FindBy(id = "category_menu_thumbnail_images")
    private WebElement menuThumbnailImagesInput;

    @FindBy(id = "category_meta_title_1")
    private WebElement metaTitleInputField;

    @FindBy(id = "category_meta_description_1")
    private WebElement metaDescriptionTextArea;

    @FindBy(id = "category_meta_keyword_1-tokenfield")
    private WebElement metaKeywordsInputField;

    @FindBy(id = "category_link_rewrite_1")
    private WebElement friendlyUrlInputField;

    @FindBy(id = "category_group_association_0")
    private WebElement visitorGroupCheckbox;

    @FindBy(id = "category_group_association_1")
    private WebElement guestGroupCheckbox;

    @FindBy(id = "category_group_association_2")
    private WebElement customerGroupCheckbox;

    @FindBy(id = "save-button")
    private WebElement saveButton;

    @FindBy(xpath = "//a[contains(@class, 'btn-outline-secondary')]")
    private WebElement cancelButton;

    public AddCategoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
    }

    public void selectDisplayedOption(boolean isDisplayed) {
        if (isDisplayed) {
            displayedYesRadioButton.click();
        } else {
            displayedNoRadioButton.click();
        }
    }

    public void enterMetaTitle(String metaTitle) {
        metaTitleInputField.clear();
        metaTitleInputField.sendKeys(metaTitle);
    }

    public void enterMetaDescription(String metaDescription) {
        metaDescriptionTextArea.clear();
        metaDescriptionTextArea.sendKeys(metaDescription);
    }

    public void enterMetaKeywords(String metaKeywords) {
        metaKeywordsInputField.clear();
        metaKeywordsInputField.sendKeys(metaKeywords);
    }

    public void enterFriendlyUrl(String friendlyUrl) {
        friendlyUrlInputField.clear();
        friendlyUrlInputField.sendKeys(friendlyUrl);
    }

    public void selectGroupAccess(boolean visitor, boolean guest, boolean customer) {
        if (visitor) {
            if (!visitorGroupCheckbox.isSelected()) {
                visitorGroupCheckbox.click();
            }
        } else {
            if (visitorGroupCheckbox.isSelected()) {
                visitorGroupCheckbox.click();
            }
        }

        if (guest) {
            if (!guestGroupCheckbox.isSelected()) {
                guestGroupCheckbox.click();
            }
        } else {
            if (guestGroupCheckbox.isSelected()) {
                guestGroupCheckbox.click();
            }
        }

        if (customer) {
            if (!customerGroupCheckbox.isSelected()) {
                customerGroupCheckbox.click();
            }
        } else {
            if (customerGroupCheckbox.isSelected()) {
                customerGroupCheckbox.click();
            }
        }
    }

    public NextPage clickSaveButton() {
        saveButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new NextPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming this action leads to another page, return the appropriate POM class
        // return new PreviousPage(driver);
    }
}
```

This Java class represents a Selenium Page Object Model for the "Add Category" page. It includes fields for interacting with various elements on the page, such as input fields, radio buttons, and checkboxes. Methods are provided to perform actions like entering text, selecting options, and clicking buttons.