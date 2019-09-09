package com.capgemini.SeleniumMavenExample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SeleniumGridTest {

	 
	
	 
	  WebDriver driver;

	 @BeforeMethod
	 public void setup() throws MalformedURLException{
		 
     		 
     DesiredCapabilities dsp=DesiredCapabilities.firefox();
	 dsp.setPlatform(Platform.WINDOWS);
	 URL url=new URL("http://192.168.43.215:4444/wd/hub");
     driver=new RemoteWebDriver(url, dsp);
	 
		 
	 }

	 @Test
	 public void startGoogle(){
		 
	
		    driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=mhF0WsvXGJTE8wfxvJGoCA&gws_rd=ssl");
	 
	 
	 
	 }

	 

}
