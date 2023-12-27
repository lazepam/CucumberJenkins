package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {
    //Hard Wait
    public static void hardWait(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    //ScreenShot
    public static String screenShot(String name) {
        String date = new SimpleDateFormat("_hh_mm_ss_dd_MM_yyyy").format(new Date());
        String path = System.getProperty("user.dir") + "/target/ekranGoruntusu/"+ name + date + "ss.png";
        //C:\SeleniumTestNG\target\ekranGoruntusu -->AbsouletePath
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return path;
    }
    public static void weScreenShot(WebElement element) {

        String date = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "target/WebElementScreenShot/" + date + "wess.png";
        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
