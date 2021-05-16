package stepDefinition;

import GerenciadorDriver.DriverAndroid;
import Interacao.IinteractionAndroidJava;
import driverFactory.DriverFactory;
import io.appium.java_client.MobileBy;
import io.cucumber.java.pt.Dado;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class MainSteps extends DriverFactory {
    IinteractionAndroidJava i = new IinteractionAndroidJava();
    WebDriverWait wait = new WebDriverWait(DriverAndroid.getDriver(),10);
    @Dado("que eu clico no menu lateral esquerdo")
    public void que_eu_clico_no_menu_lateral_esquerdo() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        DriverAndroid.getDriver().findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
    }

}
