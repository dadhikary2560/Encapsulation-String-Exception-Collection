package stringPrograms;

public class DigitsFromString {
public static void main(String[] args) {
	String s="H3ll0 5k11110";
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			System.out.print(s.charAt(i)+" ");
			System.out.println(String.valueOf(s.charAt(i)));
		}
	}
	
	
	//sum of all digits in a String
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
			sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
		//Integer.parseInt is used to convert string value to integer value
	}
	System.out.println("sum of all digits: "+sum);
}
}
