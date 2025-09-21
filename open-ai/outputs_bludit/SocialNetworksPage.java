```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialNetworksPage {

    public WebDriver driver;

    @FindBy(id = "jstwitter")
    private WebElement twitterInputField;

    @FindBy(id = "jsfacebook")
    private WebElement facebookInputField;

    @FindBy(id = "jscodepen")
    private WebElement codepenInputField;

    @FindBy(id = "jsinstagram")
    private WebElement instagramInputField;

    @FindBy(id = "jsgitlab")
    private WebElement gitlabInputField;

    @FindBy(id = "jsgithub")
    private WebElement githubInputField;

    @FindBy(id = "jslinkedin")
    private WebElement linkedinInputField;

    @FindBy(id = "jsmastodon")
    private WebElement mastodonInputField;

    @FindBy(id = "jsvk")
    private WebElement vkInputField;

    public Socialnetworkspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTwitter(String twitter) {
        twitterInputField.clear();
        twitterInputField.sendKeys(twitter);
    }

    public void enterFacebook(String facebook) {
        facebookInputField.clear();
        facebookInputField.sendKeys(facebook);
    }

    public void enterCodepen(String codepen) {
        codepenInputField.clear();
        codepenInputField.sendKeys(codepen);
    }

    public void enterInstagram(String instagram) {
        instagramInputField.clear();
        instagramInputField.sendKeys(instagram);
    }

    public void enterGitlab(String gitlab) {
        gitlabInputField.clear();
        gitlabInputField.sendKeys(gitlab);
    }

    public void enterGithub(String github) {
        githubInputField.clear();
        githubInputField.sendKeys(github);
    }

    public void enterLinkedin(String linkedin) {
        linkedinInputField.clear();
        linkedinInputField.sendKeys(linkedin);
    }

    public void enterMastodon(String mastodon) {
        mastodonInputField.clear();
        mastodonInputField.sendKeys(mastodon);
    }

    public void enterVk(String vk) {
        vkInputField.clear();
        vkInputField.sendKeys(vk);
    }
}
```