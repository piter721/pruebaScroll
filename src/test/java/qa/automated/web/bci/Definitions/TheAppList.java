package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.PageExampleClipboard;
import qa.automated.web.bci.Pages.PageList;

public class TheAppList {

	private PageList List = ApplicationLauncherAndroid.EjList;
	
	@Given("^Me posisiono en la pagina principal$")
	public void me_posisiono_en_la_paguina_principal() throws Throwable {
	    assertTrue(List.estoyEnPrincipal());
	}
	@When("^selecciono la opcion List$")
	public void selecciono_la_opcion_List() throws Throwable {
	    List.clickLista();
	}
	@Given("^bajo y selecciono la opcion stratus$")
	public void bajo_y_selecciono_la_opcion_stratus() throws Throwable {
	    List.scrollDown();
		assertTrue(List.existeStratus());
	}

	@Then("^me aparece un mensaje que me interesa stratus cloud$")
	public void me_aparece_un_mensaje_que_me_interesa_stratus_cloud() throws Throwable {
	    List.clickStratus();
	    Thread.sleep(3000);
	}

	@When("^selecciono ok y desaparece el popup emergente$")
	public void selecciono_ok_y_desaparece_el_popup_emergente() throws Throwable {
	    assertTrue(List.existeBtnOK());
	    List.clickOK();
	}
}
