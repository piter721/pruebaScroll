package qa.automated.web.bci.Launcher;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import qa.automated.web.bci.Config.Appium;
import qa.automated.web.bci.Pages.PageLoginUFTAppium;
import qa.automated.web.bci.Pages.PagePagoDeCuentasUFTAppium;
import qa.automated.web.bci.Properties.PropertiesInit;
import qa.automated.web.bci.Properties.ParamsInit;
import qa.automated.web.bci.Runnings.RunningLoginUFTAppium;
import qa.automated.web.bci.Runnings.RunningPagoDeCuentasUFTAppium;


//@SuiteClasses({ RunningLoginUFTAppium.class, RunningPagoDeCuentasUFTAppium.class})
@SuiteClasses({})
public class ApplicationLauncherAndroid {
	
	public static AndroidDriver<AndroidElement> driver;
	public static WebDriver driverWeb;
	public static PropertiesInit properties;
	public static final String CUR_DIR = System.getProperty("user.dir");

	// Pagina Mobile
	public static PageLoginUFTAppium pageLoginUFTAppium;
	public static PagePagoDeCuentasUFTAppium pagePagoDeCuentasUFTAppium;

	@BeforeClass
	public static void setUp() throws MalformedURLException {
		System.out.println(System.getProperty("os.name"));
		properties = new PropertiesInit();
		//Appium.detenerAppium();
		//Appium.iniciarAppiumServer();

		try {
			if (System.getenv("SELENIUM_SERVER_URL") != null
					&& !System.getenv("SELENIUM_SERVER_URL").equalsIgnoreCase(""))
				if (properties.getSelenium_server_url() != null
						&& !properties.getSelenium_server_url().equalsIgnoreCase("")) {
					setDriver();
				} else {
					setDriverDesa();
				}

			driver = new AndroidDriver<AndroidElement>(new URL(properties.getURL_APPIUM()), capabilities());
			driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);

			// Pages Mobile
			pageLoginUFTAppium = PageFactory.initElements(driver, PageLoginUFTAppium.class);
			pagePagoDeCuentasUFTAppium = PageFactory.initElements(driver, PagePagoDeCuentasUFTAppium.class);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void finish() {
		System.out.println("************************************************");
		System.out.println("**   Finaliza ciclo de pruebas automatizadas  **");
		System.out.println("************************************************");
		System.out.println();
		driver.quit();
		//Appium.detenerAppium();
	}

	public static void setDriver() throws MalformedURLException {
		DesiredCapabilities capability = null;
		String browserName = properties.getBrowser();
		if (browserName.equalsIgnoreCase("chrome")) {
			capability = DesiredCapabilities.chrome();
		}
		if (browserName.equalsIgnoreCase("IE")) {
			capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			capability.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			capability.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		}
		if (browserName.equalsIgnoreCase("firefox")) {
			capability = DesiredCapabilities.firefox();
			capability.setCapability("marionette", true);
		} else {
			capability = DesiredCapabilities.chrome();

		}

		capability.setJavascriptEnabled(true);
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driverWeb = new RemoteWebDriver(new URL(properties.getSelenium_server_url()), capability);
		driverWeb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverWeb.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	public static void setDriverDesa() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", CUR_DIR + properties.getBrowser_local_driver());
		driverWeb = new ChromeDriver();
		driverWeb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverWeb.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driverWeb.manage().window().maximize();
	}

	public static DesiredCapabilities capabilities() {	
		DesiredCapabilities capabilities = new DesiredCapabilities();

		File rootPath = new File(System.getProperty("user.dir"));
		File appDir = new File(rootPath, "/src/test/java/qa/automated/web/bci/apk");
		File app = new File(appDir, "app-qa (1).apk");
		capabilities.setCapability("app", app.getAbsolutePath());
		
		capabilities.setCapability("avd", "nexus_s");	//lanza emulador
		capabilities.setCapability("isHeadless", false);	//emulador invisible
		capabilities.setCapability("avdReadyTimeout", 300000);
		
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("deviceName", "emulator-5554");
		
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("BROWSER_NAME", "Chrome");

		capabilities.setCapability("appPackage", "cl.bci.app.personas.qa");
		capabilities.setCapability("appActivity", "cl.bci.app.personas.presentation.splash.SplashActivity");

		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);
		capabilities.setCapability("newCommandTimeout", 1800); //30min
		capabilities.setCapability("noReset", false);
		capabilities.setCapability("autoGrantPermissions", true);
		return capabilities;
	}
}
