package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class BeforeTestAfterTest extends GenericMethods {
@BeforeTest



public void OpenBrowser()
{
	OpenBrowser("Chrome");
}
@Test(priority=0)
public void NvigateToURL()
{
	NavigateToURL("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
}
@Test(priority=1)
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

@AfterTest
public void CloseBrowser()
{
CloseCurrentWindow();


}
}
