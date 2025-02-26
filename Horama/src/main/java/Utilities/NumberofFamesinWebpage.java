package Utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberofFamesinWebpage {
	
	WebDriver Browser;
	
	List<WebElement>frames; 
	@BeforeTest
	
	public void openbrowser() 
	{ WebDriverManager.chromedriver().setup();
	Browser=new ChromeDriver();
	//System.out.println("browser opened"); 

     Browser.get("http://www.angelfire.com/super/badwebs/");
     //Browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);} //Main Page
	}
	@Test 
	public void frames() throws InterruptedException 
	{ 
	frames=Browser.findElements(By.tagName("frame")); //iframe
	System.out.println(frames.size()); 
	Browser.switchTo().frame(1);   //switch to Frame 1
	//Thread.sleep(10000);
	WebDriverWait wait = new WebDriverWait(Browser,30); 
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/p[5]/b/a/font"))); 

	Browser.findElement(By.xpath("html/body/p[5]/b/a/font")).click(); 
	Browser.switchTo().frame(2); 
	Browser.switchTo().defaultContent(); //go back to Main Page


	} 
}
