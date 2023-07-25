package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public HomePage homePage;
	public CartPage cartPage;
	public OrderPage orderPage;
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public HomePage getHomePage(){
		HomePage homePage=new HomePage(driver);
		return homePage;
	}
	
	public CartPage getCartPage(){
		CartPage cartPage=new CartPage(driver);
		return cartPage;
	}
	
	public OrderPage getOrderPage(){
		OrderPage orderPage=new OrderPage(driver);
		return orderPage;
	}
}
