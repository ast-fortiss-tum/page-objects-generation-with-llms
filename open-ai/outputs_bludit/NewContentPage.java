```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContentPage {

    public WebDriver driver;

    // Constructor
    public Newcontentpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(id = "jsmediaManagerOpenModal")
    private WebElement imagesButton;

    @FindBy(id = "jsoptionsSidebar")
    private WebElement optionsButton;

    @FindBy(id = "jsbuttonSave")
    private WebElement saveButton;

    @FindBy(id = "jsbuttonPreview")
    private WebElement previewButton;

    @FindBy(id = "jsbuttonSwitch")
    private WebElement publishSwitch;

    @FindBy(id = "jscategory")
    private WebElement categorySelect;

    @FindBy(id = "jsdescription")
    private WebElement descriptionTextarea;

    @FindBy(id = "jscoverImagePreview")
    private WebElement coverImagePreview;

    @FindBy(id = "jsbuttonSelectCoverImage")
    private WebElement selectCoverImageButton;

    @FindBy(id = "jsbuttonRemoveCoverImage")
    private WebElement removeCoverImageButton;

    @FindBy(id = "jsdate")
    private WebElement dateInput;

    @FindBy(id = "jstypeSelector")
    private WebElement typeSelector;

    @FindBy(id = "jsposition")
    private WebElement positionInput;

    @FindBy(id = "jstags")
    private WebElement tagsInput;

    @FindBy(id = "jsparent")
    private WebElement parentSelect;

    @FindBy(id = "jstemplate")
    private WebElement templateInput;

    @FindBy(id = "jsexternalCoverImage")
    private WebElement externalCoverImageInput;

    @FindBy(id = "jsslug")
    private WebElement slugInput;

    @FindBy(id = "jsnoindex")
    private WebElement noindexCheckbox;

    @FindBy(id = "jsnofollow")
    private WebElement nofollowCheckbox;

    @FindBy(id = "jsnoarchive")
    private WebElement noarchiveCheckbox;

    @FindBy(id = "jstitle")
    private WebElement titleInput;

    @FindBy(id = "jseditor")
    private WebElement editorTextarea;

    // Interaction Methods
    public void clickImagesButton() {
        imagesButton.click();
    }

    public void clickOptionsButton() {
        optionsButton.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPreviewButton() {
        previewButton.click();
    }

    public void togglePublishSwitch() {
        publishSwitch.click();
    }

    public void selectCategory(String category) {
        categorySelect.sendKeys(category);
    }

    public void enterDescription(String description) {
        descriptionTextarea.sendKeys(description);
    }

    public void clickSelectCoverImageButton() {
        selectCoverImageButton.click();
    }

    public void clickRemoveCoverImageButton() {
        removeCoverImageButton.click();
    }

    public void enterDate(String date) {
        dateInput.sendKeys(date);
    }

    public void selectType(String type) {
        typeSelector.sendKeys(type);
    }

    public void enterPosition(String position) {
        positionInput.sendKeys(position);
    }

    public void enterTags(String tags) {
        tagsInput.sendKeys(tags);
    }

    public void selectParent(String parent) {
        parentSelect.sendKeys(parent);
    }

    public void enterTemplate(String template) {
        templateInput.sendKeys(template);
    }

    public void enterExternalCoverImage(String url) {
        externalCoverImageInput.sendKeys(url);
    }

    public void enterSlug(String slug) {
        slugInput.sendKeys(slug);
    }

    public void toggleNoindex() {
        noindexCheckbox.click();
    }

    public void toggleNofollow() {
        nofollowCheckbox.click();
    }

    public void toggleNoarchive() {
        noarchiveCheckbox.click();
    }

    public void enterTitle(String title) {
        titleInput.sendKeys(title);
    }

    public void enterEditorContent(String content) {
        editorTextarea.sendKeys(content);
    }
}
```