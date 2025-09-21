Here's the `Userspage.java` file following all the specified requirements:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userspage {
    public WebDriver driver;

    // Header elements
    @FindBy(tagName = "h2")
    public WebElement headerLabel;

    // Main action elements
    @FindBy(linkText = "Add a new user")
    public WebElement addNewUserLink;

    // Table header elements
    @FindBy(xpath = "//th[contains(text(), 'Username')]")
    public WebElement usernameHeader;
    
    @FindBy(xpath = "//th[contains(text(), 'Nickname')]")
    public WebElement nicknameHeader;
    
    @FindBy(xpath = "//th[contains(text(), 'Email')]")
    public WebElement emailHeader;
    
    @FindBy(xpath = "//th[contains(text(), 'Status')]")
    public WebElement statusHeader;
    
    @FindBy(xpath = "//th[contains(text(), 'Role')]")
    public WebElement roleHeader;
    
    @FindBy(xpath = "//th[contains(text(), 'Registered')]")
    public WebElement registeredHeader;

    // Table row elements (first row shown in HTML)
    @FindBy(xpath = "//a[contains(@href, '/admin/edit-user/admin')]")
    public WebElement firstUsernameLink;
    
    @FindBy(xpath = "//td[@class='d-none d-lg-table-cell'][1]")
    public WebElement firstNicknameCell;
    
    @FindBy(xpath = "//td[3]")
    public WebElement firstEmailCell;
    
    @FindBy(xpath = "//td[4]/b")
    public WebElement firstStatusCell;
    
    @FindBy(xpath = "//td[5]")
    public WebElement firstRoleCell;
    
    @FindBy(xpath = "//td[@class='d-none d-lg-table-cell'][2]")
    public WebElement firstRegisteredCell;

    public Userspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void clickHeaderLabel() {
        headerLabel.click();
    }

    // Assuming clicking the "Add new user" link navigates to a new page
    public NewUserPage clickAddNewUserLink() {
        addNewUserLink.click();
        return new NewUserPage(driver);
    }

    // Assuming clicking the username link navigates to an edit page
    public EditUserPage clickFirstUsernameLink() {
        firstUsernameLink.click();
        return new EditUserPage(driver);
    }

    // Methods to get text values
    public String getFirstUsernameText() {
        return firstUsernameLink.getText();
    }

    public String getFirstNicknameText() {
        return firstNicknameCell.getText();
    }

    public String getFirstEmailText() {
        return firstEmailCell.getText();
    }

    public String getFirstStatusText() {
        return firstStatusCell.getText();
    }

    public String getFirstRoleText() {
        return firstRoleCell.getText();
    }

    public String getFirstRegisteredText() {
        return firstRegisteredCell.getText();
    }
}
```

Note: I've made the following assumptions based on the HTML structure:
1. Clicking "Add a new user" link would navigate to a `NewUserPage` (which you would need to create)
2. Clicking a username link would navigate to an `EditUserPage` (which you would need to create)
3. Since there are no error messages in the provided HTML, I didn't include any error message handling methods.

The class follows all the naming conventions and structural requirements specified in your instructions. All element names are generic and based on their position/structure in the HTML.