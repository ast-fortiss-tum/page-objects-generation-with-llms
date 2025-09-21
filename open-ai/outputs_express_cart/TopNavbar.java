```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavbar {

    private WebDriver driver;

    @FindBy(className = "navbar-brand")
    private WebElement brandLink;

    @FindBy(className = "navbar-toggler")
    private WebElement toggleButton;

    @FindBy(id = "dropdownMenuButton")
    private WebElement firstDropdownButton;

    @FindBy(xpath = "//div[@id='navbarText']//li/a[@href='/lang/en']")
    private WebElement firstDropdownItem;

    @FindBy(xpath = "//div[@id='navbarText']//li/a[@href='/lang/it']")
    private WebElement secondDropdownItem;

    @FindBy(xpath = "(//button[@id='dropdownMenuButton'])[2]")
    private WebElement secondDropdownButton;

    @FindBy(xpath = "//div[@id='navbarText']//li/a[@href='/customer/account']")
    private WebElement accountLink;

    @FindBy(xpath = "//div[@id='navbarText']//li/a[@href='/customer/logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "//li[@class='nav-item']/a[@href='/checkout/cart']")
    private WebElement cartLink;

    public TopNavbar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBrandLink() {
        brandLink.click();
    }

    public void clickToggleButton() {
        toggleButton.click();
    }

    public void clickFirstDropdownButton() {
        firstDropdownButton.click();
    }

    public void selectFirstDropdownItem() {
        firstDropdownItem.click();
    }

    public void selectSecondDropdownItem() {
        secondDropdownItem.click();
    }

    public void clickSecondDropdownButton() {
        secondDropdownButton.click();
    }

    public void clickAccountLink() {
        accountLink.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public void clickCartLink() {
        cartLink.click();
    }
}
```

This Java class, `TopNavbar`, represents the top navigation bar of a web application using the Page Object Model pattern. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The constructor initializes the elements using `PageFactory.initElements`.