package web.tests;

import org.testng.annotations.Test;
import web.pages.HamburgerMenuPage;
import web.pages.RegisterPage;

public class RegisterTest extends BaseTest{
	
	private static final String USER_NAME = "outlook";
	private static final String FIRST_NAME = "vijaya";
	private static final String LAST_NAME = "G";
	private static final String PASSWORD = "BWtech1234!";
	private static final String CONFIRM_PASSWORD = "BWtech1234!";
	private static final String EMAIL = "VijayalakshmiGaddam@blackwater.tech";

	@Test(enabled = true)
	public void TestRegister() throws InterruptedException {
		RegisterPage registerPage = new RegisterPage();
		HamburgerMenuPage hamburgerMenuOptionsPage = new HamburgerMenuPage();
		hamburgerMenuOptionsPage.ClickOn_HamburgerMenu();
		//log.info("Clicked on Hamburger Menu");
		registerPage.ClickOn_Register_Option();
		registerPage.Enter_Register_UserName(USER_NAME);
		registerPage.Enter_Register_FirstName(FIRST_NAME);
		registerPage.Enter_Register_LastName(LAST_NAME);
		registerPage.Enter_Register_Email(EMAIL);
		registerPage.Enter_Register_Password(PASSWORD);
		registerPage.Enter_Register_Confirm_Password(CONFIRM_PASSWORD);
		registerPage.ClickOn_Policy_Checkbox();
		registerPage.ClickOn_Register_Button();
	}

}
