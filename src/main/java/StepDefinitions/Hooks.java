package StepDefinitions;

import cucumber.api.java.Before;
import framework.BaseDriver;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class Hooks {

	//WebDriver driver;	
	BaseDriver BD = BaseDriver.getInstance();
	
	@Before("@Smoke")
	public void beforefeature() {
		System.out.println("-----------------Before the feature execution starts-------------------");
		BD.init();
	}
	
	@After("@Smoke")
	public void afterfeature() {
		System.out.println("-----------------Closing the browser-------------------");
		BD.QuitBrowser();
	}
	
	@Before("@Regression")
	public void beforeScenario() {
		System.out.println("-----------------Before the scenarios execution-------------------");
	}
	
	@After("@Regression")
	public void afterScenario() {
		System.out.println("-----------------After the scenarios execution-------------------");
	}
}
