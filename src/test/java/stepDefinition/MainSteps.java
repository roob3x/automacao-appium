package stepDefinition;

import GerenciadorDriver.DriverWeb;
import Interacao.IinteractionAndroidJavaWeb;
import driverFactory.DriverFactory;
import io.appium.java_client.MobileBy;
import io.cucumber.java.pt.Dado;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class MainSteps extends DriverFactory {
    IinteractionAndroidJavaWeb i = new IinteractionAndroidJavaWeb();
    WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(),10);
    @Dado("que eu clico no menu lateral esquerdo")
    public void que_eu_clico_no_menu_lateral_esquerdo() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //i.esperarElementoExistir(HewsMainActivity.BTN_LEFT_SETTINGS,10);
       // pegaDriver().findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        //i.clicar(HewsMainActivity.BTN_LEFT_SETTINGS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        DriverWeb.getDriver().findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
    }

}