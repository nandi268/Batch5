package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver webDriverManager() {

		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Batch5\\Denmark\\src\\test\\java\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}		

		return driver;


	}
}


