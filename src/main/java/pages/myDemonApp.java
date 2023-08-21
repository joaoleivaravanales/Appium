package pages;
import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import step.IngresosMyDemonAPP;


public class myDemonApp  {

    private WebDriver driver;

    private AppiumDriverLocalService service;

    public myDemonApp(AndroidDriver driver){
        this.driver = driver;
        //PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);

    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
    public RemoteWebElement openMenu;

    @AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup[1]/android.widget.ImageView")
    protected WebElement clicLoginMenu;

    @Before
    public void configuracionMobile() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Pixel 4 API 28");
        cap.setCapability("platformName","Android");
        cap.setCapability("app","C:\\Users\\Jooao\\Desktop\\Joao\\PrimerEjemplo\\src\\main\\aplicacion\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformVersion","9");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    public void abrirMenu(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //openMenu.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]")).click();
    }
    public void opcionesDePresionar(String arg0) {
        switch (arg0) {
            case "Log In":
                driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Login":
                driver.findElement(AppiumBy.accessibilityId("Login button")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    public void validacionesDeTextos(String arg0) {
        switch (arg0) {
            case "Login":
                String textoLoginTitle = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Login'])")).getText();
                Assert.assertEquals("Login",textoLoginTitle);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "subtitulo":
                String txtLeyendaText = driver.findElement(AppiumBy.xpath("(//*[@text='Select a username and password from the list below, or click on the usernames to automatically populate the username and password.'])")).getText();
                Assert.assertEquals("Select a username and password from the list below, or click on the usernames to automatically populate the username and password.",txtLeyendaText);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Username":
                String textoUserName = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Username'])")).getText();
                Assert.assertEquals("Username",textoUserName);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Password":
                String textoPassword = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Password'])")).getText();
                Assert.assertEquals("Password",textoPassword);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "Login Incorrecto":
                String textoCredIncorrectas = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Provided credentials do not match any user in this service.'])")).getText();
                Assert.assertEquals("Provided credentials do not match any user in this service.",textoCredIncorrectas);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    public void ingresoDeDatosDos(String arg0, String arg1) {
        switch (arg0){
            case "Username":
                driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys(arg0);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
        switch (arg1){
            case "Password":
                driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys(arg1);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }

    }
}