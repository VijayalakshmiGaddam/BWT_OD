package web.pages;

import od.utilities.Web;
import web.tests.BaseTest;
import static web.locators.ODWebLocators.HomePage.*;

public class HamburgerMenuPage extends BaseTest {
	
	public HamburgerMenuPage() {

	}
	
	public HamburgerMenuPage ClickOn_HamburgerMenu(){
		Web.Click.ClickOn_WebElement_By(Hamburger_Menu_Icon);
		return this;
	}
}