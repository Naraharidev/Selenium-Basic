package check_code.unit_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void flipkartmob(WebDriver driver) {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[2]/div/div/button")).click();
		System.err.println("*********************************************************");
		System.out.println(driver.getTitle());
		System.out.println("-----Mobiles Under 10000 with 4GB RAM-----\n");
		driver.findElement(By.name("q")).sendKeys("Mobiles under 10000");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div/a/div[2]/div[1]/div[1]")).getText());
	}
}
