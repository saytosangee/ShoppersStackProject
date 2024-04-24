package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuantityIncreasePage extends BasePage{
	
	public QuantityIncreasePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//svg[@id='increase']")
	private WebElement increaseQuantity ;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getIncreaseQuantity() {
		return increaseQuantity;
	}
	
	

}
