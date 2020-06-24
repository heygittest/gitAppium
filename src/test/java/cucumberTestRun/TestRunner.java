package cucumberTestRun;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//tu run with junit
/*@RunWith(Cucumber.class)
	@CucumberOptions(
	                  features ="src/test/java/features",
	                  glue = "stepDefination")
	                  public class TestRunner {}
	                  */
//to run in test ng
@CucumberOptions(
        features ="src/test/java/features",
        glue = "stepDefination")
	public class TestRunner extends AbstractTestNGCucumberTests {
		
}
