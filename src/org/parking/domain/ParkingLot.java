package org.parking.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ParkingLot {

	private int parkingCapacity;
	private int emptySlots;
	private Set<ParkingTicket> parkingTicketSet;
	
	
	public ParkingLot(int capacity) {
		this.parkingCapacity = capacity;
		this.emptySlots = capacity;
		parkingTicketSet = new HashSet<ParkingTicket>();
	}
	
	public ParkingTicket parkCar(Car car) {
		if (isParkingFull()) {
			return null;
		}
		else {
			Iterator<ParkingTicket> it = parkingTicketSet.iterator();
			while(it.hasNext())
			{
				if(it.next().getCar().equals(car))
					return null;
			}	
			emptySlots -= 1;
			ParkingTicket ticket = new ParkingTicket(car);
			parkingTicketSet.add(ticket);  
			return ticket;			
		}
	}
	
	public Car unparkCar(ParkingTicket parkingTicket){
		if(parkingTicket == null)
			return null;
		else
		{
			if(parkingTicketSet.contains(parkingTicket))
			{
				emptySlots += 1;
				parkingTicketSet.remove(parkingTicket);
				return parkingTicket.getCar();		
			}
			else
				return null;
		}	
	}
	
	private boolean isParkingFull() {
		if (emptySlots == 0)
			return true;
		else
			return false;
	}
	
}
