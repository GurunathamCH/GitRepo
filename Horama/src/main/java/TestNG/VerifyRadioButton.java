package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class VerifyRadioButton extends GenericMethods{
	@Test(priority=0)

	@org.testng.annotations.Parameters({"Browser"})

	public void OpenBrowser(String Browser)
	{
		OpenBrowser(Browser);
	}
	@Test(priority=1)
	public void NvigateToURL()
	{
		NavigateToURL("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
	@Test(priority=2)
	public void VerifyGenderRadioButtonDisplayingOrNot()
	{
		if(VerifyElementDisplayerOrNot(FindWebElemenetByXpath("//*[@id='gender']"))==true)
		{
			
			System.out.println("Element Displayed");
			
		}
		else
		{
			
			System.out.println("Element not Displayed");
		}

	}

	@Test(priority=3)
	public void CloseBrowser()
	{
	CloseCurrentWindow();


	}
}
