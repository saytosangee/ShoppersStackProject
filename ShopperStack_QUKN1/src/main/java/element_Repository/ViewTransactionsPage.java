package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewTransactionsPage extends BasePage{
	
	public ViewTransactionsPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//li[text()='My Wallet']")
	private WebElement myWallet;
	
	@FindBy(xpath="//button[text()='View Transactions']")
	private WebElement viewTransactions;

	public WebElement getMyWallet() {
		return myWallet;
	}

	public WebElement getViewTransactions() {
		return viewTransactions;
	}
	
	

}
