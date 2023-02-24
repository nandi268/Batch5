package stedDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePagestepDefiantion {
	public WebDriver driver;
	
	@Given("Open the homepage")
	public void open_the_homepage() {
		 System.out.println("I am launch the webpage");	    
		    System.setProperty("webdriver.chrome.driver", "C:\\Batch5\\uk\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}
	@When("Search the product {string}")
	public void search_the_product(String string) throws InterruptedException {
		System.out.println("I am search the product");
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//input[@type='search454545']")).sendKeys("Tomato");
		
	}
	@Then("Verify the product is displayed")
	public void verify_the_product_is_displayed() {
	}

}
