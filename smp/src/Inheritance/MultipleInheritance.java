package Inheritance;

class AA extends ClassB implements Interface1
{

	@Override
	public void MethodInInterface() {
		// TODO Auto-generated method stub
	System.out.println("Interface method Implemented in Class");	
	}


}

public class MultipleInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //AA a=new AA();
		Interface1 I1;
		I1=new AA();
		
	
		I1.MethodInInterface();
		
	}

}
