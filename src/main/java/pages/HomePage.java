package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private  WebDriver driver;

	//Constructor
	public HomePage(WebDriver driver){

		this.driver=driver;
	}
	
	
	
	//element locators

	private By signin_link=By.className("login");
	

	// methods/actions/keywords
	
	public void navigate() {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	public void clickOnSignInLink()
	{
			driver.findElement(signin_link).click();
		
	}


	

}
