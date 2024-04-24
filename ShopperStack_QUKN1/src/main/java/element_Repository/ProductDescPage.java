package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescPage extends BasePage{
	
	public ProductDescPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='men']")
	private WebElement men;
	
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/452/542/k12go7k0/shirt/g/w/p/42-9951619-roadster-original-imafknz5rug4hnbg.jpeg?q=50']")
	private WebElement productDesc;

	public WebElement getMen() {
		return men;
	}

	public WebElement getProductDesc() {
		return productDesc;
	}

	
}
