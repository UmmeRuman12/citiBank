package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class DataProvider {
	@Test(dataProvider = "getData")
	public void sample(String username, String password)
	{
		System.out.println("username ->" + username +" and password ->" + password+"");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		//Login to application
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(username,password);
		
		//validate for home page title  
//		String ExpTitle = "actiTIME -  Enter Time-Track";
		String actTitle = driver .getTitle();
		//Assert.assertEquals(actTitle, ExpTitle);
		Assert.assertTrue(actTitle.contains("actiTIME"));
		System.out.println("Home page validated");
		
	}
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin";
		data[0][1] = "manager";
		
		data[1][0] = "trainee";
		data[1][1] = "trainee";
		
		data[2][0] = "hi";
		data[2][1] = "hellow";
		return data;
	}
}
