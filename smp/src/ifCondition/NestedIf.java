package ifCondition;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a java program to verify if a even number is divisible by 6 or not
//else the number is divisible by 3 or not		
		
		
		int a=13;
		
		if(a%2==0)
			
		{
			System.out.println("even");
			if(a%6==0)
			{
				System.out.println(a+" is divisible by 6");
			
			}
			else
			{
				
				System.out.println(a+" is not divisible by 6");
				
			}
		
			
		}
		else
		{
			
			
			System.out.println("odd");
			
			
			if(a%3!=0)
			{
				
				System.out.println(a+" is not divisible by 3");
			}
			else
			{
				System.out.println(a+" is divisible by 3");
				
			}
		}
		
	}

}
