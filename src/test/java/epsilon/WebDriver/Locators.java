package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		System.out.println("username is identified");
		
		usernameTextField.sendKeys("admin");
		//admin it is the input that will be visible on the webpage
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		System.out.println("Password is verified");
		passwordTextField.sendKeys("manager");
		//sendKeys is used to identify and enter the data in that text field
		
		//WebElement Login = driver.findElement(By.id("loginButton"));
		//Login.click();
		//loginButton is from inspect->login->id
		
		
		//click() is used to perform click operation
		System.out.println("Logged In");
		
		//Link Text:-It clicks on the "forgot your password?" link and display that webpage
		//driver.findElement(By.linkText("Forgot your password?")).click();
	
		
		//cssSelector is used to check whether the name or id locator is working well
         //driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");	
         
         
         //to use xpath 
         //WebElement Login = driver.findElement(By.xpath("//a[@class='initial']"));
         
         //xpath by visible text
		WebElement Login = driver.findElement(By.xpath("//div[.='Login ']"));
		Login.click();
         
         
	}

}
