package GentricLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepositary.Webshoplogin;
import ObjectRepositary.WelcomePage;

public class BasicClass {
	public WebDriver driver;
	
	@BeforeClass
	public void lanuchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void Login() {
		WelcomePage welcomepage=new WelcomePage(driver);
		Webshoplogin login=new Webshoplogin(driver);
		
		welcomepage.getLoginlink().click();
		login.getEmailtextfield().sendKeys("alexsanderrichard444@gmail.com");
		login.getPasswordtextfield().sendKeys("123456");
		login.getLoginbutton().click();
	}
	
	@AfterMethod
	public void Logout() {
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.getLogoutbutton().click();
	}
	
	@AfterClass
		public void CloseBrowser() {
		driver.quit();
	}

}
