package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.PendingException;


public class PageCarroCompraAliexpress {
	@FindBy(xpath = "//android.view.View[@index='0']")
	private WebElement btnSaltar;
	@FindBy(id = "com.alibaba.aliexpresshd:id/navigation_my_ae")
	private WebElement btnMiCuenta;
	@FindBy(id = "com.alibaba.aliexpresshd:id/tv_un_login")
	private WebElement TxtIniciarSesion;
	@FindBy(id = "com.alibaba.aliexpresshd:id/btn_sign_in")
	private WebElement btnIdentificate;
	@FindBy(id = "com.alibaba.aliexpresshd:id/et_email")
	private WebElement TxtEmail;
	@FindBy(id = "com.alibaba.aliexpresshd:id/et_password")
	private WebElement TxtPass;
	@FindBy(id = "com.alibaba.aliexpresshd:id/rl_ali_sign_in_btn")
	private WebElement btnIdentificarUsuario;
	@FindBy(id = "com.alibaba.aliexpresshd:id/navigation_home")
	private WebElement btnIconoInicio;
	@FindBy(id = "com.alibaba.aliexpresshd:id/rl_search_box")
	private WebElement btnBuscar;
	@FindBy(id = "com.alibaba.aliexpresshd:id/abs__search_src_text")
	private WebElement TxtBuscar;
	@FindBy(id = "com.alibaba.aliexpresshd:id/abs__search_go_btn")
	private WebElement btnBuscarProducto;
	@FindBy(xpath = "//android.widget.TextView[@text='xaomi mi mix']")
	private WebElement LblProducto;
	@FindBy(id = "com.alibaba.aliexpresshd:id/riv_productsummary_img")
	private WebElement ImgProducto;
	@FindBy(id = "com.alibaba.aliexpresshd:id/ll_addToCart_1")
	private WebElement btnAñadirAlCarro;
	@FindBy(xpath = "//android.widget.CompoundButton[@index='0']")
	private WebElement ImgSeleccionColor;
	@FindBy(xpath = "//android.widget.CompoundButton[@text='For Mi Mix 2']")
	private WebElement ImgMaterial;
	@FindBy(id = "com.alibaba.aliexpresshd:id/rl_apply_options")
	private WebElement btnContinuar;
	@FindBy(id = "com.alibaba.aliexpresshd:id/buttonDefaultNegative")
	private WebElement BtnIrAlCarroCompra;
	@FindBy(id = "com.alibaba.aliexpresshd:id/bt_got_it")
	private WebElement btnloTengo;
	@FindBy(id = "com.alibaba.aliexpresshd:id/product_checkbox")
	private WebElement CbxSeleccionarProducto;
	@FindBy(id = "com.alibaba.aliexpresshd:id/menu_delete")
	private WebElement BtnBorrar;
	@FindBy(id = "com.alibaba.aliexpresshd:id/buttonDefaultPositive")
	private WebElement btnEliminar;
	@FindBy(xpath = "//android.widget.ImageButton[@index='0']")
	private WebElement btnAtras;
	@FindBy(id = "com.alibaba.aliexpresshd:id/menu_overflow")
	private WebElement btnOpcionesMenuGeneral;
	@FindBy(id = "com.alibaba.aliexpresshd:id/rl_drawer_list_item_root")
	private WebElement LnkMiCuenta;
	@FindBy(id = "com.alibaba.aliexpresshd:id/tv_settings")
	private WebElement btnOpcionAjustes;
	@FindBy(id = "com.alibaba.aliexpresshd:id/btn_login_out")
	private WebElement btnCerrarSesion;
	@FindBy(xpath = "com.alibaba.aliexpresshd:id/buttonDefaultPositive")
	private WebElement btnAceptarCierreSesion;
	
	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	//booleanos de validacion por la posicion en la que me encuentro
	
	public boolean existebtnSaltar() {
		return existe(btnSaltar);
	}
	public boolean estoyEnPaginaPrincipal() {
		return existe(btnMiCuenta);
	}
	public boolean estoyIniciarSesion() {
		return existe(TxtIniciarSesion);
	}
	public boolean existebtnIdentificate() {
		return existe(btnIdentificate);
	}
	public boolean existeTxtEmail() {
		return existe(TxtEmail);
	}
	public boolean existebtnBuscar() {
		return existe(btnBuscar);
	}
	public boolean existeTxtBuscar() {
		return existe(TxtBuscar);
	}
	public boolean existeLblProducto() {
		return existe(LblProducto);
	}
	public boolean existebtnbuscarProducto() {
		return existe(btnBuscarProducto);
	}
	public boolean existeImgProducto() {
		return existe(ImgProducto);
	}
	public boolean existebtnAñadirAlCarro() {
		return existe(btnAñadirAlCarro);
	}
	public boolean existeImgSeleccionColor() {
		return existe(ImgSeleccionColor);
	}
	public boolean existeBtnIrAlCarroCompra() {
		return existe(BtnIrAlCarroCompra);
	}
	public boolean existeCbxSeleccionarProducto() {
		return existe(CbxSeleccionarProducto);
	}
	public boolean existebtnEliminar() {
		return existe(btnEliminar);
	}
	public boolean existebtnOpcionesMenuGeneral() {
		return existe(btnOpcionesMenuGeneral);
	}
	public boolean existebtnCerrarSesion() {
		return existe(btnCerrarSesion);
	}
	public boolean existebtnOpcionesAjustes() {
		return existe(btnOpcionAjustes);
	}
	public boolean existebtnAceptarCierreSesion() {
		return existe(btnAceptarCierreSesion);
	}
	public boolean existelnkMicuenta() {
		return existe(LnkMiCuenta); 
	}
	
	//funciones para ejecutar acciones dentro de la aplicacion
	
	public void clickSaltar() {
		boolean btnsaltar;
		btnsaltar = existebtnSaltar();
		if (btnsaltar = true) {
			btnSaltar.click();
		}
		
	}
	public void clickMiCuenta() {
		btnMiCuenta.click();
	}
	public void clickIniciarSesion() {
		TxtIniciarSesion.click();
	}
	public void clickIdentificate() {
		btnIdentificate.click();
	}
	public void ingresarEmail(String usuario) {
		TxtEmail.sendKeys(usuario);
	}
	public void ingresarPass(String pass) {
		TxtPass.sendKeys(pass);
	}
	public void clickEnviarDatosUsuario() {
		btnIdentificarUsuario.click();
	}
	public void BtnIconoPaginaPrincipal() {
		btnIconoInicio.click();
	}
	public void clickBotonBuscar() {
		btnBuscar.click();
	}
	public void escribirProducto(String celular) {
		TxtBuscar.sendKeys(celular);
	}
	public void clickBtnBuscarProducto() {
		btnBuscarProducto.click();
	}
	public void clickProducto() {
		LblProducto.click();
	}
	public void clickImgenProducto() {
		ImgProducto.click();
	}
	public void clickAñadirCarro() {
		btnAñadirAlCarro.click();
	}
	public void clickImagenColor() {
		ImgSeleccionColor.click();
	}
	public void clickImagenMaterial() {
		ImgMaterial.click();
	}
	public void clickBotonContinuar() {
		btnContinuar.click();
	}
	public void clickIrCarroCompra() {
		BtnIrAlCarroCompra.click();
	}
	public boolean existePopupLoTengo() {
		return existe(btnloTengo);
	}
	public void cliclloTengo() {
		Boolean retorno;
		retorno = existePopupLoTengo();
		if (retorno = true) {
			btnloTengo.click();
		}
	}
	public boolean existeProducto() {
		return existe(CbxSeleccionarProducto);
	}
	public void clickRecuadroSeleccionadorProducto() {
		Boolean elemento;
		elemento = existeProducto();
		if (elemento = true) {
			CbxSeleccionarProducto.click();
		}
		else {
			throw new PendingException();
		}
	}
	public void clickBorrar() {
		BtnBorrar.click();
	}
	public void clickEliminar() {
		btnEliminar.click();
	}
	public void clickAtras() {
		btnAtras.click();
	}
	public void clickMenuOpcionesGenerales() {
		btnOpcionesMenuGeneral.click();
	}
	public void clickLNKMiCuenta() {
		LnkMiCuenta.click();
	}
	public void clickOpcionAjustes() {
		btnOpcionAjustes.click();
	}
	public void clickCerrarSesion() {
		btnCerrarSesion.click();
	}
	public void clickbtnAceptarCierreSesion() {
		btnAceptarCierreSesion.click();
	}
}
