/*5) Left Rotate an Array by a Given Number of Positions

Implement a Java program that rotates an array to the left by a specified number of positions.
*/

import java.util.*;
public class LeftRotateArray 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the size of the array: ");
        	int n = sc.nextInt();

        	int[] arr = new int[n];
        	System.out.print("Enter the elements of the array: ");
        	for (int i = 0; i < n; i++) 
		{
            		arr[i] = sc.nextInt();
        	}

        	System.out.print("Enter the number of positions to rotate: ");
        	int positions = sc.nextInt();

        	rotateArray(arr, positions);

        	System.out.println("Rotated array: ");
        	printArray(arr);
    	}

    	public static void rotateArray(int[] arr, int positions) 
	{
        	positions = positions % arr.length;

        	reverseArray(arr, 0, arr.length - 1);
        	reverseArray(arr, 0, positions - 1);
        	reverseArray(arr, positions, arr.length - 1);
    	}

    	public static void reverseArray(int[] arr, int start, int end) 
	{
        	while (start < end) 
		{
            		int temp = arr[start];
            		arr[start] = arr[end];
            		arr[end] = temp;
            		start++;
            		end--;
        	}
    	}

    	public static void printArray(int[] arr) 
	{
        	for (int i = 0; i < arr.length; i++) 
		{
            		System.out.print(arr[i] + " ");
        	}
        	System.out.println();
    	}
}
