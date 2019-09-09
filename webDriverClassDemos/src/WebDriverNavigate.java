import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverNavigate {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
      	      
        // launch Firefox and direct it to the Base URL
        driver.get("http://docs.seleniumhq.org/");

        driver.navigate().to("http://www.google.com");
        //driver.navigate().refresh();
        driver.navigate().back();
        // driver.navigate().forward();

        }
}
