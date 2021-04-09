package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Salary value: ");
			double value = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> emails = list.stream()
					.filter(em -> em.getSalary() > value)
					.map(em -> em.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());

			emails.forEach(System.out::println);
			
			
			List<Double> salary = list.stream()
					.filter(em -> em.getName().charAt(0) == 'M')
					.map(em -> em.getSalary())
					.collect(Collectors.toList());
			
			double sumSalary = salary.stream().reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalary);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}