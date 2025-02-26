package TestNG;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class DragSlider extends GenericMethods {
	@Test(priority=0)
	public void DragSlider() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();//
		//WebDriver Browser=new ChromeDriver();//
		//System.out.println("browser opened"); 

	    // Browser.get("https://www.tgsrtcbus.in/oprs-web/");
		OpenBrowser("Chrome");
	     NavigateToURL("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
	     ScrollPageDown();
	     int LocationX=FindWebElemenetByXpath("//*[@id='slider']/span").getLocation().x;
	     int LocationY=FindWebElemenetByXpath("//*[@id='slider']/span").getLocation().y;
	     Actions Ac=new Actions(Browser);
	    Ac.dragAndDropBy(FindWebElemenetByXpath("//*[@id='slider']/span"), LocationX, 50).build().perform();;
}
}
