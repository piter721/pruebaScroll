package qa.automated.web.bci.Definitions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Generic.UsoCom;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.PagePagoDeCuentasUFTAppium;

public class BCI_PagoDeCuentasUFTAppium {

	private PagePagoDeCuentasUFTAppium pagePago = ApplicationLauncherAndroid.pagePagoDeCuentasUFTAppium;

	@After
	public void screenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			UsoCom.screenshot("@pagoDeCuentasUFTAppium");
		}
	}
	
	@Given("^que estoy en la pagina de inicio$")
	public void que_estoy_en_la_pagina_de_inicio() throws Throwable {
		if (pagePago.existeTabContainer()) {
			assertTrue(pagePago.apareceTabContainer());
		}
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

	@Given("^estoy logeado con el rut$")
	public void estoy_logeado_con_el_rut() throws Throwable {
		assertEquals(pagePago.verificarNumeroCuenta(), "Nº 23188444");
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

	@When("^ingreso al menu de pagos$")
	public void ingreso_al_menu_de_pagos() throws Throwable {
		if (pagePago.existeBtnMas()) {
			pagePago.clickBtnMas();
		}

		if (pagePago.existeBtnEntrarPago()) {
			pagePago.clickBtnEntrarPago();
		}
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

	@Then("^se muestra la pagina de Pagos$")
	public void se_muestra_la_pagina_de_Pagos() throws Throwable {
		assertEquals(pagePago.verificarPagoCuentas(), "Pago de cuentas");
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

	@Given("^que estoy en la pagina de Pagos$")
	public void que_estoy_en_la_pagina_de_Pagos() throws Throwable {
		assertEquals(pagePago.textoConsultarPagosPendientes(), "Consultar pagos pendientes");
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

	@When("^ingreso a pagos pendientes$")
	public void ingreso_a_pagos_pendientes() throws Throwable {
		if (pagePago.existeConsultarPagosPendientes()) {
			pagePago.clickConsultarPagosPendientes();
		}
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

	@Then("^valido datos de cuentas por pagar$")
	public void valido_datos_de_cuentas_por_pagar() throws Throwable {
		assertEquals(pagePago.verificarTextoTotalPagar(), "Tienes un total a pagar de:");
		assertEquals(pagePago.verificarTextoCuentaInscrita(), "aguu");
		assertEquals(pagePago.verificarTextoBiller(), "Aguas Andinas");
		assertEquals(pagePago.verificarTextoNCliente(), "Nº cliente 11587763");
		assertTrue(pagePago.verificarTextoVencimiento().contains("Vence el"));
		UsoCom.screenshot("@pagoDeCuentasUFTAppium");
	}

}
