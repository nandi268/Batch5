package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public HomePage homePage;
	public CartPage cartPage;
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public HomePage getHomePageObject(){
		homePage=new HomePage(driver);
		return homePage;
	}
	
	public CartPage getcartPageObject(){
		cartPage=new CartPage(driver);
		return cartPage;
	}
}
