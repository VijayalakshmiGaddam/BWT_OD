package web.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ODWebLocators {

	public static class HomePage{
		
		public final static By Hamburger_Menu_Icon = By.xpath("//span[@class=\"mob-menu-toggle\"]");
		public final static By DigitalPlans_Option = By.xpath("(//span[text()='Digital Plans'])[1]");
		public final static By Services_Option = By.xpath("(//span[text()='Services'])[1]");
		public final static By Products_Option = By.xpath("(//span[contains(text(),'Products')])[1]");
		public final static By Services_Dropdown = By.xpath("(//i[@class=\"di fa fa-angle-down\"])[2]");
		public final static By Products_Dropdown = By.xpath("(//i[@class=\"di fa fa-angle-down\"])[6]");
		public final static By OffLoadDigital_Email_Link = By.xpath("(//span[text()=\"Offload Digital\"])[1]");
		public final static By Profile_Dropdown = By.xpath("(//i[@class=\"di fa fa-angle-down\"])[46]");
		public final static By Profile_Logout_Option = By.xpath("(//span[text()=\"Logout\"])[1]");
	}

	public static class MyAccountPage {
		
		public final static By Profile_Name = By.xpath("(//span[@class=\"txt\"])[48]");
		public final static By Dashboard_Logout_Link = By.xpath("//a[text()=\"Log out\"]");
		public final static By MyAccount_Logout_Option = By.xpath("//a[text()=\"Logout\"]");
		public final static By Header_Logout_Option = By.xpath("(//span[text()=\"Logout\"])[2]");
		public final static By Payment_Methods_Option = By.xpath("//a[text()=\"Payment methods\"]");
		public final static By Account_Details_Option = By.xpath("//a[text()=\"Account details\"]");
		public final static By Addresses_Option = By.xpath("//a[text()=\"Addresses\"]");
		public final static By Orders_Option = By.xpath("//a[text()=\"Orders\"]");
		public final static By Subscriptions_Option = By.xpath("//a[text()=\"Subscriptions\"]");
		
		public final static By Add_Payment_Method_Link = By.xpath("/html/body/div[1]/div[3]/main/div/div/div/section[2]/div/div/div/div/div/div/div/div/div/div/a");
		public final static By Card_Number_Textbox = By.xpath("(//iframe[@frameborder=\"0\"])[1]");
		public final static By Add_Payment_Method_Button = By.xpath("//button[text()=\"Add payment method\"]");
		public final static By Added_Payment_Success_Message = By.xpath("//div[@role=\"alert\"]");
		public final static By Payment_Deleted_Success_Message = By.xpath("//div[@class=\"woocommerce-message\"]");
		public final static By Make_Default_Success_Message = By.xpath("//div[@class=\"woocommerce-message\"]");
		public final static By Added_Payment_Delete_Link = By.xpath("(//a[text()=\"Delete\"])[1]");
		public final static By Make_Default_Link = By.xpath("(//a[text()=\"Make default\"])[1]");
		
		public final static By Account_First_Name_Textbox = By.xpath("//input[@name=\"account_first_name\"]");
		public final static By Account_Last_Name_Textbox = By.xpath("//input[@name=\"account_last_name\"]");
		public final static By Account_Display_Name_Textbox = By.xpath("//input[@name=\"account_display_name\"]");
		public final static By Account_Email_Textbox = By.xpath("//input[@name=\"account_email\"]");
		public final static By Account_Current_Password_Textbox = By.xpath("//input[@name=\"password_current\"]");
		public final static By Account_New_Password_Textbox = By.xpath("//input[@name=\"password_1\"]");
		public final static By Account_Confirm_New_Password_Textbox = By.xpath("//input[@name=\"password_2\"]");
		public final static By Account_Save_Changes_Button = By.xpath("//button[text()=\"Save changes\"]");
		public final static By Account_Changes_Success_Message = By.xpath("//div[@class=\"woocommerce-message\"]");
	}
	
	public static class RegisterPage{
		
		public final static By Policy_Checkbox = By.xpath("//i[@class=\"um-icon-android-checkbox-outline-blank\"]");
		public final static By Register_Option = By.xpath("(//span[text()='Register'])[1]");
		public final static By Register_Button = By.xpath("//input[@value=\"Register\"]");
		public final static By Register_UserName_Textbox = By.xpath("//input[@data-validate=\"unique_username\"]");
		public final static By Register_FirstName_Textbox = By.xpath("//input[@data-key=\"first_name\"]");
		public final static By Register_LastName_Textbox = By.xpath("//input[@data-key=\"last_name\"]");
		public final static By Register_Email_ID_Textbox = By.xpath("//input[@data-validate=\"unique_email\"]");
		public final static By Register_Password_Textbox = By.xpath("//input[@data-key=\"user_password\"]");
		public final static By Register_Confirm_Password_Textbox = By.xpath("//input[@data-key=\"confirm_user_password\"]");
	}
	
	public static class LoginPage{

		public final static By Login_Option = By.xpath("(//span[text()='Login'])[1]");
		public final static By Login_Username_Or_EmailAddress_Textbox = By.xpath("//input[@data-key=\"username\"]");
		public final static By Login_Password_Textbox = By.xpath("//input[@data-key=\"user_password\"]");
		public final static By Login_Button = By.xpath("//input[@value=\"Login\"]");
		
		public final static By Forgot_Your_Password_Link = By.xpath("//a[@class=\"um-link-alt\"]");
		public final static By Reset_Username_Or_Email_Textbox = By.xpath("//input[@name=\"username_b\"]");
		public final static By Reset_My_Password_Button = By.xpath("//input[@value=\"Reset my password\"]");
		/*public final static String Reset_PWD_Link = "https://offload.digital/password-reset/?act=reset_password";
		public final static By Gmail_User_Textbox = By.xpath("//input[@aria-label=\"Email or phone\"]");
		public final static By Gmail_Next_Button = By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]");
		public final static By Gmail_Password_Textbox = By.xpath("//input[@name=\"password\"]");
		public final static By Offload_Mail = By.xpath("(//span[text()=\"Offload Digital\"])[1]");
		public final static By Reset_Your_Password_Button = By.xpath("//a[text()=\"Reset your password\"]");
		*/
		public final static By New_Password_Textbox = By.xpath("//input[@name=\"user_password\"]");
		public final static By Confirm_Password_Textbox = By.xpath("//input[@name=\"confirm_user_password\"]");
		public final static By Change_My_Password_Button = By.xpath("//input[@value=\"Change my password\"]");
		public final static By Success_Message_Text = By.xpath("//p[text()=\"You have successfully changed your password.\"]");
	}
	
	public static class ContactFormPage{
		
		public final static By Contact_Dropdown = By.xpath("(//i[@class=\"di fa fa-angle-down\"])[45]");
		public final static By Contact_Option = By.xpath("(//span[text()='Contact'])[2]");
		public final static By ContactForm_Name_Textbox = By.xpath("//input[@autocomplete=\"given-name\"]");
		public final static By ContactForm_Email_Textbox = By.xpath("//input[@name=\"email\"]");
		public final static By ContactForm_Phone_Textbox = By.xpath("//input[@name=\"phone\"]");
		public final static By ContactForm_Subject_Textbox = By.xpath("//input[@name=\"nf-field-7\"]");
		public final static By ContactForm_Message_Textbox = By.xpath("//textarea[@name=\"nf-field-8\"]");
		public final static By ContactForm_Submit_Button = By.xpath("//input[@value=\"Submit\"]");
		public final static By Anti_Spam_Question_Textbox = By.xpath("//input[@name=\"nf-field-68\"]");
		public final static By ContactForm_SuccessMessage = By.xpath("//h2[text()=\"Your form has been successfully submitted.\"]");

		public final static By SupportForm_SuccessMessage_Textbox = By.xpath("//h2[text()='Your form has been successfully submitted.']");
		public final static By Support_Option = By.xpath("(//span[text()=\"Support\"])[1]");
		public final static By SupportForm_First_Name_Textbox =By.xpath("(//input[@autocomplete=\"given-name\"])[1]");
		public final static By SupportForm_Last_Name_Textbox = By.xpath("//input[@name=\"lname\"]");
		public final static By SupportForm_Company_Name_Textbox = By.xpath("(//input[@name=\"fname\"])[2]");
		public final static By SupportForm_Business_Email_Address_Textbox = By.xpath("//input[@name=\"email\"]");
		public final static By SupportForm_Contact_Telephone_Number_Textbox = By.xpath("//input[@name=\"phone\"]");
		public final static By SupportForm_Brief_overview_of_the_issue_Textbox = By.xpath("//textarea[@name=\"nf-field-44\"]");
		public final static By SupportForm_Submit_Button = By.xpath("//input[@value=\"Submit\"]");
	}
	
	public static class ShopPage{
		
		public final static By Proceed_To_Paypal_Button = By.xpath("//button[text()=\"Proceed to PayPal\"]");
		public final static By Paypal_Email_Or_Mobile_Textbox = By.xpath("//input[@autocomplete=\"username\"]");
		public final static By Paypal_Password_Textbox = By.xpath("//input[@id=\"password\"]");
		public final static By Paypal_Login_Button = By.xpath("//button[@value=\"Login\"]");
		public final static By Paypal_Continue_Button = By.xpath("//button[text()=\"Continue\"]");
		public final static By Paypal_PayNow_Button = By.xpath("//input[@value=\"Pay Now\"]");
		public final static By Paypal_Payment_Done_Icon = By.xpath("//div[@class=\"done\"]");
		public final static By Paypal_Radio_Button = By.xpath("//input[@value=\"paypal\"]");
		public final static By Paypal_Accept_Cookies_Button = By.xpath("//button[text()=\"Accept Cookies\"]");
		
		public final static By QuickView_ADDTOCart_Button = By.xpath("(//button[text()=\"Add to cart\"])[1]");
		public final static By QuickView_ViewCart_Button = By.xpath("//a[text()=\"View cart\"]");
		public final static By QuickView_BuyNow_Button = By.xpath("(//button[text()=\"Buy Now\"])[1]");
		public final static By Quick_View_Button = By.xpath("(//span[text()='Quick View'])[1]");
		
		public final static By Search_Textbox = By.xpath("//input[@class=\"search-field\"]");
		public final static By Search_Button = By.xpath("//button[text()=\"Search\"]");
		public final static By Footer_Search_Textbox = By.xpath("(//input[@title=\"Search for:\"])[2]");
		public final static By Footer_Search_Icon = By.xpath("(//i[@class=\"fa fa-search\"])[3]");
		
		public final static By Credit_Card_Radio_Button = By.xpath("//input[@value=\"stripe\"]");
		public final static By Credit_Card_Place_Order_Button = By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[1]/div/div/div/div/div/section/div/div/div/div/div/div/div/div/div/div/form/div[2]/div/div/div/button");
		public final static By Card_Number_Textbox = By.xpath("//iframe[@title=\"Secure card payment input frame\"]");
		public final static By Card_ExpireDate = By.xpath("/html/body/div/form/div/div[2]/span[2]/span/span/input");
		public final static By Card_CVC = By.xpath("/html/body/div/form/div/div[2]/span[3]/span/span/input");
		public final static By Save_Payment_Checkbox = By.xpath("//input[@name=\"wc-stripe-new-payment-method\"]");
		public final static By Terms_And_Conditions_Checkbox = By.xpath("//input[@name=\"terms\"]");
		public final static By Saved_Payment_Method_Text = By.xpath("//label[text()=\"Visa ending in 4242 (expires 11/21)\"]");
		public final static By Use_New_Payment_Text =By.xpath("//label[text()=\"Use a new payment method\"]");
		public final static By Card_Payment_ThankYou_Message = By.xpath("//p[text()=\"Thank you. Your order has been received.\"]");

		public final static By ProductPage_AddToCart_Button = By.xpath("(//button[text()=\"Add to cart\"])[1]");
		public final static By ProductPage_BuyNow_Button = By.xpath("(//button[text()=\"Buy Now\"])[1]");
		public final static By Product_Add_To_Cart_Button =By.xpath("(//a[text()=\"Add to cart\"])[1]");
		public final static By Product_AddToWishlist_Link = By.xpath("//a[text()=\"ADD TO WISHLIST\"]");
		public final static By Product_Browse_Wishlist_Link = By.xpath("(//a[text()=\"BROWSE WISHLIST	        \"])[1]");
		public final static By Product_SendToFriend_Link = By.xpath("//a[text()=\" SEND TO FRIEND\"]");

		public final static By Shop_Option = By.xpath("(//span[text()='Shop'])[1]");
		//public final static By Shop_AddToCart_Button = By.xpath("(//button[text()=\"Add to cart\"])[1]");
		public final static By Shop_BuyNow_Button = By.xpath("(//a[text()=\"Buy Now\"])[1]");
		public final static By Shop_View_Cart_Button = By.xpath("(//a[text()=\"View cart\"])[1]");
		public final static By Shop_Sorting_Dropdown = By.xpath("//select[@name=\"orderby\"]");
		public final static By Shop_Show_Details_Button = By.xpath("//a[text()=\"Audio Conferencing\"]");
		
		public final static By Cart_Proceed_To_Checkout_Button = By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[2]/div/div/div/div[2]/div/div/a");
		public final static By Cart_Title = By.xpath("//h1[text()=\"Cart\"]");
		public final static By Cart_Delete_Icon = By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[2]/div/div/div/form/table/tbody/tr[1]/td[1]/a");
		public final static By Update_Cart_Button = By.xpath("//button[text()=\"Update cart\"]");
		public final static By Cart_Removed_Success_Message = By.xpath("//div[@class=\"woocommerce-message\"]");
		public final static By Cart_Undo_Button = By.xpath("//a[text()=\"Undo?\"]");
		public final static By Cart_ReturnToShop_Link = By.xpath("//a[@class=\"button wc-backward\"]");
		public final static By Cart_Updated_Success_Message = By.xpath("//div[@class=\"woocommerce-message\"]");
		
		public final static By QuantityIncrement_Button = By.xpath("//span[@class=\"jcf-btn-inc\"]");
		public final static By QuantityDecrement_Button = By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[2]/div/div/div/form/table/tbody/tr[1]/td[5]/div/span/span[2]");
		public final static By Checkout_ViewCart_Button = By.xpath("(//a[text()=\"View cart\"])[1]");
		public final static By Wishlist_AddToCart_Button = By.xpath("//a[text()=\"Add to cart\"]");
		public final static By Wishlist_Remove_Link = By.xpath("//a[text()=\"Remove\"]");
		public final static By Wishlist_Delete_Icon = By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[2]/div/div/form/table/tbody/tr/td[1]/div/a");
		public final static By Wishlist_Removed_Success_Message = By.xpath("//div[@class=\"woocommerce-message\"]");
		public final static By Wishlist_AddToCart_Success_Message = By.xpath("//div[text()=\"Product added to cart successfully\"]");
		
		public final static By First_Name_Textbox = By.xpath("//input[@data-qa-id=\"First name\"]");
		public final static By Last_Name_Textbox = By.xpath("//input[@data-qa-id=\"Last name\"]");
		public final static By Email_Textbox = By.xpath("//input[@data-qa-id=\"Email address\"]");
		public final static By Country_Dropdown = By.xpath("//span[@role=\"presentation\"]");
		public final static By Country_SearchBox = By.xpath("//input[@class=\"select2-search__field\"]");
		public final static By India_Option = By.xpath("//li[text()='India']");
		
	}
	
	public static class LogoutPage{
		
		public final static By Logout_Option = By.xpath("(//span[text()='Logout'])[1]");
		public final static By Profile_Dropdown = By.xpath("(//i[@class=\"di fa fa-angle-down\"])[48]");
	}

}