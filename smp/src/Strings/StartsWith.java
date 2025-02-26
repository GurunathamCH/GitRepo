package Strings;
class StartsWithExp
{
	String A="Good Morning",B="Good",C="Morning";
	public void VerifyWordExistornot()
	{
	if(A.startsWith(B))
		{
			
			
			System.out.println(A+" Starts with "+B);
		}
		else
		{
			System.out.println(A+" not Starts with "+B);
			
		}
		
	}
	public void EndswithExp()
	{
		
		if(A.endsWith(C))
		{
			
			
			System.out.println(A+" Ends with "+C);
		}
		else
		{
			System.out.println(A+" not Ends with "+C);
			
		}
	}
}
public class StartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartsWithExp s=new StartsWithExp();
		s.VerifyWordExistornot();
		s.EndswithExp();
	}

}
