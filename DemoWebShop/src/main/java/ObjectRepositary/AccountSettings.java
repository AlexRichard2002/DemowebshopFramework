package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings {
	
	public AccountSettings(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Orders")
	private WebElement orderbutton;
	
	@FindBy(xpath = "(//input[@class='button-2 order-details-button'])[1]")
	private WebElement orderdetails1;
	
	@FindBy(linkText = "Downloadable products")
	private WebElement downloadableproductsbutton;
	
	@FindBy(linkText = "Reward points")
	private WebElement Rewardpointsbutton;
	
	@FindBy(linkText = "Change password")
	private WebElement changepasswordbutton;
	
	@FindBy (xpath = "(//input[@class='text-box single-line password'])[1]")
	private WebElement Oldpassword;
	
	@FindBy (xpath = "(//input[@class='text-box single-line password'])[2]")
	private WebElement Newpassword;

	@FindBy (id = "ConfirmNewPassword")
	private WebElement Confirmpassword;
	
	@FindBy(xpath="//input[@class='button-1 change-password-button']")
	private WebElement Changepassword1;
	
	public WebElement getOrderbutton() {
		return orderbutton;
	}

	public WebElement getOrderdetails1() {
		return orderdetails1;
	}

	public WebElement getDownloadableproductsbutton() {
		return downloadableproductsbutton;
	}

	public WebElement getRewardpointsbutton() {
		return Rewardpointsbutton;
	}

	public WebElement getChangepasswordbutton() {
		return changepasswordbutton;
	}

	public WebElement getOldpassword() {
		return Oldpassword;
	}

	public WebElement getNewpassword() {
		return Newpassword;
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}


	public WebElement getChangepassword1() {
		return Changepassword1;
	}
	
	
	

}
