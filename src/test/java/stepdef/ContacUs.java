package stepdef;

import caseBase.TestCaseBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.DashboardModule;

public class ContacUs {

	@When("Navigate to the contact page.")
	public void navigate_to_the_contact_page() throws InterruptedException {
	   DashboardModule.contactUs(TestCaseBase.driver);
	}
	@When("Enter valid information in the form fields \\(name, email, message).")
	public void enter_valid_information_in_the_form_fields_name_email_message() {
	    DashboardModule.contactForm(TestCaseBase.driver);
	}
	@When("Click on the send button.")
	public void click_on_the_send_button() throws InterruptedException {
	    DashboardModule.saveMessage(TestCaseBase.driver);
	}
	@Then("Verify that the message is sent successfully and appropriate confirmation message is displayed.")
	public void verify_that_the_message_is_sent_successfully_and_appropriate_confirmation_message_is_displayed() throws InterruptedException {
	    DashboardModule.ContactAlertMessage(TestCaseBase.driver);
	}
}