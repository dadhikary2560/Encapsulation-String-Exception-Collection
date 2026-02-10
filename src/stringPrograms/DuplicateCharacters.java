package stringPrograms;

public class DuplicateCharacters {
public static void main(String[] args) {
	String s="Hello world";
	
	for(int i=0;i<s.length();i++)
	{
		boolean isFound=false;
		for(int k=0;k<i;k++)
		{
			if(s.charAt(i)==s.charAt(k))
			{
				isFound=true;
				break;
			}
		}
		if(isFound)
			continue;
		int count=0;
		char a=s.charAt(i);
		for(int j=i+1;j<s.length();j++)
		{
			char b=s.charAt(j);
			if(a==b)
				count++;
		}
		if(count>0)
			System.out.println("duplicate for "+a+" "+count);
	}
}
}
