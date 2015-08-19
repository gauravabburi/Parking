package org.parking.domain;

public class ParkingTicket {
	private static int ticketNumberGenerator = 0;
	private int parkingTicketNumber;
	private Car car;
	
	public ParkingTicket(Car car)
	{
		this.car = car;
		parkingTicketNumber = ++ticketNumberGenerator;
	}
	
	public Car getCar()
	{
		return car;
	}
}
