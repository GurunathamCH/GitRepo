package Maps;

import java.util.HashMap;
import java.util.Map;

class MapExp
{Map<Integer,String>is=new HashMap<Integer,String>();// 1:a   2:b 3:c
	Map<String, Integer> hm;
void CreatingMap()
	{//Key Value pair
		// Creating an empty HashMap
       hm= new HashMap<String, Integer>();   //a 100==b 200==c 300 ==d:4000
	}
void InsertingValuesintoMap()
	{
		// Inserting pairs in above Map
        // using put() method
        hm.put("a", new Integer(100));
       // hm.put("a", new Integer(10000));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        hm.put("a", new Integer(10000));
		
	}
	void PrintingKeyandValue()
	{
		
		 // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
             hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
	}
	}
}
public class MapExample {

	public static void main(String a[])
	{
		MapExp m=new MapExp();
		m.CreatingMap();
		m.InsertingValuesintoMap();
		m.PrintingKeyandValue();
		
	}

}
