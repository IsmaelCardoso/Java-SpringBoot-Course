package application;

import java.util.Locale;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		// Como existe uma pequena possibilidade do HashCode dar uma colisão, porem ele
		// é muito mais rapido, uma boa pratica é, utilizasa o hashCode e se o item
		// contrado for igual confirmamos osmente aquele intem com o equals.

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		System.out.println("C1: " + c1.hashCode());
		System.out.println("C2: " + c2.hashCode());
		System.out.println("Equals? " + c1.equals(c2));
		
		System.out.println("Direct comparable is? " + (c1 == c2)); // estes objetos foram alocados no hippe em posições diferentes (referencias de memória) e portanto são objetos diferentes
		
		
		//Utilizamos o "==" quando queremos comparar as referências dos objetos ou quando temos expressão literal que possuem um tratamento nativo especial para elas (Ex: String)
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println("Direct comparable(literals) is? " + (s1 == s2));
		
		
	}
}