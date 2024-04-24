package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddToCartPage;
import element_Repository.AddToWishListPage;
import generic_Library.BaseTest;

public class AddToWishListTest extends BaseTest {
	
	@Test
	public void AddToWishListTestCase() throws InterruptedException
	{
		AddToWishListPage wishlist = new AddToWishListPage(driver);
		Thread.sleep(3000);
		wishlist.getKids().click();
		Thread.sleep(3000);
		wishlist.getHeartIcon().click();
		Thread.sleep(3000);
		base_Page.getAccountButton().click();
		Thread.sleep(3000);
		wishlist.getWishList().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
	}
