package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.pageTbk;

public class ProbandoTbk {
	pageTbk tbk = ApplicationLauncherAndroid.tbk;
	@Given("^Me posisiono en la pagina del Login$")
	public void me_posisiono_en_la_pagina_del_Login() throws Throwable {
	    assertTrue(tbk.estoyLogin());
	}

	@When("^ingreso el rut cliente\"([^\"]*)\" rut comercial\"([^\"]*)\" y pass\"([^\"]*)\"$")
	public void ingreso_el_rut_cliente_rut_comercial_y_pass(String RutC, String RutE, String Pass) throws Throwable {
	    tbk.escribirDatos(RutC, RutE, Pass);
	}

	@When("^hago click en el boton ingresar$")
	public void hago_click_en_el_boton_ingresar() throws Throwable {
	    tbk.clickIngresar();
	}

	@Given("^Me posisiono en la pagina principal$")
	public void me_posisiono_en_la_pagina_principal() throws Throwable {
	    assertTrue(tbk.estoyPaginaPrincipal());
	}

	@When("^ingreso un monto manualmente con los botones en pantalla$")
	public void ingreso_un_monto_manualmente_con_los_botones_en_pantalla() throws Throwable {
	    tbk.clickuno();
	    Thread.sleep(1000);
	    tbk.clickcero();
	    Thread.sleep(1000);
	    tbk.clickcero();
	    Thread.sleep(1000);
	    tbk.clickcero();
	    Thread.sleep(1000);
	    tbk.clickcero();
	}

	@Then("^se ingresa correctamente el monto en el campo de texto de cuatro digitos$")
	public void se_ingresa_correctamente_el_monto_en_el_campo_de_texto_de_cuatro_digitos() throws Throwable {
	    assertTrue(tbk.validarMonto());
	}

	@When("^presionar el boton de cobrar$")
	public void presionar_el_boton_de_cobrar() throws Throwable {
	    tbk.clickCobrar();
	}

	@Then("^aparece un mensaje de error ed conexion y presiono el boton de volver a intentar$")
	public void aparece_un_mensaje_de_error_ed_conexion_y_presiono_el_boton_de_volver_a_intentar() throws Throwable {
	    assertTrue(tbk.mensajeErr());
	}
}
