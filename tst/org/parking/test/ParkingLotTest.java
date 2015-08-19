package org.parking.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.parking.domain.ParkingLot;

public class ParkingLotTest {

	@Test
	public void shouldBeAbleToPark() {
		
		ParkingLot parking = new ParkingLot(10);
		assertTrue(parking.parkCar());
	}
	
	@Test
	public void shouldNotBeAbleToPark() {
		ParkingLot parking = new ParkingLot(0);
		assertFalse(parking.parkCar());
	}

}
