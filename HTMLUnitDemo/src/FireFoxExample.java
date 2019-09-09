import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///c:/html/first.html");
		WebElement element = 
				driver.findElement(By.id("uName"));
		element.sendKeys("using Firefox");
		
	}

}
