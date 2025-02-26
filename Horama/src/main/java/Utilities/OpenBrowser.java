package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver Browser;///Interface 
//Open Chrome Browser
WebDriverManager.chromedriver().setup();
Browser=new ChromeDriver();//Class
//Edge Browser
WebDriverManager.edgedriver().setup();
Browser=new EdgeDriver();
//Internet Exploler
WebDriverManager.iedriver().setup();
Browser=new InternetExplorerDriver();

/*
ChromeDriver Chrome=new ChromeDriver();  //Class
EdgeDriver edge=new EdgeDriver();//class
InternetExplorerDriver ie=new InternetExplorerDriver();//class
*/
	
	
	}

}
