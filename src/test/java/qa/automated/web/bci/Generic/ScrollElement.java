package qa.automated.web.bci.Generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileDriver;

public class ScrollElement {
	AndroidDriver<MobileElement> driver;
	MobileDriver<WebElement> driverM;
	public ScrollElement(AndroidDriver<MobileElement> driver)
	{
		this.driver = driver ;
	}
	public MobileElement scrollToExactElement(MobileElement ele,String str) 
	{
		return ((AndroidElement) ele)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\""+str+"\"));");
	}

	 public MobileElement ScrollToElement(MobileElement ele, String str) 
	 {
		 return ((AndroidElement) ele)
			.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
					+ "new UiSelector().textContains(\""+str+"\"));");
	}
	 public void ScrollStepWise(MobileElement ele, int step) 
	 {
		 ((AndroidElement) ele)
			.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollForward("+step+"))");
	}
	 
	 public void scrollDown() {
			Dimension dimensions =  driverM.manage().window().getSize(); 
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
				
			new  TouchAction((PerformsTouchActions)driverM)//TouchAction((PerformsTouchActions)driverM))
				.press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
		}
	 
	        public WebElement getItemViews() {
			return driverM.findElement(By.xpath("//android.widget.TextView[@text='Stratus']"));
		}
		
		public List<WebElement> getItemWebView(){
			return driverM.findElements(By.xpath("//android.widget.TextView[@text='Altocumulus']"));
		}
		
		public void scrollTillWebView() throws InterruptedException {
			getItemViews().click();
			
			while(getItemWebView().size() == 0) {
				scrollDown();
			}
			
			if(getItemWebView().size() > 0) {
				getItemWebView().get(0).click();
			}
			Thread.sleep(4000);	
			
		}
}
