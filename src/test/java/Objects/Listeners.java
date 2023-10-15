package Objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Listeners extends utils implements ITestListener {


    public Listeners(WebDriver driver) {
        super(driver);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            getScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
