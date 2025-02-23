/*
	8) Find the Missing Elements in a Sorted Array
	Implement a Java program that identifies missing numbers 
	in a sorted sequence of integers.
*/
import java.util.*;
public class FindMissElmInSortedArr
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Shorted Array");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("\nMissing Elements");
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}		
	}
}