package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/BDD/sampleapplication.html/");	
try {

		//Find Username textbox and enter value
		driver.findElement(By.name("userName")).sendKeys("");
		Thread.sleep(10000);
				
		//Find Password textbox and enter value
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		Thread.sleep(10000);

		//Find Confirm Password textbox and enter value
		driver.findElement(By.className("Format")).sendKeys("igate");
		Thread.sleep(10000);
}
catch(Exception e) {
	System.out.print("some exception");
	}
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("20");
		driver.findElement(By.name("Phone")).sendKeys("8908765434");
				
		
		//Examples of Get commands
		
				System.out.println("Title is :" + driver.getTitle());
				System.out.println("Current URL is :" + driver.getCurrentUrl());
												
				Boolean b =  driver.getPageSource().contains("Sample");
				if(b==true)			
				{
					System.out.println("Passed");
				}
				else
				{
					System.out.println("failed");
				}

			
						
				//Find Submit button
				//driver.findElement(By.name("submit")).click();
				//driver.close();
				//driver.quit();
				 
				 

	}

}
