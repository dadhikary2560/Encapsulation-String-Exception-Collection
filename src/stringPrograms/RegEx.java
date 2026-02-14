package stringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
public static void main(String[] args) {
	String s="H3e11o 5ki11i0 W223d";
	String arr[]=s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		String rev="";
		for(int j=arr[i].length()-1;j>=0;j--)
		{
			rev=rev+arr[i].charAt(j);
		}
		System.out.print(rev+" ");
	}
	
	int res=0;
	Pattern p=Pattern.compile("\\d{2}"); // Here \d is for finding digit pattern
	Matcher m=p.matcher(s);				// matcher matches with the pattern 
	while(m.find())						//continues finding matches
	{
		res=res+Integer.parseInt(m.group()); //m.group='3' Integer=3
	}
	System.out.println(res);
}
}
