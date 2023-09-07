package epsilon.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); //It will download the updated driver executable
		WebDriver driver = new EdgeDriver();
		
		// to maximise , minimise, full screen
				driver.manage().window().maximize();
				
		//Load the application - get()
		driver.get("https://flipkart.com");
		System.out.println("Flipkart Loaded");
        
		//To get the page title - getTitle()
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get current url of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to get page source
		//String PageSource = driver.getPageSource();
	//	System.out.println(PageSource);
		
		//to get window handle(It holds the address of the window)
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		
		// to quit it closes all the tabs
		driver.quit();
		System.out.println("Browser closed");
		
		
		//driver.navigate().back();
		
		// driver.findElement(By.id(WindowHandle));
		
}
}