package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.GenericMethods;

public class Signup extends GenericMethods{
	FileInputStream FIS;
	FileOutputStream FOS;
	XSSFWorkbook WOB;
	XSSFSheet WOS;
	Row r;
	@Test(priority=0)
	public void SignUp() throws InterruptedException, IOException
	{
		FIS=new FileInputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");
		WOB=new XSSFWorkbook(FIS);
		WOS=WOB.getSheet("USERS");
		
	   OpenBrowser("Chrome"); 
	   //NavigateToURL("https://www.demoblaze.com/");
	    Browser.manage().window().maximize();
	   for(int i=1;i<=WOS.getLastRowNum()+1;i++)
	   {NavigateToURL("https://www.demoblaze.com/");
	     //Browser.manage().window().maximize();
		   //NavigateToURL("https://www.demoblaze.com/");
		   Thread.sleep(5000);
	  r=WOS.getRow(i);
	   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signin2']"));
	   Thread.sleep(2000);
	   EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='sign-username']"), r.getCell(0).getStringCellValue());
	   EnterValuesIntoTextFiled(FindWebElemenetByXpath("//*[@id='sign-password']"), r.getCell(1).getStringCellValue());
	   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));
	   //Sign up successful.   success
	   Thread.sleep(3000);
	   if(Browser.switchTo().alert().getText().contains("Sign up successful."))
	   {
		   r.createCell(3).setCellValue("Pass");
		   FOS=new FileOutputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");
		   WOB.write(FOS);
		   Browser.switchTo().alert().accept();
		   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signInModal']/div/div/div[3]/button[1]"));
		   
		   Thread.sleep(2000);
	   }
	   else
	   {
		   r.createCell(3).setCellValue("Fail"); 
		   FOS=new FileOutputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");
		   WOB.write(FOS);
		   Browser.switchTo().alert().accept();
		   Thread.sleep(2000);
		   ClickOnWebElement(FindWebElemenetByXpath("//*[@id='signInModal']/div/div/div[3]/button[1]"));
		  
		   Thread.sleep(2000);
		   
	   }
	   
	   //
	   
	   }
	   FOS=new FileOutputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");
	   WOB.write(FOS);
	}
}
