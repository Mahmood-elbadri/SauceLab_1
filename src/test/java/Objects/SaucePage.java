package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaucePage extends BasePage {
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName_txt;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password_txt;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement succes;

    public SaucePage(WebDriver driver) {
        super(driver);
    }

    public void signIn(String username, String pass) throws InterruptedException {

        userName_txt.sendKeys(username);
        password_txt.sendKeys(pass);
        Thread.sleep(1000);

        loginBtn.click();

    }

    public boolean loginSuccess() throws InterruptedException {
        Thread.sleep(1000);
        return succes.isDisplayed();
    }
}
