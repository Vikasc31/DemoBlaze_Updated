package pageobject;
import org.openqa.selenium.By;

public class LoginPageObject {
	
	public static By signup = By.xpath("//a[text()='Sign up']");
	public static By signuser = By.xpath("//input[@id='sign-username']");
	public static By signpassword = By.xpath("//input[@id='sign-password']");
	public static By signupbutton = By.xpath("//button[text()='Sign up']");
	
	public static By login = By.xpath("//a[text()='Log in']");
	public static By loginuser = By.xpath("//input[@id='loginusername']");
	public static By loginpassword = By.xpath("//input[@id='loginpassword']");
	public static By loginbutton = By.xpath("//button[text() = 'Log in']");
	public static By profileusername = By.xpath("//a[@id='nameofuser']");
}