```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {

    public WebDriver driver;

    // Constructor
    public WikiPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(id = "firstHeading")
    private WebElement headerLabel;

    @FindBy(className = "mw-helplink")
    private WebElement helpLink;

    @FindBy(css = ".oo-ui-buttonElement-button span.oo-ui-labelElement-label")
    private WebElement visualButton;

    @FindBy(css = "#ooui-1 .oo-ui-buttonElement-button span.oo-ui-labelElement-label")
    private WebElement wikitextButton;

    @FindBy(css = ".mw-jump-link[href='#mw-head']")
    private WebElement jumpToNavigationLink;

    @FindBy(css = ".mw-jump-link[href='#searchInput']")
    private WebElement jumpToSearchLink;

    @FindBy(id = "searchInput")
    private WebElement searchInputField;

    @FindBy(id = "mw-searchButton")
    private WebElement searchButton;

    @FindBy(id = "searchButton")
    private WebElement goButton;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(1) a")
    private WebElement firstPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(2) a")
    private WebElement secondPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(3) a")
    private WebElement thirdPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(4) a")
    private WebElement fourthPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(5) a")
    private WebElement fifthPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(6) a")
    private WebElement sixthPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(7) a")
    private WebElement seventhPersonalToolLink;

    @FindBy(css = "#p-personal .vector-menu-content-list li:nth-child(8) a")
    private WebElement eighthPersonalToolLink;

    // Interaction Methods
    public void clickHelpLink() {
        helpLink.click();
    }

    public void clickVisualButton() {
        visualButton.click();
    }

    public void clickWikitextButton() {
        wikitextButton.click();
    }

    public void clickJumpToNavigationLink() {
        jumpToNavigationLink.click();
    }

    public void clickJumpToSearchLink() {
        jumpToSearchLink.click();
    }

    public void enterSearchText(String text) {
        searchInputField.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickGoButton() {
        goButton.click();
    }

    public String getHeaderLabelText() {
        return headerLabel.getText();
    }

    public String getFirstPersonalToolLinkText() {
        return firstPersonalToolLink.getText();
    }

    public String getSecondPersonalToolLinkText() {
        return secondPersonalToolLink.getText();
    }

    public String getThirdPersonalToolLinkText() {
        return thirdPersonalToolLink.getText();
    }

    public String getFourthPersonalToolLinkText() {
        return fourthPersonalToolLink.getText();
    }

    public String getFifthPersonalToolLinkText() {
        return fifthPersonalToolLink.getText();
    }

    public String getSixthPersonalToolLinkText() {
        return sixthPersonalToolLink.getText();
    }

    public String getSeventhPersonalToolLinkText() {
        return seventhPersonalToolLink.getText();
    }

    public String getEighthPersonalToolLinkText() {
        return eighthPersonalToolLink.getText();
    }
}
```

This Java class `WikiPage` is a Selenium Page Object Model (POM) class that represents a web page. It includes WebElements for various elements on the page, such as buttons, links, and input fields, and provides methods to interact with these elements.