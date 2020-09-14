package od.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Type extends Web {

	private static Type type = null;

	private Type() {
		super();
	}

	public static synchronized Type performType() {
		if (type == null) {
			type = new Type();
		}
		return type;
	} 

	public boolean Type_InTo_TextField_By(By by, Keys key) {
		GetWebElement(by).sendKeys(key);
		return true;
	} 

	public boolean Clear_AND_Type_InTo_TextField_By(By by, String text) {
		GetWebElement(by).clear();
		GetWebElement(by).sendKeys(text);
		return true;
	}

	public boolean Type_InTo_TextField_By(By by, String text) {
		GetWebElement(by).sendKeys(text);
		return true;
	}

	public boolean Type_Char_By_Char_InTo_TextField_By(By by, String text) {
		char[] ch = text.toCharArray();
		for(char c:ch) {
			GetWebElement(by).sendKeys(Character.toString(c));
			FreezeAppForMilliSeconds(1);
		}
		return true;
	}

	public boolean Type_InTo_TextField_By_Xpath(String xpath, String text) {
		GetWebElement(By.xpath(xpath)).sendKeys(text);
		return true;
	}

	public boolean Type_InTo_TextField_By_Id(String id, String text) {
		GetWebElement(By.id(id)).sendKeys(text);
		return true;
	}

	public boolean Type_InTo_TextField(WebElement e, String text) {
		GetWebElement(e).sendKeys(text);

		return true;
	}
	
}