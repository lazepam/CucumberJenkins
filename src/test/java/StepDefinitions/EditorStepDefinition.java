package StepDefinitions;

import Pages.EditorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EditorStepDefinition {
    EditorPage editorPage;
    @When("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        editorPage = new EditorPage();
        editorPage.newButton.click();
    }

    @Then("kullanici cikan pencerede verilen bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciCikanPenceredeVerilenBilgileriGirer(String name, String lname, String posotion, String office, String extensition, String date, String salary) {
   new EditorPage().firstName.sendKeys(name, Keys.TAB,lname,Keys.TAB,posotion,Keys.TAB,office,Keys.TAB,extensition,Keys.TAB,date,Keys.TAB,salary);

    }

    @Then("kullanici Create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        new EditorPage().createButton.click();
    }

    @Then("kullanici search bolumune {string} bilgilerini girer")
    public void kullaniciSearchBolumuneBilgileriniGirer(String name) {
        new EditorPage().search.sendKeys(name);
    }

    @Then("kullanici {string} ile basarili bir sekilde giris yapildigini dogrular")
    public void kullaniciIleBasariliBirSekildeGirisYapildiginiDogrular(String name) {
        Assert.assertTrue(new EditorPage().actualName.getText().contains(name));
    }
}
