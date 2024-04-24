package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishListPage extends BasePage{
	
	public AddToWishListPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='kids']")
	private WebElement kids;
	
	@FindBy(xpath="//svg[@class='class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv\"']")
	private WebElement heartIcon;
	
	@FindBy(xpath="//li[text()='Wish List']")
	private WebElement wishList;

	public WebElement getKids() {
		return kids;
	}

	public WebElement getHeartIcon() {
		return heartIcon;
	}

	public WebElement getWishList() {
		return wishList;
	}

	
}
