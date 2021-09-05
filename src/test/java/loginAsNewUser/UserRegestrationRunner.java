package loginAsNewUser;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


@CucumberOptions(features = "src/test/java/loginAsNewUser/LoginAuthentication.feature",
glue = {"loginAsNewUser" },
plugin = { "pretty", "html:target/cucumber-html-report" },
tags = { "~@NotRun" })

public class UserRegestrationRunner extends AbstractTestNGCucumberTests {


	
	@Test
	public void f() {

	}

}
