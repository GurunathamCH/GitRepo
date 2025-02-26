package P1;

public class AB {
protected void p1()
{
	System.out.println("Protected in P1");

}
public void publicmethod()
{
	System.out.println("Public void method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifiers am=new AccessModifiers();
am.DefaultMethod();
am.ProtectedMethod();
	}

}
