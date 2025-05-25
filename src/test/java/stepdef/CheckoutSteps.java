package stepdef;

import caseBase.TestCaseBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.DashboardModule;

public class CheckoutSteps {
	
	@When("Proceed to the checkout page from the cart.")
	public void proceed_to_the_checkout_page_from_the_cart() throws InterruptedException {
	    DashboardModule.clickCart(TestCaseBase.driver);
	}
	@When("Click on the Place Order button.")
	public void click_on_the_place_order_button() throws InterruptedException {
		DashboardModule.placeOrder(TestCaseBase.driver);
	}
	@When("Add all neccesary details.")
	public void add_all_neccesary_details() {
	    DashboardModule.checkoutForm(TestCaseBase.driver);
	}
	@When("Click on purchase button")
	public void click_on_purchase_button() {
	    DashboardModule.purchaseButton(TestCaseBase.driver);
	}
	@Then("confirmation message should be visible")
	public void confirmation_message_should_be_visible() {
	    DashboardModule.confimationMessage(TestCaseBase.driver);
	}
	@Then("click on purchase button to final confiramtion")
	public void click_on_purchase_button_to_final_confiramtion() {
	    DashboardModule.confirmOk(TestCaseBase.driver);
	}

}