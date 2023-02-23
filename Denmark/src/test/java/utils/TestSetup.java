package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManger;
	
	public TestSetup() {
		pageObjectManger=new PageObjectManager(driver);
	}

}
