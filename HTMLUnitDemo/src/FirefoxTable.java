import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///c:/html/table.html");
		WebElement element =
				driver.findElement(By.xpath("//*[@id=\"data\"]/tbody/tr[2]/td[1]/input"));
		System.out.println("ele = "+element);
		element.sendKeys("Abc");
		//element.submit();
		//element.sendKeys("abc");
		
	}

}
