class MOL
{
	//Method overloading:method name is same and method heading is different in a class(different number of parameters or order of parameter or oder of parameters)
	//Method overriding:method name is same and method body is different in multiple inherited classes
	void Display()
	{
		
		System.out.println("Display message given");
	}
	void Display(int a)///Method Heading
	{
		//method Body
		System.out.println("print int a value "+a);
		
	}
	void Display(float b)///Method Heading
	{
		//method Body
		System.out.println("print float b value "+b);
		
	}
	void Display(int a,int b)
	{
		System.out.println("print int a value "+a+"b value "+b);
		
	}
	void Display(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	void Display(float a,int b)
	{
		
		
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOL m=new MOL();
		m.Display(3, 7);
	}

}
