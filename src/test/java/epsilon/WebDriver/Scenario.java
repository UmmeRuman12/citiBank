package epsilon.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario {
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
		//check on all the boxes
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//div[@class='img']"));
		for(int i=1;i<allCheckBoxes.size();i++)
		{
			for(WebElement ele:allCheckBoxes)
			{
				ele.click();
			}
		}
		//we first have a for loop which starts from 1
	
		System.out.println("all the element is checked");
	}

}
