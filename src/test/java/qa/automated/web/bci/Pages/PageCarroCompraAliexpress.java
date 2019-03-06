package qa.automated.web.bci.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCarroCompraAliexpress {
	@FindBy(xpath = "//android.view.View[@index='0']")
	private WebElement btnSaltar;
	
	public void clickSaltar() {
		btnSaltar.click();
	}
}
