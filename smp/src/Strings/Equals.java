package Strings;
class CompareStrings
{
	String Name1="abcd",Name2="ABCD",Name3="abcd";
	public void Compare()
	{
		
		
		if(Name1.equals(Name2))//compares String equals or not with upper case and lower case letter
		{
			
			System.out.println("Name1 and Name2 Same");
			
		}
		else
		{
			
			System.out.println("Name1 and Name2 not Same");	
		}
	}
}
public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CompareStrings c=new CompareStrings();
c.Compare();
	}

}
