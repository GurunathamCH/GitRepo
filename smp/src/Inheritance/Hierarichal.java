package Inheritance;
class Parent1
{
	int property=100000000;
public void ParentProperty()
{
	System.out.println("Parent property "+property);
}
}


class Child1 extends Parent1
{
	

}

class Child2 extends Parent1
{
	
}
class Child3 extends Parent1
{
	public void Chil3Own()
	{
		
		
		System.out.println("Child 3 own property");
	}

}
public class Hierarichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1=new Child1();
		c1.ParentProperty();
		Child2 c2=new Child2();
		c2.ParentProperty();
		Child3 c3=new Child3();
		c3.ParentProperty();
		c3.Chil3Own();

	}

}
