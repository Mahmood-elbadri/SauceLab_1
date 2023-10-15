package Objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class utils extends BasePage{
    public utils (WebDriver driver) {
        super(driver);
    }

    public void getScreenshot() throws IOException {
        Date current = new Date();
        String screenShotFileName = current.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenShotFileName + "png"));
    }
}
