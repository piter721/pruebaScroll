package qa.automated.web.bci.Pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.net.MalformedURLException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import io.appium.java_client.MobileElement;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class pageScroll {
	MobileDriver driverM;
	AppiumDriver<MobileElement> driver;
	@FindBy(xpath = "//android.widget.TextView[@text='List Demo']")
	private WebElement ListDemo;
	@FindBy(xpath = "//android.widget.TextView[@text='Cumulonimbus']")
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
	public void scrollDown(){
		
		Actions actions = new Actions(ApplicationLauncherAndroid.driver);		
		actions.dragAndDropBy(Altocumulus, 0, 100).build().perform();
		
		//TouchAction a2 = new TouchAction(ApplicationLauncherAndroid.driver);
		//Thread.sleep(4000);
		//a2.dragAndDropBy(point(Altocumulus, 0, 100)).perform();
		
		//Dimension dim = driver.manage().window().getSize();
		//int height = dim.getHeight();
		//int width = dim.getWidth();
		//int x = width/2;
		//int startY = (int)(height*0.80);
		//int endY = (int)(height*0.20);
		//driver.swipe(x, startY, x, endY, 500);
		
		//int xOffset = 0;
		//int yOffset = -50;
		//Actions moveSlider = new Actions(driverM);
        //Action action = moveSlider.clickAndHold(CumulusMediocris)
          //      .moveByOffset(xOffset, yOffset)
            //    .release()
              //  .build();
        //action.perform();
        //Thread.sleep(500);
		
		//AndroidElement startElement = (AndroidElement) Altocumulus; 
		//AndroidElement endElement = (AndroidElement) CumulusMediocris;
		//int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        //int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
 
        //int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        //int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        //new TouchAction(driverM)
        //.press(point(startX,startY))
        //.waitAction(waitOptions(ofMillis(1000)))
        //.moveTo(point(endX, endY))
        //.release().perform();
        
        //int num = 2;
		//TouchAction actions = new TouchAction(driverM);
		//actions.press(element(startElement)).waitAction(waitOptions(ofSeconds(num))).moveTo(300, 500).release().perform();
		
		//TouchAction((MobileDriver) driver).press(startElement).waitAction(Duration.ofMillis(3000)).moveTo(300, 500).release().perform();
	}
	private void scroll(int fromX, int fromY, int toX, int toY) {
		   //TouchAction touchAction = new TouchAction(driver);
		   //touchAction.tap(PointOption.point(fromX, fromY)).waitAction(1000).moveTo(toX, 
		   //toY).release().perform();
		}
	public void clickStratus() {
		Stratus.click();
	}
}
