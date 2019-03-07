package qa.automated.web.bci.Definitions;


import org.openqa.selenium.interactions.SourceType;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.PageCarroCompraAliexpress;



public class ALI_FlujoCarroCompra {

	private PageCarroCompraAliexpress pageAli = ApplicationLauncherAndroid.carroCompraAliexpress;
	@Given("^me posiciono en el menu principal$")
	public void me_posiciono_en_el_menu_principal() throws Throwable {
	   pageAli.clickSaltar();
	}

	@When("^hago click en mi cuenta de la barra inferior$")
	public void hago_click_en_mi_cuenta_de_la_barra_inferior() throws Throwable {
	    
	}

	@Then("^aparece en opciones de la cuenta$")
	public void aparece_en_opciones_de_la_cuenta() throws Throwable {
	    
	}

	@When("^hago click en iniciar sesion$")
	public void hago_click_en_iniciar_sesion() throws Throwable {
	    
	}

	@Then("^aparece un popup de inicio o registro$")
	public void aparece_un_popup_de_inicio_o_registro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton de identificarme$")
	public void hago_click_en_el_boton_de_identificarme() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece la pagina de ingreso$")
	public void aparece_la_pagina_de_ingreso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^ingreso el usuario \"([^\"]*)\" y pass \"([^\"]*)\"$")
	public void ingreso_el_usuario_y_pass(String usuario, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece en detalles de mi cuenta con mi cuenta agregada exitosamente$")
	public void aparece_en_detalles_de_mi_cuenta_con_mi_cuenta_agregada_exitosamente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^que me posiciono en el menu principal$")
	public void que_me_posiciono_en_el_menu_principal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton de busqueda en el menu de la barra inferior$")
	public void hago_click_en_el_boton_de_busqueda_en_el_menu_de_la_barra_inferior() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece la pagina de busquedas$")
	public void aparece_la_pagina_de_busquedas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^ingreso el celular\"([^\"]*)\" en el campo de texto en la parte superior$")
	public void ingreso_el_celular_en_el_campo_de_texto_en_la_parte_superior(String celular) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece un listado de los resultados por nombre$")
	public void aparece_un_listado_de_los_resultados_por_nombre() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^selecciono el primer resultado$")
	public void selecciono_el_primer_resultado() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^me posiciono en la ventana de busqueda$")
	public void me_posiciono_en_la_ventana_de_busqueda() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^aparece los resultados acorde a lo buscado$")
	public void aparece_los_resultados_acorde_a_lo_buscado() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^selecciono el primer equippo en la pagina de busquedas$")
	public void selecciono_el_primer_equippo_en_la_pagina_de_busquedas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^me posiciono en la ventana de detalles del producto$")
	public void me_posiciono_en_la_ventana_de_detalles_del_producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton agregar a la cesta$")
	public void hago_click_en_el_boton_agregar_a_la_cesta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^el producto se guardara en la cesta$")
	public void el_producto_se_guardara_en_la_cesta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece un popup de seleccion de producto$")
	public void aparece_un_popup_de_seleccion_de_producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^haga click en un paquete que seleccione$")
	public void haga_click_en_un_paquete_que_seleccione() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^me selecciona dicho paquete$")
	public void me_selecciona_dicho_paquete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^haga click en una imagen con el color del celular$")
	public void haga_click_en_una_imagen_con_el_color_del_celular() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^me selecciona la imagen con el respectivo color$")
	public void me_selecciona_la_imagen_con_el_respectivo_color() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^me aumenta la cantidad de celulares que comprare$")
	public void me_aumenta_la_cantidad_de_celulares_que_comprare() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton continuar$")
	public void hago_click_en_el_boton_continuar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece un popup informando que se añadio a la cesta con opciones$")
	public void aparece_un_popup_informando_que_se_añadio_a_la_cesta_con_opciones() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click  en ir a cesta$")
	public void hago_click_en_ir_a_cesta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^ingreso a la cesta del usuario$")
	public void ingreso_a_la_cesta_del_usuario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^me posiciono en la ventana de mi cesta$")
	public void me_posiciono_en_la_ventana_de_mi_cesta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el recuadro en la parte izquierda del producto$")
	public void hago_click_en_el_recuadro_en_la_parte_izquierda_del_producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^se marca con un victo y se selecciona el producto$")
	public void se_marca_con_un_victo_y_se_selecciona_el_producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en la imagen de bote de basura en la parte superior derecha$")
	public void hago_click_en_la_imagen_de_bote_de_basura_en_la_parte_superior_derecha() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece un popup con un mensaje de seguridad de eliminacion$")
	public void aparece_un_popup_con_un_mensaje_de_seguridad_de_eliminacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en eliminar$")
	public void hago_click_en_eliminar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece el cesto sin el producto recientemente seleccionado$")
	public void aparece_el_cesto_sin_el_producto_recientemente_seleccionado() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click a la flecha en la parte superior izquierda$")
	public void hago_click_a_la_flecha_en_la_parte_superior_izquierda() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece la ventana de busqueda con la descripcion del producto anteriormente seleccionado$")
	public void aparece_la_ventana_de_busqueda_con_la_descripcion_del_producto_anteriormente_seleccionado() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece la ventana de busqueda con el producto anteriormente buscado$")
	public void aparece_la_ventana_de_busqueda_con_el_producto_anteriormente_buscado() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece la pagina principal de busqueda$")
	public void aparece_la_pagina_principal_de_busqueda() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en ajustes$")
	public void hago_click_en_ajustes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece una ventana de ajustes$")
	public void aparece_una_ventana_de_ajustes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton cerrar sesion$")
	public void hago_click_en_el_boton_cerrar_sesion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece un popup validando que cierro sesion$")
	public void aparece_un_popup_validando_que_cierro_sesion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton aceptar$")
	public void hago_click_en_el_boton_aceptar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparece en el menu principal$")
	public void aparece_en_el_menu_principal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^la sesion esta cerrada$")
	public void la_sesion_esta_cerrada() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
