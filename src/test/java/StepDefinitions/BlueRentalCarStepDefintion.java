package StepDefinitions;

import Pages.BlueRentalPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BlueRentalCarStepDefintion {
    BlueRentalPage blueRentalPage;

    @Then("kullanici login buttonuna tiklar")
    public void kullaniciLoginButtonunaTiklar() {
        blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
    }

    @Then("kullanici {string} ve {string} bilgilerini girer ve login olur")
    public void kullaniciVeBilgileriniGirerVeLoginOlur(String email, String password) {
        blueRentalPage = new BlueRentalPage();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty(email),Keys.TAB,ConfigReader.getProperty(password),Keys.ENTER);
        ReusableMethods.hardWait(2);
        blueRentalPage.loginButtun2.click();
        ReusableMethods.hardWait(1);
        blueRentalPage.profile.click();
    }

    @Then("kullanici login oldugunu {string} ile dogrular")
    public void kullaniciLoginOldugunuIleDogrular(String email) {
        blueRentalPage = new BlueRentalPage();
        Assert.assertEquals(blueRentalPage.actualEmail.getText(),ConfigReader.getProperty(email));
    }

    @Then("verilen kullanici bilgileri ile login olur")
    public void verilenKullaniciBilgileriIleLoginOlur(DataTable data) {
        for (int i =1; i < data.asLists().size() ; i++) {
            blueRentalPage = new BlueRentalPage();
            blueRentalPage.email.sendKeys(data.row(i).get(0),Keys.TAB,data.row(i).get(1),Keys.ENTER);
            ReusableMethods.hardWait(2);
            Driver.getDriver().navigate().back();
            ReusableMethods.hardWait(2);


        }

    }
}
