package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class FileUploadUsingRobot extends GenericMethods{
	@Test(priority=0)
	public void UploadFile() throws InterruptedException, AWTException
	{
		//WebDriverManager.chromedriver().setup();//
		//WebDriver Browser=new ChromeDriver();//
		//System.out.println("browser opened"); 

	    // Browser.get("https://www.tgsrtcbus.in/oprs-web/");
		OpenBrowser("Chrome");
	     NavigateToURL("https://easyupload.io/");
	     Thread.sleep(3000);
	    ClickOnWebElement(FindWebElemenetByXpath("//*[@id='dropzone']/div[2]/button"));
	    Thread.sleep(3000);
	    Robot rt=new Robot(); 
	    rt.keyPress(KeyEvent.VK_A); 
	    rt.keyRelease(KeyEvent.VK_A); 
	    rt.keyPress(KeyEvent.VK_B); 
	    rt.keyRelease(KeyEvent.VK_B); 
	    rt.keyPress(KeyEvent.VK_B); 
	    rt.keyRelease(KeyEvent.VK_C); 
	    rt.keyPress(KeyEvent.VK_C); 
	    rt.keyPress(KeyEvent.VK_PERIOD); 
	    rt.keyRelease(KeyEvent.VK_PERIOD); 
	    rt.keyPress(KeyEvent.VK_J); 
	    rt.keyRelease(KeyEvent.VK_J); 
	    rt.keyPress(KeyEvent.VK_P); 
	    rt.keyRelease(KeyEvent.VK_P); 
	    rt.keyPress(KeyEvent.VK_G); 
	    rt.keyRelease(KeyEvent.VK_G); 
	    rt.keyPress(KeyEvent.VK_ENTER); 
	    rt.keyRelease(KeyEvent.VK_ENTER); 

	    
	    

	    
}
}
