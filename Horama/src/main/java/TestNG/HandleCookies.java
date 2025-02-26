package TestNG;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {
	WebDriver driver; 
	Cookie name;
@Test(priority=0)
public void ADDCookies()
{WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(); 

driver.get("https://www.google.com"); 
name = new Cookie("mycookie", "123456789123");  //Create Cookie
driver.manage().addCookie(name);    //Add Cooke to Browser
// After adding the cookie we will check that by displaying all the cookies. 
Set<Cookie> cookiesList = driver.manage().getCookies(); 
for(Cookie getcookies :cookiesList) { 
System.out.println(getcookies );
}
driver.manage().deleteCookie(name); //delete cookie with the name
System.out.println("after deleting number of cookies are "+driver.manage().getCookies().size()); 
System.out.println("after deleting names of cookies"); 
Set<Cookie> cookiesList1 = driver.manage().getCookies(); 
for(Cookie getcookies :cookiesList1) { 
System.out.println(getcookies ); 
}
driver.manage().deleteAllCookies(); //delete all cookies
System.out.println("number of cookies after delete all "+driver.manage().getCookies().size()); 
}
	

}
