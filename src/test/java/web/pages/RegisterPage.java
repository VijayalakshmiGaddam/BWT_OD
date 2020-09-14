package web.pages;

import static web.locators.ODWebLocators.RegisterPage.*;

import org.openqa.selenium.support.ui.ExpectedConditions;

import od.utilities.Web;
import web.tests.BaseTest;

public class RegisterPage extends BaseTest{
	
	public RegisterPage() {

	}
	
	public RegisterPage ClickOn_Register_Option(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Option)).click();
		return this;
	}
	
	public RegisterPage Enter_Register_UserName(String username) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_UserName_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_UserName_Textbox)).sendKeys(username);
		return this;
	}
	
	public RegisterPage Enter_Register_FirstName(String firstname) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_FirstName_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_FirstName_Textbox)).sendKeys(firstname);
		return this;
	}
	
	public RegisterPage Enter_Register_LastName(String lastname) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_LastName_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_LastName_Textbox)).sendKeys(lastname);
		return this;
	}
	
	public RegisterPage Enter_Register_Email(String email) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Email_ID_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Email_ID_Textbox)).sendKeys(email);
		return this;
	}

	public RegisterPage Enter_Register_Password(String password) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Password_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Password_Textbox)).sendKeys(password);
		return this;
	}

	public RegisterPage Enter_Register_Confirm_Password(String confirmpassword) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Confirm_Password_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Confirm_Password_Textbox)).sendKeys(confirmpassword);
		return this;
	}
	
	public RegisterPage ClickOn_Register_Button() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Register_Button)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public RegisterPage ClickOn_Policy_Checkbox() {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Policy_Checkbox)).click();
		return this;
	}
	
}