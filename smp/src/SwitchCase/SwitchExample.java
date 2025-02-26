package SwitchCase;

class DisplayDayNumber
{
	public void DispayNumberBasedOnDay()
	{
		String day="Tuesday";
		switch(day)
		{
		case "Monday":
		{
			System.out.println("1");
			break;
			
		}
		
		
		case "Tuesday":
		{
			System.out.println("2");
			break;
			
		}
		case "WednesDay":
		{
			System.out.println("3");
			break;
			
		}
		case "Thursday":
		{
			System.out.println("4");
			break;
			
		}
		case "Friday":
		{
			System.out.println("5");
			break;
			
		}
		case "Saturday":
		{
			System.out.println("6");
			break;
			
		}
		case "Sunday":
		{
			System.out.println("7");
			break;
			
		}
		default:
			System.out.println("not a valid day");
		}
		
		
		
	}


}

public class SwitchExample {

	public static void main(String[] args) {
		DisplayDayNumber d =new DisplayDayNumber();
		d.DispayNumberBasedOnDay();
		//Display Week Day name bases on given number
	
		
		// TODO Auto-generated method stub
/*
		int a=9;
switch(a)
   	{
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wedns Day");
	break;
	
	
case 4:
	System.out.println("Trues Day");
	break;
	
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Sat Day");
	break;
case 7:
	System.out.println("Sunday");
	break;
	
default:
	System.out.println("please enter number between 1 to 7");
		
   	}
   	*/
	}

}
