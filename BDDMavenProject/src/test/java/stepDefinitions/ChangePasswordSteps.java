package stepDefinitions;

import java.io.IOException;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.HeaderPage;

public class ChangePasswordSteps
{
	HeaderPage headerPage;
	
	public ChangePasswordSteps()
	{
		headerPage = new HeaderPage(Hooks.driver);
	}
	
	
	@Given("user navigates to change password screen")
	public void navigateToChangePassword()
	{
		headerPage.navigateToChangePassword();
	}
	
	@When("user enters valid credentials")
	public void enterCredentialsAndHitLogin()
	{
		headerPage.enterValidCredentials();
	}
	
	@Then("password should be changed successfully")
	public void verifyChangePassword() throws IOException
	{
		headerPage.verifySuccessMessage();
	}
	
	@And("hits update button")
	public void hitUpdate()
	{
		headerPage.clickUpdateButton();
	}

}
