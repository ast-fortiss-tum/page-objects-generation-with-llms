```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;

    // Page elements
    @FindBy(id = "firstHeading")
    private WebElement headerLabel;

    @FindBy(id = "siteSub")
    private WebElement subHeaderLabel;

    @FindBy(css = "a[href='#mw-head']")
    private WebElement jumpToNavigationLink;

    @FindBy(css = "a[href='#searchInput']")
    private WebElement jumpToSearchLink;

    @FindBy(css = "a[href='/index.php?title=Special:UserLogin&returnto=Main+Page']")
    private WebElement loginLink;

    @FindBy(css = "a[href='/index.php/Main_Page']")
    private WebElement mainPageLink;

    @FindBy(css = "a[href='/index.php?title=Talk:Main_Page&action=edit&redlink=1']")
    private WebElement discussionLink;

    @FindBy(css = "a[href='/index.php?title=Main_Page&action=edit']")
    private WebElement viewSourceLink;

    @FindBy(css = "a[href='/index.php?title=Main_Page&action=history']")
    private WebElement viewHistoryLink;

    @FindBy(id = "searchInput")
    private WebElement searchInputField;

    @FindBy(id = "mw-searchButton")
    private WebElement searchButton;

    @FindBy(id = "searchButton")
    private WebElement goButton;

    @FindBy(css = "a[href='/index.php/Special:RecentChanges']")
    private WebElement recentChangesLink;

    @FindBy(css = "a[href='/index.php/Special:Random']")
    private WebElement randomPageLink;

    @FindBy(css = "a[href='https://www.mediawiki.org/wiki/Special:MyLanguage/Help:Contents']")
    private WebElement helpLink;

    @FindBy(css = "a[href='/index.php/Special:WhatLinksHere/Main_Page']")
    private WebElement whatLinksHereLink;

    @FindBy(css = "a[href='/index.php/Special:RecentChangesLinked/Main_Page']")
    private WebElement relatedChangesLink;

    @FindBy(css = "a[href='/index.php/Special:SpecialPages']")
    private WebElement specialPagesLink;

    @FindBy(css = "a[href='javascript:print();']")
    private WebElement printableVersionLink;

    @FindBy(css = "a[href='http://localhost:8080/index.php?title=Main_Page&oldid=1']")
    private WebElement permanentLink;

    @FindBy(css = "a[href='/index.php?title=Main_Page&action=info']")
    private WebElement pageInformationLink;

    @FindBy(css = "a[href='/index.php?title=Special:CiteThisPage&page=Main_Page&id=1&wpFormIdentifier=titleform']")
    private WebElement citeThisPageLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void clickLoginLink() {
        loginLink.click();
    }

    public void clickMainPageLink() {
        mainPageLink.click();
    }

    public void clickDiscussionLink() {
        discussionLink.click();
    }

    public void clickViewSourceLink() {
        viewSourceLink.click();
    }

    public void clickViewHistoryLink() {
        viewHistoryLink.click();
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

    public void clickRecentChangesLink() {
        recentChangesLink.click();
    }

    public void clickRandomPageLink() {
        randomPageLink.click();
    }

    public void clickHelpLink() {
        helpLink.click();
    }

    public void clickWhatLinksHereLink() {
        whatLinksHereLink.click();
    }

    public void clickRelatedChangesLink() {
        relatedChangesLink.click();
    }

    public void clickSpecialPagesLink() {
        specialPagesLink.click();
    }

    public void clickPrintableVersionLink() {
        printableVersionLink.click();
    }

    public void clickPermanentLink() {
        permanentLink.click();
    }

    public void clickPageInformationLink() {
        pageInformationLink.click();
    }

    public void clickCiteThisPageLink() {
        citeThisPageLink.click();
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }

    public String getSubHeaderText() {
        return subHeaderLabel.getText();
    }
}
```