package autoapp.automation.stepDef;

import autoapp.automation.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIStepDefinitions {

	@Then("^User clicks on create an account button$")
	public void user_clicks_on_create_an_account_button() throws Throwable {
		RegisterPage.createAccountButton();
	}

	@When("^User clicks on \"([^\"]*)\" link$")
	public void user_clicks_on_link(String strLink) throws Throwable {
		RegisterPage.clickSignIn(strLink);

	}

	@When("^User enters the \"([^\"]*)\" text$")
	public void user_enters_the_text(String text) throws Throwable {
		RegisterPage.createAccount(text);

	}

	@Given("^User launch the \"([^\"]*)\" application url$")
	public void user_launch_the_application_url(String applicationName) throws Throwable {
		RegisterPage.openApplicaiton(applicationName);

	}

	@Then("^User validates the \"([^\"]*)\" message$")
	public void user_validates_the_message(String message) throws Throwable {
		RegisterPage.validateErrorMessage(message);

	}
	
	@When("User mouseHover on {string} link")
	public void user_mouse_hover_on_link(String strLink) {
		RegisterPage.mouseHoverToElement(strLink);

		
	}

	@Then("User validates the Summer Dresses page")
	public void user_validates_the_summer_dresses_page() {
		RegisterPage.verifySummerDresssesLink();
	}

	
	@Then("User select a dress")
	public void user_select_a_dress() {
		
	}
	
	@Then("User will change the color of dress")
	public void user_will_change_the_color_of_dress() {
		
	}
	
	@Then("User will add the item to cart")
	public void user_will_add_the_item_to_cart() {
		
	}
	
	@Then("User validates the cart summary")
	public void user_validates_the_cart_summary() {
		
	}


	
	
	
	

}
