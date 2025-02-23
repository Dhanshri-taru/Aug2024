/*4) Find Floor and Ceil of a Given Number in a Sorted Array

Write a Java program to find the floor and ceil of a given number in a sorted array using binary search.
*/


import java.util.*;
public class FindFloorCeilNumSortedArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the aray in sorted order:");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.printl("Enter the target number:");
		int target = sc.nextInt();
		int floor = findFloor(arr,target);
		int ceil = findCeil(arr,target);
		System.out.println("Floor of "+target + ":" +floor);
		System.out.println("Ceil of "+target + ":" +ceil);
	}
	public static int findFloor(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			if(arr[mid] == target)
			{
				retrun arr[mid];
			}
			else if(arr[mid] < target)
			{
				start = mid+1;
			} else{
				end = mid-1;
			}
		}
		return arr[end];
	}
	public static int findCeil(int[] arr,int target)
	{
		int start = 0;
		int end = arr.length - 1;
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			if(arr[mid] == target)
			{
				return arr[mid];
			}
			else if(arr[mid] < target)
			{
				start = mid+1;	
			} else{
				end = mid-1;
			}
		}
		return arr[start];
	}
}














