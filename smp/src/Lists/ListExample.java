package Lists;

import java.util.ArrayList;
import java.util.List;


class listFunctions
{//Collection used to Store Group of Values
	//Collections support CRUD operations
	//C=Create
	//R=Read
	List<String> values=new ArrayList<String>(); //Create String List
	
	public void AddElementsToList()
	{
		values.add("ABC");//index 0  //insert Add values into list
		values.add("DEF");//index 1
		values.add("SDF");// index 2
		values.add("SDF");
		
		// ABC DEF SDF
	}
	public void UpdateElementsList()
	{
		values.set(0, "Sravan");  //Update values within the list
		values.set(2, "Shiva");
	
		//Sravan DEF Shiva
	}
	public void DeleteElemeninList()
	{
		
		values.remove(1);//Delete value in List with Index
		//Sravan Shiva
	}

	public void GetandPrintElementsOfList()
	{
		for(int i=0;i<values.size();i++)  //Read Getting the Values From List
		{
			String ListValue=values.get(i);  //values.get(0)=Sravan   values.get(1)=Shiva
			//Get values from List normal Array a[0],in List a.get[0]
			System.out.println(ListValue);
		}
	}
}
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listFunctions l=new listFunctions();
		l.AddElementsToList();
		System.out.println("Printing after adding the elements");
		l.GetandPrintElementsOfList();
		l.UpdateElementsList();
		System.out.println("Printing after Updating the elements");
		l.GetandPrintElementsOfList();
		l.DeleteElemeninList();
		System.out.println("Printing after deleting the elements");
		l.GetandPrintElementsOfList();
		
		
	}

}
