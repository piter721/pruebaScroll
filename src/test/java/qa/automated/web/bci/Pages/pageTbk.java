package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageTbk {
	@FindBy(xpath = "android.widget.EditText[@text='Rut personal']")
	private WebElement txtRutCliente;
	@FindBy(xpath = "android.widget.EditText[@text='Rut empresa']")
	private WebElement txtRutEmpresa;
	@FindBy(xpath = "android.widget.EditText[@text='Contraseña']")
	private WebElement txtPass;
	@FindBy(id = "login_boton_entrar")
	private WebElement btnIngresar;
	@FindBy(id = "num_uno")
	private WebElement uno;
	@FindBy(id = "num_dos")
	private WebElement dos;
	@FindBy(id = "num_tres")
	private WebElement tres;
	@FindBy(id = "num_cuatro")
	private WebElement cuatro;
	@FindBy(id = "num_cinco")
	private WebElement cinco;
	@FindBy(id = "num_seis")
	private WebElement seis;
	@FindBy(id = "num_siete")
	private WebElement siete;
	@FindBy(id = "num_ocho")
	private WebElement ocho;
	@FindBy(id = "num_nueve")
	private WebElement nueve;
	@FindBy(id = "num_cero")
	private WebElement cero;
	@FindBy(id = "cobrar_pad")
	private WebElement btnCobrar;
	@FindBy(id = "monto_venta")
	private WebElement txtMonto;
	@FindBy(xpath = "android.widget.Button[@index='1']")
	private WebElement btnVolverIntentar;
	
	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean estoyLogin(){
		return existe(txtRutCliente);
	}
	public boolean estoyPaginaPrincipal() {
		return existe(uno);
	}
	public boolean mensajeErr() {
		return existe(btnVolverIntentar);
	}
	public boolean validarMonto() {
		String Monto;
		Monto = txtMonto.getText();
		String MontoLimpio = Monto.replaceAll("[.$]", "");
		Integer.parseInt(MontoLimpio);
		if(MontoLimpio.equals("10000") || MontoLimpio.length() == 4) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void escribirDatos(String rutC, String rutE, String Pass) {
		txtRutCliente.sendKeys(rutC);
		txtRutEmpresa.sendKeys(rutE);
		txtPass.sendKeys(Pass);
	}
	public void clickIngresar() {
		btnIngresar.click();
	}
	public void clickuno() {
		uno.click();
	}
	public void clickdos() {
		dos.click();
	}
	public void clicktres() {
		tres.click();
	}
	public void clickcuatro() {
		cuatro.click();
	}
	public void clickcinco() {
		cinco.click();
	}
	public void clickseis() {
		seis.click();
	}
	public void clicksiete() {
		siete.click();
	}
	public void clickocho() {
		ocho.click();
	}
	public void clicknueve() {
		nueve.click();
	}
	public void clickcero() {
		cero.click();
	}
	public void clickCobrar() {
		btnCobrar.click();
	}
	public void clickIntentarDeNuevo() {
		btnVolverIntentar.click();
	}
}
