package qa.automated.web.bci.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import qa.automated.web.bci.Launcher.ApplicationLauncherAndroid;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import io.appium.java_client.MobileElement;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertNotNull;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class pageScroll {
	MobileDriver driverM;
	AppiumDriver<MobileElement> driver;
	AndroidDriver driverAD;
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
		
//		((JavascriptExecutor) driver).executeScript("mobile:touch:swipe(0,500)");
		
		
//		double fromX = 0.80;
//		double fromY = 0.20;
//		int offsetX = 2000;
//		
//		Dimension dim = driver.manage().window().getSize();
//				int width = (int)(dim.width/2);
//				int start = (int)(dim.getHeight() * fromX);
//				int end = (int)(dim.getHeight() * fromY);
//		new TouchAction(driverM).press(width, start).waitAction(Duration.ofMillis(offsetX)).moveTo(width, end).release().perform();
//		
		
		//int offsetY = 206;
		
//		(new TouchAction(driver))
//	    .press(PointOption.point(fromX, fromY))
//	    .moveTo(PointOption.point(offsetX, offsetY))
//	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//	    .release()
//	    .perform();

//		 TouchAction ta = new TouchAction(driver);
//	        ta.press(PointOption.point(207, 582)).moveTo(PointOption.point(8, 
//	        -360)).release().perform();
		
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
	public void scrollAndClick() {
		String text = "Stratus";
		String uiSelector = "new UiSelector().textMatches(\"" + text + "\")";

		String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ");";

		driverAD.findElementByAndroidUIAutomator(command);
		
		
	}
	public AndroidElement ScrollToElement() {
		String by = "xpath";
		String using = "//android.widget.TextView[@text='Cumulonimbus']";
		AndroidElement element = null;
	    int numberOfTimes = 10;
	    Dimension size = driver.manage().window().getSize();
	    int anchor = (int) (size.width / 2);
	    // Swipe up to scroll down
	    int startPoint = (int) (size.height - 10);
	    int endPoint = 10;

	    for (int i = 0; i < numberOfTimes; i++) {
	        try {
	            new TouchAction(driver)
	                .longPress(point(anchor, startPoint))
	                .moveTo(point(anchor, endPoint))
	                .release()
	                .perform();
	            element = (AndroidElement) driver.findElement(by, using);
	            i = numberOfTimes;
	        } catch (NoSuchElementException ex) {
	            System.out.println(String.format("Element not available. Scrolling (%s) times...", i + 1));
	        }
	    }
	    return element;
	}
	
	public void otroIntento() {
		driver.findElementByAccessibilityId("Views").click();
        AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']"));
        MobileElement listGroup = list
                .findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\" List item:25\"));"));
        assertNotNull(listGroup.getLocation());
        listGroup.click();
	}
	
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)                            
			.withTimeout(20, TimeUnit.SECONDS)          
			.pollingEvery(5, TimeUnit.SECONDS)          
			.ignoring(NoSuchElementException.class);    

			  WebElement aboutMe= wait.until(new Function<WebDriver, WebElement>() {       
			public WebElement apply(WebDriver driver) { 
			return driver.findElement(By.id("about_me"));     
			 }  
			}); 
	
}
