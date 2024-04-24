package testscripts;

import org.testng.annotations.Test;

import element_Repository.CreateAccountPage;
import element_Repository.ViewTransactionsPage;
import generic_Library.BaseTest;

public class CreateAccountTest extends BaseTest {
	
	@Test
	public void CreateAccountTestCase() throws InterruptedException
	{
		CreateAccountPage create = new CreateAccountPage(driver);
		create.getCreateAccount().click();
		create.getFirstName().sendKeys("sang");
		create.getLastName().sendKeys("shan");
		create.getFemale().click();
		create.getPhoneNumber().sendKeys("9988445522");
		create.getEmailAddress().sendKeys("sang@gmail.com");
		create.getPassword().sendKeys("123456");
		create.getConfirmPassword().sendKeys("123456");
		create.getTermsAndConditions().click();
		Thread.sleep(3000);
		create.getRegister().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}


