package check_code.unit_learning;
import org.openqa.selenium.WebDriver;
public class Main {
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=BrowserHandler.setDriver();
		
		amazon.amazonmob(driver);
		flipkart.flipkartmob(driver);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
