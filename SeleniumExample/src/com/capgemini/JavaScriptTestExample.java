package com.capgemini;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptTestExample {

	   
	   
	  WebDriver driver;// ref variable
	   @BeforeClass
	   public void setup() {
	  
		      System.out.println("getting resources");
		       /*
		       System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
		       driver=new ChromeDriver();// web driver object is created and refering to Chrome browser
			   driver.get("https://demo.opencart.com/");
		       driver.manage().window().maximize();
		       */
	 
	 }
	   
	   @Test(priority=3)
	   public void login(){
	 
		    System.out.println("Login test");
		   
		   
	   }
	   
	   @Test(priority=1)
	   public void testMouseOperation(){
		   
		      System.out.println("sample test case");
		 
		            /*		           
		              JavascriptExecutor scriptExecutor =(JavascriptExecutor)driver;
		             
		   
		           scriptExecutor.executeScript("alert('welcome to selenium world!!!')");
		           Alert alert=driver.switchTo().alert();        
		           
		           String alertMessage=alert.getText();
		           alert.accept();
		           
		           if(alertMessage.equals("welcome to selenium world!!!"))
		           {
		        	   
		        	    System.out.println("Match found");
		           }
		           else{
		        	   
		        	   System.out.println("Match not found");
		        	   
		           }
		           
		           scriptExecutor.executeScript("confirm('Do you want to continue')");
		           
		           alert=driver.switchTo().alert();
		           alert.dismiss();
		   */
		   
	   }
	   
	   @AfterClass
	   public void releaseResource(){
		   
		   System.out.println("Resources will be realsed here");
		   
	   }




}
