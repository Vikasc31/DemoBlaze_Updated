package stepdef;

import caseBase.TestCaseBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.LoginModule;

public class LoginSteps {
	
	@Given("the user opens the Chrome browser")
	public void the_user_opens_the_chrome_browser() {
	    TestCaseBase.setup();
	}
	@When("navigates to the login window")
	public void navigates_to_the_login_window() throws InterruptedException {
	    LoginModule.userLogin(TestCaseBase.driver);
	}
	@And("the user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String string) {
	   LoginModule.loginUserName(TestCaseBase.driver, string);
	}
	@And("enters a valid password {string}")
	public void enters_a_valid_password(String string) {
	    LoginModule.loginUserPassword(TestCaseBase.driver, string);
	}
	@And("clicks the login button")
	public void clicks_the_login_button() throws InterruptedException {
	    LoginModule.loginButton(TestCaseBase.driver);
	}

	@Then("The logged-in users name should be displayed at the top, under the profile name section.")
	public void the_logged_in_users_name_should_be_displayed_at_the_top_under_the_profile_name_section() {
	    
		LoginModule.profileUser(TestCaseBase.driver);
		
	}
	
}