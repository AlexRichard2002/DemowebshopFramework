package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webshoplogin {
	
	public Webshoplogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement Emailtextfield;
	
	@FindBy(id="Password")
	private WebElement Passwordtextfield;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement Loginbutton;
	
	
	public WebElement getEmailtextfield() {
		return Emailtextfield;
		
		
	}


	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}


	public WebElement getLoginbutton() {
		return Loginbutton;
	}
}

