package StepDefinitions;

import Browser.Browser;
import Pages.Checkingtc03;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc03loginSteps extends Browser {
	@Given("page is here")
	public void page_is_here() {
	   
	}

	@When("user enter email and password same as email")
	public void user_enter_email_and_password_same_as_email() throws Exception {
		try {
			
		
		Checkingtc03.validcredentials();
		}
		catch(Exception e) {
	}    
	}

	@Then("user  showing {string}")
	public void user_showing(String string) throws InterruptedException {
		Checkingtc03.getclear();
	}


}
