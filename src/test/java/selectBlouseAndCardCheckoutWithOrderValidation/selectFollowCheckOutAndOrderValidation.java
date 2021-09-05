package selectBlouseAndCardCheckoutWithOrderValidation;

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
import pages.BlousesPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.OrderHistoryPage;
import pages.OrderPage;

public class selectFollowCheckOutAndOrderValidation {

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

	@And("^user login with his registerd credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_with_his_registerd_credentials(String email, String password) throws Throwable {
		new AuthenticationPage(driver).userCanSignIn(email, password);

	}

	@When("^user select \"([^\"]*)\" to buy with specific criteria \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_to_buy_with_specific_criteria_and(String item, String size, String colour)
			throws Throwable {
		if (item.equals("Blouse"))
			new MyAccountPage(driver).selectBlouse();
		new BlousesPage(driver).AddItemToCart(size, colour);

	}

	@When("^user proceed to checkout with specific \"([^\"]*)\"$")
	public void user_proceed_to_checkout_with_specific(String paymentMethod) throws Throwable {

		new OrderPage(driver).productCheckoutToPlaceOrder();
	}

	@Then("^order placed successfully and shown in order history Tab$")
	public void order_placed_successfully_and_shown_in_order_history_Tab() throws Throwable {

		Assert.assertEquals(new OrderPage(driver).getOrderConfirmationText(), "Your order on My Store is complete.");
		new OrderPage(driver).openOrderHistoryPage();
		new OrderHistoryPage(driver).openOrderDetails();
		Assert.assertEquals(new OrderHistoryPage(driver).getOrderDetails(), "Blouse - Color : White, Size : L");

	}

	@Given("^after user open site to buy clothes$")
	public void after_user_open_site_to_buy_clothes() throws Throwable {

	}

	@And("^user proceed to checkout and login with his registerd credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_proceed_to_checkout_and_login_with_his_registerd_credentials(String email, String password)
			throws Throwable {

		new OrderPage(driver).proceedToSummaryCheckout();
		new AuthenticationPage(driver).userCanSignIn(email, password);
	}

	@And("^user proceed to checkout after sign in  with specific \"([^\"]*)\"$")
	public void user_proceed_to_checkout_after_sign_in_with_specific(String arg1) throws Throwable {
		new OrderPage(driver).productCheckoutToPlaceOrderAfterSigninStep();
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
