import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		int a, b, ab;
		
		
		a = 20;
		b = 15;
		ab = a + b;
		System.out.println("Soma = " + ab);
		
		double tt = 3.14159;
		double raio = 100.64;
		double formula = tt * Math.pow(raio, 2);
		System.out.println("Area do raio = " + formula);
		
		int c, d, e, f;
		c = 40;
		d = 20;
		e = 10;
		f = 55;
		int diferenca = (c + d) - (e + f);
		System.out.println("Diferença = " + diferenca);
		
		int customerNumber = 67;
		int workedHouers = 32;
		double houerValue = 6.9;
		double salary = (double) workedHouers * houerValue;
		System.out.printf("%n%nNumber = %d%nSalary = US$ %.2f", customerNumber, salary);
		
		int quantity1 = 1;
		int quantity2 = 2;
		double value1 = 5.30;
		double value2 = 5.10;
		
		double valuePayment = (quantity1 * value1) + (quantity2 * value2);
		System.out.printf("%n%nValor a pagar: R$ %.2f", valuePayment);
		
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
