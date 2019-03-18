package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class pageScroll {
	MobileDriver driverM;
	@FindBy(xpath = "//android.widget.TextView[@text='List Demo']")
	private WebElement ListDemo;
	@FindBy(xpath = "//android.widget.TextView[@text='Altocumulus']")
	private WebElement Altocumulus;
	@FindBy(xpath = "//android.widget.TextView[@text='Cumulus Mediocris']")
	private WebElement CumulusMediocris;
	@FindBy(xpath = "//android.widget.TextView[@text='Stratus']")
	private WebElement Stratus;
	public boolean existe(WebElement we) {
		try {
			return we.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean estoyEnPrincipal() {
		return existe(ListDemo);
	}
	public boolean estoyEnListas() {
		return existe(Altocumulus);
	}
	
	public void ClickListDemo() {
		ListDemo.click();
	}
	public void scrollDown() {
		AndroidElement startElement = (AndroidElement) Altocumulus; 
		AndroidElement endElement = (AndroidElement) CumulusMediocris;
		int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
 
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction(driverM)
        .press(point(startX,startY))
        .waitAction(waitOptions(ofMillis(1000)))
        .moveTo(point(endX, endY))
        .release().perform();
        
        //int num = 2;
		//TouchAction actions = new TouchAction(driverM);
		//actions.press(element(startElement)).waitAction(waitOptions(ofSeconds(num))).moveTo(300, 500).release().perform();
		
		//TouchAction((MobileDriver) driver).press(startElement).waitAction(Duration.ofMillis(3000)).moveTo(300, 500).release().perform();
	}
	public void clickStratus() {
		Stratus.click();
	}
}
