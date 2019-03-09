package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_CustomListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\Desktop\\Selenium Stuffs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		WebElement customizelistbox = driver.findElement(By.id("BE_flight_origin_city"));
		customizelistbox.sendKeys("Ahmedabad");
		//customizelistbox.sendKeys(Keys.RETURN);
		
	}

}
