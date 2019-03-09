package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_Frame {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/guru99home/"); 
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("html/body/a/img")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("philadelphia-field-email")).sendKeys("Test");
		

	}

}
