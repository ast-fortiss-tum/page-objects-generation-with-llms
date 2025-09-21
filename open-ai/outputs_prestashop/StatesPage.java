```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatesPage {

    public WebDriver driver;

    @FindBy(className = "toolbar_btn")
    private WebElement menuButton;

    @FindBy(id = "page-header-desc-state-new_state")
    private WebElement addNewStateButton;

    @FindBy(className = "btn-help")
    private WebElement helpButton;

    @FindBy(id = "subtab-AdminZones")
    private WebElement zonesTab;

    @FindBy(id = "subtab-AdminCountries")
    private WebElement countriesTab;

    @FindBy(id = "subtab-AdminStates")
    private WebElement statesTab;

    public StatesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public NewStatePage clickAddNewStateButton() {
        addNewStateButton.click();
        return new NewStatePage(driver);
    }

    public void clickHelpButton() {
        helpButton.click();
    }

    public void clickZonesTab() {
        zonesTab.click();
    }

    public void clickCountriesTab() {
        countriesTab.click();
    }

    public void clickStatesTab() {
        statesTab.click();
    }
}
```

### Explanation:
- **WebDriver Field**: The `driver` field is declared as required.
- **WebElement Fields**: Each key element from the HTML is defined as a `WebElement` using `@FindBy` annotations.
- **Constructor**: Initializes the elements using `PageFactory.initElements(driver, this);`.
- **Interaction Methods**: Methods are provided to interact with each element. For example, clicking the "Add new state" button returns a new instance of `NewStatePage`, assuming it exists. Other methods perform actions like clicking tabs or buttons without returning a new page object.