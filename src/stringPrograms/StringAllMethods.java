package stringPrograms;

public class StringAllMethods {
public static void main(String[] args) {
	String s=new String("Hello World");	//Heap Memory
	String t="Hello World";				//String Constant Pool
	System.out.println(s==t);			//so should return false
	//compares addresses				//as no connection between HEAP and SCP
	
	
	//reverse a string
	String palindrome="malayalam";
	String rev="";
	System.out.println(palindrome.length());
	for(int i=palindrome.length()-1;i>=0;i--)
	{
		rev=rev+palindrome.charAt(i);
	}
	System.out.println(rev);
	
	//check if string is palindrome or not
	if(rev.equals(palindrome))
		System.out.println("string is palindrome");
	else
		System.out.println("not palindrome");
	
	//make upper case or lower case
	String uppercase="debabrat";
	System.out.println(uppercase.toUpperCase());
	String lowercase=uppercase.toLowerCase();
	System.out.println(lowercase);
	
	//using charAt method
	System.out.println(lowercase.length());
	for(int i=0;i<lowercase.length();i++)
	{
		System.out.print(lowercase.charAt(i)+" ");
	}
	System.out.println();
	
	//find index using indexOf and lastIndexOf
	System.out.println(lowercase.indexOf('b'));
	System.out.println(lowercase.lastIndexOf('b'));
	
	System.out.println(s);
	
	//split method
	String arr[]=s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
