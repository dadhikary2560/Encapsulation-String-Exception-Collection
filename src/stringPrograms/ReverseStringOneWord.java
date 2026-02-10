package stringPrograms;

import java.util.Scanner;

public class ReverseStringOneWord {
	public void ReverseString(String input) {
		// TODO Auto-generated method stub
		System.out.println(input);
		String arr[]=input.split(" ");
		String reverseFull="";
		for(int i=0;i<arr.length;i++)
		{
			String reverse="";
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				reverse=reverse+arr[i].charAt(j);
			}
			reverseFull=reverseFull+" "+reverse;
		}
		System.out.println("reverse string one word at a time: "+reverseFull);

	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	sc.close();
	ReverseStringOneWord obj=new ReverseStringOneWord();
	obj.ReverseString(s);
	
}
}
