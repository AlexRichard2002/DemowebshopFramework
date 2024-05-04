package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingcartPage {
	
	public ShoppingcartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "CountryId")
	private WebElement Countrydropdown;
	
	@FindBy(id="StateProvinceId")
	private WebElement Statedropdown;
	
	@FindBy(id="ZipPostalCode")
	private WebElement Zipcodetextfield;
	
	@FindBy(id="termsofservice")
	private WebElement Termofservice;
	
	@FindBy(id="checkout")
	private WebElement Checkoutbutton;
	
	@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[1]")
	private WebElement continue1button;
	
	@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[2]")
	private WebElement continue2button;
	
	@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
	private WebElement continue3button;
	
	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement continue4button;
	
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement continue5button;
	
	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement continue6button;
	
	@FindBy(partialLinkText = "Click here for order details.")
	private WebElement Orderdetails;
	
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	private WebElement continue7button;

	public WebElement getCountrydropdown() {
		return Countrydropdown;
	}

	public WebElement getStatedropdown() {
		return Statedropdown;
	}

	public WebElement getZipcodetextfield() {
		return Zipcodetextfield;
	}

	public WebElement getTermofservice() {
		return Termofservice;
	}

	public WebElement getCheckoutbutton() {
		return Checkoutbutton;
	}

	public WebElement getContinue1button() {
		return continue1button;
	}

	public WebElement getContinue2button() {
		return continue2button;
	}

	public WebElement getContinue3button() {
		return continue3button;
	}

	public WebElement getContinue4button() {
		return continue4button;
	}

	public WebElement getContinue5button() {
		return continue5button;
	}

	public WebElement getContinue6button() {
		return continue6button;
	}

	public WebElement getOrderdetails() {
		return Orderdetails;
	}

	public WebElement getContinue7button() {
		return continue7button;
	}
	
	
	

}
