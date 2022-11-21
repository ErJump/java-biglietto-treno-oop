package org.generation.italy;

import java.math.BigDecimal;

public class Biglietto {
	private int userKm = 0; 
	private int userAge = 0;
	
    private static final BigDecimal PRICE_FOR_KM = new BigDecimal(0.21);
    private static final BigDecimal OVER_65_DISCOUNT = new BigDecimal(0.60);
    private static final BigDecimal YOUNG_DISCOUNT = new BigDecimal(0.80);

	Biglietto(int userKm, int userAge) throws Exception{
		isValidKm(userKm);
		isValidEta(userAge);
	}
	
	public int getUserKm() {
		return userKm;
	}

	public int getUserAge() {
		return userAge;
	}

	public static BigDecimal getPriceForKm() {
		return PRICE_FOR_KM;
	}

	public static BigDecimal getOver65Discount() {
		return OVER_65_DISCOUNT;
	}

	public static BigDecimal getYoungDiscount() {
		return YOUNG_DISCOUNT;
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

    private BigDecimal getDiscount() {
        if(userAge > 65) {
            return PRICE_FOR_KM;
        } else if(userAge < 18) {
            return YOUNG_DISCOUNT;
        } else {
            return BigDecimal.ONE;
        }
    }

    public BigDecimal getTicketPrice() {
        return PRICE_FOR_KM.multiply(new BigDecimal(userKm)).multiply(getDiscount());
    }
    
    @Override
    public String toString() {
    	return "Km: " + getUserKm()
    			+ "\nEtà: " + getUserAge()
                + "\nPrezzo: " + getTicketPrice().doubleValue() + "$";
    }
}
