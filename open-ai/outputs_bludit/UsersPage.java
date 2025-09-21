```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

    public WebDriver driver;

    @FindBy(xpath = "//h2/span[2]")
    private WebElement headerLabel;

    @FindBy(xpath = "//a[@href='/admin/new-user']")
    private WebElement addNewUserLink;

    @FindBy(xpath = "//table/thead/tr/th[1]")
    private WebElement usernameHeader;

    @FindBy(xpath = "//table/thead/tr/th[2]")
    private WebElement nicknameHeader;

    @FindBy(xpath = "//table/thead/tr/th[3]")
    private WebElement emailHeader;

    @FindBy(xpath = "//table/thead/tr/th[4]")
    private WebElement statusHeader;

    @FindBy(xpath = "//table/thead/tr/th[5]")
    private WebElement roleHeader;

    @FindBy(xpath = "//table/thead/tr/th[6]")
    private WebElement registeredHeader;

    @FindBy(xpath = "//tbody/tr/td[1]/a")
    private WebElement firstUserLink;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private WebElement firstUserNickname;

    @FindBy(xpath = "//tbody/tr/td[3]")
    private WebElement firstUserEmail;

    @FindBy(xpath = "//tbody/tr/td[4]/b")
    private WebElement firstUserStatus;

    @FindBy(xpath = "//tbody/tr/td[5]")
    private WebElement firstUserRole;

    @FindBy(xpath = "//tbody/tr/td[6]")
    private WebElement firstUserRegistered;

    public Userspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHeaderLabelText() {
        return headerLabel.getText();
    }

    public NewUserPage clickAddNewUserLink() {
        addNewUserLink.click();
        new NewUserPage(driver);
    }

    public String getFirstUserLinkText() {
        return firstUserLink.getText();
    }

    public void clickFirstUserLink() {
        firstUserLink.click();
        // Assume EditUserPage is another POM class
        // return new EditUserPage(driver);
    }

    public String getFirstUserNickname() {
        return firstUserNickname.getText();
    }

    public String getFirstUserEmail() {
        return firstUserEmail.getText();
    }

    public String getFirstUserStatus() {
        return firstUserStatus.getText();
    }

    public String getFirstUserRole() {
        return firstUserRole.getText();
    }

    public String getFirstUserRegistered() {
        return firstUserRegistered.getText();
    }
}
```

This Java class `Userspage` is a Selenium Page Object Model representation of the HTML content provided. It includes WebElements for key elements on the page and methods to interact with them.