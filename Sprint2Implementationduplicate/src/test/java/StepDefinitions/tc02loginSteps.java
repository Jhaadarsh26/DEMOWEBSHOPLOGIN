package StepDefinitions;

import Browser.Browser;
import Pages.Checkingtc03;
import Pages.Checkingvalidtc02;
import Pages.checkingValidtc01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc02loginSteps extends Browser{
	@Given("page is loaded")
	public void page_is_loaded() {
	    
	}
	
	

	@When("user enters password")
	public void user_enters_password() throws Exception {
		try {
		Checkingvalidtc02.loginagain();
		
		
	}
		catch(Exception e) {
			
		}
	}
	

	@And("clicks on login")
	public void clicks_on_login() {
		
	}

	@Then("user  should be displayed a message error {string}")
	public void user_should_be_displayed_a_message_error(String string) throws InterruptedException {
	
		Checkingtc03.getclear();
	}

}
