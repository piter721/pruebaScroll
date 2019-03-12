package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.PageExampleClipboard;

public class TheAppClipboard {
	
	private PageExampleClipboard cli = ApplicationLauncherAndroid.ejemploClipboard;
	
	@Given("^Me posisiono en la pagina principal$")
	public void me_posisiono_en_la_paguina_principal() throws Throwable {
	    assertTrue(cli.estoyenInicio());
	}

	@When("^selecciono la opcion clipboard demo$")
	public void selecciono_la_opcion_clipboard_demo() throws Throwable {
	    cli.clickClipboard();
	    Thread.sleep(3000);
	}

	@Given("^me posisiono en la ventana de clipboard$")
	public void me_posisiono_en_la_ventana_de_clipboard() throws Throwable {
	    assertTrue(cli.existeTxtPrueba());
	}

	@When("^ingreso una palabra\"([^\"]*)\" en el campo de texto$")
	public void ingreso_una_palabra_en_el_campo_de_texto(String palabra) throws Throwable {
	    cli.txtPrueba(palabra);
	    Thread.sleep(3000);
	}

	@When("^presiono el boton guardar y luego el boton refresh$")
	public void presiono_el_boton_guardar_y_luego_el_boton_refresh() throws Throwable {
	    cli.ClickBtnSetClipboard();
	    Thread.sleep(3000);
	    cli.clickRefresh();
	    Thread.sleep(3000);
	}

	@Then("^se cambia el texto del clipboard por la palabra ingresada anteriormente$")
	public void se_cambia_el_texto_del_clipboard_por_la_palabra_ingresada_anteriormente() throws Throwable {
	    cli.ValidarCambioCorrecto();
	}
}
