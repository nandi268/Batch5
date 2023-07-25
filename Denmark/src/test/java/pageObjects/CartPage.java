package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By productName=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]");
	
	public String  getProductName(){
		String name = driver.findElement(productName).getText();		
		return name;
	}
	
	By proceedToChecckout=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	public void proceedToCheckout() {
		driver.findElement(proceedToChecckout).click();
	}
}
