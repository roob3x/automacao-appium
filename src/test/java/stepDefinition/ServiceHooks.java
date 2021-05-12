package stepDefinition;

import GerenciadorDriver.DriverWeb;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class ServiceHooks {
    @Before
    public void setup() throws MalformedURLException {
      //  DriverWeb driver = new DriverWeb();
       // driver.iniciarDriver();
        DriverWeb.configuracaoEmulador();
    }
}
