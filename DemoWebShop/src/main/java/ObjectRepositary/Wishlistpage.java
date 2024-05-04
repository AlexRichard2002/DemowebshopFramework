package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
     public Wishlistpage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath = "//input[@name='addtocart']")
     private WebElement addtocartcheckbox;
     
     @FindBy(xpath = "//input[@class='button-2 wishlist-add-to-cart-button']")
     private WebElement addtocartbutton;

	public WebElement getAddtocartcheckbox() {
		return addtocartcheckbox;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
     
     
}
