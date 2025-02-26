package While;
class whil
{

	public void print100to0()
	{	int a=100;
		while(a>=0)   //100 99 98       0
	{
		
		System.out.println(a);
		a--;//99   98 97  0 -1
		
	}
	
	}
	public void print100to1numbers()
	{	int a=100;  //variable declaration
		while(a>=1)//condition
	{
		
		System.out.println(a); //statements
		a--;  //increment or decrement
		
	}
	
	}
}
public class Print100to0Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
whil w=new whil();
//w.print100to0();
w.print100to1numbers();

	}

}
