package pageobject;
import org.openqa.selenium.By;

public class DashboardPageObject {
	
	public static By selectproduct1 = By.xpath("//a[text()='Samsung galaxy s6']");
	public static By addproducttocart = By.xpath("//a[text()='Add to cart']");
	public static By selectMultiple = By.xpath("//a[@class='hrefch']");
	public static By selectproduct2 = By.xpath("//a[text()='Nokia lumia 1520']");
	public static By selectproduct3 = By.xpath("//a[text()='Nexus 6']");
	public static By selectproduct4 = By.xpath("//a[text()='Iphone 6 32gb']");
	public static By homebutton = By.xpath("//a[text()='Home ']");
	public static By cart = By.xpath("//a[text()='Cart']");	
	public static By cartitems = By.xpath("//tbody/tr");
	public static By totalprice = By.xpath("//h3[@id='totalp']");
	public static By deleteitem = By.xpath("//tr[1]//a[text()='Delete']");
	public static By placeorderbutton = By.xpath("//button[text()='Place Order']");
	public static By placeorder_name = By.xpath("//input[@id='name']");
	public static By placeorder_country = By.xpath("//input[@id='country']");
	public static By placeorder_city = By.xpath("//input[@id='city']");
	public static By placeorder_creditcard = By.xpath("//input[@id='card']");
	public static By placeorder_month = By.xpath("//input[@id='month']");
	public static By placeorder_year = By.xpath("//input[@id='year']");
	public static By purchasebutton = By.xpath("//button[text()='Purchase']");
	public static By confirmation = By.xpath("//h2[text()='Thank you for your purchase!']");
	
	public static By ok = By.xpath("//button[text()='OK']");
	public static By contact = By.xpath("//a[text()='Contact']");
	public static By contact_email = By.xpath("//input[@id='recipient-email']");
	public static By contact_name = By.xpath("//input[@id='recipient-name']");
	public static By message = By.xpath("//textarea[@id='message-text']");
	public static By send_message = By.xpath("//button[text()='Send message']");
}