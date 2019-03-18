package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.pageScroll;

public class ScrollApp {
	private pageScroll ps = ApplicationLauncherAndroid.bajarConScrollApp; 
	@Given("^ingresar a la pagina principal$")
	public void ingresar_a_la_pagina_principal() throws Throwable {
	    assertTrue(ps.estoyEnPrincipal());
	}

	@Then("^seleccionar una opcion de la pantalla$")
	public void seleccionar_una_opcion_de_la_pantalla() throws Throwable {
	    ps.ClickListDemo();
	    Thread.sleep(3000);
	}

	@When("^estoy dentro de la seleccion$")
	public void estoy_dentro_de_la_seleccion() throws Throwable {
	    assertTrue(ps.estoyEnListas());
	}

	@Then("^hago un scroll down para ver opciones que estan abajo$")
	public void hago_un_scroll_down_para_ver_opciones_que_estan_abajo() throws Throwable {
	    ps.scrollDown();
	    Thread.sleep(3000);
	    ps.ClickListDemo();
	}
}
