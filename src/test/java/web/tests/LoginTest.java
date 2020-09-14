package web.tests;

import org.testng.annotations.Test;
import web.pages.HamburgerMenuPage;
import web.pages.LoginPage;

public class LoginTest extends BaseTest {

	public static String EMAIL = "vijayalakshmireddy4@gmail.com";
	
	//public static String GMAIL_USER = "vijayalakshmireddy4@gmail.com";
	//public static String GMAIL_PWD = "";

	@Test(priority = 0)
	public void testLogin() throws InterruptedException {
		LoginPage loginPage = new LoginPage("vijayalakshmireddy4@gmail.com", "BWtech1234!");
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		log.info("Clicked on Hamburger Menu");
		loginPage.ClickOn_Login_Option();
		log.info("Clicked on Login Option");
		loginPage.setUserName();
		log.info("Given Registered User Name");
		loginPage.setPassword();
		log.info("Given Password");
		loginPage.ClickOn_Login_Button();
		log.info("Clicked on Login Button");
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		log.info("Clicked on Hamburger Menu");
		loginPage.ClickOn_Profile_Name();
		log.info("Clicked on Profile Name");
	}

	/* @Test(priority = 1)
    public void testForgotPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage("VijayalakshmiGaddam@blackwater.tech", "BWtech1234!");
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
        loginPage.ClickOn_Login_Option();
        loginPage.ClickOn_Forgot_Your_Password();
        loginPage.Enter_Username_Or_Email(EMAIL);
        loginPage.ClickOn_Reset_My_Password_Button();
        //loginPage.Enter_Gmail_Details(GMAIL_USER, GMAIL_PWD);
        //loginPage.ClickOn_Offload_Mail();
        //loginPage.ClickOn_ResetYourPassword_Button();
        //loginPage.NavigateTo_Reset_Password_Page();
        //loginPage.Enter_New_Password();
        //loginPage.Enter_Confirm_Password();
        //loginPage.ClickOn_Reset_My_Password_Button();
        //loginPage.Displayed_Success_Message();
    }*/
}