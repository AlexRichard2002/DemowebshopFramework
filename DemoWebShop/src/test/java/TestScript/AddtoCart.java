package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepositary.ShoppingcartPage;
import ObjectRepositary.Webshoplogin;
import ObjectRepositary.WelcomePage;

public class AddtoCart {
	@Test(priority =8 )
    public void ShoppingCartLink() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		welcomepage.getShoppingcartlink().click();
		driver.quit();
		
    }
    
    @Test(priority = 9)
    public void ShoppingCartpage() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		driver.quit();
		
    
    } 
    
    @Test(priority = 10)
    public void BillingAddress() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		shoppingcart.getContinue1button().click();
		driver.quit();
    }
    
    @Test(priority = 11)
    public void ShippingAddress() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		shoppingcart.getContinue1button().click();
		shoppingcart.getContinue2button().click();
		driver.quit();
    }
    @Test(priority = 12)
    public void shippingMethod() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		shoppingcart.getContinue1button().click();
		shoppingcart.getContinue2button().click();
		shoppingcart.getContinue3button().click();
		driver.quit();
    }
    
    @Test(priority = 13)
    public void Paymentmethod() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		shoppingcart.getContinue1button().click();
		shoppingcart.getContinue2button().click();
		shoppingcart.getContinue3button().click();
		shoppingcart.getContinue4button().click();
		driver.quit();
    }
    
    @Test(priority = 14)
    public void Paymentinformation() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		shoppingcart.getContinue1button().click();
		shoppingcart.getContinue2button().click();
		shoppingcart.getContinue3button().click();
		shoppingcart.getContinue4button().click();
		shoppingcart.getContinue5button().click();
		driver.quit();
    }
   
    
    @Test(priority = 15)
    public void Orderstatus() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		ShoppingcartPage shoppingcart=new ShoppingcartPage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getShoppingcartlink().click();
		
		WebElement country=shoppingcart.getCountrydropdown();
		
		Select countryselect=new Select(country);
		countryselect.selectByVisibleText("India");
		
		shoppingcart.getZipcodetextfield().sendKeys("624002");
		shoppingcart.getTermofservice().click();
		shoppingcart.getCheckoutbutton().click();
		shoppingcart.getContinue1button().click();
		shoppingcart.getContinue2button().click();
		shoppingcart.getContinue3button().click();
		shoppingcart.getContinue4button().click();
		shoppingcart.getContinue5button().click();
		shoppingcart.getContinue6button().click();
		shoppingcart.getContinue7button().click();
		driver.quit();
    }
    
}
