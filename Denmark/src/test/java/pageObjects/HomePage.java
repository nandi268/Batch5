package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}

By	searchProduct1=By.xpath("//input[@type='search']");

public void searchProduct(String productName){
	driver.findElement(searchProduct1).sendKeys(productName);
}
	
By productName=By.cssSelector("h4.product-name");
	
	public String getProductName(){
	return	driver.findElement(productName).getText();
	}
	
	By addToCart=By.xpath("//button[text()='ADD TO CART']");
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	
	By openCart=By.xpath("//*[@alt='Cart']");
	
	public void openCartPage() {
		driver.findElement(openCart).click();
	}
	
	By noProducts=By.xpath("//*[text()='Sorry, no products matched your search!']");
	
	public boolean isProductDisplayed(){
		
		return driver.findElement(noProducts).isDisplayed();
		
	}
	
	By increment=By.xpath("//*[@class='increment']");
	public void clickOnIncrementButton(int a) throws InterruptedException {
		for(int i=0; i<a; i++) {
			driver.findElement(increment).click();
			 Thread.sleep(5000);
		}		
	}
	
	By decrement=By.xpath("//*[@class='decrement']");
	public void clickOnDecrementButton(int a) throws InterruptedException {
		for(int i=0; i<a; i++) {
			driver.findElement(decrement).click();
			 Thread.sleep(5000);
		}		
	}
}
