package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://www.google.com");
	    String PageTitle=Browser.getTitle();
	    System.out.println(PageTitle);
	    Browser.navigate().to("https://www.horamait.com");
	    System.out.println(Browser.getTitle());
	    Browser.navigate().back();
	    System.out.println(Browser.getTitle());
	}

}
