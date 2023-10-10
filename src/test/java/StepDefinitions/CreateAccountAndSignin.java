package StepDefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import PageElements.CreateAccountAndSigninE;
import config.PropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountAndSignin extends BaseClass {
	
	public static String browser;

	@Before
	public void setup1()
	{
		
		PropertiesFile.readPropertiesFile();

		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if(driver!=null)
		{
		driver.quit();
		}
	}
	@AfterStep
	public void addScreenshot(Scenario scenario){
		if(scenario.isFailed()==true)
		{
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.quit();
		}
	}



	
	@Given("User launch browser")
	public void user_launch_browser() {
	login=new CreateAccountAndSigninE(driver);
	}
	@When("user opens URL {string}")
	public void user_opens_url(String string) {
		 driver.manage().window().maximize();
		driver.get(string);
	}
	@When("click on create free account button in dashboard")
	public void click_on_create_free_account_button_in_dashboard() {
	click(login.create_free_account_btn);
	}
	@When("enter valid email address {string}")
	public void enter_valid_email_address(String string) {
	sendKeys(login.txt_email, string);
	}
	@When("enter valid password {string}")
	public void enter_valid_password(String string) {
		sendKeys(login.txt_password, string);
	}
	@When("click on create account button")
	public void click_on_create_account_button() {
	click(login.create_account_btn);
	}
	@When("enter invalid password {string}")
	public void enter_invalid_password(String string) {
		sendKeys(login.txt_password, string);
	}

	@When("select the checkbox to accept CNBC terms of service and privacy policy")
	public void select_the_checkbox_to_accept_cnbc_terms_of_service_and_privacy_policy() {
	click(login.TermsandCond);
	}
	@Then("verify system throwing error message {string}")
	public void verify_system_throwing_error_message(String string) {
	waitForWebElement(login.get_auth_error_message);
	String act_error_message=login.get_auth_error_message.getAttribute("innerHTML");
	System.out.println(act_error_message);
	Assert.assertTrue(act_error_message.contains(string));
	}
	@Then("verify system throwing the error message {string}")
	public void verify_system_throwing_the_error_message(String string) {
		waitForWebElement(login.get_auth_error_message);
		String act_error_message=login.get_auth_error_message.getText();
		Assert.assertTrue(act_error_message.equalsIgnoreCase(string));
	}
	@Then("verify system throwing the error message {string} when user not selected terms and conditions checkbox")
	public void verify_system_throwing_the_error_message_when_user_not_selected_terms_and_conditions_checkbox(String string) {
		waitForWebElement(login.get_termsandcond_err_message);
		String act_error_message=login.get_termsandcond_err_message.getText();
		Assert.assertTrue(act_error_message.equalsIgnoreCase(string));	  
	}
	@Then("verify system displaying error message {string}")
	public void verify_system_displaying_error_message(String string) {
	validateErrorMessage(string);
	}
	@When("click on sign in button in CNBC dashboard")
	public void click_on_sign_in_button_in_cnbc_dashboard() {
	click(login.sign_in_menu);
	}
	@When("select the checkbox to stay signed in")
	public void select_the_checkbox_to_stay_signed_in() {
	click(login.stay_signed_in);
	}
	@When("click on sign in button")
	public void click_on_sign_in_button() {	
	click(login.sign_in);
	}
	@When("click on my account button in CNBC dashboard")
	public void click_on_my_account_button_in_cnbc_dashboard() {
	click(login.my_account_dropdown);
	}
	@Then("verify system displaying signed in users email address {string}")
	public void verify_system_displaying_signed_in_users_email_address(String string) {
	String get_email=login.get_signed_in_email.getText();
	Assert.assertTrue(get_email.equalsIgnoreCase(string));
	}
	@Then("click on sign out button")
	public void click_on_sign_out_button() {
	click(login.sign_out_btn);
	}
	@When("click on create free account link in sign in page")
	public void click_on_create_free_account_link_in_sign_in_page() {
	click(login.create_free_account_link);
	}
	@When("click on forgot password link")
	public void click_on_forgot_password_link() {
	click(login.forgot_password_link);
	}
	@When("enter your email {string} to receive to reset password mail")
	public void enter_your_email_to_receive_to_reset_password_mail(String string) {
	sendKeys(login.txt_forgot_password_email,string);
	}
	@When("click on continue button")
	public void click_on_continue_button() {
	click(login.continue_btn);
	}
	@Then("verify user able to see message {string}")
	public void verify_user_able_to_see_message(String string) {
		String act_message=login.get_forgot_password_instructions.getText();
		Assert.assertTrue(act_message.equalsIgnoreCase(string));
	}
	@When("click on close button")
	public void click_on_close_button() {
	click(login.close_btn);
	}
	@When("click on done button")
	public void click_on_done_button() {
		login=new CreateAccountAndSigninE(driver);
	click(profile.done_btn);
	}
	@When("click on conform watchlist button")
	public void click_on_conform_watchlist_button() {
		login=new CreateAccountAndSigninE(driver);
	click(profile.conformation_wishlist_btn);
	}





	


}
