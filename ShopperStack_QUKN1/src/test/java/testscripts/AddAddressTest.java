package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import element_Repository.AddAddressPage;
import element_Repository.AddToCartPage;
import generic_Library.BaseTest;
import generic_Library.SelectClassUtility;

public class AddAddressTest extends BaseTest {
	
	private WebElement country;
	private WebElement state;
	private WebElement city;

	@Test
	public void AddAddressTestCase() throws InterruptedException
	{
		AddAddressPage address = new AddAddressPage(driver);
		base_Page.getAccountButton().click();
		Thread.sleep(3000);
		address.getMyProfile().click();
		Thread.sleep(3000);
		address.getMyAddress().click();
		Thread.sleep(3000);
		address.getAddAddress().click();
		Thread.sleep(3000);
		address.getHome().click();
		address.getName().sendKeys("Sang");
		address.getHouse_Office_Number().sendKeys("No.14");
		address.getStreetInfo().sendKeys("5th cross street");
		address.getLandmark().sendKeys("near forum");
		SelectClassUtility dropdown = new SelectClassUtility();
		dropdown.selectDropDownByValue(country, "India");
		dropdown.selectDropDownByValue(state, "Karnataka");
		dropdown.selectDropDownByValue(city, "Bengaluru");
		address.getPincode().sendKeys("560010");
		address.getPhoneNumber().sendKeys("9988776655");
		address.getAddAddressButton().click();
		utility_Methods.takeScreenshot(driver);
	}
}
