package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage {
    public static WebElement aramaKutusu(){
     return Driver.getDriver().findElement(By.xpath("//textarea"));
    }

    public static WebElement sonucYazisi(){
        return Driver.getDriver().findElement(By.id("result-stats"));
    }

}
