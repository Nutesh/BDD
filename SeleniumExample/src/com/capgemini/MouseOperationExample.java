package com.capgemini;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOperationExample {

	   
	  WebDriver driver;// ref variable
 
	 
	   @BeforeMethod
	   public void setup() {
	 
		       System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
		       driver=new ChromeDriver();// web driver object is created and refering to Chrome browser
			   driver.get("https://demo.opencart.com/");
		       driver.manage().window().maximize();
		       
	 
	 }
	   @Test
	   public void testMouseOperation(){
		   
		   WebDriverWait wait=new WebDriverWait(driver,30);
		   
		    driver.findElement(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		   
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[5]/a")));
		   
		   WebElement webCam=driver.findElement(By.xpath(".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[5]/a"));
		   
		   Actions action=new Actions(driver);
		   action.moveToElement(webCam).build().perform();
		   webCam.click();
		   
		   
		   
		   
		   
		   
	   }
	   




}
