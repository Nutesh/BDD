import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestWebDriverTSChrome 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("http://www.google.com/");
	}
}
