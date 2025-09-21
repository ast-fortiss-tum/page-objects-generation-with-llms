```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
    public WebDriver driver;

    // Customer details section
    @FindBy(id = "customerLogout")
    private WebElement changeCustomerButton;

    @FindBy(id = "shipEmail")
    private WebElement emailInputField;

    @FindBy(id = "shipCompany")
    private WebElement companyInputField;

    @FindBy(id = "shipFirstname")
    private WebElement firstNameInputField;

    @FindBy(id = "shipLastname")
    private WebElement lastNameInputField;

    @FindBy(id = "shipAddr1")
    private WebElement address1InputField;

    @FindBy(id = "shipAddr2")
    private WebElement address2InputField;

    @FindBy(id = "shipCountry")
    private WebElement countrySelectField;

    @FindBy(id = "shipState")
    private WebElement stateInputField;

    @FindBy(id = "shipPostcode")
    private WebElement postcodeInputField;

    @FindBy(id = "shipPhoneNumber")
    private WebElement phoneNumberInputField;

    @FindBy(id = "orderComment")
    private WebElement orderCommentTextArea;

    @FindBy(xpath = "//a[@href='/checkout/cart']")
    private WebElement returnToCartLink;

    @FindBy(id = "checkoutInformation")
    private WebElement continueToShippingLink;

    // Cart section
    @FindBy(xpath = "//button[@class='btn btn-primary btn-qty-minus']")
    private WebElement decreaseQuantityButton;

    @FindBy(xpath = "//input[@class='form-control cart-product-quantity text-center']")
    private WebElement productQuantityInputField;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-qty-add']")
    private WebElement increaseQuantityButton;

    @FindBy(xpath = "//button[@class='btn btn-danger btn-delete-from-cart']")
    private WebElement deleteFromCartButton;

    @FindBy(id = "shipping-amount")
    private WebElement shippingAmountLabel;

    @FindBy(id = "total-cart-amount")
    private WebElement totalCartAmountLabel;

    @FindBy(id = "empty-cart")
    private WebElement emptyCartButton;

    public Checkoutpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Interaction methods
    public void clickChangeCustomerButton() {
        changeCustomerButton.click();
    }

    public void enterEmail(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    public void enterCompany(String company) {
        companyInputField.clear();
        companyInputField.sendKeys(company);
    }

    public void enterFirstName(String firstName) {
        firstNameInputField.clear();
        firstNameInputField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInputField.clear();
        lastNameInputField.sendKeys(lastName);
    }

    public void enterAddress1(String address1) {
        address1InputField.clear();
        address1InputField.sendKeys(address1);
    }

    public void enterAddress2(String address2) {
        address2InputField.clear();
        address2InputField.sendKeys(address2);
    }

    public void selectCountry(String country) {
        countrySelectField.sendKeys(country);
    }

    public void enterState(String state) {
        stateInputField.clear();
        stateInputField.sendKeys(state);
    }

    public void enterPostcode(String postcode) {
        postcodeInputField.clear();
        postcodeInputField.sendKeys(postcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberInputField.clear();
        phoneNumberInputField.sendKeys(phoneNumber);
    }

    public void enterOrderComment(String comment) {
        orderCommentTextArea.clear();
        orderCommentTextArea.sendKeys(comment);
    }

    public void clickReturnToCartLink() {
        returnToCartLink.click();
    }

    public void clickContinueToShippingLink() {
        continueToShippingLink.click();
    }

    public void clickDecreaseQuantityButton() {
        decreaseQuantityButton.click();
    }

    public void setProductQuantity(String quantity) {
        productQuantityInputField.clear();
        productQuantityInputField.sendKeys(quantity);
    }

    public void clickIncreaseQuantityButton() {
        increaseQuantityButton.click();
    }

    public void clickDeleteFromCartButton() {
        deleteFromCartButton.click();
    }

    public String getShippingAmount() {
        return shippingAmountLabel.getText();
    }

    public String getTotalCartAmount() {
        return totalCartAmountLabel.getText();
    }

    public void clickEmptyCartButton() {
        emptyCartButton.click();
    }
}
```