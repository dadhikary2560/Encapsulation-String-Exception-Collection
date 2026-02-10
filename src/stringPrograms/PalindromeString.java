package stringPrograms;

public class PalindromeString {
public static void main(String[] args) {
	String s="Malayalam";
	String rev="";
	//s=s.toLowerCase();		changes case to lowercase
	for(int i=s.length()-1;i>=0;i--)
		rev=rev+s.charAt(i);
	System.out.println(rev);
	if(rev.equals(s))
		System.out.println("string is palindrome");
	System.out.println("original string: "+s);
}
}
