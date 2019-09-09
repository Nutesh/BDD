package com.capgemini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoadUserHomePage {

	     WebDriver driver;

	   @BeforeMethod
	   public void getResource() throws InterruptedException{
		   
		   System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		  
	   
	   }
	   
	   @Test
	   public void load(){
		  
		   driver.get("file:///D:/SeleniumTraining/SeleniumExample/Demo.html");
		   
		   
		       //WebElement textElement=driver.findElement(By.id("uid"));
		   
		   
		      //WebElement element=driver.findElement(By.name("username"));
		   
		       WebElement element=driver.findElement(By.cssSelector("html>body>p"));
		       System.out.println("Element Name is"+element.getTagName()+"element text is"+element.getText());
		   
		
		    /*
		   WebElement headingElement=driver.findElement(By.tagName("h1"));
		
		   String name=headingElement.getTagName();
		   
		   String text=headingElement.getText();
		   
		   System.out.println("element is\t"+name);
		   System.out.println("Text is \t"+text);
		   */
		     
		     
		   try {
			
			    Thread.sleep(1000);
		
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   
	   @AfterMethod
	   public void releaseResource(){
		   
		   driver.close();
		   
	   }
	
	


}
