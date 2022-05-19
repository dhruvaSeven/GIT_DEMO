package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features"
		,glue="stepDefinitions",tags="not @Smoke",dryRun=true,monochrome=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
