package StepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import framework.Utils.TestContextSetup;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import framework.BaseDriver;
import cucumber.api.java.en.Then;
import PageObjects.SearchPageObject;
public class SearchPage {

	TestContextSetup testContextSetup;	
	WebDriver driver = BaseDriver.getInstance().getWebDriver();
	SearchPageObject searchPageObject = new SearchPageObject(driver);
	
	public SearchPage(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@Given("^Launch the browser$")
	public void launch_the_browser() {
	    // Background keywords runs this function every time test case is triggered 
	    System.out.println("Background keyword is running : Perform prerequisiste here");
	}
	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("Give step running\n");
	}
	
	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Give step running\n");
	}

	@When("^User search for \"([^\"]*)\"$")
	public void user_search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Give step running..serach term:"+arg1 +"\n");
	}

	@Then("^Search result is displayed$")
	public void search_result_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Then step running\n");
	}
	
	@When("^data table demo step$")
	public void data_table_demo_step(DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> obj = data.raw();
		System.out.println("Data is:"+ obj.get(0).get(0)+"\n");
		System.out.println("Data is:"+ obj.get(0).get(1)+"\n");
		System.out.println("Data is:"+ obj.get(0).get(2)+"\n");
	}
	
	@When("^User login with (.+) and (.+)$")
	public void user_login_with_and(String arg1, String arg2)  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Username"+arg1);
	    System.out.println("Username"+arg2);
	}
	
	@When("^Access variable here$")
	public void access_variable_here() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Access value step"+ testContextSetup.data);
		searchPageObject.methodFromSearchPage();
	}
}
