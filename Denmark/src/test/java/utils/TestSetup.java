package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {
	
	public WebDriver driver;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	
	public TestSetup() {
		testBase=new TestBase();		
		pageObjectManager=new PageObjectManager(testBase.webDriverManager());
	}

}
