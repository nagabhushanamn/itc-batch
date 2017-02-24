package my;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Learn {

	public static void main(String[] args) {

		// Set<String> set = new TreeSet<>();
		// Set<String> set = new HashSet<>();
		Set<String> set = new LinkedHashSet<>();
		set.add("X");
		set.add("A");
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("Z");
		set.add("E");

		System.out.println(set);

	}

}
