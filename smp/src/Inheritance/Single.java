package Inheritance;
class Fruits//parent
{
	String Name="Any Fruit";
	void displayMthodFruits()
	{
		
		System.out.println(Name);
	}

}

class Apple extends Fruits   //child
{

void displayMthodApple()
{
	System.out.println("Method in Child class");
}
}
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple a=new Apple();  //child class object
	  a.displayMthodFruits();  //calling parent class related method
	  System.out.println(a.Name);//calling parent class related Variable
	  a.displayMthodApple();//calling child class method
Fruits F=new Fruits();
F.displayMthodFruits();


	}

}
