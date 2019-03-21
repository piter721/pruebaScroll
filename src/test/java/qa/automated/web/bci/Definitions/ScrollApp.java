package qa.automated.web.bci.Definitions;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import java.net.URL;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automated.web.bci.Generic.ScrollElement;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;
import qa.automated.web.bci.Pages.pageScroll;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScrollApp {
	
	private AppiumDriver<MobileElement> driver;
	private pageScroll ps = ApplicationLauncherAndroid.bajarConScrollApp;
	private AndroidDriver<MobileElement> driverM = ApplicationLauncherAndroid.driverM;
	ScrollElement se = new ScrollElement((AndroidDriver<MobileElement>) driverM);
	
	@FindBy(xpath = "//android.widget.ScrollView[@index='0']")
	private MobileElement PantallaScroll;
	
	@Given("^ingresar a la pagina principal$")
	public void ingresar_a_la_pagina_principal() throws Throwable {
	    assertTrue(ps.estoyEnPrincipal());
	}

	@Then("^seleccionar una opcion de la pantalla$")
	public void seleccionar_una_opcion_de_la_pantalla() throws Throwable {
	    ps.ClickListDemo();
	    Thread.sleep(3000);
	}

	@When("^estoy dentro de la seleccion$")
	public void estoy_dentro_de_la_seleccion() throws Throwable {
	    assertTrue(ps.estoyEnListas());
	}

	@Then("^hago un scroll down para ver opciones que estan abajo$")
	public void hago_un_scroll_down_para_ver_opciones_que_estan_abajo() throws Throwable, InterruptedException, IOException {
//		String visibleText = "Stratus"; //para la funcion de scrollElement al igual que el valor PantallaScroll
	    ps.otroIntento();
		//se.scrollDown();
//		AppCompatActivity activity;
//	    Activity = driver.getcurrentactivity();
//		String currentActivityName = driver.getCurrentActivity();
	    Thread.sleep(3000);
	    ps.ClickListDemo();
	}
}
