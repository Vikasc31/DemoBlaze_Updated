package module;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.DashboardPageObject;

public class DashboardModule {

	// Select single product//
	public static void selectProduct1(WebDriver driver) throws InterruptedException {
		
		driver.findElement(DashboardPageObject.selectproduct1).click();
		Thread.sleep(2000);
	}
	public static void addProduct1ToCart(WebDriver driver) throws InterruptedException {
		
		driver.findElement(DashboardPageObject.addproducttocart).click();
	
		Thread.sleep(1000);
		try {
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		Thread.sleep(500);
		alert.accept();
		Thread.sleep(500);
        System.out.println(alertMessage);
        String expectedMessage = "Product added.";
        Assert.assertEquals(expectedMessage, alertMessage);
		}catch(NoAlertPresentException e) {
			
			System.out.println("no such alert");
		}

	}
	public static void verifycart(WebDriver driver) throws InterruptedException{
		
		driver.findElement(DashboardPageObject.homebutton);
	
		driver.findElement(DashboardPageObject.cart).click();
		
		Thread.sleep(3000);
		
		List<WebElement> cartItems = driver.findElements(DashboardPageObject.cartitems);
		
		int expectedItemCount = 1;
		assert cartItems.size() == expectedItemCount : "Incorrect number of cart items.";

	
	}
	//Add multiple products 
	public static void addMultipleProducts(WebDriver driver) throws InterruptedException {
	    List<By> productLocators = new ArrayList<>();
	    productLocators.add(DashboardPageObject.selectproduct2);
	    productLocators.add(DashboardPageObject.selectproduct3);
	    productLocators.add(DashboardPageObject.selectproduct4);
	    
	    for (By locators : productLocators) {
	        WebElement productElement = driver.findElement(locators);
	        productElement.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement addProduct = driver.findElement(DashboardPageObject.addproducttocart);
	        addProduct.click();
	        
	        Thread.sleep(1000);
	        
	        try {
	            Alert alert = driver.switchTo().alert();
	            String alertMessage = alert.getText();
	            Thread.sleep(500);
	            alert.accept();
	            Thread.sleep(500);
	            String expectedMessage = "Product added.";
	            Assert.assertEquals(expectedMessage, alertMessage);

	        } catch (NoAlertPresentException e) {
	            System.out.println("No alert is present Error");
	        }
	        
	        driver.findElement(DashboardPageObject.homebutton).click();
	        Thread.sleep(1000);
	        
	    }
	}

	public static void clickCart(WebDriver driver) throws InterruptedException {
		
		driver.findElement(DashboardPageObject.cart).click();	
		Thread.sleep(1000);
		}
	public static void verifyCartitems(WebDriver driver) throws InterruptedException {
		
		driver.findElement(DashboardPageObject.cart).click();
		
		Thread.sleep(2000);
		
		List<WebElement> cartItems = driver.findElements(DashboardPageObject.cartitems);
		
		Thread.sleep(2000);
		
		int expectedItemCount = 4;
		assert cartItems.size() == expectedItemCount : "Incorrect number of cart items.";
		
       }
	public static void cartCalculation(WebDriver driver) throws InterruptedException {
		
		WebElement totalPrice = driver.findElement(DashboardPageObject.totalprice);
		
		
		String subTotal = totalPrice.getText();
		

		String expectedPrice = "2620";
		
	    assert subTotal.equals(expectedPrice) : "Incorrect total price";
	    
	    Thread.sleep(500);
	    
		}	
        
	public static void removeItem(WebDriver driver) throws InterruptedException {
				
		driver.findElement(DashboardPageObject.deleteitem).click();
		
		Thread.sleep(5000);
		
		List<WebElement> cartItems = driver.findElements(DashboardPageObject.cartitems);
		
		Thread.sleep(2000);
		System.out.println(cartItems.size());
		int expectedItemCount = 3;
		System.out.println(expectedItemCount);
		assert cartItems.size() == expectedItemCount : "Incorrect number of cart items.";
	}
	
	public static void placeOrder(WebDriver driver) throws InterruptedException {
		
		driver.findElement(DashboardPageObject.placeorderbutton).click();
		Thread.sleep(1000);

		}
	public static void checkoutForm(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.placeorder_name).sendKeys("Vikas Chavan");
		driver.findElement(DashboardPageObject.placeorder_country).sendKeys("India");
		driver.findElement(DashboardPageObject.placeorder_city).sendKeys("Pune");
		driver.findElement(DashboardPageObject.placeorder_creditcard).sendKeys("1234567890");
		driver.findElement(DashboardPageObject.placeorder_month).sendKeys("09");
		driver.findElement(DashboardPageObject.placeorder_year).sendKeys("2027");
		
		}
	public static void purchaseButton(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.purchasebutton).click();
	
		}

	public static void confimationMessage(WebDriver driver) {
	
	WebElement messageElement = driver.findElement(DashboardPageObject.confirmation);
	
	if (messageElement.isDisplayed()) {
        System.out.println("Order place successfully");
    } else {
        System.out.println("Failed to place order");
    }
	
		}
	public static void confirmOk(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.ok).click();
	
		}
	
	public static void contactUs(WebDriver driver) throws InterruptedException {
	
		driver.findElement(DashboardPageObject.contact).click();
	
		Thread.sleep(500);	
	}
	
	public static void contactForm(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.contact_email).sendKeys("abc@123.com");
		
		driver.findElement(DashboardPageObject.contact_name).sendKeys("Vikas Chavan");
		
		driver.findElement(DashboardPageObject.message).sendKeys("Nice product");
		
	}
	
	public static void saveMessage(WebDriver driver) throws InterruptedException {	
		
		driver.findElement(DashboardPageObject.send_message).click();
		
		Thread.sleep(500);
		
		
	}
	public static void ContactAlertMessage(WebDriver driver) throws InterruptedException {
		
		try {
            Alert alert = driver.switchTo().alert();
            String alertMessage = alert.getText();
            Thread.sleep(500);
            alert.accept();
            Thread.sleep(500);
            String expectedMessage = "Thanks for the message!!";
            Assert.assertEquals(expectedMessage, alertMessage);

        } catch (NoAlertPresentException e) {
            System.out.println("No alert is present Error");
        }
	}
}
	