package com.capgemini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartBrowserTestCase {
 
	 WebDriver driver;
	
	 @BeforeMethod
	 public void getResources(){
		 
		 System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		 
		 driver=new ChromeDriver();
	
	   }
	 
	 @Test
	 public void launch(){
		 
		  driver.get("http://spicejet.com/");

	 
	 }
	 
	 @AfterMethod
	 public void relaseResources(){
		 
		 if(driver!=null){
			 
			   driver.close();
			 
		 }
		 
	 }
	 



}
