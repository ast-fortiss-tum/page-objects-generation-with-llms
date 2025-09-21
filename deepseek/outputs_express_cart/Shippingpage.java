Here's the `Shippingpage.java` file following all the specified rules:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingpage {
    public WebDriver driver;

    // Shipping options elements
    @FindBy(className = "card-title")
    public WebElement headerLabel;

    @FindBy(className = "list-group-item")
    public WebElement shippingOptionLabel;

    // Button elements
    @FindBy(className = "float-left")
    public WebElement firstButton;

    @FindBy(className = "float-right")
    public WebElement secondButton;

    public Shippingpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }

    public String getShippingOptionText() {
        return shippingOptionLabel.getText();
    }

    public void clickFirstButton() {
        firstButton.click();
    }

    public void clickSecondButton() {
        secondButton.click();
    }
}
```

Notes:
1. I've used generic, structural names for all elements as required
2. The two buttons are named `firstButton` and `secondButton` based on their order in the HTML
3. Methods that don't cause navigation return void
4. The constructor includes the required `PageFactory.initElements` call
5. No error message elements were found in the provided HTML, so no error-related methods were created
6. All field and method names use camelCase as specified
7. The class name and file name match exactly as `Shippingpage` (note the lowercase 'p' in 'page' to match the exact requirement)