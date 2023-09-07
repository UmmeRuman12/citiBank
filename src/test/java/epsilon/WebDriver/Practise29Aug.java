package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise29Aug {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        
        driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		//findElement(By.id("username")) is used to identify username test field and we are identifying 
		//it with the help of username id which is mentioned in the website 
		//Steps to search for id:-1)Go to website 2)right click and click on inspect
		//3)click on username..on the right side we will find codes only for username and there we will find the value for id just copy paste it here in the code
		System.out.println("username is identified");
		
		usernameTextField.sendKeys("admin");
		//This is used to Display admin in the textfield area of username
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		//since "name" is given in the password code in inspect so we take name value and id value is not given so we dont take that 
		System.out.println("Password is identified");
		passwordTextField.sendKeys("manager");
		//same as above
		
		//-->WebElement Login = driver.findElement(By.id("loginButton"));
		//-->Login.click();
		//perform click operation meaning it will click on login button and goes to home page
		//-->System.out.println("Logged In");
		
		//->driver.findElement(By.linkText("Forgot your password?")).click();
		//It is used to click on the link name Forgot your password
		
		//driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");	
		
		//->!!!!driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		//the above is also used to identify the password text field and type manager in the password textfield using cssSelector
		//we get that "input[name='pwd'] from website->inspect->ctrl+f->down field will be open then click on password field and type the tag name in the below field
		// and inside tag name give attribute name and value in the form "tag name[attribute name='attribute value']
		
		//->driver.findElement(By.xpath("//a[@class='initial']")).click();
		//this is also used to identify and click login button and it is called xpath with single attribute
		
		driver.findElement(By.xpath("//a[@class='initial' and @id='loginButton']")).click();
		
		   //xpath by visible text
		//!!!!WebElement Login = driver.findElement(By.xpath("//div[.='Logging in ...']"));
		//Login.click();
		
		
		
	}
}
