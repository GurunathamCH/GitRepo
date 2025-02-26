package Interfaces;
class Subject implements Class1  //Interface to class inheritance
{
	public void Classes()
	{
		System.out.println(SchoolName);
		System.out.println("Total Classes 4");
	}
	public void Classtimings()
	{
		
		System.out.println("9 AM to 4 PM");
		
	}
	
	public void Activity() {
		// TODO Auto-generated method stub

		System.out.println("Games");
	}

}
public class NoramalClass {
	public static void main(String a[])
	{
		
		Subject s=new Subject();
		//System.out.println("School name "+s.SchoolName);
		s.Classes();
	}
}
