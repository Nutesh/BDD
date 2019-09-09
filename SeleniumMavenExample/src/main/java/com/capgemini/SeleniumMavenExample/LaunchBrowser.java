package com.capgemini.SeleniumMavenExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowser {

	
	 WebDriver driver;

	 @BeforeMethod
	 public void setup(){
	
		 System.setProperty("webdriver.chrome.driver", "mydriver//chromedriver.exe");
		 driver=new ChromeDriver();		   
	 
	 
	 }
	 @Test
	 public void startBrowser() throws InterruptedException{
		 
		 driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=jutzWtpVhcTzB8vXl5AN");
	
		 Thread.sleep(5000);
		 
		 driver.quit();

	 }




}
