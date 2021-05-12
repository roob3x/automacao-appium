package Order;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.io.IOException;

public abstract class Order {
    public abstract void escrever(MobileBy element, String texto) throws IOException;
    public abstract void clicar(By element) throws IOException;
    public abstract void apagarCampo(MobileBy element) throws IOException;
    public abstract void esperarUmSegundo() throws InterruptedException;
}
