package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<String> list = new ArrayList<>();
		
		
		list.add("Pedro");
		list.add("Alex");
		list.add("Bob");
		list.add("João");
		list.add("Josefa");
		list.add("Jonas");
		list.add(2, "Marco");
		
		list.remove("Josefa");
		list.remove(1);
		
		System.out.println(list.size());
		for (String li: list) {
			System.out.println(li);
		}
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list);
		
		System.out.println("Index of Bob: " +  list.indexOf("Bob"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		
		System.out.println(result);
		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
