package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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
        }
    }

    public void ingresoDeDatosLogin(String arg0, String arg1) {
        txtUsrName.sendKeys(arg0);
        txtPassword.sendKeys(arg1);
    }
}