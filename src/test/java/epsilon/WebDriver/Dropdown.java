package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
      public static void main(String[] args) throws InterruptedException {
    		WebDriverManager.edgedriver().setup();
    		WebDriver driver = new EdgeDriver();
    		
    		driver.manage().window().maximize();
    		
    		driver.get("https://demoqa.com/select-menu");
    		//javascript code for scrolling as codes are not available for scrolling in selenium and java
    		//we r scrolling becox when we launch the website we are not able to see the "old style select dropdown" so we scroll down and selenium will identify that dropdown 
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,300);","");
    		//description for window.scrollBy(0,300) in notebook 
    		//create an object of select class
    	    WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
    		
    	    Select sel = new Select(dropdown);
    	    sel.selectByIndex(5);;
    	    System.out.println("data selected");
    	    
    	    Thread.sleep(2000);
    	    sel.selectByValue("7");
    	    
    	    Thread.sleep(2000);
    	    sel.selectByVisibleText("Magenta");
    	    
    	    js.executeScript("window.scrollBy(0,300);", "");
    		
    		//Multi select drop down
    		WebElement carsdropdown = driver.findElement(By.id("cars"));
    		
    		Select se = new Select(carsdropdown);
    		se.selectByValue("volvo");
    		
    		Thread.sleep(2000);
    		
    		se.selectByValue("audi");
    		
    		Thread.sleep(2000);
    		se.selectByVisibleText("Saab");
    		
    		Thread.sleep(2000);
    		se.deselectByValue("volvo");
    		
    		se.deselectAll();
    		System.out.println("all selected options are deselected");
    		
	}
}
