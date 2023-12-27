package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueRentalPage {
    public BlueRentalPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@role='button']")
    public WebElement login;


    @FindBy(id = "formBasicEmail")
    public WebElement email;
    @FindBy(xpath = "(//*[.='Profile'])[1]")
    public WebElement profile;

    @FindBy(xpath = "//em")
    public WebElement actualEmail;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alert;


    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement ok;
    @FindBy(css = "#dropdown-basic-button")
    public WebElement loginButtun2;
}
