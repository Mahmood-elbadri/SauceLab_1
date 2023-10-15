package Scenarios;

import Objects.DataProvideClass;
import Objects.SaucePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestScenario {
    SaucePage sauce;
    WebDriver driver;

    @BeforeMethod
    public void beforeRun() {
        driver = new ChromeDriver();
        sauce = new SaucePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test(dataProvider = "IDS",dataProviderClass = DataProvideClass.class)
    public void login(String username, String pass) throws InterruptedException {
        sauce.signIn("standard_user", "secret_sauce");
        Assert.assertTrue(sauce.loginSuccess());
    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
