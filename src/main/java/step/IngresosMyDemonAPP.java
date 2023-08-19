package step;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.myDemonApp;

import java.net.MalformedURLException;


public class IngresosMyDemonAPP {
    AppiumDriver driver;
    myDemonApp mydemonapp;

    public IngresosMyDemonAPP() {
        mydemonapp = new myDemonApp((AndroidDriver) driver);
    }

    @Given("Cuando ingreso al aplicativo MyDemonAPP")
    public void cuandoIngresoAlAplicativoMyDemonAPP() throws MalformedURLException {
        mydemonapp.configuracionMobile();
    }

    @When("Me encuentro en el home del aplicativo")
    public void meEncuentroEnElHomeDelAplicativo() {
        mydemonapp.abrirMenu();
    }
}
