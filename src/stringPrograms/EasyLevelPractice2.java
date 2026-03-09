package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class EasyLevelPractice2 {

	private static void m1(Scanner obj) {
		System.out.println("enter choice 1.Remove spaces from a string"
				+ "2. Print each character of a string on a new line."
				+ "3. ASCII code for each character"
				+ "4. replace all vowels with *"
				+ "5. if a4b3 then prints aaaabbb and vice versa"
				+ "6. reverse expected from 5");
		int choice = obj.nextInt();

		if (choice == 1) {
// Remove spaces from a string.
			String s = "Hello Tester! this is new string method";
			String res = "";
			for (int i = 0; i < s.length(); i++) {
				if (Character.isWhitespace(s.charAt(i)))
					continue;
				else
					res = res + s.charAt(i);
			}
			System.out.println(res);
		}
//8 Print each character of a string on a new line.
		if(choice ==2)
		{
			String s="Debabrat";
			for(int i=0;i<s.length();i++)
				System.out.println(s.charAt(i));
		}
//9 Find ASCII value of each character in a string.
		if(choice==3)
		{
			String s="Debabrat";
			for(int i=0;i<s.length();i++)
			{
				int ascii_code=s.charAt(i);
				System.out.print(ascii_code+" ");
			}
		}
//10 Replace all vowels in a string with '*'.
		if(choice==4)
		{
			String s="Hello java, this is string program";
			s=s.toLowerCase();
			String res="";
			Character arr[]=new Character[s.length()];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.charAt(i);
				
				if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i'
						|| arr[i]=='o' || arr[i]=='u')
					arr[i]='#';
				
				res=res+arr[i];
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(res);
		}
//1) i/p:  a4b3c2a1 
		/*
		 * O/p: aaaabbbcca1 And vice versa
		 * 
		 * 2) abc // a1b2c3 and vice versa
		 */	
		if(choice==5)
		{
			String s="a4b3c2a1";
			
			for(int i=0;i<s.length()-1;i++)
			{
				int count=1;
				if(Character.isDigit(s.charAt(i+1)))
				{
					count=Integer.parseInt(String.valueOf(s.charAt(i+1)));
					for(int j=0;j<count;j++)
					{
						System.out.print(s.charAt(i));
					}
				}
			}
		}
	//reversal of aaaabbbcca expected Output=a4b3c2a1
		if(choice==6)
		{
			String s="aaaaaaaabbbbbbccaadb";
			for(int i=0;i<s.length()-1;i++)
			{
				int count=1;
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
						count++;
					else
						break;
				}
				System.out.print(s.charAt(i)+""+count);
				i=i+count-1;				//this step is very important
										//increasing i simultaneously, 
										//and skipping same letters
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m1(sc);
	}
}
