```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {

    public WebDriver driver;

    @FindBy(xpath = "//a[@href='/checkout/information']")
    private WebElement changeInformationLink;

    @FindBy(xpath = "//a[@href='/checkout/shipping']")
    private WebElement changeShippingLink;

    @FindBy(id = "discountCode")
    private WebElement discountCodeInput;

    @FindBy(id = "addDiscountCode")
    private WebElement applyDiscountButton;

    @FindBy(id = "removeDiscountCode")
    private WebElement removeDiscountButton;

    @FindBy(id = "submit")
    private WebElement processPaymentButton;

    @FindBy(id = "payment-message")
    private WebElement paymentMessageText;

    public Paymentpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickChangeInformationLink() {
        changeInformationLink.click();
        // Assume CheckoutInformationPage is another POM class
        // return new CheckoutInformationPage(driver);
    }

    public void clickChangeShippingLink() {
        changeShippingLink.click();
        // Assume CheckoutShippingPage is another POM class
        // return new CheckoutShippingPage(driver);
    }

    public void enterDiscountCode(String code) {
        discountCodeInput.clear();
        discountCodeInput.sendKeys(code);
    }

    public void clickApplyDiscountButton() {
        applyDiscountButton.click();
    }

    public void clickRemoveDiscountButton() {
        removeDiscountButton.click();
    }

    public void clickProcessPaymentButton() {
        processPaymentButton.click();
    }

    public String getPaymentMessageText() {
        return paymentMessageText.getText();
    }
}
```

This Java class `Paymentpage` is structured according to the Page Object Model pattern using Selenium. It defines web elements using `@FindBy` annotations and provides methods to interact with these elements. The constructor initializes the elements using `PageFactory.initElements`.