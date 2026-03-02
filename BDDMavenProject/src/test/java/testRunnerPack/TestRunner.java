package testRunnerPack;

import org.testng.annotations.Listeners;

import hooks.ListenerClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@Listeners(ListenerClass.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\features",  // path of folder
		glue = {"stepDefinitions","hooks"}   // name of package which contains all step definitions
		
		)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
