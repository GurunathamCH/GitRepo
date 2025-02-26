package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
	    Browser.findElement(By.name("username")).sendKeys("QAGuru");
	    WebElement Password=Browser.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input"));
	    Password.sendKeys("Test");
	}

}
