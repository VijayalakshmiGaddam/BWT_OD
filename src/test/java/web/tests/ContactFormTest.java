package web.tests;

import org.testng.annotations.Test;
import web.pages.ContactFormPage;
import web.pages.HamburgerMenuPage;

public class ContactFormTest extends BaseTest {
	
	private static final String Contact_NAME = "vijaya";
	private static final String Contact_EMAIL = "vijayalakshmireddy@gmail.com";
	private static final String Contact_SUBJECT = "Want to extends plan";
	private static final String Contact_MESSAGE = "We are statisfied with the services";
	private static final String Contact_PHONE = "1234567891";
	private static final String Contact_VALUE = "11";

	private static final String Support_First_NAME = "vijaya";
	private static final String Support_Last_NAME = "g";
	private static final String Support_Company_NAME = "BWT";
	private static final String Support_EMAIL = "vijayalakshmireddy@gmail.com";
	private static final String Support_PHONENUM = "9876543215";
	private static final String Support_Issue = "Network issue";

	@Test(priority = 0)//enabled = true)
	public void TestContactForm() {
		ContactFormPage contactFormPage = new ContactFormPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		contactFormPage.ClickOn_Contact_Dropdown();
		contactFormPage.ClickOn_ContactForm_Option();
		contactFormPage.Enter_ContactForm_Name(Contact_NAME);
		contactFormPage.Enter_ContactForm_Email(Contact_EMAIL);
		contactFormPage.Enter_Phone_Number(Contact_PHONE);
		contactFormPage.Enter_ContactForm_Subject(Contact_SUBJECT);
		contactFormPage.Enter_ContactForm_Message(Contact_MESSAGE);
		contactFormPage.Enter_Anti_Spam_Quetion(Contact_VALUE);
		contactFormPage.ClickOn_ContactForm_Submit();
		contactFormPage.Displayed_ContactForm_SuccessMessage();
	}
	
	@Test(priority = 1)//enabled = false)
	public void TestSupportForm() throws InterruptedException {
		ContactFormPage contactFormPage = new ContactFormPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		contactFormPage.ClickOn_Contact_Dropdown();
		//Thread.sleep(500);
		contactFormPage.ClickOn_Support_Option();
		contactFormPage.Enter_SupportForm_First_Name(Support_First_NAME);
		contactFormPage.Enter_SupportForm_Last_Name(Support_Last_NAME);
		contactFormPage.Enter_SupportForm_Company_Name(Support_Company_NAME);
		contactFormPage.Enter_SupportForm_Email(Support_EMAIL);
		contactFormPage.Enter_SupportForm_PhoneNumber(Support_PHONENUM);
		contactFormPage.Enter_SupportForm_Issue(Support_Issue);
		contactFormPage.ClickOn_SupportForm_Submit();
		//contactFormPage.Displayed_SupportForm_SuccessMessage();
	}
}