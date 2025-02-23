/*1) Add Zero to Start of Array

Write a Java program to take an array of integers as input and move all zeros to the start while maintaining the order of other elements.
Add Zero to End of Array

Implement a Java program that moves all zeros in an array to the end while keeping the order of non-zero elements unchanged.
*/

public class MoveZeroEnd
{
	public static void MoveZero(int a[])
	{
		int size=a.length;
		int index=0;
		
		for(int i=index;i<size;i++)
		{
			if(a[i]!=0)
			{
				a[index]=a[i];
				index++;
			}
		}
		while(index <size)
		{
		a[index]=0;
		index ++;
		}
	}
	public static void displayArray(int a[])
	{  
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}
	public static void main(String x[])
	{
		
		int arr[]={1,2,0,3,0,4};
		MoveZeroEnd.displayArray(arr);
		System.out.println("______________");
		MoveZeroEnd.MoveZero(arr);
		MoveZeroEnd.displayArray(arr);
	}
}
