package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Computer {
	
	public Computer(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (partialLinkText = "Desktops")
	private WebElement Desktopslink;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	private WebElement addtocartbutton;
	
	@FindBy(id="product_attribute_74_5_26_82")
	private WebElement Fastprocessorbutton;
	
	@FindBy(id = "product_attribute_74_6_27_85")
	private WebElement GBrambutton;
	
	@FindBy(id = "product_attribute_74_3_28_87")
	private WebElement Hddbutton;
	
	@FindBy(id = "product_attribute_74_8_29_90")
	private WebElement softwarecheckbox;
	
	@FindBy(id="add-to-cart-button-74")
	private WebElement addtocart2;

	public WebElement getAddtocart2() {
		return addtocart2;
	}

	public WebElement getFastprocessorbutton() {
		return Fastprocessorbutton;
	}

	public WebElement getGBrambutton() {
		return GBrambutton;
	}

	public WebElement getHddbutton() {
		return Hddbutton;
	}

	public WebElement getSoftwarecheckbox() {
		return softwarecheckbox;
	}

	public WebElement getDesktopslink() {
		return Desktopslink;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	
	
	
		
	}


