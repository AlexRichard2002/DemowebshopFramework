package GentricLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods {
	
	public static void getWebpageScreenshot(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File permanent=new File("./screenshots/"+ getTime() +".png");
		
		try {
			FileHandler.copy(temp, permanent);
		}catch(IOException e) {
			e.printStackTrace();
		}
		}

public static void getWebElementScreenshot(WebElement element) {
   File temp=element.getScreenshotAs(OutputType.FILE);
   
   File permanent=new File("./Screenshots/"+getTime()+".png");
   
}
