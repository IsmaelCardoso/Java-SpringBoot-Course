package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter de measures of triagle X: ");		

		x.a = sc.nextDouble();
		x.b= sc.nextDouble(); 
		x.c = sc.nextDouble();
		
		System.out.println("Enter de measures of triagle Y: ");		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();	
		
		System.out.printf("Trinagle X area: area %.4f%n", areaX);
		System.out.printf("Trinagle Y area: area %.4f%n", areaY);	
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else {
			System.out.println("Large area: Y");
		}
		
		sc.close();
		

	}

}
	