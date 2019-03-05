package qa.automated.web.bci.Config;
import java.io.File;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import qa.automated.web.bci.Properties.PropertiesInit;

public class Appium {
	public static AppiumDriverLocalService server;
	public static PropertiesInit properties;
	
	public static void iniciarAppiumServer(int port){
		properties = new PropertiesInit();
		String rutaJs = null;
			if (System.getProperty("os.name").contains("Windows"))
				rutaJs = properties.RUTAWINDOWS;
			else if (System.getProperty("os.name").contains("Linux"))
				rutaJs = properties.RUTALINUX;
			else if (System.getProperty("os.name").contains("Mac"))
				rutaJs = properties.RUTAMAC;
			
			server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.withAppiumJS(new File(rutaJs))
					.usingPort(port));
				server.start();
				System.out.println("servidor appium iniciado");
    }
	
	public static void detenerAppium() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				Runtime.getRuntime().exec("taskkill /f /im node.exe /im qemu-system-x86_64.exe");
			}else if (System.getProperty("os.name").contains("Linux")) {
				Runtime.getRuntime().exec("killall node qemu-system-i38");
			}else if (System.getProperty("os.name").contains("Mac")) {
				Runtime.getRuntime().exec("killall node qemu-system-i386");
			}
		}catch (Exception e) {
		}
		System.out.println("Appium esta apagado");
	}
}
