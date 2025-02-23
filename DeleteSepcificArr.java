/*3) Delete a Specific Element from an Array

Create a Java program that allows the user to input an array and a specific value, then deletes all occurrences of that value while maintaining the order of other elements.
*/


import java.util.*;
public class DeleteSepcificArr
{
	public static int[] deleteElement(int[]arr,int target)
	{
		int[] result = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=target)
			{
				result[i]=arr[i];
				j++;
			}
		}
		return result;		
	}
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		System.out.println("Enter target");
		int target=sc.nextInt();
		int []result=deleteElement(arr,target);
		System.out.println("After deletion of array");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]+" ");
		}
	}
}
















