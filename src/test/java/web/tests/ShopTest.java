package web.tests;

import org.testng.annotations.Test;
import web.pages.HamburgerMenuPage;
import web.pages.ShopPage;

public class ShopTest  extends BaseTest{
	private static final String CARD_DETAILS = "55555555555544441121123";
	private static final String CARD_NUMBER = "4242424242424242";
	private static final String EXPIRE_DATE = "1021";
	private static final String CVC = "123";
	
	private static final String PRODUCT = "Office 365";
	private static final String PRODUCTNAME = "One Drive";

	private static final String PAYPALUSER = "sb-a5vn81035851@personal.example.com";
	private static final String PAYPALPWD = "KDJ<yw%2";

	@Test(priority = 0)//enabled = false)
	public void testCreditPayment() throws InterruptedException {
		ShopPage shopPage = new ShopPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		shopPage.ClickOn_Shop_Option();
		shopPage.HoverOn_ShowDetails_Button();
		shopPage.ClickOn_Product_AddToCart_Button();
		shopPage.ClickOn_ViewCart_Button();
		shopPage.ClickOn_ProceedToCheckout_Button();
		shopPage.ClickOn_CreditCard_RadioButton();
		//shopPage.Enter_CardDetails(CARD_DETAILS);
//		shopPage.Enter_Credit_Or_Debit_CardNumber(CARD_NUMBER);
//		 shopPage.Enter_ExpireDate(EXPIRE_DATE);
//		 shopPage.Enter_CVC_Numeber(CVC);
		shopPage.ClickOn_Terms_And_Conditions_Checkbox();
		shopPage.ClickOn_PlaceOrder_Button();
	}
	/*
	@Test(priority = 1)//enabled = false)
	public void testPaypalPayment() throws InterruptedException {
		ShopPage shopPage = new ShopPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		shopPage.ClickOn_Shop_Option();
		shopPage.HoverOn_ShowDetails_Button();
		shopPage.ClickOn_Shop_BuyNow_Button();
		shopPage.ClickOn_Paypal_Raido_Button();
		shopPage.ClickOn_Terms_And_Conditions_Checkbox();
		shopPage.ClickOn_ProceedToPaypal_Button();
		shopPage.Enter_Paypal_Username(PAYPALUSER);
		shopPage.Enter_Paypal_Password(PAYPALPWD);
		shopPage.ClickOn_Paypal_Login_Button();
		shopPage.ClickOn_AcceptCookies_Button();
		shopPage.ClickOn_Paypal_Continue_Button();
		shopPage.ClickOn_PayNow_Button();
		shopPage.Displayed_DoneIcon();

	}
	@Test(priority = 2)//enabled = true)
	public void testSearchPayment() throws InterruptedException {
		ShopPage shopPage = new ShopPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		shopPage.ClickOn_Shop_Option();
		shopPage.Enter_Product_Name(PRODUCT);
		shopPage.ClickOn_Search_Button();
		shopPage.Enter_ProductName(PRODUCTNAME);
		shopPage.ClickOn_Search_Icon();
	}
	@Test(priority = 3)//enabled = true)
	public void testSorting() throws InterruptedException {
		ShopPage shopPage = new ShopPage();
		HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
		hamburgerMenuPage.ClickOn_HamburgerMenu();
		shopPage.ClickOn_Shop_Option();
		shopPage.ClickOn_Sorting_Dropdown();
		shopPage.Select_Option_From_Dropdown();
	}
	 @Test(priority = 4)//enabled = false)
    public void testQuickView(){
        ShopPage shopPage = new ShopPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
        shopPage.ClickOn_Shop_Option();
        shopPage.HoverOn_ShowDetails_Button();
        shopPage.ClickOn_QuickView_Button();
        //shopPage.ClickOn_QuickView_AddToCart_Button();
        //shopPage.ClickOn_QuickView_ViewCart_Button();
        shopPage.ClickOn_QuickView_BuyNow_Button();
        shopPage.ClickOn_Checkout_ViewCart_Button();
    }
  @Test(priority = 5)
    public void testAddRemoveUndoProduct() throws InterruptedException {
        ShopPage shopPage = new ShopPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
        shopPage.ClickOn_Shop_Option();
        shopPage.HoverOn_ShowDetails_Button();
        shopPage.ClickOn_Product_AddToCart_Button();
        shopPage.ClickOn_ViewCart_Button();
        shopPage.ClickOn_Cart_DeleteIcon();
        shopPage.Displayed_Removed_Success_Message();
        shopPage.ClickOn_Undo_Button();
    }
  
  @Test(priority = 6)
  public void testReturnToShop() throws InterruptedException {
      ShopPage shopPage = new ShopPage();
      HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
      hamburgerMenuPage.ClickOn_HamburgerMenu();
      shopPage.ClickOn_Shop_Option();
      shopPage.HoverOn_ShowDetails_Button();
      shopPage.ClickOn_Product_AddToCart_Button();
      shopPage.ClickOn_ViewCart_Button();
      shopPage.ClickOn_Cart_DeleteIcon();
      shopPage.Displayed_Removed_Success_Message();
      shopPage.ClickOn_ReturnToShop_Link();
  }
  
	
	@Test(priority = 7)
    public void testQuantityIncrementUpdateCart() throws InterruptedException {
        ShopPage shopPage = new ShopPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
        shopPage.ClickOn_Shop_Option();
        shopPage.HoverOn_ShowDetails_Button();
        shopPage.ClickOn_Product_AddToCart_Button();
        shopPage.ClickOn_ViewCart_Button();
        shopPage.ClickOn_Quantity_Increment_Button();
        shopPage.ClickOn_UpdateCart_Button();
        shopPage.Displayed_Cart_Updated_Success_Message();
	}
	
	@Test(priority = 8)
    public void testQuantityDecrementUpdateCart() throws InterruptedException {
        ShopPage shopPage = new ShopPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
        shopPage.ClickOn_Shop_Option();
        shopPage.HoverOn_ShowDetails_Button();
        shopPage.ClickOn_Product_AddToCart_Button();
        shopPage.ClickOn_ViewCart_Button();
        shopPage.ClickOn_Quantity_Decrement_Button();
        shopPage.ClickOn_UpdateCart_Button();
        shopPage.Displayed_Cart_Updated_Success_Message();
	}
	
	@Test(priority = 9)
    public void testWishlist() throws InterruptedException {
        ShopPage shopPage = new ShopPage();
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
        hamburgerMenuPage.ClickOn_HamburgerMenu();
        shopPage.ClickOn_Shop_Option();
        shopPage.HoverOn_ShowDetails_Button();
        shopPage.ClickOn_ShowDetails_Button();
        shopPage.ClickOn_AddToWishlist_Link();
        shopPage.ClickOn_Browse_Wishlist_Link();
        //shopPage.ClickOn_Wishlist_Remove_Link();
//        shopPage.ClickOn_Wishlist_Delete_Icon();
//        shopPage.Displayed_Deleted_Success_Message();
        shopPage.ClickOn_Wishlist_AddToCart_Button();

	}
	*/
}