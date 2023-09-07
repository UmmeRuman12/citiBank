package actitime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class LoginToActiTime {
		@Test
		public void loginToApp()
		{
			//launch the browser
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://demo.actitime.com/login.do");
			//Login to application
			LoginPage lp = new LoginPage(driver);
			lp.loginToApp("admin","manager");
			//lp.getUsernameEdt().sendKeys("admin");
			//lp.getPasswordEdt().sendKeys("manager");
			//lp.getLoginBtn().click();
			System.out.println("Login successfully");
			
		}
}
