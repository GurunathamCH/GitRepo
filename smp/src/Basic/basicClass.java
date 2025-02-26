package Basic;
class basic
{//A class is structure and collection of Data members and members functions
	//data member :Variables used to store and manipulate data
	//member functions:Methods or Functions used to implement the logic
	
//Class Object DataAbstraction Encapsulation Inheritance Polymorphism DynamicBinding MrssagePassing
int a;   //number VaribleName
final int b=40;
final String UserName="Das",Password="Test@123";

//Variable is Name given to memory which is used to store a value
//Variable name can't be changed,u can change the value 


void Display()//ReturnType MethiodNmae
{String Firstname="SA",LastName="DAS";
String name=Firstname+" "+LastName;
System.out.println(name);

	a=10;
	a=34;
System.out.println(a);
System.out.println(UserName+" "+Password);
for(int i=1;i<=100;i++)
{//1  2 3
	for(int j=1;j<=10;j++)
	{
		//1 2      10
		System.out.println(i+"*"+j+"="+i*j);
	}
	//j=0;
	//i++
}

//0 10 20 30 ... 500   
/*
for
{
	System.out.println();
}

1*1=1
1*2=2


1*10=10
*/

//print 1 to 100 tables
}
}

public class basicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
basic b=new basic();// object is an instance of a class,instance means allocating the memory
b.Display();
	}

}
