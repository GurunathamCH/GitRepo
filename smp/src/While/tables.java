package While;


class aaa
{
	
public void Table(int i)
{//int i=1;
int j=1;	
while(j<=100)
{
	
System.out.println(i+"*"+j+"="+(i*j));
j++;
}
}

public void Tableusingfor(int i)
{//int i=1;
for(int j=1;j<=100;j++)
{
	System.out.println(i+"*"+j+"="+(i*j));


}
}
public void tables()
{
	
int t=7,i=1;
while(i<=100)
{
	
System.out.println(t+"*"+i+"="+(t*i));
i++;
}

}

public void Print1to100Tables()
{
	for(int i=1;i<=100;i++)
	{
		
		
		for(int j=1;j<=10;j++)
		{
			
			System.out.println(i+"*"+j+"="+(i*j));
			
		}
	}

}
}
public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
aaa a=new aaa();
//a.Table(9);
a.Print1to100Tables();
	}

}
