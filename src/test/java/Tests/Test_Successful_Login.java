package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ExtractorData;
import Pages.HomePage;
import Pages.LoginPage;

public class Test_Successful_Login extends TestBase{

	LoginPage loginObj;
	HomePage homObj;
	ExtractorData ex;


	@Test
	public void TestLogin_CorrectCredentials() throws Exception {

		loginObj = new LoginPage(driver);
		ex = new ExtractorData();

		loginObj.AcceptCookies();
		loginObj.setEmail(ex.Locaters("Credentials", 1));
		loginObj.setPassword(ex.Locaters("Credentials", 2));
		loginObj.ClickOnLoginBttn();
		homObj = new HomePage(driver);
		homObj.waitForPageLoaded();
		AssertJUnit.assertTrue(homObj.welcomeMessageDisplayed());
		
		homObj.Close_Message();
	}
	
	@Test
	public void TestLogin_CorrectCredentialss() throws Exception {

		loginObj = new LoginPage(driver);
		ex = new ExtractorData();

		loginObj.AcceptCookies();
		loginObj.setEmail(ex.Locaters("Credentials", 1));
		loginObj.setPassword(ex.Locaters("Credentials", 2));
		loginObj.ClickOnLoginBttn();
		homObj = new HomePage(driver);
		homObj.waitForPageLoaded();
		AssertJUnit.assertTrue(homObj.welcomeMessageDisplayed());
		
		homObj.Close_Message();
	}
}
