package stedDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.TestSetup;

public class HomepagestepDefinations {
	public WebDriver driver;
	TestSetup testSetup;
	HomePage homePage;

	public HomepagestepDefinations(TestSetup testSetup) {
		this.testSetup = testSetup;
		this.homePage = testSetup.pageObjectManager.getHomePage();
	}

	@Given("Launch the webpage")
	public void launch_the_webpage() throws InterruptedException {
		System.out.println("I am launch the webpage");
		Thread.sleep(5000);
//		homePage.searchProduct("Totmat");	
	}

	@When("Search the tomoato")
	public void search_the_tomoato() throws InterruptedException {
		System.out.println("I am search the product");
		Thread.sleep(10000);
		homePage.searchProduct("Tomato");
	}

	@Then("Validate product is displayed")
	public void validate_product_is_displayed() throws InterruptedException {
		System.out.println("I am Validate product is displayed");
		Thread.sleep(5000);
		testSetup.driver.findElement(By.xpath("//button[text()='ADD TO CART']")).isDisplayed();
	}

	@When("Add the produc to the cart")
	public void add_the_produc_to_the_cart() throws InterruptedException {
		Thread.sleep(6000);
		homePage.addToCart();
	}

	@And("^Open the cart window$")
	public void open_the_cart_window() throws Throwable {
		Thread.sleep(6000);
		homePage.openCartPage();
		Thread.sleep(6000);

	}
	
	@When("Search the product {string}")
	public void search_the_product(String productName) throws InterruptedException {
	   System.out.println("Search the product" + productName); 
	   Thread.sleep(5000);
	   homePage.searchProduct(productName);
	   Thread.sleep(5000);
	}
	@Then("Verify product {string} is displayed")
	public void verify_product_is_displayed(String expectedproductName) {
		System.out.println("Validating the product is displayed" + expectedproductName );
	String  actualProductName=homePage.getProductName();
	System.out.println("Product Name is: " + actualProductName);
	
	Assert.assertEquals(actualProductName, expectedproductName, "Product Name is not matched");

	}
	
	
	
	@When("Increment the quantity\"{int}\"")
	public void increment_the_quantity(Integer int1) throws InterruptedException {
	    System.out.println(int1);	   
	    homePage.clickOnIncrementButton(int1);	    
	}
	
	@When("Decrement the quantity\"{int}\"")
	public void decrement_the_quantity(Integer int1) throws InterruptedException {
	    homePage.clickOnDecrementButton(int1);	    
	}
	
	@Then("Verify product is not displayed")
	public void verify_product_is_not_displayed() {
	   boolean product=homePage.isProductDisplayed();
	   
	   if(product==true) {
		   System.out.println("Pass");
	   }else {
		   System.out.println("Fail");
	   }
	}
	
	

}
