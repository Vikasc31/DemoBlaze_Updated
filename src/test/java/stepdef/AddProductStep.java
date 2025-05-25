package stepdef;
import caseBase.TestCaseBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.DashboardModule;
import module.LoginModule;

public class AddProductStep {

	@Given("user click to the login window")
	public void user_click_to_the_login_window() throws InterruptedException {
		LoginModule.userLogin(TestCaseBase.driver);
		LoginModule.login(TestCaseBase.driver, "Vikas311", "Common@22");
	}
	@When("user select a specific product")
	public void user_select_a_specific_product() throws InterruptedException{
	    DashboardModule.selectProduct1(TestCaseBase.driver);
	}
	@And("user click on the Add to cart button")
	public void user_click_on_the_add_to_cart_button() throws InterruptedException {
	    DashboardModule.addProduct1ToCart(TestCaseBase.driver);
	}
	@Then("product should be visible in the cart")
	public void product_should_be_visible_in_the_cart() throws InterruptedException {
	    DashboardModule.verifycart(TestCaseBase.driver);
	}
		
}	