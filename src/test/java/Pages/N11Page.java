package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11Page {
    public N11Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchData")
    public WebElement n11aramakutusu;
    @FindBy(xpath = "//h2[.='Mağaza Puanı']")
    public WebElement magazaPuani;

    @FindBy(css = ".thumb.grade60")
    public WebElement puanimlegi;

    public static WebElement powerranger(int sayi){
      return Driver.getDriver().findElement(By.xpath("//*[@class='rangeSlider']//span["+sayi+"]"));
    }
    @FindBy(xpath = "//*[@class='rangeSlider']//span[7]")
    public WebElement rangeSlider;


}