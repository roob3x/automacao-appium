package Interface;

import GerenciadorDriver.DriverWeb;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.GsmCallActions;
import io.appium.java_client.functions.ExpectedCondition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public interface Interation {
    default void esperarElementoExistir(By element, int timeout) throws IOException {
        WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(), timeout);

           // wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    default void esperarElementoExistirAndroid(AndroidElement element, int timeout) throws IOException {
        WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(), timeout);

        wait.until(ExpectedConditions.visibilityOf(element));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    default void validarTextoDoElemento(MobileBy element, String texto, String atribuiteType) throws IOException {
        Assert.assertEquals(texto,DriverWeb.getDriver().findElement(element).getAttribute(atribuiteType));
    }

}
