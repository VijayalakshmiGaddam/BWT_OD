package web.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import od.utilities.Web;
import web.tests.BaseTest;
import static web.locators.ODWebLocators.LogoutPage.*;
import static web.locators.ODWebLocators.MyAccountPage.*;

public class LogoutPage extends BaseTest{

	public LogoutPage ClickOn_Menu_Logout(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Logout_Option)).click();
		return this;
	}

	public LogoutPage ClickOn_Dashboard_Logout(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Dashboard_Logout_Link)).click();
		return this;
	}

	public LogoutPage ClickOn_MyAccount_Logout(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(MyAccount_Logout_Option)).click();
		return this;
	}
	
	public LogoutPage ClickOn_ProfileName_Dropdown(){
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Profile_Name)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Profile_Dropdown)).click();
		return this;
	}
}