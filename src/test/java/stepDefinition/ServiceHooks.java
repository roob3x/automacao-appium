package stepDefinition;

import GerenciadorDriver.DriverAndroid;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class ServiceHooks {
    @Before
    public void setup() throws MalformedURLException {
        DriverAndroid.configuracaoEmulador();
    }
}
