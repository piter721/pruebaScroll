package qa.automated.web.bci.Pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

//import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import qa.automated.web.bci.Generic.ScrollElement;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;


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
	@FindBy(id = "com.mercadolibre:id/search_cell_title_text_view") //descripcion de la primera imagen
	private WebElement lblDescripcionProducto;
	@FindBy(id = "com.mercadolibre:id/vip_shortDescription_itemTitle")//descripcion de la segunda imagen
	private WebElement lblImagen;
	@FindBy(id = "com.mercadolibre:id/vip_root")// Scroll View, pantalla completa del scroll
	private WebElement ScrollView;
	@FindBy(id = "com.mercadolibre:id/vip_custom_action_button_title")
	private WebElement btnComprar;
	@FindBy(id = "com.mercadolibre:id/vip_action_bar_menu_action_bookmark")
	private WebElement elementoFinal;
	@FindBy(xpath = "android.widget.TextView[@text='$ 129.990']") //punto de inicio de swipe o scroll
	private WebElement precio;
	@FindBy(id = "com.mercadolibre:id/vip_shortDescription_itemTitle")//descripcion de la segunda imagen
	private WebElement descripcion2;
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
	
	
	public void clickMasTarde() throws Throwable{
		boolean btnmastarde;
		for (int i = 0; i > 10;i++) {
			btnmastarde = existepopup();
	    	if(btnmastarde = true) {
	    		btnMasTarde.click();
	    		Thread.sleep(1000);
		    	i = i + 1;
	    	}
	    	else {
	    		System.out.println("pasa de largo");
	    		Thread.sleep(1000);
		    	i = i + 1;
	    	}
	    	
		}
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
		texto1 = lblDescripcionProducto.getText();
		System.out.println("**************LA DESCRIPCION DE LA PRIMERA IMAGEN******************");
		System.out.println("************************" + texto1 + "*****************************");
		System.out.println("************************FIN DEL PRIMERO****************************");
	}
	public void clickimgtele() throws InterruptedException {
		imgTelevisor.click();
		gettextlbldescpro();
		Thread.sleep(3000);
		Compare(texto1, texto2);
	}
	public void gettextlbldescpro() {
		texto2 = lblImagen.getText();
		System.out.println("**************LA DESCRIPCION DE LA SEGUNDA IMAGEN******************");
		System.out.println("************************" + texto2 + "*****************************");
		System.out.println("************************FIN DEL SEGUNDA****************************");
	}
	public void Compare(String t1, String t2) {
		if(t1.equals(t2)) {
			System.out.println("*************************RESULTADO*****************************");
			System.out.println("************************Validacion exitosa*****************************");
			System.out.println("************************FIN DEL PRIMERO****************************");
		}
		else {
			System.out.println("no son lo mismo");
		}
	}
	public void scrollDown() {
		AndroidElement ini, fin;
		ini = (AndroidElement) precio;
		fin = (AndroidElement) descripcion2;
		int startX = ini.getLocation().getX() + (ini.getSize().getWidth() / 2);
        int startY = ini.getLocation().getY() + (ini.getSize().getHeight() / 2);

        int endX = fin.getLocation().getX() + (fin.getSize().getWidth() / 2);
        int endY = fin.getLocation().getY() + (fin.getSize().getHeight() / 2);

        new TouchAction(ApplicationLauncherAndroid.driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
//		este es el codigo para swipe left - right
//		AndroidElement gallery = ApplicationLauncherAndroid.driver.findElementById("com.mercadolibre:id/vip_root");
//        List<MobileElement> images = gallery
//                .findElementsByClassName("android.widget.ScrollView");
//        int originalImageCount = images.size();
//        Point location = gallery.getLocation();
//        Point center = gallery.getCenter();
//
//        TouchAction swipe = new TouchAction(ApplicationLauncherAndroid.driver)
//                .press(element(images.get(0),10, center.y - location.y))
//                .waitAction(waitOptions(Duration.ofMillis(3000)))
//                .moveTo(element(gallery,40,center.y - location.y))
//                .release();
//        swipe.perform();
		
		
//		Actions actions = new Actions(ApplicationLauncherAndroid.driverWeb);		
//		actions.dragAndDropBy(ApplicationLauncherAndroid.pml.lblImagen, 0, 100).build().perform();
	}
	
}
