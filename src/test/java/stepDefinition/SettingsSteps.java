package stepDefinition;

import GerenciadorDriver.DriverWeb;
import Interacao.IinteractionAndroidJava;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.GsmCallActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class SettingsSteps{
    IinteractionAndroidJava i = new IinteractionAndroidJava();
    WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(),10);
    @Dado("clicar no menu do lado direito")
    public void clicar_no_menu_do_lado_direito() throws InterruptedException, IOException {
        // Write code here that turns the phrase above into concrete actions
       // i.esperarElementoExistir(SettingsActivity.BTN_MENU_DIREITO,10);
        //i.clicar(SettingsActivity.BTN_MENU_DIREITO);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.leavjenn.hews:id/iv_expander")));
        Thread.sleep(1000);
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/iv_expander")).click();
    }

    @Quando("clicar em login")
    public void clicar_em_login() throws IOException {
        // Write code here that turns the phrase above into concrete actions
       // i.clicar(SettingsActivity.LINK_LOGIN);
        //pegaDriver().findElement(MobileBy.id("com.leavjenn.hews:id/design_menu_item_text")).click();
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/design_menu_item_text")).click();

    }

    @Quando("preencher login {string}")
    public void preencher_login(String texto) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //i.esperarElementoExistir(SettingsActivity.INPUT_LOGIN,20);
        //i.escrever(SettingsActivity.INPUT_LOGIN,texto);
        //WebDriverWait wait = new WebDriverWait(pegaDriver(),20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.leavjenn.hews:id/et_user_name")));
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_user_name")).sendKeys(texto);
        //pegaDriver().findElement(By.id("com.leavjenn.hews:id/et_user_name")).sendKeys("roberto");
    }

    @Quando("alterar login para {string}")
    public void alterar_login(String texto) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //i.esperarElementoExistir(SettingsActivity.INPUT_LOGIN,20);
        //i.escrever(SettingsActivity.INPUT_LOGIN,texto);
        //WebDriverWait wait = new WebDriverWait(pegaDriver(),20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.leavjenn.hews:id/et_user_name")));
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_user_name")).clear();
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_user_name")).sendKeys(texto);
        //pegaDriver().findElement(By.id("com.leavjenn.hews:id/et_user_name")).sendKeys("roberto");
    }

    @Quando("preencer senha {string}")
    public void preencer_senha(String texto) throws IOException {
        // Write code here that turns the phrase above into concrete actions
       // i.escrever(SettingsActivity.INPUT_PASSWORD,texto);

        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_password")).sendKeys(texto);
       // pegaDriver().findElement(By.id("com.leavjenn.hews:id/et_password")).sendKeys("12345");

    }
    @Quando("alterar senha para {string}")
    public void alterar_senha(String texto) throws IOException {
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_password")).clear();
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_password")).sendKeys(texto);

    }

    @Quando("clicar em logar")
    public void clicar_em_logar() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/button1")));
        DriverWeb.getDriver().findElement(MobileBy.id("android:id/button1")).click();

    }

    @Entao("validar que o usuario esta logado como {string}")
    public void validar_que_o_usuario_esta_logado_como(String texto) throws IOException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.leavjenn.hews:id/tv_account")));
        Assert.assertEquals(texto,DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/tv_account")).getText());
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/layout_login")).click();

    }

    @Entao("clicar no botao cancel")
    public void clicar_no_botao_cancel() {
        DriverWeb.getDriver().findElement(MobileBy.id("android:id/button2")).click();
    }

    @Entao("validar mesangem de erro com {string}")
    public void validar_mesangem_de_erro_com(String texto) throws IOException {

        Assert.assertEquals(texto,DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/tv_prompt")).getText());
    }
    @Entao("clicar em deslogar")
    public void clicar_em_deslogar() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.leavjenn.hews:id/iv_expander")));
        Thread.sleep(1000);
        DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/iv_expander")).click();
    }

    @Entao("fazer ligacao para o numero {string}")
    public void fazer_ligacao_para_o_numero(String texto) throws InterruptedException {

        DriverWeb.getDriver().makeGsmCall(texto,GsmCallActions.CALL);
    }
    @Entao("aceitar ligacao {string}")
    public void aceitar_ligacao(String texto) throws InterruptedException {
        Thread.sleep(2000); // pause just for effect
        DriverWeb.getDriver().makeGsmCall(texto, GsmCallActions.ACCEPT);
    }
    @Entao("finalizar ligacao {string}")
    public void finalizar_ligacao(String texto) throws InterruptedException {
        Thread.sleep(2000);
        DriverWeb.getDriver().makeGsmCall(texto, GsmCallActions.CANCEL);
    }

    @Entao("validar que o login esta preenchido com {string}")
    public void validar_que_o_login_esta_preechido_com(String texto) throws InterruptedException {
        Assert.assertEquals(texto,DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_user_name")).getText());
    }
    @Entao("validar que a senha esta preenchido com {string}")
    public void validar_que_a_senha_esta_preenchido_com(String texto) throws InterruptedException {
        Assert.assertEquals(texto,DriverWeb.getDriver().findElement(MobileBy.id("com.leavjenn.hews:id/et_password")).getText());
    }
}
