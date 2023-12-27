package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.Driver;

public class GooglePage {
    public static WebElement aramaKutusu(){
     return Driver.getDriver().findElement(By.xpath("//textarea"));
    }

    public static WebElement sonucYazisi(){
        return Driver.getDriver().findElement(By.id("result-stats"));
    }

}
