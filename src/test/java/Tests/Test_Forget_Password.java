package Tests;

import java.util.concurrent.ThreadLocalRandom;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;

public class Test_Forget_Password extends TestBase {

	LoginPage loginObj;
	HomePage homObj;
	int rand_int1 = ThreadLocalRandom.current().nextInt();

	@Test
	public void Test_Reset_Credentials() throws Exception {
		String email = rand_int1+"ad@gmail.com";
		loginObj = new LoginPage(driver);
		loginObj.AcceptCookies();
		loginObj.ClickonForgetPassword();

		Assert.assertTrue(loginObj.SendEmailButton_Status().getAttribute("class").contains("disabled")); 
		loginObj.Send_Email_ForReset(email);
		Assert.assertTrue(loginObj.SendEmailButton_Status().isEnabled());
		loginObj.SendEmailButton_Status().click();
		Assert.assertTrue(loginObj.ConfirmationMessage_reset().isDisplayed());
		Assert.assertTrue(loginObj.ConfirmationMessage_reset().getText().contains(email));
		Assert.assertTrue(loginObj.ShutDownButton_Status().isDisplayed());


	}
}
