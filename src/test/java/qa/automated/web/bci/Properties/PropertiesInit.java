package qa.automated.web.bci.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInit {
	public static Properties parametros;
	private String browser;
	private String selenium_server_url;
	private String browser_local_driver;
	public String URL_APPIUM;
	public String PORT_APPIUM;
	public String SALUDOSUCURSAL;
	public String SALUDOLOGIN;
	public String SALUDOCONDICIONES;
	public String SALUDOVERSIONPRUEBA;
	public String RUTAWINDOWS;
	public String RUTAMAC;
	public String RUTALINUX;

	public PropertiesInit() {
		Properties parametros;
		File propFileName = new File("src/test/java/qa/automated/web/bci/Config/config.properties").getAbsoluteFile();
		FileInputStream inputStream;

		try {
			inputStream = new FileInputStream(propFileName);
			parametros = new Properties();
			parametros.load(inputStream);

			browser = parametros.getProperty("BROWSER");
			selenium_server_url = parametros.getProperty("SELENIUM_SERVER_URL");
			browser_local_driver = parametros.getProperty("BROWSER_LOCAL_DRIVER");

			// Configuraciones Appium
			URL_APPIUM = parametros.getProperty("URL_APPIUM");
			PORT_APPIUM = parametros.getProperty("PORT_APPIUM");
			RUTAWINDOWS = parametros.getProperty("RUTAWINDOWS");
			RUTAMAC = parametros.getProperty("RUTAMAC");
			RUTALINUX = parametros.getProperty("RUTALINUX");

			// Textos
			SALUDOSUCURSAL = parametros.getProperty("SALUDOSUCURSAL");
			SALUDOLOGIN = parametros.getProperty("SALUDOLOGIN");
			SALUDOCONDICIONES = parametros.getProperty("SALUDOCONDICIONES");
			SALUDOVERSIONPRUEBA = parametros.getProperty("SALUDOVERSIONPRUEBA");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Modifica fichero de propiedades
	 * 
	 * @param fichero Archivo properties a modificar
	 * @param key     Nombre de properties a modificar
	 * @param value   Valor que se modificara en propertie
	 * 
	 * @return void
	 */

	public String getPORT_APPIUM() {
		return PORT_APPIUM;
	}

	public void setPORT_APPIUM(String pORT_APPIUM) {
		PORT_APPIUM = pORT_APPIUM;
	}

	public String getURL_APPIUM() {
		return URL_APPIUM;
	}

	public void setURL_APPIUM(String uRL_APPIUM) {
		URL_APPIUM = uRL_APPIUM;
	}

	public static Properties getParametros() {
		return parametros;
	}

	public static void setParametros(Properties parametros) {
		PropertiesInit.parametros = parametros;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getSelenium_server_url() {
		return selenium_server_url;
	}

	public void setSelenium_server_url(String selenium_server_url) {
		this.selenium_server_url = selenium_server_url;
	}

	public String getBrowser_local_driver() {
		return browser_local_driver;
	}

	public void setBrowser_local_driver(String browser_local_driver) {
		this.browser_local_driver = browser_local_driver;
	}

	public String getSALUDOSUCURSAL() {
		return SALUDOSUCURSAL;
	}

	public void setSALUDOSUCURSAL(String sALUDOSUCURSAL) {
		SALUDOSUCURSAL = sALUDOSUCURSAL;
	}

	public String getSALUDOLOGIN() {
		return SALUDOLOGIN;
	}

	public void setSALUDOLOGIN(String sALUDOLOGIN) {
		SALUDOLOGIN = sALUDOLOGIN;
	}

	public String getSALUDOCONDICIONES() {
		return SALUDOCONDICIONES;
	}

	public void setSALUDOCONDICIONES(String sALUDOCONDICIONES) {
		SALUDOCONDICIONES = sALUDOCONDICIONES;
	}

	public String getSALUDOVERSIONPRUEBA() {
		return SALUDOVERSIONPRUEBA;
	}

	public void setSALUDOVERSIONPRUEBA(String sALUDOVERSIONPRUEBA) {
		SALUDOVERSIONPRUEBA = sALUDOVERSIONPRUEBA;
	}

	public String getRUTAWINDOWS() {
		return RUTAWINDOWS;
	}

	public void setRUTAWINDOWS(String rUTAWINDOWS) {
		RUTAWINDOWS = rUTAWINDOWS;
	}

	public String getRUTAMAC() {
		return RUTAMAC;
	}

	public void setRUTAMAC(String rUTAMAC) {
		RUTAMAC = rUTAMAC;
	}
	
	public String getRUTALINUX() {
		return RUTALINUX;
	}

	public void setRUTALINUX(String rUTALINUX) {
		RUTALINUX = rUTALINUX;
	}

}
