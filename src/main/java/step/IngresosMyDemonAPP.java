package step;


import io.appium.java_client.android.AndroidDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.requirements.reports.ScenarioOutcome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.myDemonApp;

import java.io.Console;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class IngresosMyDemonAPP {

    public static AndroidDriver driver;
    myDemonApp mydemonapp = new myDemonApp();


    @Given("Cuando ingreso al aplicativo MyDemonAPP")
    public void cuandoIngresoAlAplicativoMyDemonAPP() throws MalformedURLException {

    }

    @When("Selecciono el acordeon posicionado en la perte superior izquierda")
    public void seleccionoElAcordeonPosicionadoEnLaPerteSuperiorIzquierda() {
        mydemonapp.abrirMenu();
    }

    @And("Selecciono la opcion de {string} dentro del acordeon")
    public void seleccionoLaOpcionDeDentroDelAcordeon(String arg0) {
        mydemonapp.opcionesDePresionar(arg0);
    }

    @And("Valido el titulo de la pagina {string}")
    public void validoElTituloDeLaPagina(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Valido el {string} de leyenda del cuerpo abajo del Login")
    public void validoElDeLeyendaDelCuerpoAbajoDelLogin(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Valido que se encuentre el texto {string} arriba de la caja de cuadro")
    public void validoQueSeEncuentreElTextoArribaDeLaCajaDeCuadro(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Ingreso el {string} en la caja de texto junto a la {string}")
    public void ingresoElEnLaCajaDeTextoJuntoALa(String arg0, String arg1) {
        mydemonapp.ingresoDeDatosLogin(arg0,arg1);
    }

    @And("Presiono el boton de {string} dentro de la pagina")
    public void presionoElBotonDeDentroDeLaPagina(String arg0) {
        mydemonapp.opcionesDePresionar(arg0);
    }

    @Then("Valido el texto de {string}")
    public void validoElTextoDe(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Valido los siguientes textos")
    public void validoLosSiguientesTextos(DataTable campo) {
       mydemonapp.validoCampos(campo);
    }

    @Then("Valido que redireccione a la pagina de {string}")
    public void validoQueRedireccioneALaPaginaDe(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Valido los siguientes textos en pagina TextView")
    public void validoLosSiguientesTextosEnPaginaTextView(DataTable campo) {
        mydemonapp.validoCamposPantallTextView(campo);
    }

    @And("Ingreso en el campo la {string}")
    public void ingresoEnElCampoLa(String arg0) {
        mydemonapp.ingresoDatoURL(arg0);
    }

    @And("Presiono el boton de {string}")
    public void presionoElBotonDe(String arg0) {
        mydemonapp.opcionesDePresionar(arg0);
    }
}
