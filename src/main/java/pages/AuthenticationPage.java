package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

	private WebDriver driver;

	// Constructor
	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private By email_txt = By.id("email_create");
	private By create_account_btn = By.id("SubmitCreate");
	private By email_login_field = By.id("email");
	private By password_field = By.id("passwd");
	private By signin_btn = By.id("SubmitLogin");
	private By aleardyExistingEmailErroMessage = By.xpath("//*[@id=\"create_account_error\"]/ol/li");
	private By regestrationerrormessage = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
	
	
	// Methods

	public void userCanSignIn(String email, String password) {

		enterEmailToLogin(email);
		enterPasswordToLogin(password);
		clickOnSignInButton();
	}

	public void enterEmailToRegister(String email) {

		driver.findElement(email_txt).sendKeys(email);
	}

	public void clickOnCreateAccountButton() {

		driver.findElement(create_account_btn).click();
	}

	public String getextforerrormessageforaleadyexistemail() {
		return driver.findElement(aleardyExistingEmailErroMessage).getText();
	}
	
	public String getextforregestrationerrormessage () {
		return driver.findElement(regestrationerrormessage ).getText();
	}
	
	

	public void enterEmailToLogin(String email) {

		driver.findElement(email_login_field).sendKeys(email);
	}

	public void enterPasswordToLogin(String password) {

		driver.findElement(password_field).sendKeys(password);
	}

	public void clickOnSignInButton() {

		driver.findElement(signin_btn).click();
	}

}
