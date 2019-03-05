package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePagoDeCuentasUFTAppium {

	/** OBJETOS **/

	/* pagina 1 */
	@FindBy(id = "cl.bci.app.personas.qa:id/menuInferior")
	private WebElement tabContainer; // barra container

	@FindBy(id = "cl.bci.app.personas.qa:id/account_number")
	private WebElement textoNumeroCuenta;// texto numero de cuenta

	@FindBy(xpath = "//android.widget.LinearLayout[@index='4']")
	private WebElement containerMas; // barra con boton mas

	@FindBy(xpath = "//*[@resource-id='cl.bci.app.personas.qa:id/rv_opciones_dashboard']//android.view.ViewGroup[@index='0']")
	private WebElement btnEntrarPago; // boton ingresar a pago

	/* pagina 2 */
	@FindBy(id = "cl.bci.app.personas.qa:id/tv_dashboard_pago_cuentas")
	private WebElement textoPagoCuentas; // texto de pago de cuentas

	@FindBy(id = "cl.bci.app.personas.qa:id/tv_dashboard_cuentas_inscritas")
	private WebElement btnConsultarPagosPendientes; // boton para ingresar a pagos pendientes

	/* pagina 3 */
	@FindBy(id = "cl.bci.app.personas.qa:id/tv_title")
	private WebElement textoTotalPagar; // texto Tienes un total a pagar de:

	@FindBy(xpath = "//android.view.ViewGroup[@index='0']//*[@resource-id='cl.bci.app.personas.qa:id/tv_cuenta_inscrita_name']")
	private WebElement textoCuentaInscrita; // texto de la cuenta inscrita a pagar

	@FindBy(xpath = "//android.view.ViewGroup[@index='0']//*[@resource-id='cl.bci.app.personas.qa:id/tv_biller']")
	private WebElement textoBiller; // texto de la compañia a pagar

	@FindBy(xpath = "//android.view.ViewGroup[@index='0']//*[@resource-id='cl.bci.app.personas.qa:id/tv_nCliente']")
	private WebElement textoNCliente; // numero del cliente

	@FindBy(xpath = "//android.view.ViewGroup[@index='0']//*[@resource-id='cl.bci.app.personas.qa:id/tv_vencimiento']")
	private WebElement textoVencimiento; // fecha de vencimiento de cuenta

	/** METODOS **/

	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/* pagina 1 */
	public boolean existeTabContainer() {
		return this.existe(tabContainer);
	}

	public boolean apareceTabContainer() {
		return tabContainer.isEnabled();
	}

	public String verificarNumeroCuenta() {
		return textoNumeroCuenta.getText();
	}

	public boolean existeBtnMas() {
		return this.existe(containerMas);
	}

	public void clickBtnMas() {
		containerMas.click();
	}

	public boolean existeBtnEntrarPago() {
		return this.existe(btnEntrarPago);
	}

	public void clickBtnEntrarPago() {
		btnEntrarPago.click();
	}

	/* pagina 2 */
	public String verificarPagoCuentas() {
		return textoPagoCuentas.getText();
	}

	public boolean existeConsultarPagosPendientes() {
		return this.existe(btnConsultarPagosPendientes);
	}

	public String textoConsultarPagosPendientes() {
		return btnConsultarPagosPendientes.getText();
	}

	public void clickConsultarPagosPendientes() {
		btnConsultarPagosPendientes.click();
	}

	/* pagina 3 */
	public String verificarTextoTotalPagar() {
		return textoTotalPagar.getText();
	}

	public String verificarTextoCuentaInscrita() {
		return textoCuentaInscrita.getText();
	}

	public String verificarTextoBiller() {
		return textoBiller.getText();
	}

	public String verificarTextoNCliente() {
		return textoNCliente.getText();
	}

	public String verificarTextoVencimiento() {
		return textoVencimiento.getText();
	}

	/** GETTERS & SETTERS **/

	public WebElement getTabContainer() {
		return tabContainer;
	}

	public void setTabContainer(WebElement tabContainer) {
		this.tabContainer = tabContainer;
	}

	public WebElement getTextoNumeroCuenta() {
		return textoNumeroCuenta;
	}

	public void setTextoNumeroCuenta(WebElement textoNumeroCuenta) {
		this.textoNumeroCuenta = textoNumeroCuenta;
	}

	public WebElement getContainerMas() {
		return containerMas;
	}

	public void setContainerMas(WebElement containerMas) {
		this.containerMas = containerMas;
	}

	public WebElement getBtnEntrarPago() {
		return btnEntrarPago;
	}

	public void setBtnEntrarPago(WebElement btnEntrarPago) {
		this.btnEntrarPago = btnEntrarPago;
	}

	public WebElement getTextoPagoCuentas() {
		return textoPagoCuentas;
	}

	public void setTextoPagoCuentas(WebElement textoPagoCuentas) {
		this.textoPagoCuentas = textoPagoCuentas;
	}

	public WebElement getBtnConsultarPagosPendientes() {
		return btnConsultarPagosPendientes;
	}

	public void setBtnConsultarPagosPendientes(WebElement btnConsultarPagosPendientes) {
		this.btnConsultarPagosPendientes = btnConsultarPagosPendientes;
	}

	public WebElement getTextoTotalPagar() {
		return textoTotalPagar;
	}

	public void setTextoTotalPagar(WebElement textoTotalPagar) {
		this.textoTotalPagar = textoTotalPagar;
	}

	public WebElement getTextoCuentaInscrita() {
		return textoCuentaInscrita;
	}

	public void setTextoCuentaInscrita(WebElement textoCuentaInscrita) {
		this.textoCuentaInscrita = textoCuentaInscrita;
	}

	public WebElement getTextoBiller() {
		return textoBiller;
	}

	public void setTextoBiller(WebElement textoBiller) {
		this.textoBiller = textoBiller;
	}

	public WebElement getTextoNCliente() {
		return textoNCliente;
	}

	public void setTextoNCliente(WebElement textoNCliente) {
		this.textoNCliente = textoNCliente;
	}

	public WebElement getTextoVencimiento() {
		return textoVencimiento;
	}

	public void setTextoVencimiento(WebElement textoVencimiento) {
		this.textoVencimiento = textoVencimiento;
	}

}
