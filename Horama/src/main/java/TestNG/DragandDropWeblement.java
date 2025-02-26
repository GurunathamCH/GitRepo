package TestNG;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class DragandDropWeblement extends GenericMethods{
	@Test(priority=0)
	public void DoubleclickOnWebElement() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();//
		//WebDriver Browser=new ChromeDriver();//
		//System.out.println("browser opened"); 

	    // Browser.get("https://www.tgsrtcbus.in/oprs-web/");
		OpenBrowser("Chrome");
	     NavigateToURL("https://demo.guru99.com/test/drag_drop.html");
	     ScrollPageDown();
	     Actions Ac=new Actions(Browser);
	     
	     Ac.dragAndDrop(FindWebElemenetByXpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"), FindWebElemenetByXpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li")).build().perform();;
	     
	}

}
