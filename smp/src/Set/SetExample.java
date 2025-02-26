package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SetExp
{ /*
The Set Interface is present in java.util package and extends the Collection interface. 
It is an unordered collection of objects in which duplicate values cannot be stored.
*/
	Set<String>Names;  //Set Declaration
	void SetCreate()
	{
		
		Names=new HashSet<String>();  //Set Declaration
		
	}
	void AddingElementsToSet()
	{
		
		
		Names.add("Sravan");
		Names.add("Shiva");
		Names.add("Kiran");
		Names.add("Shiva");
		Names.add("Shiva");
	}
	
	void RemovingTheElementsinSet()
	{
		
		Names.remove("Shiva");
		
	}
	
	void GetValuesOfSetUsingIterator()
	{
		
		Iterator i=Names.iterator();//Storing set into iterator
		while(i.hasNext())//if iterator index contains element
		{
			
			System.out.println(i.next());//get the Element
			
		}
		
	}
	
	

}
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExp se=new SetExp();
		se.SetCreate();
		se.AddingElementsToSet();
		System.out.println("Set after adding the elements");
		se.GetValuesOfSetUsingIterator();
		se.RemovingTheElementsinSet();
		System.out.println("Set after Removing the elements");
		se.GetValuesOfSetUsingIterator();
	}

}
