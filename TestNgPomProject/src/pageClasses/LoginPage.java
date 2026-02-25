package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.PropertyReader;

public class LoginPage
{

//	private variables - webelements

//	driver.findElement

//	SYNTAX :

//	@FindBy(locator = value) 
//	private WebElement elementName;

	WebDriver driver;

	private final String textBoxEmailXpath = "//input[@placeholder='Email']";
	private final String textBoxPasswordXpath = "//input[@placeholder='Password']";
	private final String buttonLoginXpath = "//button[@type='submit']";
	private final String dropdownProfileIconXpath = "//button[@id='page-header-user-dropdown']";
	

	@FindBy(xpath = textBoxEmailXpath)
	private WebElement textBoxEmail;

	@FindBy(xpath = textBoxPasswordXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = buttonLoginXpath)
	private WebElement buttonLogin;
	
	@FindBy(xpath = dropdownProfileIconXpath)
	private WebElement dropdownProfileIcon;

//	public constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
//		initialize non-static variables
		PageFactory.initElements(driver, this);
	}

//	public methods
	public boolean login() throws IOException
	{
		boolean result = false;
		try
		{
			textBoxEmail.sendKeys(PropertyReader.readProperty("UserName"));
			textBoxPassword.sendKeys(PropertyReader.readProperty("Password"));
			buttonLogin.click();
			
			ExplicitWait.waitUntilElementVisibileByXpath(driver, dropdownProfileIconXpath);
			
			if(dropdownProfileIcon.isDisplayed())
			{
				System.out.println("User Logged in Successfully");
				result = true;
			}
			else
			{
				System.out.println("Failed to login");
			}
			
		}
		catch (IOException e)
		{
			System.out.println("Exception in method 'login' : " + e.getMessage());
		}
		
		return result;
	}

}
