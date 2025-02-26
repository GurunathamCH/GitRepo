package ModularDrivenFramework;

import Utilities.GenericMethods;

public class Signup extends Home{

	public void SignUpIntoWebsite(String UserName,String Password)
{
	
	EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='sign-username']"), UserName);
	   EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='sign-password']"), Password);
	   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));

}
}
