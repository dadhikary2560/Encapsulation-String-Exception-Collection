package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class EasyLevel {

	//1 Count total number of characters in a string (excluding spaces).
	private void first() {
		String s="Hello world, this is string program";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isWhitespace(s.charAt(i)))
				continue;
			else
				count++;
		}
		System.out.println("length of the string is: "+count);
	}
	
	//3 Reverse a string without using built-in reverse methods.
	private void third() {
		String s="Debabrat";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		System.out.println("reverse string is: "+rev);
	}
	
	//4 Check whether a string is palindrome.
	private void fourth() {
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		System.out.println("reverse string is: "+rev);
		if(rev.equals(s))
			System.out.println("string is palindrome: "+s);
		else
			System.out.println("string is not palindrome");
	}
	
	//5 Convert lowercase characters to uppercase and vice versa.
	private void fifth() {
		String s="MY NAME IS DEBABRAT";
		for(int i=0;i<s.length();i++)
		{
			System.out.print(Character.toLowerCase(s.charAt(i)));
		}
		System.out.println();
		System.out.println(s.toLowerCase());
	}
	
	//6 Count occurrence of a specific character in a string.
	private void sixth() {
		String s="Hello world, this is string program";
		System.out.println(s);
		System.out.println("enter one character of which you want to see occurence");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		sc.close();
		ch=Character.toLowerCase(ch);
		System.out.println("character entered is: "+ch);
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch2=s.charAt(i);
			if(ch2==ch)
				count++;
		}
		System.out.println("occurence of the letter: "+ch+" is: "+count);
	}
	
	//7 Remove spaces from a string.
	private void seventh() {
		String s="Hello world, this is string program";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isWhitespace(s.charAt(i)))
				continue;
			else
				System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	//8 Print each character of a string on a new line.
	private void eighth() {
		String s="Hello world, this is string program";
		for(int i=0;i<s.length();i++)
			System.out.println(s.charAt(i));
	}
	
	//9 Find ASCII value of each character in a string.
	private void ninth() {
		String s="Debabrat";
		for(int i=0;i<s.length();i++)
		{	
			int ascii=s.charAt(i);			//TYPECASTING FROM CHAR TO INT
			System.out.println("ascii code for "+s.charAt(i)+" is "+ascii);
		}
	}
	
	//10 Replace all vowels in a string with '*'.
	private void tenth() {
		String s="Hello world, this is string program";
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
					s.charAt(i)=='o' || s.charAt(i)=='u')
				arr[i]='*';
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		EasyLevel obj=new EasyLevel();
		obj.first();
		System.out.println("---------------------------------------------");
		obj.third();
		System.out.println("---------------------------------------------");
		obj.fourth();
		System.out.println("---------------------------------------------");
		obj.fifth();
		System.out.println("---------------------------------------------");
		obj.sixth();
		System.out.println("---------------------------------------------");
		obj.seventh();
		System.out.println("---------------------------------------------");
		obj.eighth();
		System.out.println("---------------------------------------------");
		obj.ninth();
		System.out.println("---------------------------------------------");
		obj.tenth();
	}
}
