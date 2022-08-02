package autoapp.automation.stepDef;

import autoapp.automation.pages.PersonalInfoPage;
import autoapp.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {

	@Given("^Automation practice application is opened$")
	public void automation_practice_application_is_opened() throws Throwable {
	}

	@When("^I click sign in$")
	public void i_click_sign_in() throws Throwable {
		RegisterPage.clickSignIn(null);
	}

	@And("^I create account with emailid \"([^\"]*)\"$")
	public void i_create_account_with_emailid(String emailId) throws Throwable {
		RegisterPage.createAccount(emailId);		
	}

	@Then("^I should be able to register with my below details$")
	public void i_should_be_able_to_register_with_my_below_details(DataTable dataTable) throws Throwable {
		PersonalInfoPage.enterPersonalInformation(dataTable);		
	}
}
