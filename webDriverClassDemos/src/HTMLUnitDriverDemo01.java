import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverDemo01
{

	public static void main(String[] args) throws InterruptedException
	{
			// Creating a new instance of the HTML unit driver
			WebDriver driver = new HtmlUnitDriver();
				
			driver.get("file:///C:/Bharti/BDDFS/Demos/Lesson5-HTMLPages//WorkingWithForms.html/");         
			Thread.sleep(10000);    
		    System.out.println("Page title is: " + driver.getTitle());      
		    
		    driver.quit();
	}

}