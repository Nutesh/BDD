package cookingPage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.CookingBeanPageFactory;

public class CookingStepDefinition {
private WebDriver driver;
private CookingBeanPageFactory cookingPageFactory;
//Loading Driver using cucumber hook
@Before
public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:/Users/rulingam/Desktop/BDD Testing/chromedriver/chromedriver.exe" );
	driver= new ChromeDriver();
}
//Making the scenarios wait for 10seconds
@Before
public void waitscenario() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
}

@Given("^User is on 'Enquiry Form' Page$")
public void user_is_on_Enquiry_Form_Page() throws Throwable {
   driver.get("C:\\Users\\rulingam\\Downloads\\185916_SET8\\Recipe_class_registration.html");
   cookingPageFactory=new CookingBeanPageFactory(driver);
}

@Then("^'Verifying the title of page'$")
public void verifying_the_title_of_page() throws Throwable {
	String expectedMessage="Online Cooking Class Enquiry Form";
	String actualMessage=driver.getTitle();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.close();
}

@Then("^'Verifying the Text on page'$")
public void verifying_the_Text_on_page() throws Throwable {
	String bodyText = driver.findElement(By.tagName("body")).getText();
	Assert.assertTrue("Text not found!", bodyText.contains("Online Cooking School"));
	driver.close();
   }

@When("^User clicks 'Download our Recipe class Brochure' button$")
public void user_clicks_Download_our_Recipe_class_Brochure_button() throws Throwable {
	driver.findElement(By.linkText("Download our Recipe class Brochure")).click();
}

@Then("^verify the text 'Recipe class Brochure is sent to your registered mail id' on page$")
public void verify_the_text_Recipe_class_Brochure_is_sent_to_your_registered_mail_id_on_page() throws Throwable {
	String bodyText=driver.findElement(By.tagName("body")).getText();
	Assert.assertTrue("Text not found!", bodyText.contains("Recipe class Brochure is sent to your registered mail id"));
   }

@Given("^User is on 'message' Page$")
public void user_is_on_message_Page() throws Throwable {
	driver.get("C:\\Users\\rulingam\\Downloads\\185916_SET8\\msg.html");
   }

@When("^user clicks 'Go Back to Registration' button$")
public void user_clicks_Go_Back_to_Registration_button() throws Throwable {
	driver.findElement(By.linkText("Go Back to Registration")).click();
   }

@Then("^displays 'Enquiry Form' Page$")
public void displays_Enquiry_Form_Page() throws Throwable {
	String expectedMessage="Online Cooking Class Enquiry Form";
	String actualMessage=driver.getTitle();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.close();
   }

@When("^user enters invalid first name$")
public void user_enters_invalid_first_name() throws Throwable {
	cookingPageFactory.setFirstName("");
	cookingPageFactory.setSubmitButton();
   }

@Then("^displays 'First Name must be filled out'$")
public void displays_First_Name_must_be_filled_out() throws Throwable {
	String expectedMessage="First Name must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
   }

@When("^user enters invalid last name$")
public void user_enters_invalid_last_name() throws Throwable {
	cookingPageFactory.setFirstName("sai");
	cookingPageFactory.setLastName("");
	cookingPageFactory.setSubmitButton();
   }

@Then("^displays 'Last Name must be filled out'$")
public void displays_Last_Name_must_be_filled_out() throws Throwable {
	String expectedMessage="Last Name must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
   }

@When("^user enters alphabetic Mobile Number$")
public void user_enters_alphabetic_Mobile_Number() throws Throwable {
	cookingPageFactory.setFirstName("sai");
	cookingPageFactory.setLastName("Venkat");
	cookingPageFactory.setMobileNumber("abcde");
	cookingPageFactory.setSubmitButton();
   }

@Then("^displays 'Enter numeric value'$")
public void displays_Enter_numeric_value() throws Throwable {
	String expectedMessage="Enter numeric value";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
   }

@When("^user enters Invalid Mobile Number$")
public void user_enters_Invalid_Mobile_Number() throws Throwable {
	cookingPageFactory.setFirstName("sai");
	cookingPageFactory.setLastName("Venkat");
	cookingPageFactory.setMobileNumber("48458");
	cookingPageFactory.setSubmitButton();
   }

@Then("^displays 'Enter ten digit Mobile number'$")
public void displays_Enter_ten_digit_Mobile_number() throws Throwable {
	String expectedMessage="Enter 10 digit Mobile number";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
   }

@When("^user clicks 'Enquire Now!!!' button$")
public void user_clicks_Enquire_Now_button() throws Throwable {
	cookingPageFactory.setFirstName("sai");
	cookingPageFactory.setLastName("Venkat");
	cookingPageFactory.setEmailId("sai@gmail.com");
	cookingPageFactory.setMobileNumber("8686853104");
	cookingPageFactory.setRecipeCategory("Non-Veg");
	cookingPageFactory.setCity("Mumbai");
	cookingPageFactory.setLearningMode("In house training");
	cookingPageFactory.setCourseDuration("6 months");
	cookingPageFactory.setSubmitButton();
   }

@Then("^displays 'Enquiry details must be filled out'$")
public void displays_Enquiry_details_must_be_filled_out() throws Throwable {
	String expectedMessage="Enquiry details must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
   }
@When("^user clicks 'Enquire Now1!!!' button$")
public void user_clicks_Enquire_Now1_button() throws Throwable {
	cookingPageFactory.setFirstName("sai");
	cookingPageFactory.setLastName("Venkat");
	cookingPageFactory.setEmailId("sai@gmail.com");
	cookingPageFactory.setMobileNumber("8686853104");
	cookingPageFactory.setRecipeCategory("Non-Veg");
	cookingPageFactory.setCity("Mumbai");
	cookingPageFactory.setLearningMode("In house training");
	cookingPageFactory.setCourseDuration("6 months");
	cookingPageFactory.setEnquiryTextBox("Info");
	cookingPageFactory.setSubmitButton();
   }

@Then("^displays 'Thank you for submitting the online recipe class Enquiry'$")
public void displays_Thank_you_for_submitting_the_online_recipe_class_Enquiry() throws Throwable {
	String expectedMessage="Thank you for submitting the online recipe class Enquiry";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
   }

@When("^user clicks 'Alert box message'$")
public void user_clicks_Alert_box_message() throws Throwable {
	driver.switchTo().alert().accept();
   }

@Then("^displays 'Our location representative will contact you soon'$")
public void displays_Our_location_representative_will_contact_you_soon() throws Throwable {
	String bodyText=driver.findElement(By.tagName("body")).getText();
	Assert.assertTrue("Text not found!", bodyText.contains("Our location representative will contact you soon."));
   }

}
