package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.SourceType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Generic.UsoCom;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.PageLoginUFTAppium;
import qa.automated.web.bci.Properties.ParamsInit;

public class BCI_LoginUFTAppium {

    @After
    public void screenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            UsoCom.screenshot("@loginUFTAppium");
        }
    }

    private PageLoginUFTAppium pageLogin = ApplicationLauncherAndroid.pageLoginUFTAppium;
    private boolean FlagPrimerUso = false;

    @Given("^que soy un usuario$")
    public void que_soy_un_usuario() throws Throwable {
        // TODO: AQUI SE DEBERIA PREGUNTAR A LA BASE DE DATOS SI SOY UN USUARIO
        assertTrue(UsoCom.validarRut(pageLogin.obtenerRutCliente()));
        UsoCom.screenshot("@loginUFTAppium");
    }

    @Given("^la aplicacion esta iniciada$")
    public void la_aplicacion_esta_iniciada() throws Throwable {
        assertTrue(pageLogin.existeMainContent());
        UsoCom.screenshot("@loginUFTAppium");
    }

    @Given("^que el boton ingresar esta habilitado$")
    public void que_el_boton_ingresar_esta_habilitado() throws Throwable {
        Thread.sleep(10000);
        assertTrue(pageLogin.existeBtnIngresar());
        UsoCom.screenshot("@loginUFTAppium");
    }

    @When("^hago click en el boton ingresar$")
    public void hago_click_en_el_boton_ingresar() throws Throwable {
        pageLogin.clickBtnIngresar();
        UsoCom.screenshot("@loginUFTAppium");
    }

    @Then("^aparece pagina de login$")
    public void aparece_pagina_de_login() throws Throwable {
        //TODO: parametros no funciona bien, da un nullPointerException
        //assertEquals(pageLogin.obtenerTextoPass(), parametros.TEXTOPASS);
        assertEquals(pageLogin.obtenerTextoPass(), "Clave Internet");
        Thread.sleep(100);
        assertTrue(!pageLogin.activoBtnLogin());
        UsoCom.screenshot("@loginUFTAppium");
    }

    @Given("^que existen los campos de ingreso de datos$")
    public void que_existen_los_campos_de_ingreso_de_datos() throws Throwable {
        assertTrue(pageLogin.existeInputPass());
        UsoCom.screenshot("@loginUFTAppium");
    }

    @When("^ingreso rut\"([^\"]*)\" y contraseña\"([^\"]*)\"$")
    public void ingreso_rut_y_contraseña(String rut, String pass) throws Throwable {
        if (pageLogin.existeTextoRut()) pageLogin.escribirInputRut(rut);
        if (pageLogin.existeInputPass()) pageLogin.escribirInputPass(pass);
        if (pageLogin.existeBtnLogin() && pageLogin.activoBtnLogin()) pageLogin.clickBtnLogin();
        if (pageLogin.existeTycTittleTexto() && pageLogin.existeClickCheckTerm())
            pageLogin.clickCheckTerm();
        if (pageLogin.existeBtnAceptarTerminos() && pageLogin.activoBtnAceptarTerminos())
            pageLogin.clickBtnAceptarTerminos();
        //TODO: Huella
        if (pageLogin.existeBtnSkipFinger()) pageLogin.clickBtnSkipFinger();
        if (pageLogin.existeBtnComenzar() && pageLogin.activoBtnComenzar())
            pageLogin.clickBtnComenzar();
        UsoCom.screenshot("@loginUFTAppium");
    }

    @Then("^aparezco en pagina de inicio$")
    public void aparezco_en_pagina_de_inicio() throws Throwable {
        assertTrue(pageLogin.existeMenuInferior());
        UsoCom.screenshot("@loginUFTAppium");
    }
}
