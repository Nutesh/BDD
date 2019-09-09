package com.capgemini;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathExample {

	
	
	    WebDriver driver;

	    @BeforeMethod
	    public void getResource() throws InterruptedException{
		   
		   System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   
	    }
	   @Test
	   public void load(){
		  
		    
		    driver.get("http://www.calculator.net/bmi-calculator.html");
		   
		    WebElement table=driver.findElement(By.className("cinfoT"));
		   
		   List<WebElement> rows=table.findElements(By.tagName("tr"));		   
		   
		     for(WebElement row:rows){
		    	 
		    	    
		    	 List<WebElement> cols=row.findElements(By.tagName("td"));
		     
		    	  for(WebElement col:cols){
		    		  
		    		   System.out.println(col.getText());
		    		  
		    	  }
		     
		     
		     
		     }
		  
		   
	  
		   try {
			
			    Thread.sleep(1000);
		
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   
	   @AfterMethod
	   public void releaseResource(){
		   
		   //driver.close();
		   
	   }
	
	


}
