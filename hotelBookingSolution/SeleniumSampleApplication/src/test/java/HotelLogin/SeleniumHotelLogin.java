package HotelLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHotelLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("file:///D:/BDD/BDD%20certf/hotelBooking/hotelBooking/login.html/");
		String strheading = driver.findElement(By.xpath("//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		if(strheading.contentEquals("Hotel Booking Application")) 
		{
			System.out.println("Heading Matched");
		}
		else
		{
			System.out.println("Heading Not Matched");
		}
		}


	}


