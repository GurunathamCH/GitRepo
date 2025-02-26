package While;


class whileExp
{

	public void printevenbetween1to100()
	{	int a=1;
		while(a<=100)   //101<=100
	{
		
		if(a%2==0)
		{
			
			System.out.println(a);
		}
			
			
		a++;  //101
		
	}
		
}
	
	
}

public class PrintEvenNumbersbetween1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileExp w1=new whileExp();
		w1.printevenbetween1to100();
	}

}
