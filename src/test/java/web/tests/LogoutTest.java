package web.tests;

import org.testng.annotations.Test;
import web.pages.HamburgerMenuPage;
import web.pages.LogoutPage;

public class LogoutTest extends BaseTest {

	/*@Test(priority = 0)//enabled = true)
	public void testMenuLogout() {
		LogoutPage logoutPage = new LogoutPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		logoutPage.ClickOn_ProfileName_Dropdown();
		logoutPage.ClickOn_Menu_Logout();
	}

	 @Test(priority = 1)//enabled = false)
    public void testDashboardLogout() {
        LogoutPage logoutPage = new LogoutPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        logoutPage.ClickOn_Dashboard_Logout();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
    }
    */
    @Test(priority = 0)//enabled = false)
    public void testMyAccountLogout() {
        LogoutPage logoutPage = new LogoutPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        logoutPage.ClickOn_MyAccount_Logout();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
    }
}