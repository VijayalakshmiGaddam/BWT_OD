package web.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import od.utilities.Web;
import web.tests.BaseTest;
import static web.locators.ODWebLocators.LoginPage.*;
import static web.locators.ODWebLocators.MyAccountPage.*;

public class LoginPage extends BaseTest {

	private static String Username;
	private static String Password;

	public LoginPage(String username, String password) {
		Username = username;
		Password = password;
	}

	public void setUserName(){
		Web.Click.ClickOn_WebElement_By(Login_Username_Or_EmailAddress_Textbox);
		Web.Type.Type_InTo_TextField_By(Login_Username_Or_EmailAddress_Textbox, Username);
	}

	public void setPassword(){
		Web.Click.ClickOn_WebElement_By(Login_Password_Textbox);
		Web.Type.Type_InTo_TextField_By(Login_Password_Textbox, Password);
	}

	public LoginPage ClickOn_Login_Option(){
		Web.Click.ClickOn_WebElement_By(Login_Option);
		return this;
	}

	public LoginPage ClickOn_Login_Button() {
		Web.Click.ClickOn_WebElement_By(Login_Button);
		return this;
	}

	public LoginPage ClickOn_Profile_Name() throws InterruptedException{
		Web.Click.ClickOn_WebElement_By(Profile_Name);
		Thread.sleep(3000);
		return this;
	}

	public LoginPage ClickOn_Forgot_Your_Password() {
		Web.Click.ClickOn_WebElement_By(Forgot_Your_Password_Link);
		return this;
	}

	public LoginPage Enter_Username_Or_Email(String email){
		Web.Click.ClickOn_WebElement_By(Reset_Username_Or_Email_Textbox);
		Web.Type.Type_InTo_TextField_By(Reset_Username_Or_Email_Textbox, email);
		return this;
	}

	public LoginPage ClickOn_Reset_My_Password_Button() throws InterruptedException {
		Web.Click.ClickOn_WebElement_By(Reset_My_Password_Button);
		Thread.sleep(5000);
		return this;
	}

	public LoginPage Enter_New_Password(){
		Web.Click.ClickOn_WebElement_By(New_Password_Textbox);
		return this;
	}
	
	public LoginPage Enter_Confirm_Password() {
		Web.Click.ClickOn_WebElement_By(Confirm_Password_Textbox);
		return this;
	}
	
	public LoginPage ClickOn_Change_My_Password_Button() {
		Web.Click.ClickOn_WebElement_By(Change_My_Password_Button);
		return this;
	}
	
	public LoginPage Displayed_Success_Message() {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Success_Message_Text)).isDisplayed();
		return this;
	}

}