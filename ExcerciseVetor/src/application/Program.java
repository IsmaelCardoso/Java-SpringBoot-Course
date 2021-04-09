package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int rented;
		rented = sc.nextInt();
		Rooms[] rooms = new Rooms[10];
		
		for (int i=0; i<rented; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			
			String email = sc.nextLine();
			
			int room = sc.nextInt();
			
			rooms[room - 1] = new Rooms(name, email, room);			
		}
		
		System.out.println("How many rooms will be rented? " + rented);
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				count += 1;
				System.out.println();
				System.out.println(
				"Rent #" + 
				count + 
				"\nName: " + 
				rooms[i].getName() + 
				"\nEmail: " + 
				rooms[i].getEmail() +
				"\nRoom: " + 
				rooms[i].getRoom()
				);
			}
		}
		
		System.out.println();
		System.out.println("Busy rooms:" + rented);
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(
					rooms[i].getRoom() + 
					": " + 
					rooms[i].getName() + 
					", " + 
					rooms[i].getEmail()
				);
			}
		}
		
		sc.close();
	}

}
