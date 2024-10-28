package smp;
class thisExp
{//whenever class level variable names and method parameter names are same
	//to differentiate both 
//this keyword====used to refer current class object	
	
	int a=20,b;//class level variable
	
	public void add(int a,int b)//method parameters
	{//System.out.println(a);
	//System.out.println(b);
		System.out.println("method peramater a value with input parameter:"+a);
		System.out.println("befor updating class lavel a value:"+this.a);
		this.a=a;   //store input value into class level variable a
		System.out.println("after updating class level a the value"+this.a);
		System.out.println(a);
	
	}
	public void ChangeValues()
	{System.out.println("before update a value:"+a+" b vaue:"+b);
		a=40;
		b=50;
		
		System.out.println("after update a value:"+a+" b vaue:"+b);
	}
}
public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisExp t=new thisExp();
		//t.ChangeValues();
		t.add(3,4);
	}

}
