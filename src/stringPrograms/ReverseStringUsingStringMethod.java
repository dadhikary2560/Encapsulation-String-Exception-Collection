package stringPrograms;

public class ReverseStringUsingStringMethod {
public static void main(String[] args) {
	String s="Hello Debabrat";
	String reverse="";			//empty string
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	System.out.println("reverse string is: "+reverse);
}
}
