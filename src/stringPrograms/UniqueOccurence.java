package stringPrograms;

public class UniqueOccurence {
public static void main(String[] args) {
	String s="Hello java, my name is Debabrat Adhikary";
	
	for(int i=0;i<s.length();i++)
	{
		boolean isDuplicate=false;
		for(int k=0;k<i;k++)
		{
			if(s.charAt(i)==s.charAt(k))
			{
				isDuplicate=true;
				break;
			}
		}
		if(isDuplicate)
			continue;
		int count=1;
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
				count++;
		}
		if(count==1)
			System.out.println(s.charAt(i)+" "+count+"  ");
	}
}
}
