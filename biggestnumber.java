import java.util.*;
public class biggestnumber {
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int[] array;
		int n,i,max = Integer.MIN_VALUE;
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
			if(array[i]>max)
				max = array[i];
		}
		System.out.println("Largest element is " + max);
		}
		
	}
}
