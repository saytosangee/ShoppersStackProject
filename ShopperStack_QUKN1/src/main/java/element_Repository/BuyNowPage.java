package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyNowPage extends BasePage{
	
	public BuyNowPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='beautyProducts']")
	private WebElement beauty;
	
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/832/832/l572ufk0/lipstick/w/w/r/11-2-forever-matte-lipstick-lakme-original-imagfxbgmznjh4wc.jpeg?q=70']")
	private WebElement productDesc;
	
	@FindBy(xpath="//button[@id='Buy Now']")
	private WebElement Buynowbutton;

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getProductDesc() {
		return productDesc;
	}

	public WebElement getBuynowbutton() {
		return Buynowbutton;
	}

}
