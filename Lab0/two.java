import java.util.*;
import java.io.*;

public class two 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true)
		{
			System.out.println("1. Check if string palindrome");
			System.out.println("2. Write the string in alphabetical order");
			System.out.println("3. Compare 2 strings");
			System.out.println("4. Toggle String");
			System.out.println("5. Check for substring");
			System.out.println("6. Exit");
			int a = sc.nextInt();
			int l;
			if(a==1)
			{
				int k = 1;

				String s = sc.next();
				l = s.length();
				for(int i = 0; i<l/2; i++)
				{
					if( s.charAt(i) != s.charAt(l-1-i) )
						k = 0;
				}
				if(k == 1)
					System.out.println("Palindrome\n");
				else
					System.out.println("Not a palindrome\n");	
			}
			if(a==2)
			{
				String s = sc.next();
				l = s.length();

				char b[] = new char[l];
				for(int i=0;i<l;i++)
					b[i] = s.charAt(i);
				char t;
				for(int j=0;j<l-1;j++)
				{
					for(int k=0;k<l-1-j;k++)
				  	{
				   		if(b[k]>b[k+1])
				   		{
				   			t=b[k];
						    b[k]=b[k+1];
						    b[k+1]=t;
			   			}
			  		}
				}
				System.out.println("\nOriginal word : " +s);
				System.out.print("Sorted word : ");
				for(int m=0;m<l;m++)
					System.out.print(b[m]);
				System.out.print("\n");
			}
			if(a==3)
			{
				String s1 = sc.next();
				String s2 = sc.next();
				int k = 1;
				int l1 = s1.length();
				int l2 = s2.length();
				if(l1!=l2)
				{
					System.out.println("Not equal\n");
				}
				else
				{
					for(int i = 0 ; i<l1;i++)
					{
						if(s1.charAt(i)!= s2.charAt(i))
						{
							k=0;
							break;
						}
					}
					if(k==0)
					{
						System.out.println("Not equal\n");
					}
					else 
						System.out.println("Equal\n");
				}
			}
			if(a==4)
			{
				
				String s = sc.next();
				
				l = s.length();
				char b[] = new char[l];
				for(int i=0;i<l;i++)
					b[i] = s.charAt(i);
				
				for (int i = 0; i < l; i++)
    			{
			        char c = b[i];
			        if (Character.isUpperCase(c))
			        {
			            b[i] = Character.toLowerCase(c);
			        }
			        else if (Character.isLowerCase(c))
			        {
			            b[i] = Character.toUpperCase(c);
			        }
    			}
				for(int m=0;m<l;m++)
					System.out.print(b[m]);
				System.out.println("\n");
			}
			if(a==5)
			{
				String s1 = sc.next();
				String s2 = sc.next();
				if(s1.toLowerCase().contains(s2.toLowerCase()) )
					System.out.println("Yes , String 2 is a substing os string 1");
				else
					System.out.println("No, not a substring"+"\n \n");
			}
			if(a==6)
			{
				System.exit(0);
			}
		}
	}
}