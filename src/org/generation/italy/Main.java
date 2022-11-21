package org.generation.italy;

public class Main {
	public static void main(String[] args) {
		Biglietto b1 = null;
		try {
			b1 = new Biglietto(100, 18);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(b1);			
		}
	}
}
