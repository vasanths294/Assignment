import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		String a;
		System.out.println("Enter string to check Palindrome");
		a = cin.nextLine();
		char[] array = a.toCharArray();
		//System.out.print(a);
		int flag=0,i,l = a.length();
		for(i=0;i<l/2;i++)
		{
			if(array[i]!=array[l-i-1])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
