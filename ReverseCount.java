import java.lang.*;
import java.util.*;
 class ReverseCount
{
	public static void main(String[] args)
	{
		int vow=0;
		int con=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1; i>=0 ;i--)
		{
		 rev= rev+ str.charAt(i);
		}
		for(int i=0;i<str.length()-1;i++)
		{
			str=str.toLowerCase();
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vow++;
			}
			else if(ch==' ')
			{
			}
			else
			{
				con++;
			}
		
		}	
		System.out.print(" , the given string contains "+vow+"vowels and"+con+"consonants");
	}

}