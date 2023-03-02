package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
	public WebDriver driver;
	public OrderPage(WebDriver driver){
		this.driver=driver;
	}
	
By placeOrder=By.xpath("//*[text()='Place Order']");

public void clickPlaceOrder(){
	driver.findElement(placeOrder).click();
}

By termandCnditions=By.xpath("//input[@class='chkAgree']");

public void clickCheckBoxTermsandConditions() {
	driver.findElement(termandCnditions).click();
}

By proceed=By.xpath("//button[text()='Proceed']");

public void clickOnProceedButton() {
	driver.findElement(proceed).click();
}

By success=By.xpath("//*[contains(text(),'Thank you, your order has been placed successfully')]");


public boolean isSuccessIsDisplayed() {
	return driver.findElement(success).isDisplayed();
}
	
}
