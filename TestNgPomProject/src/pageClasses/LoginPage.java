package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	
//	private variables - webelements
	
//	driver.findElement
	
//	SYNTAX :
	
//	@FindBy(locator = value) 
//	private WebElement elementName;
	
	
//	WebDriver driver;
	
	private final String textBoxEmailXpath = "//input[@placeholder='Email']";
	private final String textBoxPasswordXpath = "//input[@placeholder='Password']";
	private final String buttonLoginXpath = "//button[@type='submit']";
	
	
	@FindBy(xpath = textBoxEmailXpath)
	private WebElement textBoxEmail;
	
	@FindBy(xpath = textBoxPasswordXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginXpath)
	private WebElement buttonLogin;
	
	
//	public constructor
	public LoginPage(WebDriver driver)
	{
//		initialize non-static variables
		PageFactory.initElements(driver, this);
	}
	
//	public methods
	public void login()
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@1234");
		buttonLogin.click();
	}
	
	public void invalidLogin()
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@123422");
		buttonLogin.click();
	}

}
