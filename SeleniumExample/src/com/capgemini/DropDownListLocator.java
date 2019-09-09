package com.capgemini;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownListLocator {

	
	WebDriver driver;
	 
	 @BeforeMethod
    public void setup(){
   	 
              System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
              driver=new ChromeDriver();
              driver.get("http://www.calculator.net/calorie-calculator.html");
              driver.manage().window().maximize();
              
	}
	 @Test
	 public void locate() throws InterruptedException{
		 
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		 .withTimeout(30, TimeUnit.SECONDS)
		 .pollingEvery(5,TimeUnit.SECONDS)
		 .ignoring(NoSuchElementException.class);
		 
		  WebElement listItem=driver.findElement(By.id("cactivity"));   	
		  Select select=new Select(listItem);
		  select.selectByIndex(0);
		  System.out.println("By Index selected item is"+select.getFirstSelectedOption().getText());
		  Thread.sleep(2000);
		  select.selectByValue("1.2");
		  System.out.println("By value selected item is"+select.getFirstSelectedOption().getText());
		  Thread.sleep(2000);
		  select.selectByVisibleText("Extra Active - very hard exercise/sports or physical job");
		  
		  System.out.println("By Visible selected item is"+select.getFirstSelectedOption().getText());
		  	  
	 }
	 public void relaseResources(){
		 
		      if(driver!=null){
		    	  
		    	  driver.quit();
		    	  
		      }
		 
	 }
	 
	 



}
