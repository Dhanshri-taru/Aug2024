/*
	11) Insert a Value at a Specified Index in an Array
	Implement a Java program that allows the user to insert a specified value at a given index in an array while shifting elements accordingly.
*/
import java.util.*;
public class InsertValueSpecIndexArr
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[6];
		System.out.println("Enter The Array Elements");
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Array Index");
		int ind=s.nextInt();
		System.out.println("Enter Value for Inserting");
		int val=s.nextInt();
		for(int i=ar.length-1;i>ind;i--)
		{
			ar[i]=ar[i-1];
		}
		for(int i=0;i<ar.length;i++)
		{
			ar[ind]=val;
		}
		System.out.println("After Inserting Index Value");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
}