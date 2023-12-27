package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private Driver(){
        //DRIVER class'ından obje olusturmamak ıcın
    }
    static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){//-->driver a deger atanmissa. driveri kapat
            driver.close();
            driver=null;
        }

    }
    public static void quitDriver(){
        if (driver!=null) {//-->drvera deger atanmissa. driveri kapat
            driver.quit();
            driver = null;
        }
    }
}
