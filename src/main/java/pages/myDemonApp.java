package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Map;



public class myDemonApp extends PageObject {


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
    protected WebElement openMenu;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup[1]/android.widget.ImageView")
    protected WebElement clicLoginMenu;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Login'])")
    protected WebElement textoLoginTitle;

    @AndroidFindBy(xpath = "(//*[@text='Select a username and password from the list below, or click on the usernames to automatically populate the username and password.'])")
    protected WebElement txtLeyendaText;


    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Username'])")
    protected WebElement textoUserName;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Password'])")
    protected WebElement textoPassword;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Provided credentials do not match any user in this service.'])")
    protected WebElement textoCredIncorrectas;

    @AndroidFindBy(accessibility = "Username input field")
    protected WebElement txtUsrName;

    @AndroidFindBy(accessibility = "Password input field")
    protected WebElement txtPassword;

    @AndroidFindBy(accessibility = "Login button")
    protected WebElement btnLoginPage;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Products'])")
    protected WebElement txtProduct;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Webview'])")
    protected WebElement btnTextView;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='URL'])")
    protected WebElement txtURL;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Enter an HTTPS url.'])")
    protected WebElement txtEnterHTTP;

    @AndroidFindBy(accessibility = "URL input field")
    protected WebElement txtboxURL;

    @AndroidFindBy(accessibility = "Go To Site button")
    protected WebElement btnGoToSite;

    @AndroidFindBy(xpath = "(//android.widget.Image[@text = 'googlelogo_tablet_tier1_hp_color_183x64dp'])")
    protected WebElement logoGoogle;


    @AndroidFindBy(className ="android.widget.EditText")
    protected WebElement barraGoogle;

    @AndroidFindBy(className = "android.widget.Button")
    protected WebElement btnLupaGoogle;

    @AndroidFindBy(xpath = "(//android.view.View[@text = 'appium - Testing en Español josepablosarco.wordpress.com › webdriver'])")
    protected WebElement pageGoogle;

    @AndroidFindBy(xpath = "(//android.view.View[@text = 'Automatización de la nube de Appium'])")
    protected WebElement txtTitleAut;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Sauce Labs Backpack\"])")
    protected WebElement mochilaSeleccionada;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Add To Cart'])")
    protected WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.TextView")
    protected WebElement carritoNumero;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Proceed To Checkout'])")
    protected WebElement btnProceed;

    @AndroidFindBy (accessibility = "Full Name* input field")
    protected WebElement txtNombreCompleto;

    @AndroidFindBy (accessibility = "Address Line 1* input field")
    protected WebElement txtDireccionUna;

    @AndroidFindBy(accessibility = "Address Line 2 input field")
    protected WebElement txtDireccionDos;




    public void abrirMenu(){
        openMenu.click();
  }
    public void opcionesDePresionar(String arg0) {
        switch (arg0) {
            case "Log In":
                clicLoginMenu.click();
                break;
            case "Login":
                btnLoginPage.click();
                break;
            case "Webview":
                btnTextView.click();
                break;
            case "Go To Site":
                btnGoToSite.click();
                break;
            case "Lupa":
                btnLupaGoogle.click();
                break;
            case "mochila":
                mochilaSeleccionada.click();
                break;
            case "Add to Cart":
                btnAddToCart.click();
                break;
            case "Sauce Labs Backpack":
                Assert.assertEquals("Sauce Labs Backpack",mochilaSeleccionada.getText());
                break;
            case "Proceed to Checkout":
                btnProceed.click();
                break;
        }
    }

    public void validacionesDeTextos(String arg0) {
        switch (arg0) {
            case "Login":
                Assert.assertEquals("Login",textoLoginTitle.getText());
                break;
            case "subtitulo":
                Assert.assertEquals("Select a username and password from the list below, or click on the usernames to automatically populate the username and password.",txtLeyendaText.getText());
                break;
            case "Username":
                Assert.assertEquals("Username",textoUserName.getText());
                break;
            case "Password":
                Assert.assertEquals("Password",textoPassword.getText());
                break;
            case "Login Incorrecto":
                Assert.assertEquals("Provided credentials do not match any user in this service.",textoCredIncorrectas.getText());
                break;
            case "Products":
                Assert.assertEquals("Products",txtProduct.getText());
                break;
            case "google":
                logoGoogle.isDisplayed();
                break;
            case "Appium espanol":
                barraGoogle.sendKeys(arg0);
                break;
            case "Automatización de la nube de Appium":
                Assert.assertEquals("Automatización de la nube de Appium",txtTitleAut.getText());
                break;
            case "Sauce Labs Backpack":
                Assert.assertEquals("Sauce Labs Backpack",mochilaSeleccionada.getText());
                break;
        }
    }

    public void ingresoDeDatosLogin(String arg0, String arg1) {
        txtUsrName.sendKeys(arg0);
        txtPassword.sendKeys(arg1);
    }


    public void validoCampos(DataTable campo) {
        try {
            List<Map<String, String>> rows = campo.asMaps(String.class, String.class);
            for (Map<String, String> row : rows) {
                String name = row.get("campo");
                if (name.equals(textoLoginTitle.getText())){
                    Assert.assertEquals(name,textoLoginTitle.getText());
                }else if (name.equals(textoUserName.getText())){
                    Assert.assertEquals(name,textoUserName.getText());
                }else if (name.equals(textoPassword.getText())){
                    Assert.assertEquals(name,textoPassword.getText());
                }else{
                    String Error = "FailedText";
                    Assert.assertEquals(Error,"ERROR");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR AQUI: " + e.getMessage());
        }
}

    public void validoCamposPantallTextView(DataTable campo) {
        try {
            List<Map<String, String>> rows = campo.asMaps(String.class, String.class);
            for (Map<String, String> row : rows) {
                String name = row.get("campo");
                if (name.equals(btnTextView.getText())){
                    Assert.assertEquals(name,btnTextView.getText());
                }else if (name.equals(txtURL.getText())){
                    Assert.assertEquals(name,txtURL.getText());
                }else if (name.equals(txtEnterHTTP.getText())){
                    Assert.assertEquals(name,txtEnterHTTP.getText());
                }else{
                    String Error = "FailedText";
                    Assert.assertEquals(Error,"ERROR");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR AQUI: " + e.getMessage());
        }
    }

    public void ingresoDatoURL(String arg0) {
        txtboxURL.sendKeys(arg0);
    }

    public void scrollText() {
        //Metodo 2
        //getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        //        + ".scrollIntoView(new UiSelector().textContains(\"josepablosarco.wordpress.com\").instance(0))")).click();
        //Metodo 2
        //  getDriver().findElement(new AppiumBy.ByAndroidUIAutomator(
        //         "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        //                 + ".scrollIntoView(new UiSelector().index(23))")).click();
        getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\"webview screen\"]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[20]"));
        WebElement listenin = getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector().textContains(\"es.testingbot.com\").instance(0))"));
        getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector().instance(2))"));
        listenin.click();

    }

    public void validacionDeCarritoUnObjeto(){
        Assert.assertEquals("1",carritoNumero.getText());
    }

    public void presionoCarritoDeCompras() {
        carritoNumero.click();
    }

    public void ingresoDeDatosPersonales(String arg0) {
        switch (arg0){
            case "Joao Leiva Ravanales":
                txtNombreCompleto.sendKeys(arg0);
                break;
            case "Costa Rica":
                txtDireccionUna.sendKeys(arg0 + " 504 Playa Ancha");
                break;
            case "Playa Ancha":
                txtDireccionDos.sendKeys(arg0 + " calle costa Rica");
                break;
        }
    }
}