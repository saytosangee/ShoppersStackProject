package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckDeliveryPage extends BasePage{
	
	public CheckDeliveryPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='electronics']")
	private WebElement electronics;
	
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/312/312/xif0q/mobile/l/8/r/-original-imaghxemnnnkd8bg.jpeg?q=70']")
	private WebElement productDesc;
	
	@FindBy(xpath="//input[@id='Check Delivery']")
	private WebElement checkDelivery;
	
	@FindBy(xpath="//button[@id='Check']")
	private WebElement checkButton;

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getProductDesc() {
		return productDesc;
	}

	public WebElement getCheckDelivery() {
		return checkDelivery;
	}

	public WebElement getCheckButton() {
		return checkButton;
	}

}
