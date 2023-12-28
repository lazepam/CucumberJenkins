package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BestBuyPage {
    public static WebElement aramaKutusu(){
       return Driver.getDriver().findElement(By.xpath("(//input)[1]"));
    }

    public static WebElement sonucYazisi(){
        return Driver.getDriver().findElement(By.cssSelector(".title-wrapper.title"));
    }

    public static WebElement sonucSayisi(){
        return Driver.getDriver().findElement(By.cssSelector("[class='item-count']"));
    }



}
