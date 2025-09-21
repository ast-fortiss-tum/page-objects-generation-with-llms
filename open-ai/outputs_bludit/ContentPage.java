```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentPage {

    public WebDriver driver;

    @FindBy(xpath = "//tr[1]//a[contains(@href, 'create-your-own-content')]")
    private WebElement firstTitleLink;

    @FindBy(xpath = "//tr[1]//a[contains(@href, 'create-your-own-content') and contains(@class, 'fa-desktop')]")
    private WebElement firstViewLink;

    @FindBy(xpath = "//tr[1]//a[contains(@href, 'create-your-own-content') and contains(@class, 'fa-edit')]")
    private WebElement firstEditLink;

    @FindBy(xpath = "//tr[1]//a[contains(@class, 'deletePageButton')]")
    private WebElement firstDeleteButton;

    @FindBy(xpath = "//tr[2]//a[contains(@href, 'set-up-your-new-site')]")
    private WebElement secondTitleLink;

    @FindBy(xpath = "//tr[2]//a[contains(@href, 'set-up-your-new-site') and contains(@class, 'fa-desktop')]")
    private WebElement secondViewLink;

    @FindBy(xpath = "//tr[2]//a[contains(@href, 'set-up-your-new-site') and contains(@class, 'fa-edit')]")
    private WebElement secondEditLink;

    @FindBy(xpath = "//tr[2]//a[contains(@class, 'deletePageButton')]")
    private WebElement secondDeleteButton;

    @FindBy(xpath = "//tr[3]//a[contains(@href, 'follow-bludit')]")
    private WebElement thirdTitleLink;

    @FindBy(xpath = "//tr[3]//a[contains(@href, 'follow-bludit') and contains(@class, 'fa-desktop')]")
    private WebElement thirdViewLink;

    @FindBy(xpath = "//tr[3]//a[contains(@href, 'follow-bludit') and contains(@class, 'fa-edit')]")
    private WebElement thirdEditLink;

    @FindBy(xpath = "//tr[3]//a[contains(@class, 'deletePageButton')]")
    private WebElement thirdDeleteButton;

    @FindBy(xpath = "//button[@class='btn btn-link' and @data-dismiss='modal']")
    private WebElement cancelDeleteButton;

    @FindBy(xpath = "//button[@class='btn btn-danger deletePageModalAcceptButton']")
    private WebElement confirmDeleteButton;

    public Contentpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstTitleLink() {
        firstTitleLink.click();
    }

    public void clickFirstViewLink() {
        firstViewLink.click();
    }

    public void clickFirstEditLink() {
        firstEditLink.click();
    }

    public void clickFirstDeleteButton() {
        firstDeleteButton.click();
    }

    public void clickSecondTitleLink() {
        secondTitleLink.click();
    }

    public void clickSecondViewLink() {
        secondViewLink.click();
    }

    public void clickSecondEditLink() {
        secondEditLink.click();
    }

    public void clickSecondDeleteButton() {
        secondDeleteButton.click();
    }

    public void clickThirdTitleLink() {
        thirdTitleLink.click();
    }

    public void clickThirdViewLink() {
        thirdViewLink.click();
    }

    public void clickThirdEditLink() {
        thirdEditLink.click();
    }

    public void clickThirdDeleteButton() {
        thirdDeleteButton.click();
    }

    public void cancelDelete() {
        cancelDeleteButton.click();
    }

    public void confirmDelete() {
        confirmDeleteButton.click();
    }
}
```