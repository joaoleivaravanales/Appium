package step;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.myDemonApp;
import java.net.MalformedURLException;


public class IngresosMyDemonAPP {

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

    @And("Visualizo que estoy en la pagina de {string}")
    public void visualizoQueEstoyEnLaPaginaDe(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Ingreso texto {string} en el buscador")
    public void ingresoTextoEnElBuscador(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Presiono boton de busqueda {string} en la pagina de google")
    public void presionoBotonDeBusquedaEnLaPaginaDeGoogle(String arg0) {
        mydemonapp.opcionesDePresionar(arg0);
    }

    @And("Me posiciono con el scroll en un texto en especifico")
    public void mePosicionoConElScrollEnUnTextoEnEspecifico() {
        mydemonapp.scrollText();
    }

    @Then("Valido el titulo de la pantalla {string}")
    public void validoElTituloDeLaPantalla(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @When("presiono el objeto que deseo comprar {string}")
    public void presionoElObjetoQueDeseoComprar(String arg0) {
        mydemonapp.opcionesDePresionar(arg0);
    }

    @And("Valido el nombre del objeto seleccionado {string}")
    public void validoElNombreDelObjetoSeleccionado(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Visualizo el carrito que se haya agregado")
    public void visualizoElCarritoQueSeHayaAgregado() {
        mydemonapp.validacionDeCarritoUnObjeto();
    }

    @And("Presiono el carrito de compras")
    public void presionoElCarritoDeCompras() {
        mydemonapp.presionoCarritoDeCompras();
    }

    @And("Valido que se visualice el objeto seleccionado {string}")
    public void validoQueSeVisualiceElObjetoSeleccionado(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Ingreso nombre completo en el campo {string}")
    public void ingresoNombreCompletoEnElCampo(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);

    }

    @And("Ingreso direccion completa en el campo {string}")
    public void ingresoDireccionCompletaEnElCampo(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso ciudad en la que vives en el campo {string}")
    public void ingresoCiudadEnLaQueVivesEnElCampo(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso state en la que vives en el campo {string}")
    public void ingresoStateEnLaQueVivesEnElCampo(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso el campo de zip en {string}")
    public void ingresoElCampoDeZipEn(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso pais en la que vives en el campo {string}")
    public void ingresoPaisEnLaQueVivesEnElCampo(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso los campos de la tarjeta en {string}")
    public void ingresoLosCamposDeLaTarjetaEn(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso el numero de la tarjeta en {string}")
    public void ingresoElNumeroDeLaTarjetaEn(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso la expiracion de la tarjeta en {string}")
    public void ingresoLaExpiracionDeLaTarjetaEn(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Ingreso el codigo de seguridad de la tarjeta en {string}")
    public void ingresoElCodigoDeSeguridadDeLaTarjetaEn(String arg0) {
        mydemonapp.ingresoDeDatosPersonales(arg0);
    }

    @And("Descheckeo el check existente")
    public void descheckeoElCheckExistente() {
        mydemonapp.checkBoxTrueToFalse();
    }

    @And("Presiono nuevamente el check existente")
    public void presionoNuevamenteElCheckExistente() {
        mydemonapp.checkBoxFalseToTrue();
    }

    @And("Valido que la mochila se encuentre seleccionada {string}")
    public void validoQueLaMochilaSeEncuentreSeleccionada(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @Then("Valido que te rediriga a la pantalla finalizada {string}")
    public void validoQueTeRedirigaALaPantallaFinalizada(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Valido el texto en la pantalla existosa de compra {string}")
    public void validoElTextoEnLaPantallaExistosaDeCompra(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @And("Valido la existencia del boton {string}")
    public void validoLaExistenciaDelBoton(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }

    @Then("valido el body de la pagina FingerPrint")
    public void validoElBodyDeLaPaginaFingerPrint(String arg0) {
        mydemonapp.validacionesDeTextos(arg0);
    }
}
