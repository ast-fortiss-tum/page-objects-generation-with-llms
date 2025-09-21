```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagsPage {

    public WebDriver driver;

    @FindBy(className = "toolbar_btn")
    private WebElement menuButton;

    @FindBy(id = "page-header-desc-tag-new_tag")
    private WebElement addNewTagButton;

    @FindBy(className = "btn-help")
    private WebElement helpButton;

    @FindBy(className = "alert-success")
    private WebElement successMessage;

    public TagsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public NewTagPage clickAddNewTagButton() {
        addNewTagButton.click();
        return new NewTagPage(driver);
    }

    public void clickHelpButton() {
        helpButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
```

In this `TagsPage` class, I've defined the key elements using `@FindBy` annotations and provided methods to interact with these elements. The `clickAddNewTagButton()` method returns a new instance of `NewTagPage`, assuming that clicking this button navigates to a new page. The `getSuccessMessage()` method retrieves the text of the success message.