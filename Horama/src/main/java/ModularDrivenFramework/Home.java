package ModularDrivenFramework;

import Utilities.GenericMethods;

public class Home extends GenericMethods{
	public void AnyOpenBrowser(String BrowserName)
	{OpenBrowser(BrowserName);
		
	}
	public void NavigateAnyURL(String URL)
	{
		NavigateToURL(URL);
	}
	public void ClickOnSignup()
	{
		
		ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signin2']"));
		
	}

	public void SignUpIntoWebsite(String UserName,String Password)
{
	
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='sign-username']"), UserName);
	 
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='sign-password']"), Password);
	   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));

}
	public void CliCkonLoginLink()
	{
		ClickOnWebElement(FindWebElemenetByXpath("//*[@id='login2']"));
	}
public void LogintoWebsite(String UserName,String Password)
{
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='loginusername']"), UserName);
	 
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='loginpassword']"), Password);
	   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='logInModal']/div/div/div[3]/button[2]"));

}
public void ClickOnProduct(String Xpath)
{
	ClickOnWebElement(FindWebElemenetByXpath(Xpath));

}

public void AddProcuctToCart() throws InterruptedException
{
	ClickOnWebElement(FindWebElemenetByXpath("//*[@id='tbodyid']/div[2]/div/a"));
	Thread.sleep(3000);
	Browser.switchTo().alert().accept();

}
public void VerifyCartProducts()
{
	ClickOnWebElement(FindWebElemenetByXpath("//*[@id='navbarExample']/ul/li[4]/a"));
	
}
public void ClickOnPalceOrder()
{
	
	
	ClickOnWebElement(FindWebElemenetByXpath("//*[@id='page-wrapper']/div/div[2]/button"));
}
public void PlaceOrder(String Name,String Country,String City,String CreditCard,String Month,String Year)
{
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='name']"),Name);
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='country']"),Country);
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='city']"),City);
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='country']"),Country);
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='card']"),CreditCard);
	ScrollPageDown();
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='month']"),Month);
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='year']"),Year);
	////*[@id="orderModal"]/div/div/div[3]/button[2]
	ClickOnWebElement(FindWebElemenetByXpath("//*[@id='orderModal']/div/div/div[3]/button[2]"));
	
	///html/body/div[10]/div[7]/div/button
	
	
}
public void VerifyOrderConfiramation()
{
	
	ClickOnWebElement(FindWebElemenetByXpath("//html/body/div[10]/div[7]/div/button"));

}
}
