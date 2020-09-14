package web.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import od.utilities.Web;

import static web.locators.ODWebLocators.MyAccountPage.*;
import web.tests.BaseTest;

public class MyAccountPage extends BaseTest{
	
	public MyAccountPage() {
		
	}
	
	public MyAccountPage ClickOn_PaymentMethods_Option() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Payment_Methods_Option)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public MyAccountPage ClickOn_Delete_Link() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Added_Payment_Delete_Link)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public MyAccountPage ClickOn_Add_Payment_Method_Link() {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Add_Payment_Method_Link)).click();
		return this;
	}
	
	public MyAccountPage Enter_CardDetails(String carddetails) throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).isDisplayed();
		Thread.sleep(5000);
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).sendKeys(carddetails);;
		return this;
	}
	
	public MyAccountPage ClickOn_Add_Payment_Method_Button() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Add_Payment_Method_Button)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public MyAccountPage Displayed_Added_Payment_Success_Message() {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Added_Payment_Success_Message)).click();
		return this;
	}
	
	public MyAccountPage Displayed_Payment_Deleted_Success_Message() {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Payment_Deleted_Success_Message)).click();
		return this;
	}
	
	public MyAccountPage ClickOn_MakeDefault_Link() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Make_Default_Link)).click();
		Thread.sleep(5000);
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Make_Default_Success_Message)).isDisplayed();
		return this;
	}
	
	public MyAccountPage ClickOn_Account_Details_Option() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Details_Option)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public MyAccountPage Enter_Account_FirstName(String firstname) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_First_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_First_Name_Textbox)).clear();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_First_Name_Textbox)).sendKeys(firstname);
		return this;
	}
	
	public MyAccountPage Enter_Account_LastName(String lastname) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Last_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Last_Name_Textbox)).clear();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Last_Name_Textbox)).sendKeys(lastname);
		return this;
	}
	
	public MyAccountPage Enter_Account_DisplayName(String displayname) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Display_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Display_Name_Textbox)).clear();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Display_Name_Textbox)).sendKeys(displayname);
		return this;
	}
	
	public MyAccountPage Enter_Account_Email(String email) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Email_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Email_Textbox)).clear();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Email_Textbox)).sendKeys(email);
		return this;
	}
	
	public MyAccountPage Enter_Account_Current_Password(String currentpwd) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Current_Password_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Current_Password_Textbox)).sendKeys(currentpwd);
		return this;
	}
	
	public MyAccountPage Enter_Account_New_Password(String newpwd) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_New_Password_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_New_Password_Textbox)).sendKeys(newpwd);
		return this;
	}
	
	public MyAccountPage Enter_Account_Confirm_New_Password(String confirmpwd) {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Confirm_New_Password_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Confirm_New_Password_Textbox)).sendKeys(confirmpwd);
		return this;
	}
	
	public MyAccountPage ClickOn_Account_SaveChanges_Button() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Save_Changes_Button)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public MyAccountPage Displayed_Changes_Success_Message() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Account_Changes_Success_Message)).isDisplayed();
		Thread.sleep(2000);
		return this;
	}
}