package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PropertyReader;

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
	public void login() throws IOException
	{
		try
		{
			textBoxEmail.sendKeys(PropertyReader.readProperty("UserName"));
			textBoxPassword.sendKeys(PropertyReader.readProperty("Password"));
			buttonLogin.click();
		}
		catch (IOException e)
		{
			System.out.println("Exception in method 'login' : " + e.getMessage());
		}
	}

}
