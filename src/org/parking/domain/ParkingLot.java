package org.parking.domain;

public class ParkingLot {

	private int parkingCapacity;
	private int emptySlots;
	
	public ParkingLot(int capacity) {
		this.parkingCapacity = capacity;
		this.emptySlots = capacity;
	}
	
	public boolean parkCar() {
		if (isParkingFull()) {
			return false;
		}
		else {
			emptySlots -= 1;
			return true;
		}
	}
	
	private boolean isParkingFull() {
		if (emptySlots == 0)
			return true;
		else
			return false;
	}
	
}
