package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ExtractorData;
import Pages.HomePage;
import Pages.LoginPage;

public class Test_Wrong_Credentials extends TestBase {

	LoginPage loginObj;
	HomePage homObj;
	ExtractorData ex;

	@Test (priority = 1)
	public void Test_Failed_Login_Wrong_Credentials() throws Exception {

		loginObj = new LoginPage(driver);
		ex = new ExtractorData();

		loginObj.AcceptCookies();
		loginObj.setEmail(ex.Locaters("Credentials", 1));

		String pass = ex.Locaters("Credentials", 2);
		String wrongpassword =pass .concat("sadas");
		loginObj.setPassword(wrongpassword);

		loginObj.ClickOnLoginBttn();

		Assert.assertTrue(loginObj.ErrorMessage().isDisplayed());
	}
	
	@Test (priority = 2)
	public void Test_Failed_Login_Empty_Credentials() throws Exception {

		loginObj = new LoginPage(driver);
		ex = new ExtractorData();

		loginObj.AcceptCookies();
		loginObj.setEmail(ex.Locaters("Credentials", 1));

		loginObj.ClickOnLoginBttn();

		Assert.assertTrue(loginObj.Empty_password_error().getAttribute("class").contains("error"));
	}
	
	
}
