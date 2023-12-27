package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditorPage {
    public EditorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@type='button']")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;
    @FindBy(xpath = "(//button)[4]")
    public WebElement createButton;
    @FindBy(xpath = "(//input)[2]")
    public WebElement search;
    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement actualName;


}
