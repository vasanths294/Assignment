import java.util.*;
public class Factorial {
	public static void main(String args[])
	{
		int i,n;
		long fac=1;
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		n = cin.nextInt();
		System.out.print("Factorial of "+n+" is ");
		for(i=1;i<=n;i++)
		{
			fac*=i;
		}
		System.out.println(fac);
	}
}
