package qa.automated.web.bci.Definitions;


import org.openqa.selenium.interactions.SourceType;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Generic.UsoCom;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.PageCarroCompraAliexpress;



public class ALI_FlujoCarroCompra {

	private PageCarroCompraAliexpress pageAli = ApplicationLauncherAndroid.carroCompraAliexpress;
	
	
	@Given("^me posiciono en el menu principal$")
	public void me_posiciono_en_el_menu_principal() throws Throwable {
	   pageAli.clickSaltar();
	   assertTrue(pageAli.estoyEnPaginaPrincipal());
	   //UsoCom.screenshot("@IngresoAplicacionAliexpress");
	}

	@When("^hago click en mi cuenta de la barra inferior$")
	public void hago_click_en_mi_cuenta_de_la_barra_inferior() throws Throwable {
	    pageAli.clickMiCuenta();
	    Thread.sleep(3000);
	}

	@Then("^aparece en opciones de la cuenta$")
	public void aparece_en_opciones_de_la_cuenta() throws Throwable {
		assertTrue(pageAli.estoyIniciarSesion());
	}

	@When("^hago click en iniciar sesion$")
	public void hago_click_en_iniciar_sesion() throws Throwable {
		pageAli.clickIniciarSesion();
		Thread.sleep(3000);
	}

	@Then("^aparece un popup de inicio o registro$")
	public void aparece_un_popup_de_inicio_o_registro() throws Throwable {
	    assertTrue(pageAli.existebtnIdentificate());
	}

	@When("^hago click en el boton de identificarme$")
	public void hago_click_en_el_boton_de_identificarme() throws Throwable {
		pageAli.clickIdentificate();
		Thread.sleep(3000);
	}

	@Then("^aparece la pagina de ingreso$")
	public void aparece_la_pagina_de_ingreso() throws Throwable {
	    assertTrue(pageAli.existeTxtEmail());
	}

	@When("^ingreso el usuario \"([^\"]*)\" y pass \"([^\"]*)\"$")
	public void ingreso_el_usuario_y_pass(String usuario, String pass) throws Throwable {
		pageAli.ingresarEmail(usuario);
		Thread.sleep(1000);
		pageAli.ingresarPass(pass);
		Thread.sleep(1000);
		pageAli.clickEnviarDatosUsuario();
		Thread.sleep(5000);
	}

	@Then("^aparece en detalles de mi cuenta con mi cuenta agregada exitosamente$")
	public void aparece_en_detalles_de_mi_cuenta_con_mi_cuenta_agregada_exitosamente() throws Throwable {
	    assertTrue(pageAli.existebtnOpcionesAjustes());
	    
	}

	@Given("^que me posiciono en el menu principal$")
	public void que_me_posiciono_en_el_menu_principal() throws Throwable {
		assertTrue(pageAli.existebtnBuscar());
	}

	@When("^hago click en el boton de busqueda en el menu de la barra inferior$")
	public void hago_click_en_el_boton_de_busqueda_en_el_menu_de_la_barra_inferior() throws Throwable {
		
		pageAli.BtnIconoPaginaPrincipal();
	    Thread.sleep(3000);
	    pageAli.clickBotonBuscar();
	    Thread.sleep(3000);
	}

	@Then("^aparece la pagina de busquedas$")
	public void aparece_la_pagina_de_busquedas() throws Throwable {
	    assertTrue(pageAli.existeTxtBuscar());
	}

	@When("^ingreso el celular\"([^\"]*)\" en el campo de texto en la parte superior$")
	public void ingreso_el_celular_en_el_campo_de_texto_en_la_parte_superior(String celular) throws Throwable {
	    pageAli.escribirProducto(celular);
	    Thread.sleep(3000);
	}

	@Then("^aparece un listado de los resultados por nombre$")
	public void aparece_un_listado_de_los_resultados_por_nombre() throws Throwable {
	    assertTrue(pageAli.existebtnbuscarProducto());
	    pageAli.clickBtnBuscarProducto();
	    Thread.sleep(3000);
	}

	@Then("^selecciono el primer resultado$")
	public void selecciono_el_primer_resultado() throws Throwable {
	    pageAli.clickProducto();
	    Thread.sleep(3000);
	}

	@Given("^me posiciono en la ventana de busqueda$")
	public void me_posiciono_en_la_ventana_de_busqueda() throws Throwable {
		assertTrue(pageAli.existeImgProducto());
	}

	@When("^aparece los resultados acorde a lo buscado$")
	public void aparece_los_resultados_acorde_a_lo_buscado() throws Throwable {
	    pageAli.clickImgenProducto();
	    Thread.sleep(3000);
	}

	@Then("^selecciono el primer equippo en la pagina de busquedas$")
	public void selecciono_el_primer_equippo_en_la_pagina_de_busquedas() throws Throwable {
	    assertTrue(pageAli.existebtnAñadirAlCarro());
	}

	@Given("^me posiciono en la ventana de detalles del producto$")
	public void me_posiciono_en_la_ventana_de_detalles_del_producto() throws Throwable {
	    assertTrue(pageAli.existebtnAñadirAlCarro());
	}

	@When("^hago click en el boton agregar a la cesta$")
	public void hago_click_en_el_boton_agregar_a_la_cesta() throws Throwable {
		 pageAli.clickAñadirCarro();
		    Thread.sleep(3000);
	}

	@Then("^aparece un popup de seleccion de producto$")
	public void aparece_un_popup_de_seleccion_de_producto() throws Throwable {
	    assertTrue(pageAli.existeImgSeleccionColor());
	}

	@When("^Selecciono las caracteristecas del producto$")
	public void haga_click_en_un_paquete_que_seleccione() throws Throwable {
	    pageAli.clickImagenMaterial();
	    Thread.sleep(2000);
	    pageAli.clickImagenColor();
	    Thread.sleep(1000);
	}

	@When("^hago click en el boton continuar$")
	public void hago_click_en_el_boton_continuar() throws Throwable {
	    pageAli.clickBotonContinuar();
	    Thread.sleep(5000);
	}

	@Then("^aparece un popup informando que se añadio a la cesta con opciones$")
	public void aparece_un_popup_informando_que_se_añadio_a_la_cesta_con_opciones() throws Throwable {
	    assertTrue(pageAli.existeBtnIrAlCarroCompra());
	}

	@When("^hago click  en ir a cesta$")
	public void hago_click_en_ir_a_cesta() throws Throwable {
		pageAli.existeBtnIrAlCarroCompra();
	}

	@Then("^ingreso a la cesta del usuario$")
	public void ingreso_a_la_cesta_del_usuario() throws Throwable {
	    pageAli.cliclloTengo();
	}

	@Given("^me posiciono en la ventana de mi cesta$")
	public void me_posiciono_en_la_ventana_de_mi_cesta() throws Throwable {
		assertTrue(pageAli.existeProducto());
	}

	@When("^hago click en el recuadro en la parte izquierda del producto$")
	public void hago_click_en_el_recuadro_en_la_parte_izquierda_del_producto() throws Throwable {
	    pageAli.clickRecuadroSeleccionadorProducto();
	    Thread.sleep(4000);
	}

	@When("^hago click en la imagen de bote de basura en la parte superior derecha$")
	public void hago_click_en_la_imagen_de_bote_de_basura_en_la_parte_superior_derecha() throws Throwable {
		pageAli.clickBorrar();
	    Thread.sleep(3000);
	}
	
	@Then("^aparece un popup con un mensaje de seguridad de eliminacion$")
	public void aparece_un_popup_con_un_mensaje_de_seguridad_de_eliminacion() throws Throwable {
	    assertTrue(pageAli.existebtnEliminar());
	}

	@When("^hago click en eliminar$")
	public void hago_click_en_eliminar() throws Throwable {
	    pageAli.clickEliminar();
	    Thread.sleep(3000);
	}

	@Then("^aparece el cesto sin el producto recientemente seleccionado$")
	public void aparece_el_cesto_sin_el_producto_recientemente_seleccionado() throws Throwable {
		assertTrue(pageAli.existebtnEliminar());
	}

	@When("^hago click a la flecha en la parte superior izquierda$")
	public void hago_click_a_la_flecha_en_la_parte_superior_izquierda() throws Throwable {
	    pageAli.clickAtras();
	    Thread.sleep(3000);
	}

	@Then("^aparece la ventana de busqueda con la descripcion del producto anteriormente seleccionado$")
	public void aparece_la_ventana_de_busqueda_con_la_descripcion_del_producto_anteriormente_seleccionado() throws Throwable {
	    assertTrue(pageAli.existebtnAñadirAlCarro());  
	}
	
	@When("^hago click en el boton de opciones$")
	public void hago_click_en_el_boton_de_opciones() throws Throwable {
		pageAli.clickMenuOpcionesGenerales();
	    Thread.sleep(5000);
	}
	
	@Then("^me aparece un menu de opciones generales$")
	public void me_aparece_un_menu_de_opciones_generales() throws Throwable {
	    assertTrue(pageAli.existelnkMicuenta());
	}

	@When("^selecciono mi cuenta$")
	public void selecciono_mi_cuenta() throws Throwable {
		pageAli.clickLNKMiCuenta();
	    Thread.sleep(5000);
	}

	@Then("^aparece en la pagina de mi cuenta$")
	public void aparece_en_la_pagina_de_mi_cuenta() throws Throwable {
		assertTrue(pageAli.existebtnOpcionesAjustes());
	}

	@When("^hago click en ajustes$")
	public void hago_click_en_ajustes() throws Throwable {
		pageAli.clickOpcionAjustes();
		Thread.sleep(5000);
	}

	@Then("^aparece una ventana de ajustes$")
	public void aparece_una_ventana_de_ajustes() throws Throwable {
	    assertTrue(pageAli.existebtnCerrarSesion());
	}

	@When("^hago click en el boton cerrar sesion$")
	public void hago_click_en_el_boton_cerrar_sesion() throws Throwable {
	    pageAli.clickCerrarSesion();
	    Thread.sleep(5000);
	}

	@Then("^aparece un popup validando que cierro sesion$")
	public void aparece_un_popup_validando_que_cierro_sesion() throws Throwable {
	    assertTrue(pageAli.existebtnAceptarCierreSesion());
	}

	@When("^hago click en el boton aceptar$")
	public void hago_click_en_el_boton_aceptar() throws Throwable {
	    pageAli.clickbtnAceptarCierreSesion();
	    Thread.sleep(3000);
	}

	@Then("^aparece en el menu principal con sesion cerrada$")
	public void aparece_en_el_menu_principal() throws Throwable {
		assertTrue(pageAli.estoyIniciarSesion());
	}


}
