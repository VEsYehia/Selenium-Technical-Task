package CreateNewAccountUser;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/java/CreateNewAccountUser/UserRegisteration.feature", 
glue = {"CreateNewAccountUser" },
plugin = { "pretty", "html:target/cucumber-html-report" },
tags = { "~@NotRun" })

public class UserRegestrationRunner extends AbstractTestNGCucumberTests {

	@Test
	public void f() {

	}

}
