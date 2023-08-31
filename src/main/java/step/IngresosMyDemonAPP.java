package step;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.myDemonApp;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Map;


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
    public void validoLosSiguientesTextos(DataTable dataTable) {
       validoCampos(dataTable);
    }


    protected void validoCampos(DataTable dataTable) {
        try {
          List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
                for (Map<String, String> row : rows) {
                    String columnName = row.get("campo"); // Replace "Column" with the actual column name
                    String expectedValue = row.get(rows); // Replace "ExpectedValue" with the actual column name
                    String xpath = getXPathForColumnName(columnName); // Replace with your method to generate XPaths
                    WebElement element = driver.findElement(By.xpath(xpath));
                    String actualValue = element.getText();
                    System.out.println(actualValue);
                    System.out.println(expectedValue);
                    Assert.assertEquals(actualValue, expectedValue);
                }
        } catch (Exception e) {
        }
    }
    public String getXPathForColumnName(String campo) {
     return "//android.widget.TextView[@text='" + campo + "']";
    }

}
