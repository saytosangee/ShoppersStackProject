package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfilePage extends BasePage{
	
	public EditProfilePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath="//button[text()='Edit Profile   ']")
	private WebElement editProfile;
	
	@FindBy(xpath="//input[@id='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id=':r5:']")
	private WebElement dateOfBirth;
	
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//select[@id='Country']")
    private WebElement country;
	
	@FindBy(xpath="//select[@id='State']")
     private WebElement state;
	
	@FindBy(xpath="//select[@id='City']")
	private WebElement city;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitbutton;

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getEditProfile() {
		return editProfile;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	
}
