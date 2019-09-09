import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverDemo01
{

	public static void main(String[] args) throws InterruptedException
	{
			// Creating a new instance of the HTML unit driver
			WebDriver driver = new HtmlUnitDriver();
				
			driver.get("file:///D:/2016%20July/Module%203/Test%20Automation%20and%20Tool%20Basics-Selenium/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/WorkingWithForms.html/");         
			Thread.sleep(10000);    
		    System.out.println("Page title is: " + driver.getTitle());      
		    
		    driver.quit();
	}

}