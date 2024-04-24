package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage{
	
	public AddToCartPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='women']")
	private WebElement women;

	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/832/832/l5iid8w0/top/i/w/5/s-59679101-forever-21-original-imagg66r6ntxhhfz.jpeg?q=70']")
	private WebElement productDesc;
	
	@FindBy(xpath="//button[@id='Add To Cart']")
	private WebElement addtocart;

	public WebElement getWomen() {
		return women;
	}

	public WebElement getProductDesc() {
		return productDesc;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	

}
