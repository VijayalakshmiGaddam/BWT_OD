package web.tests;

import org.testng.annotations.Test;
import web.pages.ShopPage;
import web.pages.HamburgerMenuPage;
import web.pages.MyAccountPage;

public class MyAccountTest {
	
	private final static String CARD_DETAILS = "55555555555544441121567";
	private static final String CARD_NUMBER = "4242424242424242";
	private static final String EXPIRE_DATE = "1021";
	private static final String CVC = "123";
	
	private final static String FIRST_NAME = "VIJAYA";
	private final static String LAST_NAME = "GADDAM";
	private final static String DISPLAY_NAME = "VIJJU";
	private final static String EMAIL = "vijayalakshmireddy4@gmail.com";
	private final static String CURRENT_PASSWORD = "BWtech1234!";
	private final static String NEW_PASSWORD = "BWTech1234!";
	private final static String CONFIRM_PASSWORD = "BWTech1234!";
	
	@Test(priority = 0)
	public void testAddPaymentMethod() throws InterruptedException{
		MyAccountPage myaccount = new MyAccountPage();
		ShopPage shopPage = new ShopPage();
		HamburgerMenuPage hamburgerMenu = new HamburgerMenuPage();
		myaccount.ClickOn_PaymentMethods_Option();
		myaccount.ClickOn_Add_Payment_Method_Link();
		shopPage.Enter_CardDetails(CARD_DETAILS);
//		shopPage.Enter_Credit_Or_Debit_CardNumber(CARD_NUMBER);
//		shopPage.Enter_ExpireDate(EXPIRE_DATE);
//		shopPage.Enter_CVC_Numeber(CVC);
		myaccount.ClickOn_Add_Payment_Method_Button();
		myaccount.Displayed_Added_Payment_Success_Message();
//		hamburgerMenu.ClickOn_HamburgerMenu();
//		shopPage.ClickOn_Shop_Option();
//		shopPage.HoverOn_ShowDetails_Button();
//		shopPage.ClickOn_QuickView_Button();
//		shopPage.ClickOn_QuickView_BuyNow_Button();
//		shopPage.ClickOn_CreditCard_RadioButton();
//		shopPage.ClickOn_Saved_Payment_Text();
//		shopPage.ClickOn_Terms_And_Conditions_Checkbox();
//		shopPage.ClickOn_PlaceOrder_Button();
//		shopPage.Displayed_Card_Payment_ThankYou_Message();
	}
	/*
	@Test(priority = 1)
	public void testDeletePaymentMethod() throws InterruptedException{
		MyAccountPage myaccount = new MyAccountPage();
		myaccount.ClickOn_PaymentMethods_Option();
		myaccount.ClickOn_Delete_Link();
		myaccount.Displayed_Payment_Deleted_Success_Message();
	}
	
	@Test(priority = 2)
	public void testMakeDefaultPayment() throws InterruptedException{
		MyAccountPage myaccount = new MyAccountPage();
		myaccount.ClickOn_PaymentMethods_Option();
		myaccount.ClickOn_MakeDefault_Link();
	}	
	
	@Test(priority = 3)
	public void testAccountDetails() throws InterruptedException {
		MyAccountPage myaccount = new MyAccountPage();
		myaccount.ClickOn_Account_Details_Option();
		myaccount.Enter_Account_FirstName(FIRST_NAME);
		myaccount.Enter_Account_LastName(LAST_NAME);
		myaccount.Enter_Account_DisplayName(DISPLAY_NAME);
		myaccount.Enter_Account_Email(EMAIL);
		myaccount.Enter_Account_Current_Password(CURRENT_PASSWORD);
		myaccount.Enter_Account_New_Password(NEW_PASSWORD);
		myaccount.Enter_Account_Confirm_New_Password(CONFIRM_PASSWORD);
		myaccount.ClickOn_Account_SaveChanges_Button();
	}*/
}
