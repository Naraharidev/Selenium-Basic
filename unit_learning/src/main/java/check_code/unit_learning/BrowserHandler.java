package check_code.unit_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandler {
	public static WebDriver getWebDriver(String driverName) {
		System.out.println(driverName);
		WebDriver driver = null;
		if ("chrome".equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://webapps.tekstac.com/Handling_Reg_Expression/");
		driver.findElement(By.id("userId")).sendKeys("Shamili");
		driver.findElement(By.id("track")).click();
		System.out.println(driver.findElement(By.id("result")).getText());
		return driver;
	}
	
	public static final int a=9;
	
	public  void m()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		getWebDriver("chrome");
		System.out.println(a);
	}
}
