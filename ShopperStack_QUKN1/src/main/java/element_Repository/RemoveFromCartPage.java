package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveFromCartPage extends BasePage{
	
	public RemoveFromCartPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="(//button[text()='Remove from cart'])[1]")
	private WebElement removeFromCart;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement yesButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelButton;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}



}
