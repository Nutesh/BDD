package com.capgemini;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	   
	 static WebDriver driver;// ref variable
 
	  static String browserName;
	 
	
	 public static void main(String[] args) {
		
		 
		      Scanner sc=new Scanner(System.in);
		      
		      System.out.println("Enter Browser name");
		      browserName=sc.next();
		 
		       if(browserName.equals("chrome")){
		      
		             System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		             driver=new ChromeDriver();// web driver object is created and refering to Chrome browser
			         
		         }
		       else if(browserName.equals("IE")){
		    	  
		    	     System.setProperty("webdriver.ie.driver","driver\\IEDriverServer.exe");
		    	     driver= new InternetExplorerDriver();
				     	     
		    	   
		       
		       }
		       else if(browserName.equals("firefox")){
		    	   
		    	 System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
		    	 driver=new FirefoxDriver();
				     	        
		        	   
		       }
		       
		     
		      
		     
		       
		     
		     
	          driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=lVNxWq2kDeTy8AeckIH4BQ");
		    
	 
	 
	 
	 }




}
