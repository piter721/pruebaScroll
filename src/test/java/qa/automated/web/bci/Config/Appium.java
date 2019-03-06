package qa.automated.web.bci.Config;
import java.io.File;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import qa.automated.web.bci.Properties.PropertiesInit;

public class Appium {
	public static AppiumDriverLocalService server;
	public static PropertiesInit properties;
	
	public static void iniciarAppiumServer(){
		properties = new PropertiesInit();
		server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder());
				server.start();
				System.out.println("servidor appium iniciado");
    }
	
	public static void detenerAppium() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				Runtime.getRuntime().exec("taskkill /f /im node.exe /im qemu-system-x86_64.exe");
			}else if (System.getProperty("os.name").contains("Linux")) {
				Runtime.getRuntime().exec("killall node qemu-system-i386");
			}else if (System.getProperty("os.name").contains("Mac")) {
				Runtime.getRuntime().exec("killall node qemu-system-i386");
			}
		}catch (Exception e) {
		}
		System.out.println("Appium esta apagado");
	}
}
