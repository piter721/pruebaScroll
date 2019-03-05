package qa.automated.web.bci.Generic;

import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

/**
* CLASE DE USO COMUN CON DIVERSOS METODOS DE USO GENERAL PARA UTILIZAR
*/


/**
 * CLASE DE USO COMUN CON DIVERSOS METODOS DE USO GENERAL PARA UTILIZAR
 */
public final class UsoCom extends ApplicationLauncherAndroid{

	/**
	 * Metodo que se encarga de esperar X cantidad de segundos durante la ejecucion de la prueba utilizando el driver
	 * 
	 * @param driver
	 * @param segundos
	 */
	public static void esperarSegundos(WebDriver driver, int segundos) {
		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Devolver path con rutas ya configuradas para Chrome
	 * 
	 */
	public static String getProperty() {
		String dirDriver = System.getProperty("user.dir");
		String path = dirDriver + "\\WebDriver\\Chrome\\Windows\\chromedriver.exe";
		return path;
	}

	/**
	 * Devolver path con rutas ya configuradas para IExplorer
	 * 
	 */
	public static String getPropertyIE() {
		String dirDriver = System.getProperty("user.dir");
		String path = dirDriver + "\\WebDriver\\IExplorer\\Windows\\64\\IEDriverServer.exe";
		return path;
	}

	/**
	 * Fecha actual
	 */
	public static String now() {
		Calendar ahora = Calendar.getInstance();
		Integer n = new Integer((ahora.get(Calendar.YEAR) * 10000) + ((ahora.get(Calendar.MONTH) + 1) * 100) + (ahora.get(Calendar.DAY_OF_MONTH)));
		return n.toString();
	}

	/**
	 * 
	 * Tomar Screenshoot
	 * 
	 * @param driver WebDriver
	 * 
	 **/

	public static void screenshot(String nombre) {
		try {
			// Sacar screenshot
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File path = new File(System.getProperty("user.dir") + "/reportes/screenshots/" + nombre + "_"
					+ UsoCom.now() + "_" + System.currentTimeMillis() + ".jpg");
			FileUtils.copyFile(screenshot, path);
			// Agrega screenshot al reporte
			Reporter.addScreenCaptureFromPath(path.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Inicializar nuevo tipo de Context View
	 * 
	 **/

	public static void cambiarContext() {
		try {
			Set<String> contextNames = driver.getContextHandles();
			for (String s : contextNames) {
				driver.context(s);
				System.out.println("Se inicializa el context " + s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Cambiar el foco de ventana web
	 * 
	 * @param driver
	 * @param cambiarSoloUna
	 *            En caso de haber mas de dos ventana y solo querer cambiar a la siguiente, true
	 */
	public static void cambiarVentanaWeb(WebDriver driver, boolean cambiarSoloUna) {
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				if (cambiarSoloUna)
					break;
			}
		}
	}

	/**
	 * Cerrar ventana web, solo cierra ventana sin detener driver
	 * 
	 * @param driver
	 *            WebDriver
	 */
	public static void cerrarVentanaWeb(WebDriver driver) {
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.close();
				driver.switchTo().window(ChildWindow);
			}
		}
	}

	/**
	 * Sroll hasta final de pagina
	 * 
	 * @param driver
	 *            WebDriver
	 * 
	 * @return void
	 */
	public static void finalVentana(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}

	/**
	 * scrollElement, realiza scroll de pagina en donde se encuentra objeto
	 * 
	 * @param driver
	 *            WebDriver
	 * @param element
	 *            WebElement donde se realizara el Scroll
	 * 
	 * @return void
	 */
	public static void scrollElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	/**
	 * scrollClickElement, realiza scroll y ademas click al elemento de la pagina
	 * 
	 * @param driver
	 *            WebDriver
	 * @param element
	 *            WebElement donde realizara Scroll y hara click
	 * 
	 * @return void
	 */
	public static void scrollClickElement(WebDriver driver, WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * obtenerTextoNovisible, retorna el texto de un elemento que no esta visible como por ejemplo en un div donde hay lista de objetos y estos no se visualizan todos
	 * 
	 * @param driver
	 *            WebDriver
	 * @param element
	 *            WebElement que se obtendra el texto
	 * 
	 * @return String
	 */
	public static String obtenerTextoNoVisible(WebDriver driver, WebElement element) {
		String texto = "";
		try {
			texto = element.getText().toString().trim();
			texto = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText", element);
		} catch (Exception e) {
			texto = "";
		}
		return texto;
	}

	/**
	 * ingresarCaracteresEspecialesID, en algunos navegadores no ingresa caracteres especiales como @ de forma correcta, este metodo mitiga ese conflicto
	 * 
	 * @param driver
	 *            WebDriver
	 * @param element
	 *            WebElement al cual se ingresara frase o caracter especial
	 * @param id
	 *            Identificador ID del elemento al que se ingresara caracter
	 * @param caracterEspecial
	 *            Frase o caracter especial a ingresar
	 * 
	 * @return void
	 */
	public static void ingresarCaracteresEspecialesID(WebDriver driver, WebElement element, String id, String caracterEspecial) {
		try {
			((JavascriptExecutor) driver).executeScript(String.format("document.getElementById(\"" + id + "\").value=\"" + caracterEspecial + "\";", element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean unloadWebElementByClass(WebDriver driver, WebElement webElement, int segundos) {
		Boolean elementExist = isElementPresent(webElement);
		int conTiempo = 0;
		String claseTag = "";
		if (elementExist)
			claseTag = webElement.getAttribute("class");
		while (elementExist == true && conTiempo <= segundos) {
			elementExist = (Boolean) ((JavascriptExecutor) driver)
					.executeScript("var elemento = document.getElementsByClassName('" + claseTag + "');return (elemento.length == 0)?false:true;");
			esperarSegundos(driver, 2);
			conTiempo = conTiempo + 2;
		}
		return elementExist;
	}

	/**
	 * Comprobar si despliega alert y cerrar este mismo
	 * 
	 * @param driver
	 * @param aceptar
	 *            Para casos de confirm se puede aceptar o continuar con operacion
	 */
	public static void checkAlert(WebDriver driver, boolean aceptar) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.alertIsPresent());
			if (driver.switchTo().alert() != null) {
				Alert alert = driver.switchTo().alert();
				if (aceptar) // OK
					alert.accept();
				else // Cancel
					alert.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Comprobar si despliega alert, obtiene mensaje de este y luego lo cierra
	 * 
	 * @param driver
	 */
	public static String textoAlert(WebDriver driver) {
		String texto = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			if (driver.switchTo().alert() != null) {
				Alert alert = driver.switchTo().alert();
				texto = alert.getText().toString().trim();
				alert.accept();
			}
		} catch (Exception e) {
			texto = "";
			e.printStackTrace();
		}
		return texto;
	}

	/**
	 * Cerrar ventana WebDriver
	 * 
	 * @param driver
	 */
	public static void cerrarVentana(WebDriver driver) {
		driver.close();
	}

	/**
	 * Cerrar proceso WebDriver
	 * 
	 * @param driver
	 */
	public static void cerrarDriver(WebDriver driver) {
		driver.quit();
	}

	/**
	 * Volver atras
	 * 
	 * @param driver
	 */
	public static void volver(WebDriver driver) {
		driver.navigate().back();
	}

	/**
	 * Comprobar si el valor es numerico
	 * 
	 * @param valor
	 *            Parametro a comprobar si es numerico
	 */
	public static boolean isNumeric(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException ne) {
			return false;
		}
	}

	/**
	 * <b>Nombre:</b> esperaElementoSegundos</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que el elemento dado es encontrado.
	 * 
	 * @param WebDriver
	 *            Controlador WebDrive.
	 * @param WebElement
	 *            Elemento a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Boolean} Retorna un valor <b>verdadero</b> si el elemento es encontrado dentro del tiempo estipulado, de lo contrario retorna un valor <b>falso</b>.
	 **/
	public static boolean esperaElementoSegundos(WebDriver driver, WebElement webElement, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, segundos);
		try {
			wait.until(ExpectedConditions.visibilityOf(webElement));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	/**
	 * <b>Nombre:</b> esperaElementoMobileSegundos</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que el elemento dado es encontrado.
	 * 
	 * @param driver
	 *            Controlador AndroidDriver.
	 * @param webElement
	 *            Elemento a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Boolean} Retorna un valor <b>verdadero</b> si el elemento es encontrado dentro del tiempo estipulado, de lo contrario retorna un valor <b>falso</b>.
	 **/
	public static boolean esperaElementoMobileSegundos(AndroidDriver<AndroidElement> driver, WebElement webElement, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, segundos);
		try {
			wait.until(ExpectedConditions.visibilityOf(webElement));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	/**
	 * <b>Nombre:</b> esperaElementoSegundos</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que lista de elementos dados sean encontrados.
	 * 
	 * @param driver
	 *            Controlador WebDrive.
	 * @param listElement
	 *            Lista de elementos a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Boolean} Retorna un valor <b>verdadero</b> si el elemento es encontrado dentro del tiempo estipulado, de lo contrario retorna un valor <b>falso</b>.
	 **/
	public static boolean esperaElementosSegundos(WebDriver driver, List<WebElement> listElement, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, segundos);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(listElement));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	/**
	 * <b>Nombre:</b> notEsperaElementoSegundos</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que el elemento dado desaparece.
	 * 
	 * @param {@link
	 * 			WebDriver} Controlador WebDrive.
	 * @param {@link
	 * 			WebElement} Elemento a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Boolean} Retorna un valor <b>verdadero</b> si el elemento es encontrado dentro del tiempo estipulado, de lo contrario retorna un valor <b>falso</b>.
	 **/
	public static boolean notEsperaElementoSegundos(WebDriver driver, WebElement webElement, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, segundos);
		if (isElementPresent(webElement)) {
			try {
				wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(webElement)));
				return true;
			} catch (TimeoutException e) {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * <b>Nombre:</b> esperaElementoException</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que el elemento dado es encontrado.
	 * 
	 * @param {@link
	 * 			WebDriver} Controlador WebDrive.
	 * @param {@link
	 * 			WebElement} Elemento a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Void} Retorna un <b>TimeoutException</b> si el elemento NO es encontrado dentro del tiempo estipulado, de lo contrario solo continua con el flujo normal.
	 **/
	public static void esperaElementoException(WebDriver driver, WebElement webElement, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, segundos);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	/**
	 * <b>Nombre:</b> isElementPresent</br>
	 * </br>
	 * <b>Description:</b> Verifica la existencia de un elemento
	 * 
	 * @param {@link
	 * 			WebElement} Objeto de tipo WebElement a buscar
	 * @return {@link Boolean} Retorna <b>True</b> si el elemento es encontrado, de lo contrario retorna <b>False</b>
	 **/
	public static boolean isElementPresent(WebElement webElement) {
		boolean resp = false;
		try {
			resp = webElement.isDisplayed();
		} catch (NoSuchElementException e) {
			resp = false;
		}
		return resp;
	}

	/**
	 * <b>Nombre:</b> loadPage</br>
	 * </br>
	 * <b>Description:</b> Espera que pagina cargue por completo una vez que desaparezca el icono de cargando en scotiaweb o bien se detendra de forma automatica una vez pasen 2
	 * min en caso de no respuesta
	 * 
	 * @return void
	 **/
//	public static void loadPage() {
//		long time = 0;
//		do {
//			esperarSegundos(AplicationRunning.driverWeb, 1);
//			time++;
//		} while (AplicationRunning.pageSitioPrivadoWeb.cargando() && time < 120);
//	}

	/**
	 * <b>Nombre:</b> isClickable</br>
	 * </br>
	 * <b>Description:</b> Comprueba si elemento es posible hacerle click
	 * 
	 * @param element
	 *            WebElement a verificar
	 * 
	 * @return boolean
	 **/
//	public static boolean isClickable(WebElement element) {
//		try {
//			WebDriverWait wait = new WebDriverWait(ApplicationLauncherMobile.driverWeb, 5);
//			wait.until(ExpectedConditions.elementToBeClickable(element));
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}

	public static String dateAdd(int intervalo, int numero, String fecha) {
		int ano = ((new Integer(fecha)).intValue() / 10000);
		int mes = (((new Integer(fecha)).intValue() - (ano * 10000)) / 100);
		int dia = (((new Integer(fecha)).intValue() - (ano * 10000) - (mes * 100)));

		Calendar f = Calendar.getInstance();
		f.set(ano, mes - 1, dia);

		f.add(intervalo, numero);

		String anoStr = String.valueOf(f.get(Calendar.YEAR));
		String mesStr = String.valueOf(f.get(Calendar.MONTH) + 1);
		String diaStr = String.valueOf(f.get(Calendar.DAY_OF_MONTH));

		anoStr = "0000" + anoStr.trim();
		mesStr = "00" + mesStr.trim();
		diaStr = "00" + diaStr.trim();

		anoStr = anoStr.substring(anoStr.length() - 4);
		mesStr = mesStr.substring(mesStr.length() - 2);
		diaStr = diaStr.substring(diaStr.length() - 2);

		String fechanueva = anoStr + mesStr + diaStr;

		return fechanueva;
	}

	public static long dateDiff(String fechaInicio, String fechaFin) {
		return dateDiff(fechaInicio, fechaFin, 0);
	}

	public static long dateDiff(String fechaInicio, String fechaFin, int intervalo) {
		Calendar inicio = Calendar.getInstance();
		Calendar fin = Calendar.getInstance();

		inicio.set(Integer.parseInt(fechaInicio.substring(0, 4)), Integer.parseInt(fechaInicio.substring(4, 6)) - 1, Integer.parseInt(fechaInicio.substring(6, 8)));
		fin.set(Integer.parseInt(fechaFin.substring(0, 4)), Integer.parseInt(fechaFin.substring(4, 6)) - 1, Integer.parseInt(fechaFin.substring(6, 8)));

		inicio.add(Calendar.DAY_OF_MONTH, +intervalo);// agregar intervalo a
														// fecha de inicio

		return fin.getTimeInMillis() - inicio.getTimeInMillis();
	}

	public static long diferenciaDias(String fechaInicio, String fechaFin) {
		long dias = 0;
		dias = dateDiff(fechaInicio, fechaFin) / (3600 * 24 * 1000);
		return dias;
	}

	public static String formateaFecha(String fecha) {
		try {
			String fechaFormato = fecha.substring(6, 8);
			fechaFormato += "/" + fecha.substring(4, 6);
			fechaFormato += "/" + fecha.substring(0, 4);

			return fechaFormato;
		} catch (Exception e) {
			return fecha;
		}
	}

	/**
	 * Crear digito verificador mediante numeros x entregados
	 * 
	 * @param r
	 *            digitos para generar rut
	 * @return String
	 */
	public static String generaDvRut(String r) {
		String dv = "";
		int rut, digito, suma, resto, resultado, factor;
		// Para el manejo de entrada estándar
		rut = Integer.parseInt(r);

		// Ahora viene la parte de extraer dígito por dígito el rut
		for (factor = 2, suma = 0; rut > 0; factor++) {
			digito = rut % 10;
			rut /= 10;
			suma += digito * factor;

			if (factor >= 7)
				factor = 1; // Para volver al ciclo
		}
		// Ahora viene el algoritmo del módulo 11
		resto = suma % 11;
		resultado = 11 - resto;

		// Mostramos por pantalla.
		// Si el resultado es menor que 10, se imprime el número.
		// Si es igual a 10, entonces se imprime "K"
		// Si no, entonces es 0
		if (resultado < 10)
			dv = String.valueOf(resultado);
		else if (resultado == 10)
			dv = "K";
		else
			dv = "0";

		return dv;
	}

	/**
	 * Comprueba si se logueo correctamente en scotiaweb, y ademas cierra ventana de terminos y condicines de ser necesario
	 * 
	 * @return boolean
	 */
//	public static boolean comprobarLoginWeb() {
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getBienvenidoUser(), 30);
//		boolean bienve = AplicationRunning.pageSitioPrivadoWeb.existeBienvenido();
//		if (bienve) {
//			esperarSegundos(AplicationRunning.driverWeb, 5);
//			if (AplicationRunning.pageSitioPrivadoWeb.existeAviso())
//				AplicationRunning.pageSitioPrivadoWeb.cerrarAviso();
//		}
//		return bienve;
//	}

	/**
	 * Agrega un nuevo destinatario
	 * 
	 * @return void
	 */
	public static void agregarDestinatario() {
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getNombreDestinatario(), 10);
//		AplicationRunning.pageSitioPrivadoWeb.ingresarNombreDestinatario(AplicationRunning.properties.getNombreDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.ingresarRutDestinatario(AplicationRunning.properties.getRutDestinatario(), AplicationRunning.properties.getDvDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.ingresarEmailDestinatario(AplicationRunning.properties.getEmailDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.escogerBancoTipoCuenta();
//		AplicationRunning.pageSitioPrivadoWeb.ingresarNroCtaDestinatario(AplicationRunning.properties.getNroCuentaDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.clickAceptarNuevoDestinatario();
//		notEsperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getNombreDestinatario(), 30);
	}

	/**
	 * Agrega un nuevo destinatario con tildes
	 * 
	 * @return void
	 */
	public static void agregarDestinatarioConTildes() {
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getNombreDestinatario(), 10);
//		AplicationRunning.pageSitioPrivadoWeb.ingresarNombreDestinatario(AplicationRunning.properties.getNombreDestinatarioTilde());
//		AplicationRunning.pageSitioPrivadoWeb.ingresarRutDestinatario(AplicationRunning.properties.getRutDestinatario(), AplicationRunning.properties.getDvDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.ingresarEmailDestinatario(AplicationRunning.properties.getEmailDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.escogerBancoTipoCuenta();
//		AplicationRunning.pageSitioPrivadoWeb.ingresarNroCtaDestinatario(AplicationRunning.properties.getNroCuentaDestinatario());
//		AplicationRunning.pageSitioPrivadoWeb.clickAceptarNuevoDestinatario();
//		notEsperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getNombreDestinatario(), 30);
	}

	/**
	 * Elimina un nuevo destinatario
	 * 
	 * @return void
	 */
	public static void eliminarDestinatarios() {
//		AplicationRunning.pageSitioPrivadoWeb.asignarXpathEliminarDestinatario(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.posicionNuevoDestnatario());
//		AplicationRunning.pageSitioPrivadoWeb.eliminarDestinatario();
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getContentAutorizacion(), 30);
//		AplicationRunning.pageSitioPrivadoWeb.confirmarEliminarDestinatario();
//		notEsperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getContentAutorizacion(), 15);
	}

	/**
	 * Comprueba si se despliega Scotiapass
	 * 
	 * @return boolean true encontro scotiapass correctamente
	 */
//	public static boolean comprobarScotiapass() {
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getCampoScotiapass(), 30);
//		boolean existeScotiapass = AplicationRunning.pageSitioPrivadoWeb.existeScotiapass();
//		return existeScotiapass;
//	}

	/**
	 * Comprueba si se despliega GC
	 * 
	 * @return boolean
	 */
//	public static boolean comprobarGridCard() {
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getGridCard(), 30);
//		return isElementPresent(AplicationRunning.pageSitioPrivadoWeb.getGridCard());
//	}

	/**
	 * Ingresa un codigo QR incorrecto
	 * 
	 * @return void
	 */
//	public static void ingresarQRIncorecto() {
//		AplicationRunning.pageSitioPrivadoWeb.clickPushQR();
//		AplicationRunning.pageSitioPrivadoWeb.ingresarCodigoQR(AplicationRunning.properties.getCodigoQrIncorrecto());
//		AplicationRunning.pageSitioPrivadoWeb.clickCodigoQR();
//	}

	/**
	 * Comprueba si se despliega mensaje de clave incorrecta en codigo QR
	 * 
	 * @return boolean
	 */
//	public static boolean claveQRIncorrecta() {
//		esperaElementoSegundos(AplicationRunning.driverWeb, AplicationRunning.pageSitioPrivadoWeb.getPopupMensajeError(), 30);
//		boolean res = AplicationRunning.pageSitioPrivadoWeb.obtenerMensajeError().contains(AplicationRunning.properties.getMsgClaveAutorizacionIncorrecta());
//		if (AplicationRunning.pageSitioPrivadoWeb.existeAceptarMensajeError())
//			AplicationRunning.pageSitioPrivadoWeb.clickAceptarMensajeError();
//		return res;
//	}

	/**
	 * Rechaza transaccion pendiente
	 * 
	 * @return void
	 */
//	public static void rechazarKeyPass() {
//		AplicationRunning.pageChallengeAutorizacion.clickRechazar();
//	}

	/**
	 * Comprueba si se rechazo transaccion correctamente
	 * 
	 * @return boolean
	 */
//	public static boolean comprobarRechazoKeyPass() {
//		AplicationRunning.driver.context("NATIVE_APP");
//		esperarSegundos(AplicationRunning.driver, 5);
//		boolean existeAlert = AplicationRunning.pageAlertAndroid.existeMensajeAlert();
//		boolean rechazada = false;
//		if (existeAlert) {
//			rechazada = AplicationRunning.pageAlertAndroid.traeMensajeAlert().contains(AplicationRunning.properties.getMsgTransaccionCancelada());
//			AplicationRunning.pageAlertAndroid.clickAlert();
//		}
//		AplicationRunning.driver.context("WEBVIEW");
//		return rechazada;
//	}

	/**
	 * Autoriza transaccion pendiente ingresando erroneamente la clave de KeyPass
	 * 
	 * @return void
	 */
//	public static void autorizarKeyPassClaveIncorrecta() {
//		AplicationRunning.pageChallengeAutorizacion.ingresarClaveKeyPassIncorrecta();
//		AplicationRunning.pageChallengeAutorizacion.clickAutorizar();
//	}

	/**
	 * Comprueba si se desplego mensaje clave KeyPass incorrecta
	 * 
	 * @return boolean
	 */
//	public static boolean comprobarKeyPassClaveIncorrecta() {
//		esperarSegundos(AplicationRunning.driver, 5);
//		esperaElementoMobileSegundos(AplicationRunning.driver, AplicationRunning.pageChallengeAutorizacion.getDetallePopupMensaje(), 30);
//		String mensaje = AplicationRunning.pageChallengeAutorizacion.obtenerDetallePopup();
//		if (isElementPresent(AplicationRunning.pageChallengeAutorizacion.getBtnCerrarPopup()))
//			AplicationRunning.pageChallengeAutorizacion.cerrarPopup();
//		boolean incorrecto = mensaje.contains(AplicationRunning.properties.getMsgClaveKeyPassIncorreta());
//		return incorrecto;
//	}

	/**
	 * Autoriza transaccion pendiente
	 * 
	 * @return void
	 */
	public static void autorizarKeyPass() {
//		AplicationRunning.pageChallengeAutorizacion.ingresarClaveKeyPass();
//		AplicationRunning.pageChallengeAutorizacion.clickAutorizar();
	}

	/**
	 * Comprueba si se autorizo transaccion correctamente
	 * 
	 * @return boolean
	 */
//	public static boolean comprobarAutorizacionKeyPass() {
//		return false;
//		esperaElementoMobileSegundos(AplicationRunning.driver, AplicationRunning.pageChallengeAutorizacion.getContMensaje(), 30);
//		String mensaje = AplicationRunning.pageChallengeAutorizacion.obtenerMensajeContenedor();
//		if (isElementPresent(AplicationRunning.pageChallengeAutorizacion.getContMensaje()))
//			AplicationRunning.pageChallengeAutorizacion.cerrarPopup();
//		boolean autorizacion = mensaje.contains(AplicationRunning.properties.getMsgTransaccionAutorizada());
//		return autorizacion;
//	}
	/**
	 * valida si el String es rut
	 * 
	 * @return boolean
	 */
	public static boolean validarRut(String rut) {
		boolean validacion = false;
		if (rut != null && rut.trim().length() > 0) {
			try {
				rut = rut.replaceAll("[.]", "").replaceAll("-", "").trim().toUpperCase();
				char dv = rut.charAt(rut.length() - 1);
				String mantisa = rut.substring(0, rut.length() - 1);
				if (isInteger(mantisa)) {
					int mantisaInt = Integer.parseInt(mantisa);
					validacion = validareRut(mantisaInt, dv);
				}
			} catch (Throwable e) {
			}
		}
		return validacion;
	}

	private static boolean validareRut(int rut, char dv) {
		int m = 0, s = 1;
		for (; rut != 0; rut /= 10) {
			s = (s + rut % 10 * (9 - m++ % 6)) % 11;

		}
		return Character.toUpperCase(dv) == (char) (s != 0 ? s + 47 : 75);
	}

	public static boolean isInteger(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			if (!Character.isDigit(cad.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}