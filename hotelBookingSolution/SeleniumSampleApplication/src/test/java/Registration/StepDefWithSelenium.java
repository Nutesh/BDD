package Registration;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefWithSelenium {
	private WebDriver driver;

	@Given("^User is on registration page$")
	public void user_is_on_registration_page() throws Throwable {

		driver = new FirefoxDriver();
		driver.get("file:///D:/BDD/sampleapplication.html/");
	}

	@When("^user enters valid username, valid password and matching confirmPassword$")
	public void user_enters_valid_username_valid_password_and_matching_confirmPassword() throws Throwable {
		try {

			//Find Username textbox and enter value
			driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
			Thread.sleep(3000);
			
			//Find Password textbox and enter value
			driver.findElement(By.name("txtPwd")).sendKeys("igate");
			Thread.sleep(3000);

			//Find Confirm Password textbox and enter value
			driver.findElement(By.className("Format")).sendKeys("igate");
			Thread.sleep(3000);
			}
		catch(Exception e) 
		{
			System.out.print("some exception");
		}
		driver.findElement(By.name("submit")).click();
	}

	@Then("^Message displayed 'Registration Successful'$")
	public void message_displayed_Registration_Successful() throws Throwable {
		String currUrl = driver.getCurrentUrl();
		System.out.print("******END*****"+currUrl);
		

	}

}
