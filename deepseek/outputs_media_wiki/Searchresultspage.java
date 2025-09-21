Here's the `Searchresultspage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultspage {
    public WebDriver driver;

    // Search form elements
    @FindBy(id = "ooui-php-1")
    private WebElement searchInputField;

    @FindBy(css = ".oo-ui-actionFieldLayout-button button")
    private WebElement searchButton;

    // Search type links
    @FindBy(css = ".search-types li.current a")
    private WebElement contentPagesLink;

    @FindBy(css = ".search-types li.normal:nth-child(1) a")
    private WebElement multimediaLink;

    @FindBy(css = ".search-types li.normal:nth-child(2) a")
    private WebElement everythingLink;

    @FindBy(css = ".search-types li.normal:nth-child(3) a")
    private WebElement advancedLink;

    // Search results elements
    @FindBy(css = ".mw-search-nonefound")
    private WebElement noResultsMessage;

    @FindBy(css = ".mw-search-exists")
    private WebElement pageExistsMessage;

    @FindBy(css = ".mw-search-exists a")
    private WebElement existingPageLink;

    // Footer link
    @FindBy(css = ".printfooter a")
    private WebElement footerLink;

    public Searchresultspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods for search form
    public void setSearchInput(String text) {
        searchInputField.clear();
        searchInputField.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    // Interaction methods for search type links
    public Searchresultspage clickContentPagesLink() {
        contentPagesLink.click();
        return new Searchresultspage(driver);
    }

    public Searchresultspage clickMultimediaLink() {
        multimediaLink.click();
        return new Searchresultspage(driver);
    }

    public Searchresultspage clickEverythingLink() {
        everythingLink.click();
        return new Searchresultspage(driver);
    }

    public Searchresultspage clickAdvancedLink() {
        advancedLink.click();
        return new Searchresultspage(driver);
    }

    // Methods for retrieving messages
    public String getNoResultsMessage() {
        return noResultsMessage.getText();
    }

    public String getPageExistsMessage() {
        return pageExistsMessage.getText();
    }

    // Method for clicking existing page link
    public Searchresultspage clickExistingPageLink() {
        existingPageLink.click();
        return new Searchresultspage(driver);
    }

    // Method for footer link
    public Searchresultspage clickFooterLink() {
        footerLink.click();
        return new Searchresultspage(driver);
    }
}
```

This implementation:
1. Follows the exact class name requirement (`Searchresultspage`)
2. Includes all required WebElement fields with @FindBy annotations
3. Uses generic, structural field names as specified
4. Includes interaction methods that return appropriate types (void or new page objects)
5. Has the required constructor with PageFactory.initElements
6. Includes methods for retrieving error/status messages
7. Follows all naming conventions and structural requirements
8. Only uses elements present in the provided HTML