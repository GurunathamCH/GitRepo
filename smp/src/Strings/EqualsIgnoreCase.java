package Strings;
class CompareStringswithIgnoreCase
{
	String Name1="abcd",Name2="ABCD",Name3="abcd";
	public void Compare()
	{
		
		
		if(Name1.equalsIgnoreCase(Name2))  //compares String equals or not without upper case and lower case letter
		{
			
			System.out.println("Name1 and Name2 Same");
			
		}
		else
		{
			
			System.out.println("Name1 and Name2 not Same");	
		}
	}
}
public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CompareStringswithIgnoreCase ci=new CompareStringswithIgnoreCase();
ci.Compare();
	}

} 
