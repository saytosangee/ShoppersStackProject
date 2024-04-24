package testscripts;

import org.testng.annotations.Test;

import element_Repository.EditProfilePage;
import generic_Library.BaseTest;

public class EditProfileTest extends BaseTest {
	
	@Test
	public void EditProfileTestCase() throws InterruptedException
	{
		EditProfilePage edit = new EditProfilePage(driver);
		base_Page.getAccountButton().click();
		Thread.sleep(3000);
		edit.getMyProfile().click();
		Thread.sleep(3000);
		edit.getEditProfile().click();
		Thread.sleep(3000);
		edit.getPhoneNumber().sendKeys("9988775544");
		Thread.sleep(3000);
		edit.getSubmitbutton().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
	}


