package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends BasePage{
	
	public HelpPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Help Center']")
	private WebElement helpCenter;

	public WebElement getHelpCenter() {
		return helpCenter;
	}

	

}
