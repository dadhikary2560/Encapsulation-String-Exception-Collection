package stringPrograms;

import java.util.Arrays;

public class MidLevel {

	//1 Remove duplicate characters from a string and reverse the rest.
	private void first() {
		String s="programming";
		String arr[]=new String[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			boolean isDuplicate=false;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					isDuplicate=true;
					count++;
					break;
				}
			}
			if(!isDuplicate)
				arr[i]=String.valueOf(s.charAt(i));
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		//the above removes the duplicate from the string
		
		
		//moves null character to the right
		String temp[]=new String[s.length()];
		int count2=0;
		for(int i=0;i<temp.length;i++)
		{
			if(arr[i]!=null)
			{
				temp[count2]=arr[i];
				count2++;
			}
			else
				continue;
		}
		System.out.println(Arrays.toString(temp));
		
		
		//shortens the array without null values
		String result[]=Arrays.copyOf(temp, temp.length-count);
		System.out.println(Arrays.toString(result));
		
		
		
		//prints the array in reverse order
		for(int i=result.length-1;i>=0;i--)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		MidLevel obj=new MidLevel();
		obj.first();
	}
}
