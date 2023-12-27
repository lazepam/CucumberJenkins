package StepDefinitions;


import Pages.BestBuyPage;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BestBuyStepDefinition {
    @Then("Bestbuy sayfasi arama kutusunda {string} aratir")
    public void bestbuySayfasiAramaKutusundaAratir(String item) {

       BestBuyPage.aramaKutusu().sendKeys(item);
        ReusableMethods.hardWait(3);
        BestBuyPage.aramaKutusu().submit();

    }

    @And("sonuc yazisinda {string} icerdigini test eder")
    public void sonucYazisindaIcerdiginiTestEder(String text) {
        System.out.println(BestBuyPage.sonucYazisi().getText());
        Assert.assertTrue(BestBuyPage.sonucYazisi().getText().contains(text));
    }

    @And("Bestbuy sayfasinda sonuc sayisini konsola yazdirir")
    public void bestbuySayfasindaSonucSayisiniKonsolaYazdirir() {
        System.out.println(BestBuyPage.sonucSayisi().getText());
    }
/*
    @Then("cikan urunlerden ilk ucune tiklayalim ve sayfa basliklarinin {string} icerdigini test edelim")
    public void cikanUrunlerdenIlkUcuneTiklayalimVeSayfaBasliklarininIcerdiginiTestEdelim(String arg0) {
    }
    Then cikan urunlerden ilk ucune tiklayalim ve sayfa basliklarinin "iPhone" icerdigini test edelim
    But 3 saniye bekler

 */
}
