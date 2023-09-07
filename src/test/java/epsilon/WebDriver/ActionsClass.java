package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("amazon.com");
		//Mouse Hovering action
		driver.findElement(By.xpath("//div[text()='EN']"));
		
	//Actions act = new Actions(driver);
	//act.moveToElement(element).perform();
//		
	//System.out.println("mouse hoviering done");
//		
		
		//Double Click
//		driver.get("https://demoqa.com/buttons");
//		
//		WebElement ele = driver.findElement(By.id("doubleClickBtn"));
//		
//		Actions act = new Actions(driver);
//		act.doubleClick(ele).perform();
//		
//		System.out.println("double click done");
//
//		WebElement rytEle = driver.findElement(By.id("rightClickBtn"));
//		act.contextClick(rytEle).perform();
//		System.out.println("right click done");
		//drop down 
		
   //     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
//	WebElement srcElement = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		
	//	WebElement targetElement = driver.findElement(By.xpath("//div[text()='United States']"));
		
//		Actions act = new Actions(driver);
	//	act.dragAndDrop(srcElement, targetElement).perform();
		
	}
	

}
