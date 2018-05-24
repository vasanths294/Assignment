import java.util.Scanner;
public class Numberofchar  {
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		String a;
		System.out.println("Enter string");
		a = cin.nextLine();
		char[] array = a.toCharArray();
		//System.out.print(a);
		int i,l = a.length(),lower=0,upper=0,special=0,digit=0;
		for(i=0;i<l;i++)
		{
			if(array[i]>='a'&&array[i]<='z')
			{
				lower++;
			}
			else if(array[i]>='A'&&array[i]<='Z')
			{
				upper++;
			}
			else if(array[i]>='0'&&array[i]<='9')
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		
			System.out.println("Uppercase "+upper+"\nLower "+lower+"\ndigit "+digit+"\nSpecial characters "+special);
		
	}
}
