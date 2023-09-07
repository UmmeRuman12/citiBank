package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPractise {
	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriverManager.edgedriver().setup(); //It will download the updated driver executable
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
        
		//Step 2: Load the application URL
		driver.get("https://amazon.com");
			
		//Mouse Hovering action
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//div[text()='EN']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		System.out.println("mouse hoviering done");
		
		//Double Click
		Thread.sleep(3000);
		driver.get("https://demoqa.com/buttons");
		WebElement ele = driver.findElement(By.id("doubleClickBtn"));		
		Actions act1 = new Actions(driver);
		act1.doubleClick(ele).perform();
		System.out.println("double click done");
		
		//right click
		Thread.sleep(3000);
		WebElement rytEle = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rytEle).perform();
		System.out.println("right click done");
		
		//Drag and Drop operation
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");		
		WebElement srcElement = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	    WebElement targetElement = driver.findElement(By.xpath("//div[text()='United States']"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(srcElement, targetElement).perform();
		
		//Move anywhere on the web page based on offset/cordinate values
		//we use movebyoffset methos in order to move the cursor in the corner and click somewhere so that that hidden popup such as login in makemytrip is gone
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		Actions act3 = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		System.out.println("popup cancelled");
		
		Thread.sleep(2000);
		Actions act4 = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		System.out.println("popup cancelled");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Hi"));
		System.out.println("Condition satisfied");
	}

	
}
