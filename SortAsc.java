import java.util.*;
public class SortAsc {
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		String[] array;
		int n,i;
		System.out.println("Enter total number of arrays");
		n = cin.nextInt();
		array = new String[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			array[i] = cin.next();
		}
		Arrays.sort(array);
		System.out.println("Sorted array is ");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}
}
