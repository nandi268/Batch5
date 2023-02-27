package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String qaurl = prop.getProperty("qaurl");
		String browser = prop.getProperty("browser");
		System.out.println(browser);

		if (driver == null) {

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser == "firefox") {
				// firefox
			}
			if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\\\msedgedriver.exe");
				driver = new EdgeDriver();
			}

			driver.get(qaurl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		return driver;

	}
}
