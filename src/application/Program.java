package application;

import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Reservation[] vector = new Reservation[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();
		
		for (int i=1; i<=n; i++) {
			input.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room: ");
			int room = input.nextInt();
			vector[room] = new Reservation(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<vector.length; i++) {
			if (vector[i] != null) {
				System.out.println(vector[i]);
			}
		}
		input.close();
	}

}
