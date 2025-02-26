package HomeScreen;

import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class TutorialsDemo extends  GenericMethods{
	@Test
	public void OpenBrowserWithName()
	{//Using Open Browser Method in bChlid Class
		
		OpenBrowser("Edge");
		NavigateToURL("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	}
	
	@Test(priority=1)
	public void PrintNumberOfDropDownsInPage()
	{
		System.out.println(FindListofDropdowns().size());
		
		
	}
	@Test(priority=2)
	public void PrintNumberOfLinksinPage()
	{
		
		System.out.println(FindListofLinks().size());
	}
	
	@Test(priority=3)
	public void EnterValuesintoNameFiled()
	{
		
		FindElementByID("name").sendKeys("gowtham");
	}
	@Test(priority=4)
	public void EnterValuesIntoNameTextFieldWithXpath()
	{
		
		FindWebElemenetByXpath("//*[@id='name']").sendKeys("Kriran");
		
		
	}
	@Test(priority=5)
	public void EneterValuesIntoEmail()
	{
		
		FindWebElementByCSSSelector("#email").sendKeys("abcs@gmail.com");
		
	}
	
	@Test(priority=6)
	public void ClickonName()
	{
		
		ClickOnWebElement(FindWebElemenetByXpath("//*[@id='name']"));
		
	}
	@Test(priority=7)
	public void EnterName()
	{
		EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='name']"), "Sravan");
		EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='name']"), "accc");
		
		
	}
	@Test(priority=8)
	public void CleartextInName() throws InterruptedException
	{
		Thread.sleep(3000);
		ClearTheTextFiled(FindWebElemenetByXpath("//*[@id='name']"));
		
	}
	@Test(priority=9)
	public void GetTextOfLink()
	{
		
		System.out.println("Text on WebElement "+GetTextOfWebEelemnt(FindWebElemenetByXpath("//*[@id='collapseTwo']/div/ul/li[1]/a")));
		
	}
	
	@Test(priority=10)
	public void GetLocationXandYofWebElement()
	{
		System.out.println("Element Xlocation "+getLocationXofWebElement(FindWebElemenetByXpath("//*[@id='collapseTwo']/div/ul/li[1]/a")));
		System.out.println("Element Y Location "+getLocationYofWebElement(FindWebElemenetByXpath("//*[@id='collapseTwo']/div/ul/li[1]/a")));
		
	}
	@Test(priority=11)
	public void getPlaceHolderValuesOfNameFiled()
	{
		System.out.println("Name Filed Place Holder "+GetAttributeValue(FindWebElemenetByXpath("//*[@id='name']"), "placeholder"));
		
		
	}
	@Test(priority=13)
	public void VerifyUploadFileOptionEnabledorNot()
	{ScrollPageDown();
	boolean Value=VerifyElementEnabledrOrNot(FindWebElemenetByXpath("//*[@id='practiceForm']/div[8]/div/div"));
	
		if(Value==true)
		{
			
			System.out.println("File Upload Option Enabled");
		}
		else
		{
			System.out.println("File Upload Option Disabled");
			
		}
	}
	@Test(priority=14)
	public void VerifyUploadFileOptionDisplayedorNot()
	{ScrollPageDown();
	boolean Value=VerifyElementDisplayerOrNot(FindWebElemenetByXpath("//*[@id='practiceForm']/div[8]/div/div"));
	
		if(Value==true)
		{
			
			System.out.println("File Upload Option Displayed");
		}
		else
		{
			System.out.println("File Upload Option Not Displayed");
			
		}
	}
	@Test(priority=15)
	public void VerifySportsCheckBoxIsSelectedorNot()
	{ScrollPageDown();
	ClickOnWebElement(FindWebElemenetByXpath("//*[@id='hobbies']"));
	boolean Value=VerifyElementSelectedOrNot(FindWebElemenetByXpath("//*[@id='hobbies']"));
	
		if(Value==true)
		{
			
			System.out.println("Sports check box is Selected");
		}
		else
		{
			System.out.println("Sports check box is not Selected");
			
		}
	}
	@Test(priority=16)
	public void SelectStateRajastanandCityAgra()
	{
		ClickOnWebElement(FindWebElemenetByXpath("//*[@id='state']"));
		SelectOptionInDropDownByVisibletext(FindWebElemenetByXpath("//*[@id='state']"), "NCR");
		//ClickOnWebElement(FindWebElemenetByXpath("//*[@id='city']"));
		//SelectOptionInDropDownByVisibletext(FindWebElemenetByXpath("//*[@id='city']"), "Agra");
		
		
	}
	
	@Test(priority=17)
	public void DeSelectStateRajastanandCityAgra()
	{
		//DeSelectOptionInDropDownByVisibiletext(FindWebElemenetByXpath("//*[@id='city']"), "Agra");
		//DeSelectOptionInDropDownByVisibiletext(FindWebElemenetByXpath("//*[@id='state']"), "NCR");
		DeSelectOptionInDropDownByIndex(FindWebElemenetByXpath("//*[@id='state']"), 1);
		//DeSelectOptionInDropDownByVisibiletext(FindWebElemenetByXpath("//*[@id='city']"), "Agra");
		
		
	}

}
