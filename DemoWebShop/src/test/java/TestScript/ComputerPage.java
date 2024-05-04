package TestScript;

import static org.testng.AssertJUnit.assertEquals;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepositary.Computer;
import ObjectRepositary.Webshoplogin;
import ObjectRepositary.WelcomePage;


public class ComputerPage {
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
		String actualResult=welcomepage.getComputerlink().getText();	
	
	    //actualResult.(actualResult, "Computers");
		//welcomepage.getComputerlink().click();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualResult, "Books");
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
}
