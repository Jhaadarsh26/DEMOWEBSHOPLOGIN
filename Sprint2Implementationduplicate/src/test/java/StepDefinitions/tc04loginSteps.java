package StepDefinitions;

import java.io.IOException;

import Pages.Checkingtc03;
import Pages.Checkingtc04;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc04loginSteps {
	
	@Given("page is there")
	public void page_is_there() throws InterruptedException {
		Checkingtc03.getclear(); 
	}

	@When("user enters valid email and invalid password")
	public void user_enters_valid_email_and_invalid_password() throws IOException {
		try {
		Checkingtc04.validcredentials();
	}
		catch(Exception e) {
			
		}
	}

	@Then("user should displayed {string} on page")
	public void user_should_displayed_on_page(String string) throws InterruptedException {
		
	}
}
