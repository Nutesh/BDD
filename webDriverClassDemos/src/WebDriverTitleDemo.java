import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTitleDemo
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				//File pathToBinary = new File("C:/Program Files/Mozilla Firefox/firefox.exe");
				//FirefoxProfile firefoxProfile = new FirefoxProfile();
				//FirefoxBinary binary = new FirefoxBinary(pathToBinary);
				//WebDriver driver = new FirefoxDriver(binary,firefoxProfile);
				
				//open the html file in the browser and copy paste the path from url to here
				WebDriver driver = new FirefoxDriver();

				      	
		String baseUrl = "http://docs.seleniumhq.org/";
        String expectedTitle = "Selenium - Web Browser Automation";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        //get current url
       System.out.println("current url is : " + driver. getCurrentUrl());

       //getpagesource
       boolean b = driver.getPageSource().contains("Which part is not");
		if (b) System.out.println("Expected text present ");

       
        // get the actual value of the title
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle))
        {
             System.out.println("Test Passed!");
         } 
         else
        {
             System.out.println("Test Failed");
         }      

         //Close browser window 
        // driver.close();
	}

}
