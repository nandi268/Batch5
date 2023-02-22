package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\java\\features", glue="\\stedDefinations", tags="@Home2"
)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
