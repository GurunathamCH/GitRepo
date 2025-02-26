package Inheritance;
class GrandParent   //parent
{
	void Assets()  
	{
		
		System.out.println("Home");
	}

}
class Parent extends GrandParent  //sub/intermediate base class
{
	void Assets()
	{
		
		System.out.println("Company");
	}
}
class child extends Parent     //sub/intermediate base class
{
	void Assets()
	{
		
		System.out.println("stock market");
	}
}
class subchild extends child    //Derived Class

{
	void Assets()
	{ 
		//polymorphism=inheritance+method overriding
		System.out.println("international market");
	}
}
public class MultiLevel {

	public static void main(String[] args) {

subchild sc=new subchild();
sc.Assets();


//Class
//Object
//Data Abstraction
//Data Encapsulation
//Inheritance
//Polymorphism
//Dynamic Binding
//message Passing

//Interfaces
//Access Specifiers and Access Modifiers
//Collections
//Exception Handling
	}

}
