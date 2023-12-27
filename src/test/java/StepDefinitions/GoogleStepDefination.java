package StepDefinitions;

import Pages.GooglePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefination {
    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);

    }

    @When("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String text) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(text));
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String item) {
        GooglePage.aramaKutusu().sendKeys(item, Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int sec) {
        ReusableMethods.hardWait(sec);
    }

    @But("kullanci sonuc sayisini konsola yazdirir")
    public void kullanciSonucSayisiniKonsolaYazdirir() {
    String[] SonucSayisi = GooglePage.sonucYazisi().getText().split(" ");
        System.out.println(SonucSayisi[1]);
    }

    @And("sonuc yazisinin resmini alir")
    public void sonucYazisininResminiAlir() {
        ReusableMethods.weScreenShot(GooglePage.sonucYazisi());
    }

    @Given("kullanici properties den {string} adresine gider")
    public void kullaniciPropertiesDenAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("arama kutusunda scenario outline ile {string} aratir")
    public void aramaKutusundaScenarioOutlineIleAratir(String arac) {
        GooglePage.aramaKutusu().sendKeys(arac,Keys.ENTER);
    }

    @And("sayfa basliginin scenario outline ile {string} icerdigini test eder")
    public void sayfaBasligininScenarioOutlineIleIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));

    }

    @When("kullanici asagidaki tablodaki bilgiler ile arama yapar")
    public void kullaniciAsagidakiTablodakiBilgilerIleAramaYapar(DataTable data) {
        System.out.println(data.asList());//bir list icinde Kitaplar, java, python, sql
        for (int i = 1; i <data.asList().size() ; i++) {
            GooglePage.aramaKutusu().sendKeys(data.asList().get(i),Keys.ENTER);
            ReusableMethods.hardWait(2);
            System.out.println(i + ". arama : " + data.asList().get(i));
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            ReusableMethods.hardWait(2);
            GooglePage.aramaKutusu().clear();
        }
    }
}
