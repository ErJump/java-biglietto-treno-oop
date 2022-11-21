package org.generation.italy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Biglietteria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire km da percorrere: ");
		int userKm = sc.nextInt();
		
		System.out.print("Inserire l'età del passeggero: ");
		int userAge = sc.nextInt();
		
		System.out.print("Biglietto flessibile: ");
		boolean flexible = sc.nextBoolean();
		
		sc.close();
		
		System.out.println("---------------");
		
		Biglietto b1 = null;
		try {
			b1 = new Biglietto(userKm, userAge, flexible);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(b1);			
		}
		
		FileWriter w = null;
		
		try {
			w = new FileWriter("./biglietto-treno.txt", true);
			w.write(b1.toString());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
