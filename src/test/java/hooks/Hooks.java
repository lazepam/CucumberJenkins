package hooks;


import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @Before //@Before notasyonu'nun importu io.cucumber.java dan olmalı
    public void setUp()  {
        System.out.println("Tüm scanerıolardan önce setUp() methodu çalışır");
    }

    @Before("@gr1")
    public void setUp2()  {
        System.out.println("Samsung Araması Yapılıyor");
    }

    @After
    public void tearDown(Scenario scenario)  {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/pgn","scenario_" +scenario.getName());
            Driver.closeDriver();
        }

    }
}
