package stringPrograms;

public class ConsonantAndVowelInString {
public static void main(String[] args) {
	String s=new String("Hello, this is program$#$ to DEMONSTRATE vowels and consonants");
	s=s.toLowerCase();
	System.out.println(s);
	int vowel=0, consonant=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
					s.charAt(i)=='o' || s.charAt(i)=='u')
				vowel++;
			else
			{
				if(Character.isWhitespace(s.charAt(i)))
					continue;
				else
					consonant++;
			}
		}
	}
	System.out.println("vowels in the string "+vowel);
	System.out.println("consonant in the string "+consonant);
}
}
