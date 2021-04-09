package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentsRecord;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<StudentsRecord> set = new HashSet<>();

		for (int i = 0; i < 3; i++) {

			System.out.print("How many students for course" + i + "? ");
			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {

				int studentRecord = sc.nextInt();

				set.add(new StudentsRecord(studentRecord));
			}
		}
		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
