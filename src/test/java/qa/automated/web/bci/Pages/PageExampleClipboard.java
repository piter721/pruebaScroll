package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageExampleClipboard {
	@FindBy(xpath = "//android.widget.TextView[@text='Clipboard Demo']")
	private WebElement OpcionClipboard;
	@FindBy(xpath = "//android.widget.EditText[@index='0']")
	private WebElement TxtTextoDePrueba;
	@FindBy(xpath = "//android.widget.TextView[@index='0']")
	private WebElement BtnSetClipboard;
	@FindBy(xpath = "//android.widget.TextView[@text='Refresh Clipboard Text']")
	private WebElement BtnRefreshClipboard;
	@FindBy(xpath = "//android.widget.TextView[@index='1']")// texto de validacion
	private WebElement LblResultado;
	
	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	//booleanos
	
	public boolean estoyenInicio() {
		return existe(OpcionClipboard);
	}
	public boolean existeTxtPrueba() {
		return existe(TxtTextoDePrueba);
	}
	public boolean ResultadoCorrecto() {
		return existe(LblResultado);
	}
	
	// Funciones
	
	public void clickClipboard() {
		OpcionClipboard.click();
	}
	public void txtPrueba(String palabra) {
		 TxtTextoDePrueba.sendKeys(palabra);
	}
	public void ClickBtnSetClipboard() {
		BtnSetClipboard.click();
	}
	public void clickRefresh() {
		BtnRefreshClipboard.click();
	}
	public void ValidarCambioCorrecto() {
		String texto, palabra;
		palabra = "hola mundo";
		texto = TxtTextoDePrueba.getText();
		if (texto.equals(palabra)) {
			System.out.println("funciona");
		}
	}
}
