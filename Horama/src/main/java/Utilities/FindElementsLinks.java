package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Browser=new ChromeDriver();
	    Browser.get("https://horamait.com");
	    List<WebElement>Links=Browser.findElements(By.tagName("a"));
	    System.out.println("Links "+Links.size());
	    List<WebElement>TextFields=Browser.findElements(By.xpath("//input[@type='text']"));
	    System.out.println("Text Fileds "+TextFields.size());
	    List<WebElement>RadioButtos=Browser.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("RadioButtons "+RadioButtos.size());
	    List<WebElement>CheckBoxes=Browser.findElements(By.xpath("//input[@type='checkbox']"));
	    System.out.println("CheckBoxes "+CheckBoxes.size());
	  
	    
	}

}
