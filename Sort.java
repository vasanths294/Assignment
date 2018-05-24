import java.util.*;
public class Sort {
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int[] array;
		int n,i;
		System.out.println("Enter total number of elements in array");
		n = cin.nextInt();
		if(n==0)
		{
			System.out.println("Array is empty");
		}
		else
		{
		array = new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			array[i] = cin.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted array is ");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		}
		
	}
}
