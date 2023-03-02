package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\java\\features", glue="\\stedDefinations", 
tags="@Order_001"
)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
