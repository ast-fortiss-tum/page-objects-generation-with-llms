```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Usersecuritypage {

    public WebDriver driver;

    @FindBy(name = "save")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@href='/admin/users']")
    private WebElement cancelButton;

    @FindBy(xpath = "//a[@href='/admin/user-password/admin']")
    private WebElement changePasswordLink;

    @FindBy(id = "jstokenAuth")
    private WebElement tokenAuthInput;

    @FindBy(id = "jsstatus")
    private WebElement currentStatusInput;

    @FindBy(id = "jsdisableUser")
    private WebElement disableUserButton;

    @FindBy(id = "jsdeleteUserAndKeepContent")
    private WebElement deleteUserAndKeepContentButton;

    @FindBy(id = "jsdeleteUserAndDeleteContent")
    private WebElement deleteUserAndDeleteContentButton;

    public Usersecuritypage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }

    public void clickChangePasswordLink() {
        changePasswordLink.click();
    }

    public void enterTokenAuth(String token) {
        tokenAuthInput.clear();
        tokenAuthInput.sendKeys(token);
    }

    public String getCurrentStatus() {
        return currentStatusInput.getAttribute("value");
    }

    public void clickDisableUserButton() {
        disableUserButton.click();
    }

    public void clickDeleteUserAndKeepContentButton() {
        deleteUserAndKeepContentButton.click();
    }

    public void clickDeleteUserAndDeleteContentButton() {
        deleteUserAndDeleteContentButton.click();
    }
}
```