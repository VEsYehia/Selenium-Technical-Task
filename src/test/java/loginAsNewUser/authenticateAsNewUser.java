package loginAsNewUser;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;

public class authenticateAsNewUser {

	private WebDriver driver;
	
	@Before
	public void MainSetupForBrowserAndWebsite() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new HomePage(driver).navigate();
	}
	@Given("^user press on signin icon and be on Authentication Page$")
	public void user_press_on_signin_icon_and_be_on_Authentication_Page() throws Throwable {
		new HomePage(driver).clickOnSignInLink();
	}

	@When("^user fill required registeration data \"([^\"]*)\"and click on create account$")
	public void user_fill_required_registeration_data_and_click_on_create_account(String email) throws Throwable {
		new AuthenticationPage(driver).enterEmailToRegister(email);
		new AuthenticationPage(driver).clickOnCreateAccountButton();
	}

	@And("^enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\"$")
	public void enter(String firstName, String lastName, String password, String address, String city, String state, String postalCode, String mobilePhone, String addressAlias) throws Throwable {
		new RegisterPage(driver).userFillRegistrationData(firstName, lastName, password, address, city, state,
				postalCode, mobilePhone, addressAlias);  
		new MyAccountPage(driver).userCanLogout();
	}

	@Then("^user login with his registerd credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_with_his_registerd_credentials(String email, String password) throws Throwable {
		new AuthenticationPage(driver).userCanSignIn(email, password);
	}

	@And("^user account page is displayed succesfully$")
	public void user_account_page_is_displayed_succesfully() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("My account"));
	}


	@Then("^appear \"([^\"]*)\" as password wrong$")
	public void appear_as_password_wrong(String errormessage) throws Throwable {
	 assertEquals(new AuthenticationPage(driver).getextforregestrationerrormessage(), errormessage );
	}

	@When("^user login with his registerd credentials \"([^\"]*)\" only$")
	public void user_login_with_his_registerd_credentials_only(String email) throws Throwable {
		new AuthenticationPage(driver).enterEmailToLogin(email);
		new AuthenticationPage(driver).clickOnSignInButton();

	}

	@Then("^appear \"([^\"]*)\" as missing password field$")
	public void appear_as_missing_password_field(String errormessage) throws Throwable {
		 assertEquals(new AuthenticationPage(driver).getextforregestrationerrormessage(), errormessage );

	}
	
	

	@When("^user login with his registerd  \"([^\"]*)\" and forget to enter email$")
	public void user_login_with_his_registerd_and_forget_to_enter_email(String password) throws Throwable {
		new AuthenticationPage(driver).enterPasswordToLogin(password);
		new AuthenticationPage(driver).clickOnSignInButton();
	}

	@Then("^appear \"([^\"]*)\" as missing email field$")
	public void appear_as_missing_email_field(String errormessage) throws Throwable {
		 assertEquals(new AuthenticationPage(driver).getextforregestrationerrormessage(), errormessage );

	}
	

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}


