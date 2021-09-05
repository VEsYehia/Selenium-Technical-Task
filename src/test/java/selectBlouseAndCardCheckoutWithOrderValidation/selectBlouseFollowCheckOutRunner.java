package selectBlouseAndCardCheckoutWithOrderValidation;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;




@CucumberOptions(features = "src/test/java/selectBlouseAndCardCheckoutWithOrderValidation/",
glue = {"selectBlouseAndCardCheckoutWithOrderValidation" },
plugin = { "pretty", "html:target/cucumber-html-report" },
tags = { "~@NotRun" })

public class selectBlouseFollowCheckOutRunner extends AbstractTestNGCucumberTests {


	
	@Test
	public void f() {

	}

}
