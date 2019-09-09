import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		//String exepath = "C:\\Bharti\\BDDFS\\Demos\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver",exepath);
		//FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); 
		WebDriver driver = new FirefoxDriver();//options);
		driver.get("file:///C:/Bharti/BDDFS/Demos/Lesson5-HTMLPages/AlertExample.html");
		/*driver.get("file:///C:/Bharti/BDDFS/Demos/Lesson5-HTMLPages/AlertExample.html");*/         
		System.out.println(" is: " + driver.findElement(By.id("uName")));      
	    Thread.sleep(10000);
	    driver.quit();
	}

}
