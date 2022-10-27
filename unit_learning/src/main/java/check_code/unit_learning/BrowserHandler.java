package check_code.unit_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandler {
	
	public static void main(String[] args)
	{
		System.out.println("printing");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webapps.tekstac.com/Handling_Reg_Expression/");
		driver.findElement(By.id("userId")).sendKeys("Shamili");
		driver.findElement(By.id("track")).click();
		System.out.println(driver.findElement(By.id("result")).getText());
	}
	
}
