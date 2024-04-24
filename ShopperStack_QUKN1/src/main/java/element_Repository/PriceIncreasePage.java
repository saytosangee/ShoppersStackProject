package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceIncreasePage extends BasePage{
	
	public PriceIncreasePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//svg[@id='increase']")
	private WebElement increasePrice ;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getIncreasePrice() {
		return increasePrice;
	}

	
}
