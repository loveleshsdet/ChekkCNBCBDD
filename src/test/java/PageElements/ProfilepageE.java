package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilepageE {
	
	WebDriver driver;

	public ProfilepageE(WebDriver Driver) {
		driver = Driver;

		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(xpath="//a[@title='profile']")
	public WebElement profile;
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement txt_firstname;
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement txt_lastname;
	@FindBy(xpath="//button[@class='ProfileForm-saveChangeButton']")
	public WebElement save_changes_btn;
	@FindBy(xpath="//input[@name='oldPassword']")
	public WebElement txt_old_password;
	@FindBy(xpath="//input[@name='newPassword']")
	public WebElement txt_new_password;
	@FindBy(xpath="//input[@name='newPasswordConfirmation']")
	public WebElement txt_cnfm_password;
	@FindBy(xpath="//input[@name='signup']")
	public WebElement submit_btn;
	@FindBy(xpath="//button[@class='Confirmation-doneButton']")
	public WebElement done_btn;
	@FindBy(xpath="//a[@class='Confirmation-watchlistButton']")
	public WebElement conformation_wishlist_btn;

}
