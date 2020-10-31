package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


	WebDriver driver;
	WebDriverWait wait;
	ExtractorData ex;

	public HomePage(WebDriver driver) {

		this.driver=driver;
	}

	public boolean welcomeMessageDisplayed() throws Exception {
		ex = new ExtractorData();
		wait = new WebDriverWait(driver ,20);
		WebElement Alert_welcome_message ; 
		Alert_welcome_message=	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ex.Locaters("HomePage", 1))));
		return Alert_welcome_message.isDisplayed();	

	}

	public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
           System.out.println("Timeout waiting for Page Load Request to complete.");
        }
    }
	public void Close_Message() throws Exception 
	{
		ex = new ExtractorData();
		WebElement Xclose =driver.findElement(By.xpath(ex.Locaters("HomePage", 2)));
		Xclose.click();
	}
}
