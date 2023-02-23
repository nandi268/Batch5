package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
By search=By.xpath("//input[@type='search']");
	
	public void searchProduct(String name) {
		driver.findElement(search).sendKeys(name);
	}
By productName=By.cssSelector("h4.product-name");
	
	public String getProductName(){
	return	driver.findElement(productName).getText();
	}
}
