package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import qa.automated.web.bci.Generic.ScrollElement;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;

public class pageMercadoLibre {
	private AndroidDriver<MobileElement> driverM = ApplicationLauncherAndroid.driverM;
	ScrollElement se = new ScrollElement((AndroidDriver<MobileElement>) driverM);
	
	@FindBy(id = "android:id/button2")
	private WebElement btnMasTarde;
	@FindBy(id = "com.mercadolibre:id/home_search")
	private WebElement btnBuscar;
	@FindBy(id = "com.mercadolibre:id/search_input_edittext")
	private WebElement txtBuscar;
	@FindBy(id = "com.mercadolibre:id/search_input_cell_label")
	private WebElement lblTelevisor;
	@FindBy(id = "com.mercadolibre:id/search_cell_image_view")
	private WebElement imgTelevisor;
	@FindBy(id = "com.mercadolibre:id/search_cell_title_text_view")
	private WebElement lblDescripcionProducto;
	@FindBy(id = "com.mercadolibre:id/vip_shortDescription_itemTitle")
	private WebElement lblImagen;
	@FindBy(id = "com.mercadolibre:id/vip_root")
	private WebElement ScrollView;
	@FindBy(id = "com.mercadolibre:id/vip_custom_action_button_title")
	private MobileElement btnComprar;
	
	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean existepopup() {
		return existe(btnMasTarde);
	}
	public boolean existepagPri() {
		return existe(btnBuscar);
	}
	public boolean existeBuscar() {
		return existe(txtBuscar);
	}
	public boolean existelblTelevisor() {
		return existe(lblTelevisor);
	}
	public boolean existeimgtele() {
		return existe(imgTelevisor);
	}
	public boolean existedescripcionProducto() {
		return existe(lblDescripcionProducto);
	}
	public boolean existe() {
		return existe(btnComprar);
	}
	
	
	public void clickMasTarde() {
		btnMasTarde.click();
	}
	public void clickBtnBuscar() {
		btnBuscar.click();
	}
	public void sendkeystext(String televisor) {
		txtBuscar.sendKeys(televisor);
	}
	public void clicklbltelevisor() {
		lblTelevisor.click();
	}
	public String gettextlbltele() {
		String text;
		text = lblTelevisor.getText();
		return text;
	}
	public void clickimgtele() throws InterruptedException {
		String text1 = gettextlbltele();
		imgTelevisor.click();
		Thread.sleep(3000);
		String text2 = gettextlbldescpro();
		if(text1.equals(text2)) {
			System.out.println("bien hecho, son la misma wea");
		}
	}
	public String gettextlbldescpro() {
		String txt;
		txt = lblDescripcionProducto.getText();
		return txt;
	}
	public void scrollDown() {
		String texto = "Comprar";
		se.ScrollToElement(btnComprar, texto);
	}
	public void clickComprar() {
		btnComprar.click();
	}
}
