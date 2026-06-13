package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
public static void main(String[] args) {
	int arr[]= {10,20,20,30};
	Set<Integer> b=new LinkedHashSet<Integer>();
	for (Integer value : arr) {
		b.add(value);
	}
	System.out.println(b);
}
}
