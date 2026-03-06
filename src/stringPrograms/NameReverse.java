package stringPrograms;

public class NameReverse {
	public static void main(String[] args) {
		String s = "my name is Debabrat";
		String splitS[] = s.split(" ");

		String rev = "";
		int n = splitS.length - 1;
		for (int i = 0; i < splitS.length; i++) {
			if (i == n) {
				for (int j = splitS[i].length() - 1; j >= 0; j--) {
					rev = rev + splitS[i].charAt(j);
				}
			} else
				rev = rev + splitS[i];
			rev = rev + " ";
		}
		System.out.println(rev);

	}
}
