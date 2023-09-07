package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scenario2 {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			WebElement usernameTextField = driver.findElement(By.id("username"));
			System.out.println("username is identified");
			usernameTextField.sendKeys("admin");
			WebElement passwordTextField = driver.findElement(By.name("pwd"));
			System.out.println("Password is verified");
			passwordTextField.sendKeys("manager");
			WebElement Login = driver.findElement(By.id("loginButton"));
			Login.click();
			System.out.println("Logged In");
			//navigate to task button
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
			System.out.println("Task button is pressed");
			//click on any one check box 
	
			driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
			//click on CopyTo 
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='copyTo button']")).click();
			////!!!!!!!!check for cancel button 
			// click on cancel in hidden division popup
			driver.findElement(By.id("(//div[@class='ok button']/following-sibling::div[@class='cancel button'])[5]")).click();
			System.out.println("clicked on cancel");
			
			
		}
}
