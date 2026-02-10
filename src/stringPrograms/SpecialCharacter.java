package stringPrograms;

public class SpecialCharacter {
public static void main(String[] args) {
	String s="#e!!o Wo@l$";
	
	for(int i=0;i<s.length();i++)
	{
		if(Character.isLetter(s.charAt(i)) || Character.isWhitespace(s.charAt(i)))
			continue;
		else
			System.out.print(s.charAt(i)+" ");
	}
}
}
