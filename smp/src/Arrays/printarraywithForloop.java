package Arrays;

public class printarraywithForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,4,6,7,3};  //Declaration and initialization
//       0 1 2 3 4
//if array size is N,index of array will ends with N-1 and Starts with Zero
System.out.println("array length "+a.length);
for(int i=0;i<a.length;i++)  //5<5 false
{
	System.out.println(i+" "+a[i]); // a[0]   a[1]  a[2]  a[3] a[4] 

}


	}

}
