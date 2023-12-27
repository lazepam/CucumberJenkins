package StepDefinitions;

import Pages.N11Page;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class N11StepDefinition {
    N11Page n11Page;

    @Then("arama kutusunda asagidaki tabloda verilen urunleri aratir ve sayfa basliklarini test eder")
    public void aramaKutusundaAsagidakiTablodaVerilenUrunleriAratirVeSayfaBasliklariniTestEder(DataTable data) {
        n11Page = new N11Page();
        for (int i = 1; i < data.asList().size(); i++) {
            n11Page.n11aramakutusu.sendKeys(data.asList().get(i), Keys.ENTER);
            ReusableMethods.hardWait(2);
            n11Page.n11aramakutusu.clear();
            String actualTitle = Driver.getDriver().getTitle();
            String expectedTitle = data.asList().get(i);
            Assert.assertTrue(actualTitle.contains(expectedTitle));

        }

    }

    @When("kullanici markapuani webelementine kadar scroll yapar")
    public void kullaniciMarkapuaniWebelementineKadarScrollYapar() {
        n11Page = new N11Page();
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(n11Page.magazaPuani).perform();
        ReusableMethods.hardWait(2);
    }

    @And("marka puanini {int} olarak ayarlar")
    public void markaPuaniniOlarakAyarlar(int sayi) {
        n11Page = new N11Page();
        /*
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(n11Page.puanimlegi, n11Page.rangeSlider);
         */
        N11Page.powerranger(sayi).click();
        ReusableMethods.hardWait(2);

    }
}
