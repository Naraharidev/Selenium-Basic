package check_code.unit_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazon {
	
	public static void amazonmob(WebDriver driver) {
		driver.get("https://www.amazon.in/");
		String Title = driver.getTitle();
		System.out.println(" Title of Website: "+Title);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("-----Mobiles Under 10000 with 4GB RAM-----\n");
		
		driver.findElement(By.xpath("//*[@id=\"p_36/1318505031\"]/span/a/span")).click();      // click on cost
		driver.findElement(By.xpath("//*[@id=\"p_n_feature_eight_browse-bin/8561115031\"]/span/a/div/label/i")).click(); // click on 4GB RAM
		driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i")).click(); //select rating
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText());
	}

}
