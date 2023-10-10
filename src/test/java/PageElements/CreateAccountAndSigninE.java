package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountAndSigninE {

	WebDriver driver;

	public CreateAccountAndSigninE(WebDriver Driver) {
		driver = Driver;

		PageFactory.initElements(Driver, this);
	}

	@FindBy(xpath = "//a[text()='Create free account']")
	public WebElement create_free_account_btn;
	@FindBy(xpath = "//input[@name='email']")
	public WebElement txt_email;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement txt_password;
	@FindBy(xpath = "//span[@class='Checkboxes-checkmark']")
	public WebElement TermsandCond;
	@FindBy(xpath = "//button[@name='signup']")
	public WebElement create_account_btn;
	@FindBy(xpath = "//*[text()='An account with this email address already exists.']")
	public WebElement get_auth_error_message;
	@FindBy(xpath = "//div[@class='Checkboxes-errorText']")
	public WebElement get_termsandcond_err_message;
	
	@FindBy(xpath = "//div[@class='SignInMenu-signInMenu']")
	public WebElement sign_in_menu;
	@FindBy(xpath = "//span[@class='Checkboxes-checkmark']")
	public WebElement stay_signed_in;
	@FindBy(xpath = "//button[@name='signin']")
	public WebElement sign_in;
	@FindBy(xpath = "//button[@class='SignInMenu-accountMenu']")
	public WebElement my_account_dropdown;
	@FindBy(xpath = "(//ul[@id='account-dropdownMenu']//a)[1]")
	public WebElement get_signed_in_email;
	@FindBy(xpath = "(//ul[@id='account-dropdownMenu']//a[text()='SIGN OUT'])[1]")
	public WebElement sign_out_btn;
	@FindBy(xpath = "//button[text()='Create Free Account']")
	public WebElement create_free_account_link;
	@FindBy(xpath = "//button[@class='AuthForms-forgotPwdButton AuthForms-signInForgotPwdButton']")
	public WebElement forgot_password_link;
	@FindBy(xpath = "//input[@name='emailOrUsername']")
	public WebElement txt_forgot_password_email;
	@FindBy(xpath = "//button[@name='continue']")
	public WebElement continue_btn;
	@FindBy(xpath = "//button[@class='AuthForms-submitButton']")
	public WebElement close_btn;
	@FindBy(xpath = "//div[@class='AuthForms-instructions']")
	public WebElement get_forgot_password_instructions;
	

	

}
