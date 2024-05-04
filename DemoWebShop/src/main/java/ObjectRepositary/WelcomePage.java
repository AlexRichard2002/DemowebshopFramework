package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	 }
	
	@FindBy(linkText="Log in")
	private WebElement Loginlink;
	
	@FindBy(linkText = "Computers")
	private WebElement Computerlink;

	@FindBy(xpath="//span[.='Shopping cart']")
	private WebElement shoppingcartlink;
	
	@FindBy(partialLinkText = "alexsanderrichard444@gmail.com")
	private WebElement accountdetails;
	
	@FindBy(partialLinkText ="Electronics")
	private WebElement Electronicslink;
	
	@FindBy(xpath = "//a[@class='ico-wishlist']")
	private WebElement wishlistlink;
	
	@FindBy(id = "small-searchterms" )
	private WebElement searchtext;
	
	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	private WebElement searchbutton;
	
	@FindBy(linkText = "Log out")
	private WebElement Logoutbutton;
	
	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getLogoutbutton() {
		return Logoutbutton;
	}

	public WebElement getAccountdetails() {
		return accountdetails;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getElectronicslink() {
		return Electronicslink;
	}
public WelcomePage() {
	// TODO Auto-generated constructor stub
}
	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getComputerlink() {
		return Computerlink;
	}

	public WebElement getLoginlink() {
		return Loginlink;
	}
	
	public WebElement getRegisterlink() {
		return accountdetails;
	}
	

}
