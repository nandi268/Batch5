package stedDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import utils.TestSetup;

public class HomepagestepDefinations {
	public WebDriver driver;
     TestSetup testSetup;
    public PageObjectManager pageObjectManager;
	public HomepagestepDefinations(TestSetup testSetup){
		this.testSetup=testSetup;
	}	
	@Given("Launch the webpage")
	public void launch_the_webpage() {
	    System.out.println("I am launch the webpage");	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Batch5\\uk\\src\\test\\resources\\chromedriver.exe");
	    testSetup.driver = new ChromeDriver();
	    testSetup.driver.manage().window().maximize();
	    testSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    testSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));		
	}	
	@When("Search the tomoato")
	public void search_the_tomoato() throws InterruptedException {
		 System.out.println("I am search the product");
		 Thread.sleep(10000);		
		 testSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tomato");
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
		testSetup.driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
	
	 @And("^Open the cart window$")
	    public void open_the_cart_window() throws Throwable {
		 Thread.sleep(6000);
		 testSetup.driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		 Thread.sleep(6000);
//		String productName=driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]")).getText();
//		System.out.println("Product name is " + productName);
	    }


}
