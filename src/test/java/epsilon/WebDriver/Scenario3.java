package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3 {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.makemytrip.com");
			WebElement usr = driver.findElement(By.xpath("//input[@id='username']"));
			usr.sendKeys("ummeruman35@gmail.com");
			driver.findElement(By.xpath("//button[@class='capText font16']")).click();
			Thread.sleep(3000);
			WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
			pwd.sendKeys("Rumanice1234!");
			driver.findElement(By.xpath("//button[@class='capText font16']")).click();
			WebElement otp = driver.findElement(By.xpath("//input[@id='otp']"));
			otp.sendKeys("");
			//driver.findElement(By.xpath("//label[@for='departure']")).click();
			//WebElement departure = driver.findElement(By.xpath("//div[@aria-label='Wed Sep 06 2023']")).click();
			//driver.findElement(By.xpath("//label[@for='return']")).click();
			//WebElement departure = driver.findElement(By.xpath("//div[@aria-label='Fri Oct 06 2023']")).click();
			
		}
}
