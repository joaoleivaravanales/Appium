package pages;
import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import step.IngresosMyDemonAPP;


public class myDemonApp  {

    AndroidDriver driver;

    public myDemonApp(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
    public WebElement openMenu;

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
        openMenu.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]")).click();
    }
    public void presionarLoginMenu(){
        clicLoginMenu.click();
    }

}