package stepdef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import module.LoginModule;
import caseBase.TestCaseBase;

public class SignUpSteps {
	
	@Given("user open chorme browser")
	public void user_open_chorme_browser() {
		
		TestCaseBase.setup();	 
		
	}
	
	@When("open sign up window")
	public void open_sign_up_window() throws InterruptedException  {
	    LoginModule.userSignUp(TestCaseBase.driver);
	   	   
	}	
	@And("enter valid user {string}")
	public void enter_valid_user(String string) {
	    LoginModule.enterUserName(TestCaseBase.driver, string);
	}
	@And("enter valid password {string}")
	public void enter_valid_password(String string) {
	    LoginModule.enterUserPassword(TestCaseBase.driver, string);
	}
	@And("user click sign up button")
	public void user_click_sign_up_button() throws InterruptedException  {
	    LoginModule.signUpButton(TestCaseBase.driver);
	
	 }
	
	@Then("user should see successful sign in alert message")
	public void user_should_see_successful_sign_in_alert_message() {

		LoginModule.handleAlert(TestCaseBase.driver);
		
	}

}