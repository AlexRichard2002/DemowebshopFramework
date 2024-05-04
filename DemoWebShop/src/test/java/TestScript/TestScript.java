package TestScript;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectRepositary.AccountSettings;
import ObjectRepositary.Computer;
import ObjectRepositary.ElectronicsPage;
import ObjectRepositary.JewelryPage;
import ObjectRepositary.ShoppingcartPage;
import ObjectRepositary.Webshoplogin;
import ObjectRepositary.WelcomePage;
import ObjectRepositary.Wishlistpage;



public class TestScript {
	
    @Test(priority = 1)
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.getLoginlink().click();
		driver.quit();
        
    }
    @Test(priority = 2)
    public void LoginPage() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.getLoginlink().click();
		
		Webshoplogin Login=new Webshoplogin(driver);
		//welcome.getLoginlink().click();
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		driver.quit();
    }
    @Test(priority = 3)
    public void invaliddatatoLogin() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.getLoginlink().click();
		
		Webshoplogin Login=new Webshoplogin(driver);
		welcomepage.getLoginlink().click();
		Login.getEmailtextfield().sendKeys("alexsanderrichard@gmail.com");
		Login.getPasswordtextfield().sendKeys("1234");
		Login.getLoginbutton().click();
		driver.quit();
    }
    @Test(priority = 4)
    public void BlankLoginPage() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.getLoginlink().click();
		
		Webshoplogin Login=new Webshoplogin(driver);
		welcomepage.getLoginlink().click();
		Login.getEmailtextfield().sendKeys("");
		Login.getPasswordtextfield().sendKeys("");
		Login.getLoginbutton().click();
		driver.quit();
    }
   
    @Test(priority = 5)
    public void Computerpage() {
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
		
		welcomepage.getComputerlink().click();
		driver.quit();
    	
    }
    
    @Test(priority = 6)
    public void Desktoplink() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		Webshoplogin Login=new Webshoplogin(driver);
		Computer computer=new Computer(driver);
		
		welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getComputerlink().click();
		computer.getDesktopslink().click();
		computer.getAddtocartbutton().click();
		driver.quit();
    }
    
    @Test(priority = 7)
    public void ChangeSpecification() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
		Webshoplogin Login=new Webshoplogin(driver);
		Computer computer=new Computer(driver);
		
		welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getComputerlink().click();
		computer.getDesktopslink().click();
		computer.getAddtocartbutton().click();
		computer.getFastprocessorbutton().click();
		computer.getGBrambutton().click();
		computer.getHddbutton().click();
		computer.getSoftwarecheckbox().click();
		computer.getAddtocart2().click();
		driver.quit();
    }
    
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
    
    @Test(priority = 16)
    public void Orderbuttonverification() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        AccountSettings accountdetails=new AccountSettings(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getRegisterlink().click();
		accountdetails.getOrderbutton().click();
		driver.quit();
    }
    
    @Test(priority = 17)
    public void Orderdetailsverification() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        AccountSettings accountdetails=new AccountSettings(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getRegisterlink().click();
		accountdetails.getOrderbutton().click();
		accountdetails.getOrderdetails1().click();
		driver.quit();
    }
    
    @Test(priority = 18)
    public void Downloadbleproducts() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        AccountSettings accountdetails=new AccountSettings(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getRegisterlink().click();
		accountdetails.getDownloadableproductsbutton().click();
        driver.quit(); 
    }
    
    @Test(priority = 19)
    public void Rewardpoints() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        AccountSettings accountdetails=new AccountSettings(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getRegisterlink().click();
		accountdetails.getRewardpointsbutton().click();
		driver.quit();
    }
    
    @Test(priority = 20)
    public void ChangePasswordbutton() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        AccountSettings accountdetails=new AccountSettings(driver);
		
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getRegisterlink().click();
        accountdetails.getChangepasswordbutton().click();
        driver.quit();
    }
    
    @Test(priority = 21)
    public void Newpassword() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        AccountSettings accountdetails=new AccountSettings(driver);
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		

		welcomepage.getRegisterlink().click();
		accountdetails.getChangepasswordbutton().click();
		accountdetails.getOldpassword().sendKeys("123456");
		accountdetails.getNewpassword().sendKeys("123456");
		accountdetails.getConfirmpassword().sendKeys("123456");
		accountdetails.getChangepassword1().click();
		driver.quit();
    }
    
    @Test(priority = 22)
    public void Electronicspage() {
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
		
		welcomepage.getElectronicslink().click();
		driver.quit();
    }
    
    @Test(priority = 23)
    public void Cellphonepage() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        ElectronicsPage electronicsPage=new ElectronicsPage(driver);
        
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getElectronicslink().click();
		electronicsPage.getCelllphonelink().click();
		driver.quit();
    }
    
    @Test(priority = 24)
    public void Smartphonepage() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        ElectronicsPage electronicsPage=new ElectronicsPage(driver);
        
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getElectronicslink().click();
		electronicsPage.getCelllphonelink().click();
		electronicsPage.getSmartphonelink().click();
		driver.quit();
    }
    
    @Test(priority = 25)
    public void Addtowishlist() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        ElectronicsPage electronicsPage=new ElectronicsPage(driver);
        
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getElectronicslink().click();
		electronicsPage.getCelllphonelink().click();
		electronicsPage.getSmartphonelink().click();
		electronicsPage.getAddtowishlist().click();
		driver.quit();
    }
    @Test(priority = 26)
    public void Addtocartlist() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        ElectronicsPage electronicsPage=new ElectronicsPage(driver);
        
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getElectronicslink().click();
		electronicsPage.getCelllphonelink().click();
		electronicsPage.getSmartphonelink().click();
		electronicsPage.getAddtocart().click();
		driver.quit();
    }
    
    @Test(priority = 27)
    public void Wishlist() {
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
		
		welcomepage.getWishlistlink().click();
		driver.quit();
		
    }
    
    @Test(priority = 28)
    public void wishlistToAddtocart() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        Wishlistpage wishlist=new Wishlistpage(driver);
        
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getWishlistlink().click();
		wishlist.getAddtocartcheckbox().click();
		wishlist.getAddtocartbutton().click();
		driver.quit();
		
    }
    @Test(priority = 29)
    public void Searchproduct() {
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
		
		welcomepage.getSearchtext().sendKeys("Jewelry");
		welcomepage.getSearchbutton().click();
		driver.quit();
    }
    
    @Test(priority = 30)
    public void Viewontheproduct() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomepage=new WelcomePage(driver);
        Webshoplogin Login=new Webshoplogin(driver);
        JewelryPage jewelry=new JewelryPage(driver);
        
        welcomepage.getLoginlink().click();
		
		
		Login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		Login.getPasswordtextfield().sendKeys("123456");
		Login.getLoginbutton().click();
		
		welcomepage.getSearchtext().sendKeys("Jewelry");
		welcomepage.getSearchbutton().click();
		jewelry.getJewelryproduct().click();
		driver.quit();
    }
    
    
}

