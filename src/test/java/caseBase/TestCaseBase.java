package caseBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCaseBase {
	
	public static WebDriver driver;
	
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().deleteAllCookies();

	}
	public void teardown() {

		if(driver != null) {
			
			driver.quit();
		}
	}
}