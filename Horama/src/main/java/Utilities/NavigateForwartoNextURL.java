package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateForwartoNextURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://www.google.com");
	    Thread.sleep(2000);
	    Browser.navigate().to("https://www.horamait.com");
	    Thread.sleep(2000);
	    Browser.navigate().back();
	    Thread.sleep(2000);
	    Browser.navigate().forward();
	}

}
