package While;
class whileExp11
{
public void print1to100()
{	int a=1;
int b[]={1,2,3,4};



	while(a<=100)   //101<=100
{
	
	System.out.println(a+" hi");
	a++;//101
	
}

}
public void print1to100numbers()
{	int a=0;  //variable declaration
	while(a<100)//condition
{
	
	System.out.println(a+" hi"); //statements
	a++;  //increment or decrement
	
}

}
}
public class Print0to100Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileExp11 w=new whileExp11();
		w.print1to100();
		w.print1to100numbers();
		
	}

}
