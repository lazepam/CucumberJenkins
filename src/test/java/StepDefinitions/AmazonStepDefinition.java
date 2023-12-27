package StepDefinitions;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici Amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("basligin Amazon icerdigini test eder")
    public void basliginAmazonIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
    }

    @Then("arama kutusunda iphone aratir")
    public void aramaKutusundaIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @But("sonuc sayisini konsola yazdirir")
    public void sonucSayisiniKonsolaYazdirir() {
        ReusableMethods.hardWait(2);
        String[] sanucSayisi = amazonPage.sonucYazisi.getText().split(" ");
        System.out.println(sanucSayisi[2]);
    }

    @And("sonuc yazisi WEB Elementinin resmini kayiteder")
    public void sonucYazisiWEBElementininResminiKayiteder() {
    ReusableMethods.weScreenShot(amazonPage.sonucYazisi);
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("arama kutusunda samsung aratir")
    public void aramaKutusundaSamsungAratir() {
        amazonPage.aramaKutusu.sendKeys("samsung", Keys.ENTER);
    }

    @Then("kullanici amazon sayfasi arama kutusunda {string} aratir")
    public void kullaniciAmazonSayfasiAramaKutusundaAratir(String item) {
        amazonPage.aramaKutusu.sendKeys(item,Keys.ENTER);
    }

    @And("cikan sonuclardan ilk {int} ine click yapar ve her sayfanin resmini alir")
    public void cikanSonuclardanIlkIneClickYaparVeHerSayfaninResminiAlir(int num) {
        for (int i = 0; i < num; i++) {
            amazonPage.linklerListesi.get(i).click();
            ReusableMethods.hardWait(2);
            ReusableMethods.screenShot("Picture");
            ReusableMethods.hardWait(2);
            Driver.getDriver().navigate().back();


        }

    }
}
