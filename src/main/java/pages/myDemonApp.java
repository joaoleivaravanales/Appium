package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class myDemonApp extends PageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
    public WebElement openMenu;

    @AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup[1]/android.widget.ImageView")
    protected WebElement clicLoginMenu;


    public void abrirMenu(){
        openMenu.click();
  }
    public void opcionesDePresionar(String arg0) {
        switch (arg0) {
            case "Log In":
                clicLoginMenu.click();
                break;
            case "Login":
                // driver.findElement(AppiumBy.accessibilityId("Login button")).click();
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    public void validacionesDeTextos(String arg0) {
        switch (arg0) {
            case "Login":
                // String textoLoginTitle = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Login'])")).getText();
                //Assert.assertEquals("Login",textoLoginTitle);
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "subtitulo":
                // String txtLeyendaText = driver.findElement(AppiumBy.xpath("(//*[@text='Select a username and password from the list below, or click on the usernames to automatically populate the username and password.'])")).getText();
                // Assert.assertEquals("Select a username and password from the list below, or click on the usernames to automatically populate the username and password.",txtLeyendaText);
                //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Username":
                // String textoUserName = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Username'])")).getText();
                //Assert.assertEquals("Username",textoUserName);
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Password":
                //         String textoPassword = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Password'])")).getText();
                // Assert.assertEquals("Password",textoPassword);
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Login Incorrecto":
                //String textoCredIncorrectas = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Provided credentials do not match any user in this service.'])")).getText();
                //Assert.assertEquals("Provided credentials do not match any user in this service.",textoCredIncorrectas);
                //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    public void ingresoDeDatosLogin(String arg0, String arg1) {
        //driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys(arg0);
        //driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys(arg1);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}