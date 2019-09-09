package com.capgemini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaitExample {

	 ChromeDriver driver;
	 
	 @BeforeMethod
     public void setup(){
    	 
               System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
               driver=new ChromeDriver();
               driver.get("http://spicejet.com/");
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
               
	}
	 @Test
	 public void testWaitExample(){
		 
		 
		 WebElement fromCity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	     fromCity.click();
		 WebDriverWait wait=new WebDriverWait(driver,500);
		 WebElement toDate=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")));
		 toDate.click();
		
	 
	 
	 
	 }





}
