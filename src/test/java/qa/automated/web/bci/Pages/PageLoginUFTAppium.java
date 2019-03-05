package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLoginUFTAppium {

	private Usuario cliente = new Usuario("231884440", "159753", "dato", "23188444", "DN");

	/** OBJETOS **/

	@FindBy(id = "cl.bci.app.personas.qa:id/main_content")
	private WebElement mainContent;// saludo ¿Hola Usuario?|pantalla0

	@FindBy(id = "cl.bci.app.personas.qa:id/tv_welcome_user")
	private WebElement textoHola;// saludo ¿Hola Usuario?|pantalla0

	@FindBy(id = "cl.bci.app.personas.qa:id/tv_change_user")
	private WebElement textoNoEresTu;// saludo ¿No eres tu?|pantalla0

	@FindBy(id = "cl.bci.app.personas.qa:id/acb_enter")
	private WebElement btnIngresar;// Boton INGRESAR|pantalla0

	@FindBy(id = "cl.bci.app.personas.qa:id/userRutWrapper")
	private WebElement textoRut;// Texto ingresa tu RUT|pantalla1

	@FindBy(id = "cl.bci.app.personas.qa:id/et_user_rut")
	private WebElement inputRut;// InputRut|pantalla1

	@FindBy(id = "cl.bci.app.personas.qa:id/userPasswordWrapper")
	private WebElement textoPass;// Texto Clave Internet|pantalla1

	@FindBy(id = "cl.bci.app.personas.qa:id/et_user_password")
	private WebElement inputPass;// InputPass|pantalla1

	@FindBy(id = "cl.bci.app.personas.qa:id/forgotten_password_link")
	private WebElement textoProb;// ¿Texto problemas con tu clave?|pantalla1

	@FindBy(id = "cl.bci.app.personas.qa:id/btn_login")
	private WebElement btnLogin;// btn INGERSAR|pantalla1

	@FindBy(id = "cl.bci.app.personas.qa:id/tyc_title")
	private WebElement tycTittleTexto;// texto Términos y condiciones|pantalla2

	@FindBy(id = "cl.bci.app.personas.qa:id/tyc_last_line")
	private WebElement tycLastTexto;// texto Acepto los Términos y condiciones,
	// las Políticas de Privacidad de Bci y autorizo el tratamiento de mis datos
	// personales en Chile o en el extranjero.|pantalla2

	@FindBy(id = "cl.bci.app.personas.qa:id/accept_terms_checkbox")
	private WebElement checkTerm;// checkbox|pantalla2

	@FindBy(id = "cl.bci.app.personas.qa:id/btn_accept")
	private WebElement btnAceptarTerminos;// btnTyc ACEPTAR|pantalla2

	@FindBy(id = "cl.bci.app.personas.qa:id/editText2")
	private WebElement textoPpalHuella;// Ingresa a Bci Móvil /n utilizando tu huella digital.|pantalla3

	@FindBy(id = "cl.bci.app.personas.qa:id/textView4")
	private WebElement textoSecHuella;// Recuerda que puedes utilizar cualquier
	// huella registrada en tu dispositivo|pantalla3

	@FindBy(id = "cl.bci.app.personas.qa:id/skip_btn")
	private WebElement btnSkipFinger;// boton saltar|En otro momento|pantalla3

	@FindBy(id = "cl.bci.app.personas.qa:id/accept_btn")
	private WebElement btnOkFinger;// boton aceptar huella|Habilitar huella|pantalla3

	@FindBy(id = "cl.bci.app.personas.qa:id/fp_terms_and_condition")
	private WebElement textoTycFinger;// texto TYC Huella|Al habilitar la huella estas aceptando
	// los Términos y Condiciones.|pantalla3

	@FindBy(id = "cl.bci.app.personas.qa:id/textView5")
	private WebElement textoBienvenidoPrueba;// ¡Bienvenido!|pantalla4

	@FindBy(id = "cl.bci.app.personas.qa:id/congrats_message")
	private WebElement TextoCongratsPrueba;// USUARIO, recuerda que en esta versión solo
	// algunas funciones están disponibles.|pantalla4

	@FindBy(id = "cl.bci.app.personas.qa:id/btn_begin")
	private WebElement btnComenzar;// Comenzar|pantalla4

	@FindBy(id = "cl.bci.app.personas.qa:id/menuInferior")
	private WebElement menuInferior;// menu|pantalla5

	/** METODOS **/

	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean existeMainContent() {
		return (mainContent.isDisplayed() && mainContent.isEnabled());
	}

	public String obtenerTextoHola() {
		return textoHola.getText();
	}

	public boolean existeTextoHola() {
		return this.existe(textoHola);
	}

	public String obtenerTextoNoEresTu() {
		return textoNoEresTu.getText();
	}

	public boolean activoBtnIngresar() {
		return btnIngresar.isEnabled();
	}

	public boolean existeBtnIngresar() {
		return this.existe(btnIngresar);
	}

	public void clickBtnIngresar() {
		btnIngresar.click();
	}

	public String obtenerTextoRut() {
		return textoRut.getText();			
	}

	public boolean existeTextoRut() {
		return this.existe(textoRut);
	}

	public String obtenerInputRut() {
		return inputRut.getText();
	}

	public void escribirInputRut(String rut) {
		inputRut.sendKeys(rut);
	}

	public String obtenerTextoPass() {
		return textoPass.getText();
	}

	public String obtenerInputPass() {
		return inputPass.getText();
	}

	public boolean existeInputPass() {
		return this.existe(inputPass);
	}

	public void escribirInputPass(String pass) {
		inputPass.sendKeys(pass);
	}

	public String obtenerTextoProb() {
		return textoProb.getText();
	}

	public boolean existeBtnLogin(){
		return this.existe(btnLogin);
	}
	
	public boolean activoBtnLogin() {
		return btnLogin.isEnabled();
	}

	public void clickBtnLogin() {
		btnLogin.click();
	}

	public boolean existeTycTittleTexto(){
		return this.existe(tycTittleTexto);
	}
	public String obtenerTycTittleTexto() {
		return tycTittleTexto.getText();
	}

	public boolean existeClickCheckTerm(){
		return this.existe(checkTerm);
	}
	
	public void clickCheckTerm() {
		checkTerm.click();
	}

	public boolean existeBtnAceptarTerminos(){
		return this.existe(btnAceptarTerminos);
	}

	public boolean activoBtnAceptarTerminos() {
		return btnAceptarTerminos.isEnabled();
	}

	public void clickBtnAceptarTerminos() {
		btnAceptarTerminos.click();
	}

	public String obtenerTextoPpalHuella() {
		return textoPpalHuella.getText();
	}

	public String obtenerTextoSecHuella() {
		return textoSecHuella.getText();
	}

	public boolean activoBtnSkipFinger() {
		return btnSkipFinger.isEnabled();
	}
	public boolean existeBtnSkipFinger() {
		return this.existe(btnSkipFinger);
	}

	public void clickBtnSkipFinger() {
		btnSkipFinger.click();
	}

	public boolean activoBtnOkFinger() {
		return btnOkFinger.isEnabled();
	}

	public void clickBtnOkFinger() {
		btnOkFinger.click();
	}

	public String obtenerTextoTycFinger() {
		return textoTycFinger.getText();
	}

	public String obtenerTextoBienvenidoPrueba() {
		return textoBienvenidoPrueba.getText();
	}

	public String obtenerTextoCongratsPrueba() {
		return TextoCongratsPrueba.getText();
	}

	public boolean existeBtnComenzar(){
		return this.existe(btnComenzar);
	}

	public boolean activoBtnComenzar() {
		return btnComenzar.isEnabled();
	}

	public void clickBtnComenzar() {
		btnComenzar.click();
	}

	public boolean existeMenuInferior() {
		return this.existe(menuInferior);
	}

	public String obtenerRutCliente() {
		return cliente.getRut();
	}

	/** Getters & Setters **/

	public WebElement getTextoHola() {
		return textoHola;
	}

	public void setTextoHola(WebElement textoHola) {
		this.textoHola = textoHola;
	}

	public WebElement getTextoNoEresTu() {
		return textoNoEresTu;
	}

	public void setTextoNoEresTu(WebElement textoNoEresTu) {
		this.textoNoEresTu = textoNoEresTu;
	}

	public WebElement getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(WebElement btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public WebElement getTextoRut() {
		return textoRut;
	}

	public void setTextoRut(WebElement textoRut) {
		this.textoRut = textoRut;
	}

	public WebElement getInputRut() {
		return inputRut;
	}

	public void setInputRut(WebElement inputRut) {
		this.inputRut = inputRut;
	}

	public WebElement getTextoPass() {
		return textoPass;
	}

	public void setTextoPass(WebElement textoPass) {
		this.textoPass = textoPass;
	}

	public WebElement getInputPass() {
		return inputPass;
	}

	public void setInputPass(WebElement inputPass) {
		this.inputPass = inputPass;
	}

	public WebElement getTextoProb() {
		return textoProb;
	}

	public void setTextoProb(WebElement textoProb) {
		this.textoProb = textoProb;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

	public WebElement getTycTittleTexto() {
		return tycTittleTexto;
	}

	public void setTycTittleTexto(WebElement tycTittleTexto) {
		this.tycTittleTexto = tycTittleTexto;
	}

	public WebElement getTycLastTexto() {
		return tycLastTexto;
	}

	public void setTycLastTexto(WebElement tycLastTexto) {
		this.tycLastTexto = tycLastTexto;
	}

	public WebElement getCheckTerm() {
		return checkTerm;
	}

	public void setCheckTerm(WebElement checkTerm) {
		this.checkTerm = checkTerm;
	}

	public WebElement getBtnAceptarTerminos() {
		return btnAceptarTerminos;
	}

	public void setBtnAceptarTerminos(WebElement btnAceptarTerminos) {
		this.btnAceptarTerminos = btnAceptarTerminos;
	}

	public WebElement getTextoPpalHuella() {
		return textoPpalHuella;
	}

	public void setTextoPpalHuella(WebElement textoPpalHuella) {
		this.textoPpalHuella = textoPpalHuella;
	}

	public WebElement getTextoSecHuella() {
		return textoSecHuella;
	}

	public void setTextoSecHuella(WebElement textoSecHuella) {
		this.textoSecHuella = textoSecHuella;
	}

	public WebElement getBtnSkipFinger() {
		return btnSkipFinger;
	}

	public void setBtnSkipFinger(WebElement btnSkipFinger) {
		this.btnSkipFinger = btnSkipFinger;
	}

	public WebElement getBtnOkFinger() {
		return btnOkFinger;
	}

	public void setBtnOkFinger(WebElement btnOkFinger) {
		this.btnOkFinger = btnOkFinger;
	}

	public WebElement getTextoTycFinger() {
		return textoTycFinger;
	}

	public void setTextoTycFinger(WebElement textoTycFinger) {
		this.textoTycFinger = textoTycFinger;
	}

	public WebElement getTextoCongratsPrueba() {
		return TextoCongratsPrueba;
	}

	public void setTextoCongratsPrueba(WebElement textoCongratsPrueba) {
		TextoCongratsPrueba = textoCongratsPrueba;
	}

	public WebElement getBtnComenzar() {
		return btnComenzar;
	}

	public void setBtnComenzar(WebElement btnComenzar) {
		this.btnComenzar = btnComenzar;
	}

	public WebElement getTextoBienvenidoPrueba() {
		return textoBienvenidoPrueba;
	}

	public void setTextoBienvenidoPrueba(WebElement textoBienvenidoPrueba) {
		this.textoBienvenidoPrueba = textoBienvenidoPrueba;
	}

	public WebElement getMenuInferior() {
		return menuInferior;
	}

	public void setMenuInferior(WebElement menuInferior) {
		this.menuInferior = menuInferior;
	}

	public WebElement getMainContent() {
		return mainContent;
	}

	public void setMainContent(WebElement mainContent) {
		this.mainContent = mainContent;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
}
