package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.pageMercadoLibre;

public class MercadoLibre {
	private pageMercadoLibre pml = ApplicationLauncherAndroid.pml;
	private String texto;
	
	@Given("^abro la aplicacion y aparece un popup$")
	public void abro_la_aplicacion_y_aparece_un_popup() throws Throwable {
	    assertTrue(pml.existepopup());
	}

	@Then("^cierro el popup y compruebo de que no haya uno sobre otro$")
	public void cierro_el_popup_y_compruebo_de_que_no_haya_uno_sobre_otro() throws Throwable {
	    boolean btnmastarde;
		pml.clickMasTarde();
	    Thread.sleep(3000);
	    pml.clickOmitir();
	}

	@Given("^Me posisiono en la pagina principal de Mercado libre$")
	public void me_posisiono_en_la_pagina_principal_de_Mercado_libre() throws Throwable {
	    assertTrue(pml.existepagPri());
	}

	@When("^hago click en el boton de busqueda$")
	public void hago_click_en_el_boton_de_busqueda() throws Throwable {
	    pml.clickBtnBuscar();
	}

	@Then("^me posiciono en la ventana de busqueda$")
	public void me_posiciono_en_la_ventana_de_busqueda() throws Throwable {
	    assertTrue(pml.existeBuscar());
	}

	@When("^busco el producto \"([^\"]*)\"$")
	public void busco_el_producto(String televisor) throws Throwable {
	    pml.sendkeystext(televisor);
	}

	@Then("^aparece un listado de resultado selecciono el primer producto$")
	public void aparece_un_listado_de_resultado_selecciono_el_primer_producto() throws Throwable {
	    assertTrue(pml.existelblTelevisor());
	    pml.clicklbltelevisor();
	}

	@Given("^me posisiono la pagina de resultados de busqueda$")
	public void me_posisiono_la_pagina_de_resultados_de_busqueda() throws Throwable {
	    assertTrue(pml.existeimgtele());
	}

	@When("^selecciono el primer televisor$")
	public void selecciono_el_primer_televisor() throws Throwable {
	    pml.clickimgtele();
	}

	@Then("^aparezco en la descripcion del producto y valido que sea ese$")
	public void aparezco_en_la_descripcion_del_producto_y_valido_que_sea_ese() throws Throwable {
	    assertTrue(pml.existedescripcionProducto());
	}

	@When("^hago un scroll down$")
	public void hago_un_scroll_down() throws Throwable {
	    pml.scrollDown();
	}

	@Then("^llego al boton de continuar$")
	public void llego_al_boton_de_continuar() throws Throwable {
//	    pml.clickComprar();
	}
}
