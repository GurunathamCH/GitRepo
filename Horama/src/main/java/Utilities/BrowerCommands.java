package Utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowerCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*
 
get() : It is used to get a URL and used to get a value 
navigate()-to()-forward()-back()-refresh() :It can perform navigate to a page,navigate back to the previous page,navigate forward to the next page and page refresh. 
getTitle() :Used to get page Title 
getCurrentURL() :Used to get the URL of the Current Page 
getPageSource() :Used to get the Source code of the page 
findElement() :used to find an element 
findElements() :Used to find multiple element 
getWindowHandle() :Used to get Unique ID of a Webpage(Root/Parent web Page ) 
getWindowHandles() :Used to Get Uniwebque ID’s of Multiple web pages Including parent and child web pages 
switchTo() :Used to Switch from One page to another page,Used to Switch from page to frame and frame to frame. 
close() :Used to Close the Current Web Page of the browser quit() :Used to close all the web pages of the web browser 
manage() :Used to manage Timeouts and Cookies 

 */
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://www.google.com");
	    Browser.navigate().to("https://www.horamait.com");
	    Browser.navigate().back();
	    Browser.navigate().forward();;
	    Browser.navigate().refresh();
	   String PageTitle= Browser.getTitle();
	   String PageURL=Browser.getCurrentUrl();
	   String PageSourceCode=Browser.getPageSource();
	   Browser.close();
	    */
	 
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://demoqa.com/browser-windows");
	    Thread.sleep(5000);
	    Browser.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) Browser;
	    js.executeScript("window.scrollBy(0,100)", "");
	    Browser.findElement(By.xpath("//*[@id='tabButton']")).click();
	    String ParentWindowID=Browser.getWindowHandle();   //ParentID
	    Set<String>AllWindowIDs=Browser.getWindowHandles();//ParentID ChildID
	    Iterator<String> iterator = AllWindowIDs.iterator();
	    
	    while(iterator.hasNext())
	    {
	    	 String ChildWindow = iterator.next();
	    	 
	    	 if(!ParentWindowID.equals(ChildWindow))
	    	 {
	    		 Browser.switchTo().window(ChildWindow);
	    		 Thread.sleep(4000);
	    		 //Browser.close();
	    		 
	    		 Browser.switchTo().defaultContent();
	    		 Browser.quit();
	    		 
	    	 }
	    	 
	    	
	    }

	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
