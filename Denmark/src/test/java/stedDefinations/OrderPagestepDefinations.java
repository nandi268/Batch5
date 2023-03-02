package stedDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.OrderPage;
import utils.TestSetup;

public class OrderPagestepDefinations {
	
	public WebDriver driver;
	TestSetup testSetup;
	OrderPage orderPage;

	public OrderPagestepDefinations(TestSetup testSetup) {
		this.testSetup = testSetup;
		this.orderPage = testSetup.pageObjectManager.getOrderPage();	}
	
	
	@Then("Place the order")
	public void place_the_order() throws InterruptedException {
		orderPage.clickPlaceOrder();
		Thread.sleep(5000);
	}
	@Then("Select the Term & Conditions")
	public void select_the_term_conditions() throws InterruptedException {
		orderPage.clickCheckBoxTermsandConditions();
		Thread.sleep(5000);
	}
	@Then("Proceed to place the order")
	public void proceed_to_place_the_order() {
		orderPage.clickOnProceedButton();
	}
	@Then("Verify order is success")
	public void verify_order_is_success() {
		boolean success = orderPage.isSuccessIsDisplayed();
		
		/*
		 * if(success==true) { System.out.println("Test is pass"); } else {
		 * System.out.println("Test is fail"); }
		 */
		
		Assert.assertTrue(success, "Order is not success: Failed");
	}
	


}
