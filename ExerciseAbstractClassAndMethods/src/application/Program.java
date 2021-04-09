package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributors;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contributors> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.next();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
		
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthyCats = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthyCats));
			} else {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();;
				list.add(new Company(name, annualIncome, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Contributors ct : list) {	
			System.out.println(ct.getName() + ": $ " + String.format("%.2f", ct.tax()));
		}
		
		Double totalTaxes = 0.0;
		for(Contributors ct : list) {	
			totalTaxes += ct.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
