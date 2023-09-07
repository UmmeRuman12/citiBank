package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
			//rule 1:-Create a separate pom class for a web page
			//rule 2:-Identify the web element using @findBy annotation
	
	@FindBy(name = "username") private WebElement usernameEdt;
	@FindBy(name = "pwd") private WebElement passwordEdt;
	@FindBy(id ="loginButton") private WebElement loginBtn;
	
	//rule3:-Create a constructor for web element
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//it initialise my web element
	}
	//rule 4:-Provide the getters by right click->source->generate getter and selector->click on select getter

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//Business Library
	//THIS IS CALLED GENERIC METHOD
	public void loginToApp(String USERNAME,String PASSWORD)
	{
		usernameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSWORD);
		loginBtn.click();
	}
	

}
