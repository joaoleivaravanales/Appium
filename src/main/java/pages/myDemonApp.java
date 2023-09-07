package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


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
        getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector()"+".textContains(\"Una introducción a Appium |\").instance(0))")).click();
    }

    public void esperar() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}