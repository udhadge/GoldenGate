package StepDefinitions;

import org.openqa.selenium.WebDriver;
import framework.Utils.TestContextSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import framework.BaseDriver;
import framework.CommonOperations;

public class HomePage extends CommonOperations{

	BaseDriver driver = BaseDriver.getInstance();
	String googleUrl = "https://www.google.com";
	TestContextSetup testContextSetup;	
	public String data;
	
	public HomePage(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@Given("^User is on Google Search Page$")
	public void user_is_on_Google_Search_Page() {
	    System.out.print("Google Search Page");	    
	    driver.OpenURL(googleUrl);
	    driver.typeKeys("//*[contains()]","text to search");
	}
	
	@Given("^Set value of variable here$")
	public void set_value_of_variable_here() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		testContextSetup.data = "Utkarsh";
	    System.out.println("Set value step");
	}

}
