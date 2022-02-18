package framework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseDriver {

	private static BaseDriver BD = new BaseDriver();
	public WebDriver driver;
	
	private BaseDriver() {
		//init();
	}
	
	public static BaseDriver getInstance() {
		return BD;
	}
	
	public void init() {
		startChrome();
	}
	
	public WebDriver getWebDriver(){
		return driver;
	}
	
	protected void startChrome() {    	
    	//KillChrome();
    	ChromeOptions chromeOptions =  new ChromeOptions();
    	Map<String, Object> chromePrefs = new HashMap<String, Object>();
    	chromePrefs.put("profile.default_content_settings.popups", false);
    	chromePrefs.put("download.default_directory", System.getProperty("java.io.tmpdir"));
    	chromeOptions.setExperimentalOption("prefs", chromePrefs);
		chromeOptions.addArguments("--test-type");
		chromeOptions.addArguments("disable-popup-blocking");		
    	if (null == System.getProperty("webdriver.chrome.driver")){
    		String chromedriverPath = "C:\\Users\\Mrunal\\eclipse-workspace\\GoldenGate\\16\\Drivers\\chromedriver.exe";
    		System.out.println("webdriver.chrome.driver is not set. will now try to use ["+chromedriverPath+"]");
    		System.setProperty("webdriver.chrome.driver", chromedriverPath);
    	}              	
    	driver = new ChromeDriver(chromeOptions);
    	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
    }  
	    
	public WebElement typeKeys(String locator, String value) {
		WebElement we = driver.findElement(By.xpath(locator));
		try {
			we.sendKeys(value);
		} catch (Exception e) {
			//Assert.fail("Unable to type in " + locator);
		}
		return we;
	}
	
	public void OpenURL(String url) {
		driver.get(url);
	}
	public void QuitBrowser() {
		driver.quit();
	}
}
