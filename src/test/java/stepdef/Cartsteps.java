package stepdef;

import caseBase.TestCaseBase;
import io.cucumber.java.en.Then;
import module.DashboardModule;

public class Cartsteps {


	@Then("Verify that the added products are displayed correctly.")
	public void verify_that_the_added_products_are_displayed_correctly() throws InterruptedException {
	    DashboardModule.verifyCartitems(TestCaseBase.driver);
	}
	@Then("Verify the subtotal, shipping, and total price calculations.")
	public void verify_the_subtotal_shipping_and_total_price_calculations() throws InterruptedException {
	    DashboardModule.cartCalculation(TestCaseBase.driver);
	}
	@Then("Remove a product from the cart and verify that it is no longer displayed.")
	public void remove_a_product_from_the_cart_and_verify_that_it_is_no_longer_displayed() throws InterruptedException {
	    DashboardModule.removeItem(TestCaseBase.driver);
	}
}