import java.util.*;
public class Fibonacci {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		int n,i,a,b,c;
		System.out.println("Enter number of terms in fibonacci ");
		n = cin.nextInt();
		a = -1;
		b = 1;
		for(i=0;i<n;i++)
		{
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
