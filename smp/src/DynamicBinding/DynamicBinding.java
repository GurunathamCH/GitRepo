package DynamicBinding;
class Parent1
{
public void ParentClassMethod()
{
	System.out.println("Parent Class method in Parent class");
}

}
class child1 extends Parent1
{
	public void ParentClassMethod()
	{
		System.out.println("Parent Class method in Child Class1");
	}
	
	public void ChildClassMethod()
	{
		System.out.println("Child Class Method");
	}
}
class child2 extends Parent1
{
	public void ParentClassMethod()
	{
		System.out.println("Parent Class method in Child Class2");
	}
	public void Display()
	{
		System.out.println("ow work c2");
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Parent1 p;  //object Declaration
//p=new child1();//object initialization(Object Refferenc)
		//Dynamic Binding is the process of binding parent class object to Child Class
Parent1 p1=new child1();//Dynamic Binding

p1.ParentClassMethod();//calling method 

Parent1 P2=new child2();
P2.ParentClassMethod();



	}

}
