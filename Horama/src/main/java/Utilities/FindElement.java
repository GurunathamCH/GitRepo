package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://horamait.com");
	    ///Browser.findElement(By.xpath("//*[@id='top-menu']/ul[1]/li[1]/a/span")).click();;
	    WebElement HomeLink=Browser.findElement(By.xpath("//*[@id='top-menu']/ul[1]/li[1]/a/span"));
	    WebElement ITCourcesLink=Browser.findElement(By.xpath("//*[@id='top-menu']/ul[1]/li[2]/a/span"));
	    ITCourcesLink.click();
	    WebElement CivilCourses=Browser.findElement(By.linkText("CIVIL COURSES"));
	    CivilCourses.click();
	    
	}

}
