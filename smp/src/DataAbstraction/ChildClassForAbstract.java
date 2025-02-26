package DataAbstraction;


class Child1 extends AbstractClass
{
	public void Tree()
	{
		
		System.out.println("Banana Tree");
	}
}


public class ChildClassForAbstract{
	//AbstractClass a1=new Child1();
	public static void main(String a[])
{
		AbstractClass a1=new Child1();
		a1.Tree();//Implemented in Child Class
		a1.Display();
	
}
}
