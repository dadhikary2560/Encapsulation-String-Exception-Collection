package stringPrograms;

public class OccurenceOfEachCharacter {
	//IIIINNDDDIIIAAAAAA
	//I4N2D3I3A6
	public void india() {
		String s="IIIINNDDDIIIAAAAAA";
		for (int i = 0; i < s.length(); i++) {

		    int count = 1;
		    int j;

		    for (j = i + 1; j < s.length(); j++) {
		        if (s.charAt(i) == s.charAt(j))
		            count++;
		        else
		            break;
		    }

		    System.out.print(s.charAt(i) + "" + count);

		    // Move i to last counted character
		    i = j - 1;
		}

	}
	
public static void main(String[] args) {
	OccurenceOfEachCharacter obj=new OccurenceOfEachCharacter();
	obj.india();
	System.out.println();
	
	
	String s=new String("Hello World");
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
		int count=1;
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
				count++;
		}
		if(count>0 && !Character.isWhitespace(s.charAt(i)))
			System.out.println("Occurence of letter "+s.charAt(i)+" is: "+count);
	}
}
}
