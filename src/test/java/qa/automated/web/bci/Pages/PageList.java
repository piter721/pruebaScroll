package qa.automated.web.bci.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageList {
	
	@FindBy(xpath = "//android.widget.TextView[@text='List Demo']")
	private WebElement OpcionClipboard;
	@FindBy(xpath = "//android.widget.TextView[@text='Stratus']")
	private WebElement Listst;
	@FindBy(id = "android:id/button1")
	private WebElement BtnOK;
	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	//booleanos
	
	public boolean estoyEnPrincipal() {
		return existe(OpcionClipboard);
	}
	public boolean existeStratus() {
		return existe(Listst);
	}
	public boolean existeBtnOK() {
		return existe(BtnOK);
	}
	
	//funciones
	
	public void clickLista() {
		OpcionClipboard.click();
	}
	public void clickStratus() {
		Listst.click();
	}
	public void clickOK() {
		BtnOK.click();
	}
	public void scrollDown() {
		Listst.sendKeys(Keys.PAGE_DOWN);
	}
}
