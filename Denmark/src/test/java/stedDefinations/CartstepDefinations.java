package stedDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import utils.TestSetup;

public class CartstepDefinations {

	public WebDriver driver;
    public TestSetup testSetup;
	public CartstepDefinations(TestSetup testSetup){
		this.testSetup=testSetup;
	}
	
	@Then("Verify the product is added to the cart")
	public void verify_the_product_is_added_to_the_cart() throws InterruptedException {
		Thread.sleep(5000);		
		String productName=testSetup.driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]")).getText();
		System.out.println("Product name is " + productName);
	}

}
