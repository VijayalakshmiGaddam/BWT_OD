package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static web.locators.ODWebLocators.ShopPage.*;
import org.openqa.selenium.support.ui.Select;

import od.utilities.Web;
import web.tests.BaseTest;

public class ShopPage extends BaseTest {
	
	public ShopPage() {

	}
	
	public ShopPage ClickOn_Shop_Option(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Shop_Option)).click();
		return this;
	}
	
	public ShopPage HoverOn_ShowDetails_Button(){
		//Web.wait.until(ExpectedConditions.presenceOfElementLocated(Shop_Show_Details_Button)).isDisplayed();
		Web.getBrowser().DoMouseOver_And_Click(Shop_Show_Details_Button);
		return this;
	}
	
	public ShopPage ClickOn_ShowDetails_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Shop_Show_Details_Button)).isDisplayed();
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Shop_Show_Details_Button)).click();
		Thread.sleep(5000);
		return this;
	}

	public ShopPage ClickOn_Product_AddToCart_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Product_Add_To_Cart_Button)).click();
		return this;
	}

	public ShopPage ClickOn_ViewCart_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Shop_View_Cart_Button)).click();
		Thread.sleep(5000);
		Web.wait.until(ExpectedConditions.visibilityOfElementLocated(Cart_Title)).isDisplayed();
		return this;
	}
	
	public ShopPage ClickOn_ProceedToCheckout_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Cart_Proceed_To_Checkout_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_ProceedToPaypal_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Proceed_To_Paypal_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_CreditCard_RadioButton() throws InterruptedException{
		Thread.sleep(2000);
		Web.wait.until(ExpectedConditions.elementToBeClickable(Credit_Card_Radio_Button)).click();
		Thread.sleep(2000);
		return this;
	}
	
	public ShopPage Enter_CardDetails(String carddetails) throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).click();
//		 char[] ch = carddetails.toCharArray();
//	        for(char c : ch) {
//	            Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).sendKeys(Character.toString(c));
//	        }
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).sendKeys(carddetails);
		Thread.sleep(2000);
		return this;
	}
	
	public ShopPage Enter_Credit_Or_Debit_CardNumber(String cardnumber) throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Number_Textbox)).sendKeys(cardnumber);
		Thread.sleep(2000);
		return this;
	}
	
	public ShopPage Enter_ExpireDate(String expiredate){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_ExpireDate)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_ExpireDate)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_ExpireDate)).sendKeys(expiredate);
		return this;
	}
	
	public ShopPage Enter_CVC_Numeber(String cvc){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_CVC)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_CVC)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_CVC)).sendKeys(cvc);
		return this;
	}
	
	public ShopPage ClickOn_Terms_And_Conditions_Checkbox(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Terms_And_Conditions_Checkbox)).click();
		return this;
	}
	
	public ShopPage ClickOn_PlaceOrder_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Credit_Card_Place_Order_Button)).click();
		Thread.sleep(6000);
		return this;
	}
	
	public ShopPage Enter_Product_Name(String product){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Search_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Search_Textbox)).sendKeys(product);
		return this;
	}
	
	public ShopPage ClickOn_Search_Button() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Search_Button)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage Enter_ProductName(String product){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Footer_Search_Textbox)).clear();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Footer_Search_Textbox)).sendKeys(product);
		return this;
	}
	
	public ShopPage ClickOn_Search_Icon() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Footer_Search_Icon)).click();
		Thread.sleep(5000);
		return this;
	}

	public ShopPage ClickOn_Sorting_Dropdown() {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Shop_Sorting_Dropdown)).click();
		return this;
	}
	
	public ShopPage Select_Option_From_Dropdown() throws InterruptedException {
		WebElement element = offLoadDigital.findElement(By.xpath("//select[@name=\"orderby\"]"));
		Select select = new Select(element);
		select.selectByVisibleText("Sort by latest");
		Thread.sleep(5000);
        return this;
	}
	
	public ShopPage ClickOn_Cart_DeleteIcon() throws InterruptedException{
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Cart_Delete_Icon)).isDisplayed();
		Actions actions = new Actions(offLoadDigital);
		WebElement element = offLoadDigital.findElement(Cart_Delete_Icon);
		actions.moveToElement(element).click().build().perform();
		//Web.wait.until(ExpectedConditions.elementToBeClickable(Cart_Delete_Icon)).click();
		Thread.sleep(8000);
		return this;
	}
	
	public ShopPage Displayed_Removed_Success_Message() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Cart_Removed_Success_Message)).isDisplayed();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage ClickOn_ReturnToShop_Link() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Cart_ReturnToShop_Link)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Cart_ReturnToShop_Link)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage ClickOn_Undo_Button() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Cart_Undo_Button)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Cart_Undo_Button)).click();
		Thread.sleep(8000);
		return this;
	}
	
	public ShopPage ClickOn_Quantity_Increment_Button() {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(QuantityIncrement_Button)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(QuantityIncrement_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_Quantity_Decrement_Button() {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(QuantityDecrement_Button)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(QuantityDecrement_Button)).click();
		return this;
	}
	
	public ShopPage Displayed_Cart_Updated_Success_Message() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Cart_Updated_Success_Message)).isDisplayed();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage ClickOn_UpdateCart_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Update_Cart_Button)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Update_Cart_Button)).click();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage ClickOn_QuickView_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Quick_View_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_QuickView_AddToCart_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(QuickView_ADDTOCart_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_QuickView_ViewCart_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(QuickView_ViewCart_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_QuickView_BuyNow_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(QuickView_BuyNow_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_Checkout_ViewCart_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Checkout_ViewCart_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_Shop_BuyNow_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Shop_BuyNow_Button)).click();
		Thread.sleep(7000);
		return this;
	}
	
	public ShopPage Enter_Paypal_Username(String paypaluser){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Email_Or_Mobile_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Email_Or_Mobile_Textbox)).clear();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Email_Or_Mobile_Textbox)).sendKeys(paypaluser);
		return this;
	}
	
	public ShopPage Enter_Paypal_Password(String paypalpassword){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Password_Textbox)).click();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Password_Textbox)).sendKeys(paypalpassword);
		return this;
	}
	
	public ShopPage ClickOn_Paypal_Login_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Login_Button)).click();
		Thread.sleep(8000);
		return this;
	}
	
	public ShopPage ClickOn_Paypal_Continue_Button(){
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Paypal_Continue_Button)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Continue_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_PayNow_Button() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_PayNow_Button)).click();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage Displayed_DoneIcon() throws InterruptedException{
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Paypal_Payment_Done_Icon)).isDisplayed();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage ClickOn_Paypal_Raido_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Radio_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_AcceptCookies_Button(){
		Web.wait.until(ExpectedConditions.elementToBeClickable(Paypal_Accept_Cookies_Button)).click();
		return this;
	}
	
	public ShopPage ClickOn_Saved_Payment_Text() throws InterruptedException{
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Saved_Payment_Method_Text)).isDisplayed();
		Thread.sleep(2000);
		Web.wait.until(ExpectedConditions.elementToBeClickable(Saved_Payment_Method_Text)).click();
		return this;
	}
	
	public ShopPage Displayed_Card_Payment_ThankYou_Message() throws InterruptedException{
		Web.wait.until(ExpectedConditions.elementToBeClickable(Card_Payment_ThankYou_Message)).isDisplayed();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage ClickOn_AddToWishlist_Link() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Product_AddToWishlist_Link)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Product_AddToWishlist_Link)).click();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage ClickOn_Browse_Wishlist_Link() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Product_Browse_Wishlist_Link)).isDisplayed();
		Web.wait.until(ExpectedConditions.elementToBeClickable(Product_Browse_Wishlist_Link)).click();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage ClickOn_Wishlist_Delete_Icon() throws InterruptedException {
		Web.wait.until(ExpectedConditions.presenceOfElementLocated(Wishlist_Delete_Icon)).isDisplayed();
		Actions actions = new Actions(offLoadDigital);
		WebElement element = offLoadDigital.findElement(Wishlist_Delete_Icon);
		actions.moveToElement(element).click().build().perform();
		//Web.wait.until(ExpectedConditions.elementToBeClickable(Wishlist_Delete_Icon)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage ClickOn_Wishlist_Remove_Link() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Wishlist_Remove_Link)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage ClickOn_Wishlist_AddToCart_Button() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Wishlist_AddToCart_Button)).click();
		Thread.sleep(5000);
		return this;
	}
	
	public ShopPage Displayed_Wishlist_AddToCart_Success_Message() throws InterruptedException {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Wishlist_AddToCart_Success_Message)).isDisplayed();
		Thread.sleep(3000);
		return this;
	}
	
	public ShopPage Displayed_Deleted_Success_Message() {
		Web.wait.until(ExpectedConditions.elementToBeClickable(Wishlist_Removed_Success_Message)).click();
		return this;
	}
}