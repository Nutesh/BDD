package com.capgemini;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocateElements {

	
	  CaloriePage caloriePage;
	 
	WebDriver driver;
	 
    @BeforeMethod
    public void setup(){
   	 
              System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
              driver=new ChromeDriver();
              driver.get("http://www.calculator.net/bmi-calculator.html");
              driver.manage().window().maximize();
              
              caloriePage=new CaloriePage(driver);
              
              
	}
	 @Test
	 public void locate(){
		 
	
		  caloriePage.caloriesEntries();
		   
	 	 
	 
	 
	 
	 }


	 public void relaseResources(){
		 
		      if(driver!=null){
		    	  
		    	  driver.quit();
		    	  
		      }
		 
	 }
	 
	 



}
