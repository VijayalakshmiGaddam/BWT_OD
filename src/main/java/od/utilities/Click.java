package od.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Click extends Web{

	private static Click click = null;

	private Click() {
		super();
	}

	public static synchronized Click performClick() {
		if (click == null) {
			click = new Click();
		}
		return click;
	}    

	public boolean ClickOn_WebElement_By(By by) {
		GetWebElement(by).click();
		return true;
	}

	public boolean ClickOn_WebElement_By_Xpath(String xpath) {
		GetWebElement(By.xpath(xpath)).click();
		return true;
	}

	public boolean ClickOn_WebElement(WebElement e) {
		GetWebElement(e).click();
		return true;
	}

}
