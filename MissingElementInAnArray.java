package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray 
{
	public static void main(String[] args) 
	{
		// Here is the input
		int[] arr = {1,2,3,4,5,7,8};

		// Sort the array	
		Arrays.sort(arr);
		int length=arr.length;
		System.out.println(arr.length);
		// loop through the array (start i from arr[0] till the length of the array)
		
		for(int i=0;i<(length-1);i++)
		{
			// check if the iterator variable is not equal to the array values respectively
			if((arr[i])!=(i+1))
			{
				// print the number
				System.out.println("Missing number is "+(i+1));
				break;
			}
			// once printed break the iteration
		}
	}

}
