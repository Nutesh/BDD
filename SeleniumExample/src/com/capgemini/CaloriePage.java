package com.capgemini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaloriePage {

      
	   
	    WebDriver driver;
 
	    By ageSearch=By.id("cage");
	    By cheightfeetSearch=By.xpath(".//*[@id='cheightfeet']");		   
	  
	
	  /* 
	  @FindBy(id="cage")
	   WebElement age;
	 
      @FindBy(xpath=".//*[@id='cheightfeet']") 
	   WebElement cheightfeet;
	*/
      
	   
	   public CaloriePage(WebDriver driver) {
		
    	  this.driver=driver;
      
      }
      
     
      public void caloriesEntries(){
    	  
    	  
    	  
    	   driver.findElement(ageSearch).clear();
    	   driver.findElement(ageSearch).sendKeys("45");
    	   
    	   driver.findElement(cheightfeetSearch).clear();
    	   driver.findElement(cheightfeetSearch).sendKeys("5.6");
    	  
    	  // age.sendKeys("45");
    	   //cheightfeet.sendKeys("5.5");  
    	  
    	  }
	 


}
