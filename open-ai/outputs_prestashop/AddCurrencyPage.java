```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCurrencyPage {

    public WebDriver driver;

    @FindBy(id = "currency_selected_iso_code")
    private WebElement currencyDropdown;

    @FindBy(id = "currency_unofficial")
    private WebElement alternativeCurrencyCheckbox;

    @FindBy(id = "currency_names_1")
    private WebElement currencyNameInput;

    @FindBy(id = "currency_symbols_1")
    private WebElement currencySymbolInput;

    @FindBy(id = "currency_iso_code")
    private WebElement isoCodeInput;

    @FindBy(id = "currency_exchange_rate")
    private WebElement exchangeRateInput;

    @FindBy(id = "currency_precision")
    private WebElement precisionInput;

    @FindBy(id = "currency_active_0")
    private WebElement statusNoRadio;

    @FindBy(id = "currency_active_1")
    private WebElement statusYesRadio;

    @FindBy(id = "save-button")
    private WebElement saveButton;

    @FindBy(xpath = "//a[contains(@class, 'btn-outline-secondary')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[@class='text-danger']/p")
    private WebElement firstErrorMessage;

    public AddCurrencyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectCurrency(String currencyCode) {
        currencyDropdown.sendKeys(currencyCode);
    }

    public void toggleAlternativeCurrencyCheckbox() {
        alternativeCurrencyCheckbox.click();
    }

    public void enterCurrencyName(String name) {
        currencyNameInput.sendKeys(name);
    }

    public void enterCurrencySymbol(String symbol) {
        currencySymbolInput.sendKeys(symbol);
    }

    public void enterExchangeRate(String rate) {
        exchangeRateInput.sendKeys(rate);
    }

    public void enterPrecision(String precision) {
        precisionInput.sendKeys(precision);
    }

    public void setStatus(boolean isActive) {
        if (isActive) {
            statusYesRadio.click();
        } else {
            statusNoRadio.click();
        }
    }

    public String getFirstErrorMessage() {
        return firstErrorMessage.getText();
    }

    public void clickSaveButton() {
        saveButton.click();
        // Assuming the save button leads to another page, return the appropriate POM class
        // return new NextPage(driver);
    }

    public void clickCancelButton() {
        cancelButton.click();
        // Assuming the cancel button leads to another page, return the appropriate POM class
        // return new PreviousPage(driver);
    }
}
```

This Java class `AddCurrencyPage` is a Selenium Page Object Model representation of the HTML content you provided. It includes WebElement fields for all key elements on the page, interaction methods for performing actions, and error message handling as specified.