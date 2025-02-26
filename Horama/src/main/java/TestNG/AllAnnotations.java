package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllAnnotations {
	@BeforeSuite
	public void BeforeSuiteMethod()
	{
		System.out.println("Before Suite1");

	}
	@AfterSuite
	public void AfterSuiteMethod()
	{
		System.out.println("After Suite1");

	}
	@BeforeClass
	public void BeforeClassMethod()
	{
		System.out.println("Before Class1");

	}
	@AfterClass
	public void AfterClassMethod()
	{
		System.out.println("After Class1");

	}
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Before Test1");

	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{System.out.println("Before Method1");
		
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After  Method1");	
	}
	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("After Test1");

	}

	@Test()
	public void ActualTest1()
	{
		System.out.println("Test1 default priority 0");
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();


	}
	@Test(priority=1)
	public void ActualTest2()
	{
		System.out.println("Test2 priority 1");

	}

}
