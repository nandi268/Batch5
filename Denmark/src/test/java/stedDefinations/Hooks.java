package stedDefinations;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestSetup;

public class Hooks {
	
	TestSetup testSetup;
	public Hooks(TestSetup testSetup){
		this.testSetup=testSetup;
	}
	
	
	@After
	public void quiteDriver() throws IOException{
		testSetup.testBase.webDriverManager().quit();
	}
	

}
