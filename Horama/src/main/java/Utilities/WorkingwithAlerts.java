package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithAlerts {
	
	@Test
	public void openbrowser() throws InterruptedException 
	{ WebDriverManager.chromedriver().setup();
	WebDriver Browser=new ChromeDriver();
	//System.out.println("browser opened"); 

     Browser.get("https://www.tgsrtcbus.in/oprs-web/");
     //Thread.sleep(3000);
     Browser.findElement(By.xpath("//*[@id='searchBtn']")).click();;
     Thread.sleep(3000);
     System.out.println(Browser.switchTo().alert().getText()); //Text of Alert
     Browser.switchTo().alert().accept();// Accept Alert/Click on OK Button
    // Browser.switchTo().alert().sendKeys("abc");
     
     
     //Browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);} //Main Page
	}
}
