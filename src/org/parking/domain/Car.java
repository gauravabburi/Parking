package org.parking.domain;

public class Car {
	
	private String carRegistrationNumber;
	
	public Car(String carRegistrationNumber){
		this.carRegistrationNumber = carRegistrationNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((carRegistrationNumber == null) ? 0 : carRegistrationNumber
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carRegistrationNumber == null) {
			if (other.carRegistrationNumber != null)
				return false;
		} else if (!carRegistrationNumber.equals(other.carRegistrationNumber))
			return false;
		return true;
	}
	
	

}
