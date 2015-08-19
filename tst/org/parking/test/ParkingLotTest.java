package org.parking.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.parking.domain.Car;
import org.parking.domain.ParkingLot;
import org.parking.domain.ParkingTicket;

public class ParkingLotTest {

	@Test
	public void shouldBeAbleToPark() {
		
		ParkingLot parking = new ParkingLot(10);
		Car car = new Car("mh02qw111");
		assertNotNull(parking.parkCar(car));
	}
	
	@Test
	public void shouldNotBeAbleToPark() {
		ParkingLot parking = new ParkingLot(0);
		Car car = new Car("mh76pk999");
		assertNull(parking.parkCar(car));
	}
	
	@Test
	public void shouldNotBeAbleToParkSameCarAgain()
	{
		ParkingLot parking = new ParkingLot(10);
		Car car = new Car("mh02qw111");
		parking.parkCar(car);
		assertNull(parking.parkCar(car));
		
	}
	
	@Test
	public void shouldBeAbleToUnpark() {
		ParkingLot parking = new ParkingLot(10);
		Car car = new Car("mh76pk999");
		ParkingTicket parkingTkt = parking.parkCar(car);
		assertNotNull(parking.unparkCar(parkingTkt));
	}

	@Test
	public void shouldNotBeAbleToUnpark() {
		ParkingLot parking = new ParkingLot(10);
		ParkingTicket parkingTkt = null;
		assertNull(parking.unparkCar(parkingTkt));
	}
}
