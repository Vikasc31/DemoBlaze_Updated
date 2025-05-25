package module;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobject.LoginPageObject;
public class LoginModule {
	
	WebDriver driver;
	public LoginModule(WebDriver driver) {
		
		this.driver = driver;
		
	}

	// sign up test/////////////////
	public static void userSignUp(WebDriver driver) throws InterruptedException{
		
		driver.findElement(LoginPageObject.signup).click();
		Thread.sleep(500);	
	}	
			
	public static void enterUserName(WebDriver driver,String username) {
		
		driver.findElement(LoginPageObject.signuser).sendKeys(username);
		
	}
	public static void enterUserPassword(WebDriver driver, String password) {
		
		driver.findElement(LoginPageObject.signpassword).sendKeys(password);

	}
	
	public static void signUpButton(WebDriver driver) throws InterruptedException  {
		
		driver.findElement(LoginPageObject.signupbutton).click();
		
		Thread.sleep(1000);
		
//		@SuppressWarnings("unused")
//		String alertMessage = handleAlert(driver);
		   
	}
	public static String handleAlert(WebDriver driver) {
        try {
            // Switch to alert
            Alert alert = driver.switchTo().alert();

            // Capture alert message
            String alertMessage = alert.getText();

            // Accept the alert
            alert.accept();

            // Define the expected message
            String expectedMessage = "This user already exist.";

            // Assert that the alert message matches the expected
            Assert.assertEquals(alertMessage, expectedMessage, "This user already exist.");

            return alertMessage;

        } catch (Exception e) {
            // Log the exception if needed
            System.err.println("Failed to handle alert: " + e.getMessage());
            throw e;  // Optionally re-throw to fail the test
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Login test
	public static void userLogin(WebDriver driver) throws InterruptedException {
		
		driver.findElement(LoginPageObject.login).click();
		
		Thread.sleep(2000);
	}
	public static void loginUserName(WebDriver driver,String username) {
		
		driver.findElement(LoginPageObject.loginuser).sendKeys(username);
	}
	public static void loginUserPassword(WebDriver driver, String password) {
		
		driver.findElement(LoginPageObject.loginpassword).sendKeys(password);
	}	
	public static void loginButton(WebDriver driver) throws InterruptedException {
		driver.findElement(LoginPageObject.loginbutton).click();
		Thread.sleep(4000);
	}
	public static void profileUser(WebDriver driver) {
			
		WebElement profileUser = driver.findElement(LoginPageObject.profileusername);
		
		String actualUser = profileUser.getText();
		       		
//		System.out.println("actual user:" +actualUser);
			
		String expectedUser = "Welcome Vikas311";
	
	    Assert.assertEquals(expectedUser, actualUser);

	
	}
	public static void login(WebDriver driver, String username, String password) throws InterruptedException {
		
		loginUserName(driver, username);
		loginUserPassword(driver, password);
		loginButton(driver);
	}

}