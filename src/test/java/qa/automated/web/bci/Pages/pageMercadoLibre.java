package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import qa.automated.web.bci.Generic.ScrollElement;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;

public class pageMercadoLibre {
	private AndroidDriver<MobileElement> driverM = ApplicationLauncherAndroid.driverM;
	private String texto1, texto2;
	ScrollElement se = new ScrollElement((AndroidDriver<MobileElement>) driverM);
	
	@FindBy(id = "android:id/button2")
	private WebElement btnMasTarde;
	@FindBy(id = "com.mercadolibre:id/home_onboarding_action_skip_text_view")
	private WebElement btnOmitir;
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
	private WebElement btnComprar;
	
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
		return existe(lblImagen);
	}
	public boolean existebtncomprar() {
		return existe(btnComprar);
	}
	
	
	public void clickMasTarde() {
		btnMasTarde.click();
	}
	public void clickOmitir() {
		btnOmitir.click();
	}
	public void clickBtnBuscar() {
		btnBuscar.click();
	}
	public void sendkeystext(String televisor) {
		txtBuscar.sendKeys(televisor);
	}
	public void clicklbltelevisor() {
		lblTelevisor.click();
		gettextlbltele();
	}
	public void gettextlbltele() {
		texto1 = imgTelevisor.getText();
		System.out.println("************************" + texto1 + "*****************************");
	}
	public void clickimgtele() throws InterruptedException {
		imgTelevisor.click();
		gettextlbldescpro();
		Thread.sleep(3000);
		if(texto1.equals(texto2)) {
			System.out.println("bien hecho, son la misma wea");
		}
		else {
			System.out.println("no son lo mismo");
		}
	}
	public void gettextlbldescpro() {
		texto2 = lblImagen.getText();
		System.out.println("*********************" + texto2 + "**************************");
	}
	public void scrollDown() {
		String texto = "Comprar";
		se.ScrollToElement(btnComprar, texto);
	}
	
}
