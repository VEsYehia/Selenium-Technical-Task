package CreateNewAccountUser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;

public class UserRegestration {

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
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@And("^enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\"$")
	public void enter(String firstName, String lastName, String password, String address, String city, String state,
			String postalCode, String mobilePhone, String addressAlias) throws Throwable {

		new RegisterPage(driver).userFillRegistrationData(firstName, lastName, password, address, city, state,
				postalCode, mobilePhone, addressAlias);

	}

	@Then("^user account page is displayed succesfully$")
	public void user_account_page_is_displayed_succesfully() throws Throwable {

		Assert.assertTrue(driver.getTitle().contains("My account"));
		new MyAccountPage(driver).userCanLogout();

	}
	
	@Then("^this email address has already been registered so appear \"([^\"]*)\"$")
	public void this_email_address_has_already_been_registered_so_appear(String ErrorMessage) throws Throwable {
		String message=new AuthenticationPage(driver).getextforerrormessageforaleadyexistemail();
		System.out.print(message);
		Assert.assertTrue(new AuthenticationPage(driver).getextforerrormessageforaleadyexistemail().contains(ErrorMessage));
	}  



	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
