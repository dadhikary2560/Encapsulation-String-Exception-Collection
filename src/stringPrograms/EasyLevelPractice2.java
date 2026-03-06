package stringPrograms;

import java.util.Scanner;

public class EasyLevelPractice2 {

	private static void m1(Scanner obj) {
		System.out.println("enter choice 1.Remove spaces from a string"
				+ "2. Print each character of a string on a new line."
				+ "3. ASCII code for each character");
		int choice = obj.nextInt();

		if (choice == 1) {
// Remove spaces from a string.
			String s = "Hello Tester! this is new string method";
			String res = "";
			for (int i = 0; i < s.length(); i++) {
				if (Character.isWhitespace(s.charAt(i)))
					continue;
				else
					res = res + s.charAt(i);
			}
			System.out.println(res);
		}
//8 Print each character of a string on a new line.
		if(choice ==2)
		{
			String s="Debabrat";
			for(int i=0;i<s.length();i++)
				System.out.println(s.charAt(i));
		}
//9 Find ASCII value of each character in a string.
		if(choice==3)
		{
			String s="Debabrat";
			for(int i=0;i<s.length();i++)
			{
				int ascii_code=s.charAt(i);
				System.out.print(ascii_code+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m1(sc);
	}
}
