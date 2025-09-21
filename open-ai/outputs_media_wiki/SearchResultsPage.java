```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

    public WebDriver driver;

    @FindBy(id = "ooui-php-1")
    private WebElement mainInputField;

    @FindBy(css = ".oo-ui-buttonElement-button")
    private WebElement searchButton;

    @FindBy(css = ".search-types li.current a")
    private WebElement firstLink;

    @FindBy(css = ".search-types li.normal:nth-child(2) a")
    private WebElement secondLink;

    @FindBy(css = ".search-types li.normal:nth-child(3) a")
    private WebElement thirdLink;

    @FindBy(css = ".search-types li.normal:nth-child(4) a")
    private WebElement fourthLink;

    @FindBy(css = ".mw-search-nonefound")
    private WebElement noResultsMessage;

    @FindBy(css = ".mw-search-exists")
    private WebElement pageExistsMessage;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSearchText(String text) {
        mainInputField.clear();
        mainInputField.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getNoResultsMessage() {
        return noResultsMessage.getText();
    }

    public String getPageExistsMessage() {
        return pageExistsMessage.getText();
    }

    public void clickFirstLink() {
        firstLink.click();
    }

    public void clickSecondLink() {
        secondLink.click();
    }

    public void clickThirdLink() {
        thirdLink.click();
    }

    public void clickFourthLink() {
        fourthLink.click();
    }
}
```

This Java class `SearchResultsPage` is a Selenium Page Object Model (POM) class that represents the search results page of a web application. It includes fields for key elements on the page, such as the search input field, search button, and various links. It also includes methods to interact with these elements, such as entering text into the search field, clicking the search button, and retrieving error messages. The class uses the `@FindBy` annotation to locate elements on the page and includes a constructor to initialize these elements using `PageFactory.initElements()`.