package P1;

public class AccessModifiers {
/*
  Access modifiers help to restrict the scope of a class, constructor, variable, method, or data member. It provides security, accessibility, 
  etc to the user depending upon the access modifier used with the element. 
  
Default – No keyword required***only within the same package*****
Private-*****within the class*****
Protected*****accessible within the same package or subclasses in different packages*****
Public*****accessible from everywhere*****

 */
	int defaultVar=10;
	private int privatevariabe=100;
	private void PrivateMethod()
	{
		
		System.out.println("private Method");
	}
	void DefaultMethod()
	{
		
		System.out.println("Default Method");
	}
	
	protected void ProtectedMethod()
	{
		
		System.out.println("");
		
	}
	
}
