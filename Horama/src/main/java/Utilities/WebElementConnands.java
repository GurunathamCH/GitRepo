package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConnands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	    Browser.findElement(By.xpath("//*[@id='gender']")).click();//Browser object
	    WebElement Gender=Browser.findElement(By.xpath("//*[@id='gender']"));  //Gender Web Element object
	    Gender.click();
	    WebElement Name=Browser.findElement(By.xpath("//*[@id='name']"));
	    Name.sendKeys("ACBC32r");
	    WebElement Link=Browser.findElement(By.xpath("//*[@id='collapseTwo']/div/ul/li[1]/a"));
	    String Text=Link.getText();
	    System.out.println(Text);
	    
	    System.out.println(Link.getText());
	    int Xlocation=Link.getLocation().x;
	    int YLocation=Link.getLocation().y;
	    System.out.println("Element X Location "+Xlocation+" Element Ylocation "+YLocation);
	    
	    String HrefValue=Link.getAttribute("href");
	    System.out.println("H ref of link "+HrefValue);
	    
	    System.out.println("Name Element Attributes Name"+Name.getAttribute("name")+" placeholder"+Name.getAttribute("placeholder"));
	    
	    Boolean Displayed=Link.isDisplayed();
	    System.out.println("enabled or not "+Displayed);
	    
	    System.out.println("Element enabled or not"+Link.isEnabled());
	    
	    JavascriptExecutor js = (JavascriptExecutor) Browser;
	    js.executeScript("window.scrollBy(0,250)", "");
	    WebElement SportsCheckbox=Browser.findElement(By.xpath("//*[@id='hobbies']"));
	    SportsCheckbox.click();
	    System.out.println("Ceheck box selected or not "+SportsCheckbox.isSelected());
	    
	    
	    WebElement StateDropDown=Browser.findElement(By.xpath("//*[@id='state']"));
	    
	  //  List<WebElement> Options=StateDropDown.findElements(By.tagName("option"));
	    Select Sc=new Select(StateDropDown);
	    Sc.selectByVisibleText("NCR");
	    Sc.selectByIndex(2);
	    Sc.deselectByIndex(2);
	  
	 
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
