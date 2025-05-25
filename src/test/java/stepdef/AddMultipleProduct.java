package stepdef;

import caseBase.TestCaseBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.DashboardModule;

public class AddMultipleProduct {
	
	@When("user select multiple product")
	public void user_select_multiple_product() throws InterruptedException {
	    DashboardModule.addMultipleProducts(TestCaseBase.driver);
	}
	@Then("added products should be visible in the cart")
	public void added_products_should_be_visible_in_the_cart() throws InterruptedException {
	    DashboardModule.verifyCartitems(TestCaseBase.driver);
	}

}