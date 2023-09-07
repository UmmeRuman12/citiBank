package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		org.openqa.selenium.WebElement un = driver.findElement(By.name("username"));
		//to type in text field
		un.sendKeys("Umme");
		//tp wait for 3 seconds
		Thread.sleep(3000);
		//to clear the text after 3 seconds
		un.clear();
		// to get the tagname of that text field
		String tagName = un.getTagName();
		System.out.println(tagName);
	    //to get the attribute name
		String attributeName = un.getAttribute("type");
		System.out.println(attributeName);
		//css values are width,height etc in style sheet
		//it basically give value of the style attributes
		String css = un.getCssValue("height");
		System.out.println(css);
		
	}

}
