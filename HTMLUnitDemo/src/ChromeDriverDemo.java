import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeDriverDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = 
		"C:\\Bharti\\BDDFS\\Demos\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/html/first.html");  
		//WebElement element = driver.findElement(By.id("uName"));
		//WebElement element = driver.findElement(By.name("userName"));
		WebElement element = driver.findElement(By.cssSelector("input[type='text'][id='uName']"));
		element.sendKeys("Hello All");
		//WebElement element =  driver.findElement(By.id("uName")); 
		//element.sendKeys("Hello");
	    Thread.sleep(10000);
	    driver.quit();
	}

}
