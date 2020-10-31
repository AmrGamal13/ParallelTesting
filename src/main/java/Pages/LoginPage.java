package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	ExtractorData ex;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		
	}
	
	public void AcceptCookies() throws Exception {
		ex = new ExtractorData();
		WebElement Cookie_bttn = driver.findElement(By.id(ex.Locaters("LoginPage", 1)));
		Cookie_bttn.click();
		
	}
	
	public void setEmail(String Email) throws Exception {
		ex = new ExtractorData();
		WebElement Email_address_txt = driver.findElement(By.xpath(ex.Locaters("LoginPage", 2)));
		Email_address_txt.sendKeys(Email);
	}
	
	public void setPassword(String Password) throws Exception {
		ex = new ExtractorData();
		WebElement password_txt = driver.findElement(By.xpath(ex.Locaters("LoginPage", 3)));
		password_txt.sendKeys(Password);
	}
	
	
	
	public WebElement ErrorMessage() throws Exception 
	{
		ex = new ExtractorData();
		WebElement Message_label = driver.findElement(By.xpath(ex.Locaters("LoginPage", 6)));
		return Message_label;
	}
	
	
	
	public void ClickOnLoginBttn() throws Exception {
		ex = new ExtractorData();
		WebElement login_bttn = driver.findElement(By.xpath(ex.Locaters("LoginPage", 4)));
		login_bttn.click();
		
	}
	
	public void ClickonForgetPassword() throws Exception {
		ex = new ExtractorData();
		WebElement forget_passwd_lnk = driver.findElement(By.xpath(ex.Locaters("LoginPage", 5)));
		forget_passwd_lnk.click();
		
	}
	
	public void Send_Email_ForReset(String Email) throws Exception 
	{
		ex = new ExtractorData();
		WebElement send_email_reset_txt = driver.findElement(By.xpath(ex.Locaters("LoginPage", 7)));
		send_email_reset_txt.sendKeys(Email);
		
	}
	
	public WebElement SendEmailButton_Status() throws Exception 
	{
		ex = new ExtractorData();
		WebElement send_email_reset_bttn = driver.findElement(By.xpath(ex.Locaters("LoginPage", 8)));
		return send_email_reset_bttn;
		
	}
	
	
	public WebElement ConfirmationMessage_reset() throws Exception 
	{
		ex = new ExtractorData();
		WebElement confirmation_message_label_reset = driver.findElement(By.xpath(ex.Locaters("LoginPage", 9)));
		return confirmation_message_label_reset;
		
	}
	
	public WebElement ShutDownButton_Status() throws Exception 
	{
		ex = new ExtractorData();
		WebElement ShutDown_button_reset = driver.findElement(By.xpath(ex.Locaters("LoginPage", 10)));
		return ShutDown_button_reset;
		
	}
	
	public WebElement Empty_password_error() throws Exception {
		ex = new ExtractorData();
		WebElement passwd_empty_error_label = driver.findElement(By.xpath(ex.Locaters("LoginPage", 11)));
		return passwd_empty_error_label;

	}
}
