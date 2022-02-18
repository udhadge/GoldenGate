package StepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage {

	WebDriver driver;
	String chromedriverPath = "C:\\Users\\Mrunal\\eclipse-workspace\\GoldenGate\\drivers\\chromedriver.exe";
	String geckodriverPath = "C:\\Users\\Mrunal\\eclipse-workspace\\GoldenGate\\drivers\\geckodriver.exe";
	String edgedriverPath = "C:\\Users\\Mrunal\\eclipse-workspace\\GoldenGate\\drivers\\msedgedriver.exe";
	String URL = "https://jsonplaceholder.typicode.com";
	
	String googleUrl = "https://www.google.com";
	String searchField = "//input[@name='q']";
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", chromedriverPath);	
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", geckodriverPath);	
		//driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Given("launch browser")
	public void launch_browser() {
		init();
	    driver.get(googleUrl);
	}

	@Given("user is on search page")
	public void user_is_on_search_page() {
		WebElement w = driver.findElement(By.xpath(searchField));
		System.out.print(w.isDisplayed());
		Assert.assertTrue("Search field is not displayed",w.isDisplayed());
	}

	/*
	@When("user enters atext in search box as {word}")
	public void user_enters_atext_in_search_box(String word) {
		driver.findElement(By.xpath(searchField)).sendKeys(word);
		driver.findElement(By.xpath(searchField)).sendKeys(Keys.ENTER);
		 System.out.print("entering search");
	}
	*/
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		String searchLink = "//h3[contains(text(),'JSONPlaceholder')]";
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchLink)));
		
		driver.findElement(By.xpath(searchLink)).click();
		System.out.print("navigated to search result");
	}

	
	
	
	
	
}
