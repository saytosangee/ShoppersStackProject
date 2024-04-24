package testscripts;

import org.testng.annotations.Test;

import element_Repository.EditProfilePage;
import element_Repository.MessagePage;
import generic_Library.BaseTest;

public class MessageTest extends BaseTest {
	
	@Test
	public void MessageTestCase() throws InterruptedException
	{
		MessagePage message = new MessagePage(driver);
		message.getChatbot().click();
		Thread.sleep(3000);
		message.getChatInput().sendKeys("hello");
		Thread.sleep(3000);
		message.getSendArrow().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
	}



