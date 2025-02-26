package Exceptions;

public class Exception {
//Exception is run time Error,occurs due to invalid logic,which terminates program execution
	//Exception Handling Converting system error messages into user friendly error message
	public static void main(String[] args) {
		// TODO Auto-generated method stub

try
{
		System.out.println(1/0);
}
catch(ArithmeticException e)
{
	System.out.println("don't eneter 0 at demoninator");
}
		
		
		
	}

}
