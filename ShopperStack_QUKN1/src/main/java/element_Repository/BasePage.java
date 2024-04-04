package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	/**
	*
	*@author Afshan
	*
	**/
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountButton;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutButton;
	

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void performLogout() {
		
		getAccountButton().click();
		getLogoutButton().click();

	}
	
	
}
