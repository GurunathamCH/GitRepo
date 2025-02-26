package HomeScreen;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class HomePage extends GenericMethods{
	
	@Test
	public void OpenBrowserWithName()
	{//Using Open Browser Method in bChlid Class
		
		OpenBrowser("cHrome");
		NavigateToURL("https://www.horamait.com");
		System.out.println(GetPageTitle());
		System.out.println(GetCurrentURL());
		NavigateToURL("https://www.horamait.com/it-courses");
		System.out.println(GetPageTitle());
		System.out.println(GetCurrentURL());
		//https://www.horamait.com/it-courses
		NavigateToPriviousURL();
		System.out.println(GetPageTitle());
		System.out.println(GetCurrentURL());
		NavigateForward();
		System.out.println(GetPageTitle());
		System.out.println(GetCurrentURL());
		//System.out.println(getPageSourceCode());
		PageRefresh();
		CloseCurrentWindow();
	}

}
