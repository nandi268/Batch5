package stedDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.CartPage;
import pageObjects.PageObjectManager;
import utils.TestSetup;

public class CartstepDefinations {

	public WebDriver driver;
	TestSetup testSetup;

	public CartstepDefinations(TestSetup testSetup) {
		this.testSetup = testSetup;
	}

	@Then("Verify the product is added to the cart")
	public void verify_the_product_is_added_to_the_cart() throws InterruptedException {
		Thread.sleep(7000);
//		CartPage  cartpage=new CartPage(testSetup.driver);
//		String actualProductName=cartpage.getProductName();
		CartPage cartpage1 = testSetup.pageObjectManager.getCartPage();
		String actualProductName1 = cartpage1.getProductName();
//		String productName=testSetup.driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]")).getText();
		System.out.println("Product name is " + actualProductName1);
		testSetup.driver.quit();
	}

}
