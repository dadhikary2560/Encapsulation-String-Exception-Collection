package stringPrograms;

public class ReverseStringUsingStringMethodPART2 {
public static void main(String[] args) {
	String s=new String("Debabrat");
	String arr[]=s.split("");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]);
	}
}
}
