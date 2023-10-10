package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import PageElements.CreateAccountAndSigninE;
import PageElements.ProfilepageE;



public class BaseClass {
	public static  WebDriver driver;
	public CreateAccountAndSigninE login;
	public ProfilepageE profile;

	
	
	public void click(WebElement element)
	{
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public void sendKeys(WebElement element ,String keyword) 
	{
		element.clear();
		element.sendKeys(keyword);
	}
	public void cleartxt(WebElement element) 
	{
		element.clear();
	}
	
	public static void waitForWebElement(WebElement element) {
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void validateErrorMessage(String error_message) {
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='"+error_message+"']")));
		String act_error_message=driver.findElement(By.xpath("//*[text()='"+error_message+"']")).getText();
		Assert.assertTrue(act_error_message.equalsIgnoreCase(error_message));	
	}
	public static void validateMessage(String message) {
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='"+message+"']")));
		String act_message=driver.findElement(By.xpath("//*[text()='"+message+"']")).getText();
		Assert.assertTrue(act_message.equalsIgnoreCase(message));	
	}
}
