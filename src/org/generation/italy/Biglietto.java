package org.generation.italy;

public class Biglietto {
	private int userKm; 
	private int userAge;
	
	Biglietto(){
		
	}
	
	public int isValidKM() {
		//verifica se i km sono positivi altrimenti lancio eccezione
        if(userKm < 0) {
            throw new Exception("I km devono essere positivi");
        } else {
            return userKm;
        }

	}
}
