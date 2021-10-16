package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Browser.Browser;
import Pages.Checkingtc03;
import Pages.checkingValidtc01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc01loginSteps extends Browser {
	
	
	
	@Given("browser is open")
	public void browser_is_open() {
		try {
			
		
		setDriver();

		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in open browser");
		}
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		url();
		
		
	}

	@When("user enters email and password")
	public void user_enters_login_button() throws Exception {
	checkingValidtc01.validcredentials();
	
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		checkingValidtc01.logout();
		
		Checkingtc03.getclear();
	}

}
