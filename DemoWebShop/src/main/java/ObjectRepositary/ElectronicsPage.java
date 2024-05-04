package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	public ElectronicsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Show products in category Cell phones']")
	private WebElement Cellphonelink;
	
	@FindBy(partialLinkText = "Smartphone")
	private WebElement smartphonelink;
	
	@FindBy(id = "add-to-wishlist-button-43")
	private WebElement Addtowishlist;
	
	@FindBy(id="add-to-cart-button-43")
	private WebElement Addtocart;

	public WebElement getCelllphonelink() {
		return Cellphonelink;
	}

	public WebElement getSmartphonelink() {
		return smartphonelink;
	}

	public WebElement getAddtowishlist() {
		return Addtowishlist;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}
     
	
}
