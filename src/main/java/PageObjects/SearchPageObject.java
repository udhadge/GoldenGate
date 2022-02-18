package PageObjects;

import org.openqa.selenium.WebDriver;

public class SearchPageObject {

	WebDriver driver;
	
	public SearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void methodFromSearchPage() {
		System.out.print("Method evoked from search page object");
	}
}

