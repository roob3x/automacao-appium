package GerenciadorDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAndroid {
    //static AppiumDriver<MobileElement> driver;
    static AndroidDriver driver;

    public static Capabilities configuracaoEmulador() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.leavjenn.hews.ui.MainActivity");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return capabilities;
    }

    public static AndroidDriver getDriver(){
        return driver;
    }
}
