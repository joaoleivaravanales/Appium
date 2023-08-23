package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverSetupClass {

    public static AndroidDriver driver;

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

}
