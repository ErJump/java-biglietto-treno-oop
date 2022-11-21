package org.generation.italy;

import java.util.Scanner;

public class Biglietteria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire km da percorrere: ");
		int userKm = sc.nextInt();
		
		System.out.print("Inserire l'età del passeggero: ");
		int userAge = sc.nextInt();
		
		Biglietto b1 = null;
		try {
			b1 = new Biglietto(userKm, userAge);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(b1);			
		}
	}
}
