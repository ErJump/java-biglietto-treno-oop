package org.generation.italy;

public class Biglietto {
	private int userKm = 0; 
	private int userAge = 0;
	
	Biglietto(int userKm, int userAge) throws Exception{
		isValidKm(userKm);
		isValidEta(userAge);
	}
	
	public void isValidKm(int km) throws Exception {
        if(km < 0) {
            throw new Exception("I km devono essere positivi");
        } else {
            this.userKm = km;
        }
	}
	
	public void isValidEta(int eta) throws Exception {
		if (eta <= 0) {
			throw new Exception ("L'età deve essere positiva e diversa da 0");
		} else {
			this.userAge = eta;
		}
	}
}
