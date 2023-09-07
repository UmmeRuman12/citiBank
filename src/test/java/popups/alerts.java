package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
			public static void main(String[] args) throws InterruptedException {
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/alerts");
				
				driver.findElement(By.id("alertButton")).click();
			    Thread.sleep(2000);
				driver.switchTo().alert().accept();
				System.out.println("clicked on ok");
				Thread.sleep(1000);
				driver.findElement(By.id("timerAlertButton")).click();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				System.out.println("Clicked on ok after 5 seconds");
			}
}
