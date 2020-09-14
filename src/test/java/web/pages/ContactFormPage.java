package web.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import od.utilities.Web;
import web.tests.BaseTest;
import static web.locators.ODWebLocators.ContactFormPage.*;

public class ContactFormPage extends BaseTest{

	public ContactFormPage ClickOn_Contact_Dropdown(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Contact_Dropdown)).click();
		return this;
	}

	public ContactFormPage ClickOn_ContactForm_Option(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Contact_Option)).click();
		return this;
	}
	
	public ContactFormPage ClickOn_Support_Option(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Support_Option)).click();
		return this;
	}
	
	public ContactFormPage Enter_ContactForm_Name(String name){
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Name_Textbox)).sendKeys(name);
		return this;
	}
	
	public ContactFormPage Enter_SupportForm_First_Name(String firstname){
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_First_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_First_Name_Textbox)).sendKeys(firstname);
		return this;
	}
	
	public ContactFormPage Enter_SupportForm_Last_Name(String lastname){
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Last_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Last_Name_Textbox)).sendKeys(lastname);
		return this;
	}
	
	public ContactFormPage Enter_SupportForm_Company_Name(String company){
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Company_Name_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Company_Name_Textbox)).sendKeys(company);
		return this;
	}
	
	public ContactFormPage Enter_ContactForm_Email(String email){
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Email_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Email_Textbox)).sendKeys(email);
		return this;
	}
	
	public ContactFormPage Enter_SupportForm_Email(String supportemail){
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Business_Email_Address_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Business_Email_Address_Textbox)).sendKeys(supportemail);
		return this;
	}
	
	public ContactFormPage Enter_Phone_Number(String phone){
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Phone_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Phone_Textbox)).sendKeys(phone);
		return this;
	}
	
	public ContactFormPage Enter_SupportForm_PhoneNumber(String supportphone){
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Contact_Telephone_Number_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Contact_Telephone_Number_Textbox)).sendKeys(supportphone);
		return this;
	}
	
	public ContactFormPage Enter_ContactForm_Subject(String subject){
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Subject_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Subject_Textbox)).sendKeys(subject);
		return this;
	}
	
	public ContactFormPage Enter_ContactForm_Message(String message){
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Message_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Message_Textbox)).sendKeys(message);
		return this;
	}
	
	public ContactFormPage Enter_SupportForm_Issue(String issue){
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Brief_overview_of_the_issue_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Brief_overview_of_the_issue_Textbox)).sendKeys(issue);
		return this;
	}
	
	public ContactFormPage Enter_Anti_Spam_Quetion(String value){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Anti_Spam_Question_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Anti_Spam_Question_Textbox)).sendKeys(value);
		return this;
	}
	
	public ContactFormPage ClickOn_ContactForm_Submit(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(ContactForm_Submit_Button)).click();
		return this;
	}
	
	public ContactFormPage ClickOn_SupportForm_Submit() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(SupportForm_Submit_Button)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public ContactFormPage Displayed_SupportForm_SuccessMessage(){
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(ContactForm_SuccessMessage)).isDisplayed();
		return this;
	}
	
	public ContactFormPage Displayed_ContactForm_SuccessMessage() {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(ContactForm_SuccessMessage)).isDisplayed();
		return this;
	}

}