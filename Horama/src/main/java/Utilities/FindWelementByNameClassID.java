package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWelementByNameClassID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	   
	    
	    //WebElement Name=Browser.findElement(By.id("name"));
	    WebElement Name=Browser.findElement(By.xpath("//*[@id='name']"));
	    Name.click();
	    
	    WebElement Email=Browser.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/div/input"));
	    Email.sendKeys("acdc@gmail");
	    
	    WebElement GenderMale=Browser.findElement(By.cssSelector("#gender"));
	    GenderMale.click();
	    List<WebElement>Radios=Browser.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println(Radios.size());
	    //#gender
	    
	    //input[@type='text'] text field
	    //input[@type='email']  email field
	    //input[@type='password'] password text field\
	    //input[@type='submit']   submit button
	    //input[@type='cancel'] b  cancel button
	    //input[@type='radio']   radio button
	    //input[@type='checkbox']  checkbox
	    //select dropdown
	    //table webtable
	    //frame  //iframe frame 
	    
	}

}
