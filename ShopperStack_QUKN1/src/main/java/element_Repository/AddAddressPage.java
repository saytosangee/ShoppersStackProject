package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressPage extends BasePage{
	
	public AddAddressPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myAddress;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddress;
	
	@FindBy(xpath="//input[@id='Home']")
	private WebElement home;

	@FindBy(xpath="//input[@id='Office']")
	private WebElement office;

	@FindBy(xpath="//input[@id='Other']")
	private WebElement other;
	
	@FindBy(xpath="//input[@id='Name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='House/Office Info']")
	private WebElement house_Office_Number;
	
	@FindBy(xpath="//input[@id='Street Info']")
	private WebElement streetInfo;
	
	@FindBy(xpath="//input[@id='Landmark']")
	private WebElement landmark;

	@FindBy(xpath="//select[@id='Country']")
	private WebElement country;

	@FindBy(xpath="//select[@id='State']")
	private WebElement state;
	
	@FindBy(xpath="//select[@id='City']")
	private WebElement city;

	@FindBy(xpath="//input[@id='Pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//button[@id='addAddress']")
	private WebElement addAddressButton;

	public WebElement getMyProfile() {
		return myProfile;
	}
	
	public WebElement getMyAddress() {
		return myAddress;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getOffice() {
		return office;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHouse_Office_Number() {
		return house_Office_Number;
	}

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandmark() {
		return landmark;
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

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}


}
