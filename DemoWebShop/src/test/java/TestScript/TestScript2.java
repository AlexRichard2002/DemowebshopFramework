package TestScript;




import org.testng.annotations.Test;

import GentricLibrary.BasicClass;
import ObjectRepositary.Computer;
import ObjectRepositary.WelcomePage;

public class TestScript2 extends BasicClass {
	 @Test(priority = 5)
	    public void Computerpage() throws InterruptedException {
		    WelcomePage welcomepage=new WelcomePage();
		    Thread.sleep(2000);
			welcomepage.getComputerlink().click();
	    	
	    }
	    
	    @Test(priority = 6)
	    public void Desktoplink() {
			
			WelcomePage welcomepage=new WelcomePage(driver);
			Computer computer=new Computer(driver);
		
			welcomepage.getComputerlink().click();
			computer.getDesktopslink().click();
			computer.getAddtocartbutton().click();
	    }
	    
	    @Test(priority = 7)
	    public void ChangeSpecification() {
	  
			WelcomePage welcomepage=new WelcomePage(driver);
			
			Computer computer=new Computer(driver);
			welcomepage.getComputerlink().click();
			computer.getDesktopslink().click();
			computer.getAddtocartbutton().click();
			computer.getFastprocessorbutton().click();
			computer.getGBrambutton().click();
			computer.getHddbutton().click();
			computer.getSoftwarecheckbox().click();
			computer.getAddtocart2().click();
			
	    }
	    
}
