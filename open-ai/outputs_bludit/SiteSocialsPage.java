```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteSocialsPage {

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

    @FindBy(id = "jsdribbble")
    private WebElement dribbbleInputField;

    @FindBy(id = "jsvk")
    private WebElement vkInputField;

    public Sitesocialspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTwitterInputField(String url) {
        twitterInputField.clear();
        twitterInputField.sendKeys(url);
    }

    public void setFacebookInputField(String url) {
        facebookInputField.clear();
        facebookInputField.sendKeys(url);
    }

    public void setCodepenInputField(String url) {
        codepenInputField.clear();
        codepenInputField.sendKeys(url);
    }

    public void setInstagramInputField(String url) {
        instagramInputField.clear();
        instagramInputField.sendKeys(url);
    }

    public void setGitlabInputField(String url) {
        gitlabInputField.clear();
        gitlabInputField.sendKeys(url);
    }

    public void setGithubInputField(String url) {
        githubInputField.clear();
        githubInputField.sendKeys(url);
    }

    public void setLinkedinInputField(String url) {
        linkedinInputField.clear();
        linkedinInputField.sendKeys(url);
    }

    public void setMastodonInputField(String url) {
        mastodonInputField.clear();
        mastodonInputField.sendKeys(url);
    }

    public void setDribbbleInputField(String url) {
        dribbbleInputField.clear();
        dribbbleInputField.sendKeys(url);
    }

    public void setVkInputField(String url) {
        vkInputField.clear();
        vkInputField.sendKeys(url);
    }

    public String getTwitterInputFieldValue() {
        return twitterInputField.getAttribute("value");
    }

    public String getFacebookInputFieldValue() {
        return facebookInputField.getAttribute("value");
    }

    public String getCodepenInputFieldValue() {
        return codepenInputField.getAttribute("value");
    }

    public String getInstagramInputFieldValue() {
        return instagramInputField.getAttribute("value");
    }

    public String getGitlabInputFieldValue() {
        return gitlabInputField.getAttribute("value");
    }

    public String getGithubInputFieldValue() {
        return githubInputField.getAttribute("value");
    }

    public String getLinkedinInputFieldValue() {
        return linkedinInputField.getAttribute("value");
    }

    public String getMastodonInputFieldValue() {
        return mastodonInputField.getAttribute("value");
    }

    public String getDribbbleInputFieldValue() {
        return dribbbleInputField.getAttribute("value");
    }

    public String getVkInputFieldValue() {
        return vkInputField.getAttribute("value");
    }
}
```