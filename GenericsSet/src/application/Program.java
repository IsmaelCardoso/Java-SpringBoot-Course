package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		//HashSet não garante a ordem -> é o mais rápido
		//TreeSet ele ordena -> é um pouco mais lento
		//LinkedHashSet tem velcidade intermediaria -> matem a ordem das inserções dos eslementos
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
//		set.remove("Notebook");
		
//		set.removeIf(x -> x.length() >= 3);
//		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
