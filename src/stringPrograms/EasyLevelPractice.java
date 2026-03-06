package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class EasyLevelPractice {

//1 Count total number of characters in a string (excluding spaces).
	private void m1() {
		String s = "Hello programmer this is string";
		System.out.println("total character with white space: " + s.length());

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i)))
				continue;
			else
				count++;
		}
		System.out.println("total number of characters in the string is: " + count);
	}

//2 Count vowels and consonants in a string.
	private static void m2() {
		String s = "Deb8Abr@T A$dhik4ary";
		s = s.toLowerCase();
		int consonanat = 0, vowel = 0, digit = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u')
					vowel++;
				else
					consonanat++;
			} else if (Character.isDigit(s.charAt(i))) {
				System.out.println("Digits available are: " + s.charAt(i));
				digit++;
			} else
				System.out.println("special characters are: " + s.charAt(i));
		}
		System.out.println("no of total digits available: "+digit);
		System.out.println("no of vowels available " + vowel);
		System.out.println("no of consonants availbale " + consonanat);
	}

//Reverse a string without using built-in reverse methods.
	private static void m3() {
		char ch = 47;
		char ch2 = '$';
		int unicode = ch2;

		System.out.println(ch);
		System.out.println(unicode);

		String s = "Java Programming";
		String arr[] = new String[s.length()];
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			arr[j] = Character.toString(s.charAt(i));
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 1) capital the first letter of each word in the given string
	 */

	private static void m4() {
		String s = "my name is debabrat";
		String arr[] = s.split(" ");
		System.out.println(Arrays.toString(arr)); // has each word as one element

		String res = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (j == 0)
					res = res + (Character.toUpperCase(arr[i].charAt(j)));
				else
					res = res + (arr[i].charAt(j));
			}
			res = res + " ";
		}
		System.out.println(res);
	}

//2) Remove 1st letter from each word and capital the second word
	private static void m5() {
		String s = "my name is debabrat";
		String arr[] = s.split(" ");

		String res = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (j == 0)
					continue;
				else if (j == 1)
					res = res + Character.toUpperCase(arr[i].charAt(j));
				else
					res = res + arr[i].charAt(j);
			}
			res = res + " ";
		}
		System.out.println(res);
	}

	/*
	 * 1) Reverse a string "automation" 2) Reverse a string array : I/p:
	 * " java selenium" O/P: "Selenium java"
	 */

	private static void m6() {
		String s = "automation";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// second part

		String a = "java selenium";
		String arr[] = a.split(" ");
		String reverse = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse + arr[i];
			reverse = reverse + " ";
		}
		System.out.println(reverse);
	}

	private static void m7(Scanner obj) {
		System.out.println("enter choice 1. for palindrome" + 
	"2. to make character uppercase or lowercase"
	+ "3. each odd word capitalise 4.occurrence of a specific character");
		int choice = obj.nextInt();

		// Check whether a string is palindrome.
		if (choice == 1) {
			String s = "malayalam";
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				rev = rev + s.charAt(i);
				System.out.println(rev);
			}
			if (rev.equals(s))
				System.out.println("original string is palindrome: " + s);
		}

		// 5 Convert lowercase characters to uppercase and vice versa.
		if (choice == 2) {
			String s = "Hello java, this is string program";
			s = s.toLowerCase();
			String res = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 != 0)
					res = res + Character.toUpperCase(s.charAt(i));
				else
					res = res + s.charAt(i);
			}
			System.out.println(res);
		}
		
		//each odd word capitalize
		if (choice == 3) {
			String s = "Hello java, this is string program";
			String arr[] = s.split(" ");
			String res = "";
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 != 0)
					res = res + arr[i].toUpperCase();
				else
					res = res + arr[i];
				res = res + " ";
			}
			System.out.println(res);
		}
		
		
		//Count occurrence of a specific character in a string.
		if(choice==4)
		{
			String s = "Hello java, this is string program";
			s=s.toLowerCase();
			System.out.println("please enter the character you want to search for");
			char c=obj.next().charAt(0);
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==c)
					count++;
			}
			System.out.println("the count for "+c+" is: "+count);
		}
	}

	public static void main(String[] args) {
		EasyLevelPractice obj = new EasyLevelPractice();
		Scanner sc = new Scanner(System.in);
		obj.m1(); //count characters without whitespace
		 m2(); //count consonant | vowel | digits | special characters
		 m3(); //reverse a string
		 m4(); //capitalize the first letter from each word
		 m5(); // Remove 1st letter from each word and capital the second word
		 m6(); //reverse a string and reverse one word at a time
		 m7(sc); // palindrome string + toUpperCase/toLowerCase
		
		sc.close();
	}
}
