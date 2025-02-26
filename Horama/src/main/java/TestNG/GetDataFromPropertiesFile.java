package TestNG;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties; 


import org.testng.annotations.Test;

public class GetDataFromPropertiesFile {
@Test(priority=0)
public void GetDataFromPropertiesFiles() throws IOException
{
	
	FileInputStream fis=new FileInputStream("D:\\Final\\Repo\\Horama\\src\\main\\java\\Credentials.properties"); 
	Properties pos=new Properties();
	pos.load(fis);
	System.out.println(pos.getProperty("UserName"));
	String Password=pos.getProperty("Password");
	System.out.println(Password);
	System.out.println(pos.getProperty("URL"));
}
}
