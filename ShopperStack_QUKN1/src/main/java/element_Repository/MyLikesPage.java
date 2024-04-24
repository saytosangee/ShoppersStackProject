package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyLikesPage extends BasePage{
	
	public MyLikesPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//li[text()='My Likes']")
	private WebElement myLikes;

	public WebElement getMyLikes() {
		return myLikes;
	}
	
	
}
