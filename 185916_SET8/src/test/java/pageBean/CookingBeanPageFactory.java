package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CookingBeanPageFactory {
WebDriver driver;

@FindBy(how=How.NAME,using="fname")
@CacheLookup
WebElement firstName;

@FindBy(how=How.NAME,using="lname")
@CacheLookup
WebElement lastName;

@FindBy(how=How.NAME,using="email")
@CacheLookup
WebElement emailId;

@FindBy(how=How.NAME,using="mobile")
@CacheLookup
WebElement mobileNumber;

@FindBy(how=How.NAME, using="D6")
@CacheLookup
WebElement recipeCategory;

@FindBy(how=How.NAME, using="D5")
@CacheLookup
WebElement city;

@FindBy(how=How.NAME, using="D4")
@CacheLookup
WebElement learningMode;

@FindBy(how=How.NAME, using="D10")
@CacheLookup
WebElement courseDuration;


@FindBy(how=How.NAME, using="enqdetails")
@CacheLookup
WebElement enquiryTextBox;

@FindBy(how=How.ID, using="Submit1")
@CacheLookup
WebElement submitButton;

public CookingBeanPageFactory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public WebElement getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName.sendKeys(firstName);
}

public WebElement getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName.sendKeys(lastName);
}

public WebElement getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId.sendKeys(emailId);;
}

public WebElement getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber.sendKeys(mobileNumber);;
}

public WebElement getRecipeCategory() {
	return recipeCategory;
}

public void setRecipeCategory(String recipeCategory) {
	this.recipeCategory.sendKeys(recipeCategory);;
}

public WebElement getCity() {
	return city;
}

public void setCity(String city) {
	this.city.sendKeys(city);;
}

public WebElement getLearningMode() {
	return learningMode;
}

public void setLearningMode(String learningMode) {
	this.learningMode.sendKeys(learningMode);;
}

public WebElement getCourseDuration() {
	return courseDuration;
}

public void setCourseDuration(String courseDuration) {
	this.courseDuration.sendKeys(courseDuration);
}

public WebElement getEnquiryTextBox() {
	return enquiryTextBox;
}

public void setEnquiryTextBox(String enquiryTextBox) {
	this.enquiryTextBox.sendKeys(enquiryTextBox);;
}

public WebElement getSubmitButton() {
	return submitButton;
}

public void setSubmitButton() {
	this.submitButton.click();
}
}
