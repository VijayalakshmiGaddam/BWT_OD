package od.utilities;

import org.openqa.selenium.By;

public class Select extends Web {

	private static Select select = null;

	private Select() {
		super();
	}

	public static synchronized Select performSelect() {
		if (select == null) {
			select = new Select();
		}
		return select;
	} 

	public boolean Select_By_Index(By by, int index) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.selectByIndex(index);
		return true;
	} 

	public boolean Select_By_Value(By by, String value) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.selectByValue(value);
		return true;
	}

	public boolean Select_By_VisibleText(By by, String text) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.selectByVisibleText(text);
		return true;
	}

	public boolean Deselect_By_Value(By by, String value) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.deselectByValue(value);
		return true;
	}

	public boolean Deselect_By_Text(By by, String text) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.deselectByVisibleText(text);
		return true;
	}

	public boolean Deselect_By_Index(By by, int index) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.deselectByIndex(index);
		return true;
	}

	public boolean Deselect_All(By by, String text) {
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(OD.Web.GetWebElement(by));
		select.deselectAll();
		return true;
	}
	
}