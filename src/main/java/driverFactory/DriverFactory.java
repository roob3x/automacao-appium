package driverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    AppiumDriver<MobileElement> driver;

    public DesiredCapabilities configuracaoEmulador() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.leavjenn.hews.ui.MainActivity");
        return capabilities;
    }

    public void iniciarDriver(){
        try {
            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), configuracaoEmulador());
        }
        catch (MalformedURLException exception){
            System.out.println("url invalida"+ exception.getMessage());
        }
    }

    public AppiumDriver<MobileElement> pegaDriver(){
        return driver;
    }

}
