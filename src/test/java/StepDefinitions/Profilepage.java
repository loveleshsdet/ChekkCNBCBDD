package StepDefinitions;

import org.testng.Assert;

import PageElements.ProfilepageE;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profilepage extends BaseClass{
	
	ProfilepageE profile=new ProfilepageE(driver);
	
	@When("click on profile option")
	public void click_on_profile_option() {
		profile=new ProfilepageE(driver);
	click(profile.profile);
	}
	@When("user enters first name as {string}")
	public void user_enters_first_name_as(String string) {
	sendKeys(profile.txt_firstname,string);
	}
	@When("user enters last name as {string}")
	public void user_enters_last_name_as(String string) {
		sendKeys(profile.txt_lastname,string);
	}
	@When("click on save changes button")
	public void click_on_save_changes_button() {
	click(profile.save_changes_btn);
	}
	@When("reload the page and verify first name {string} and last name {string} details are saved or not")
	public void reload_the_page_and_verify_first_name_and_last_name_details_are_saved_or_not(String string, String string2) {
		driver.navigate().refresh();
		waitForWebElement(profile.txt_firstname);
		String act_first_name=profile.txt_firstname.getAttribute("value");
		Assert.assertTrue(act_first_name.equalsIgnoreCase(string));
		String act_last_name=profile.txt_lastname.getAttribute("value");
		Assert.assertTrue(act_last_name.equalsIgnoreCase(string));
		
	}
	@When("to reset password , user enters old password {string}")
	public void to_reset_password_user_enters_old_password(String string) {
	sendKeys(profile.txt_old_password,string);
	}
	@When("enters new password {string}")
	public void enters_new_password(String string) {
	sendKeys(profile.txt_new_password,string);
	}

	@When("enters conform new password {string}")
	public void enters_conform_new_password(String string) {
		sendKeys(profile.txt_cnfm_password,string);
	}
	@When("click on submit button")
	public void click_on_submit_button() {
	click(profile.submit_btn);
	}
	@Then("verify system displaying message {string}")
	public void verify_system_displaying_message(String string) {
		profile=new ProfilepageE(driver);
		validateMessage(string);
	}


}
