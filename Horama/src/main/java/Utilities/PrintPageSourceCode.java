package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintPageSourceCode {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://www.horamait.com");
	    String PageCode=Browser.getPageSource();
	    System.out.println(PageCode);
	}

}
