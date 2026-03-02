package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class HeaderPage
{
	private WebDriver driver;     // default value = null
	private final String dropdownProfileIconId = "page-header-user-dropdown";
	private final String optionChangePasswordXpath = "//span[text()='Change Password']";
	private final String textBoxEnterPasswordXpath = "//input[@placeholder='Enter password']";
	private final String textBoxConfirmPasswordXpath = "//input[@placeholder='Enter confirm password.']";
	private final String buttonUpdateXpath = "//button[text()='Update']";
	private final String msgSuccessXpath = "//span[text()='Success!']";
	private final String optionLogoutXpath = "//span[text()='Logout']";
	private final String buttonLoginXpath = "//button[@type='submit']";
	
	
	@FindBy(xpath = buttonLoginXpath)
	private WebElement buttonLogin;
	
	@FindBy(xpath = optionLogoutXpath)
	private WebElement optionLogout;
	
	@FindBy(id = dropdownProfileIconId)
	private WebElement dropdownProfileIcon;
	
	@FindBy(xpath = optionChangePasswordXpath)
	private WebElement optionChangePassword;
	
	@FindBy(xpath = textBoxEnterPasswordXpath)
	private WebElement textBoxEnterPassword;
	
	@FindBy(xpath = textBoxConfirmPasswordXpath)
	private WebElement textBoxConfirmPassword;
	
	@FindBy(xpath = buttonUpdateXpath)
	private WebElement buttonUpdate;
	
	@FindBy(xpath = msgSuccessXpath)
	private WebElement msgSuccess;
	
	
//	public constructor
	public HeaderPage(WebDriver driver)  			// from base class
	{
		this.driver = driver;  // assign base class driver to global variable
//		initialize non-static variables
		PageFactory.initElements(driver, this);
	}
	
	
//	public methods
//	public boolean changePassword() throws IOException
//	{
//		boolean result = false;
//		try
//		{
//			dropdownProfileIcon.click();
//			ExtentReportHelper.logInfo("Clicked on Profile Icon");
//			optionChangePassword.click();
//			ExplicitWait.waitUntilElementVisibileByXpath(driver, textBoxEnterPasswordXpath);
//			textBoxEnterPassword.sendKeys("abcd@1234");
//			textBoxConfirmPassword.sendKeys("abcd@1234");
//			buttonUpdate.click();
//			
//			System.out.println("Msg : "+msgSuccess.getText());
//			
//			if(msgSuccess.getText().equals("Success!"))
//			{
//				ExtentReportHelper.logPass("Password changed successfully");
//				result = true;
//			}
//			else
//			{
//				ExtentReportHelper.logFail("Failed to change password");
//			}
//			ExplicitWait.waitUntilElementInvisibileByEle(driver, msgSuccess);
//		}
//		catch (Exception e)
//		{
//			ExtentReportHelper.logFail("Exception in method 'changePassword' : "+e.getMessage());
//			e.printStackTrace();
//		}
//		
//		return result;
//	}
	
	public void navigateToChangePassword()
	{
		dropdownProfileIcon.click();
		ExtentReportHelper.logInfo("Clicked on Profile Icon");
		System.out.println("Clicked on Profile Icon");
		optionChangePassword.click();
		ExplicitWait.waitUntilElementVisibileByXpath(driver, textBoxEnterPasswordXpath);
	}
	
	public void enterValidCredentials()
	{
		textBoxEnterPassword.sendKeys("abcd@1234");
		textBoxConfirmPassword.sendKeys("abcd@1234");
	}
	
	public void clickUpdateButton()
	{
		buttonUpdate.click();
	}
	
	public void verifySuccessMessage() throws IOException
	{
		System.out.println("Msg : "+msgSuccess.getText());
		
		if(msgSuccess.getText().equals("Success!"))
		{
			ExtentReportHelper.logPass("Password changed successfully");
			System.out.println("Password changed successfully");
		}
		else
		{
			ExtentReportHelper.logFail("Failed to change password");
			System.out.println("Failed to change password");
		}
		ExplicitWait.waitUntilElementInvisibileByEle(driver, msgSuccess);
	}
	
	
	public boolean logout() throws IOException
	{
		boolean result = false;                // local variable
		try
		{
			dropdownProfileIcon.click();
			optionLogout.click();
			
			
//		validation
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonLoginXpath)));
			
			ExplicitWait.waitUntilElementVisibileByXpath(driver, buttonLoginXpath);
			
			if(buttonLogin.isDisplayed())
			{
				ExtentReportHelper.logPass("Logout Successful");
				System.out.println("Logout Successful");
				result = true;
			}
			else
			{
				ExtentReportHelper.logFail("Logout Failed");
				System.out.println("Logout Failed");
			}
		}
		catch (Exception e)
		{
			ExtentReportHelper.logFail("Exception in method 'logout' : "+e.getMessage());
			System.out.println("Exception in method 'logout' :"+e.getMessage());
			
			e.printStackTrace();
		}
		
		return result;
		
	}
	

}
