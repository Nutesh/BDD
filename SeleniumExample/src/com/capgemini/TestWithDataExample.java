package com.capgemini;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithDataExample {

	
	
	 WebDriver driver;
	 
	 @BeforeMethod
      public void setup(){
   	 
              System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
              driver=new ChromeDriver();
              driver.get("http://www.calculator.net/calorie-calculator.html");
              driver.manage().window().maximize();
              
	}
	 @DataProvider
	 public Object[][] getCaloriesData() throws IOException{
		 
		 
		  Object[][] myData=ReadExcelData.readDataFromExcelFile(".\\","Book1.xlsx","Sheet1");
	        
		  return myData;
		 
		 
	 }
	 @Test(dataProvider="getCaloriesData")
	 public void locate(Hashtable<String, String> testData){
		 
	
		 WebElement age=driver.findElement(By.xpath(".//*[@id='cage']"));
		 WebElement height=driver.findElement(By.xpath(".//*[@id='cheightfeet']"));
			      	
		age.clear();
		age.sendKeys(testData.get("age"));
		height.clear();
		height.sendKeys(testData.get("height"));
		    	
	
	 
	 
	 
	 }


	 public void relaseResources(){
		 
		      if(driver!=null){
		    	  
		    	  driver.quit();
		    	  
		      }
		 
	 }
	 
	 



}
