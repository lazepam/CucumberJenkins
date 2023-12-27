package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

import java.util.List;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@class='sg-col-inner']")
    public WebElement sonucYazisi;
    @FindBy(xpath = "//h2//a")
    public List<WebElement> linklerListesi;

    @FindBy(xpath = "//img[@class='imgSwatch']")
    public List<WebElement> colorListesi;

    @FindBy(xpath = "(//span[@class='selection'])[2]")
    public WebElement colorName;
}
