package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Utilities.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters extends GenericMethods{
	public WebDriver Browser;
@Test
@org.testng.annotations.Parameters({"Browser"})
public void openBrowser(String BrowserName)
{
	if(BrowserName.equalsIgnoreCase("Chrome"))
	{
		
		WebDriverManager.chromedriver().setup();
		Browser=new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Edge"))
	{
		
		WebDriverManager.edgedriver().setup();
		Browser=new EdgeDriver();
	}
	}

}
