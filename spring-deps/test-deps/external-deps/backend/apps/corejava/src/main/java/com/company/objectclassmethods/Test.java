package com.company.objectclassmethods;

public class Test {

	public static void main(String[] args) {

		Passenger passenger = new Passenger();
		passenger.setFirstName("Pushkar");
		passenger.setLastName("Chauhan");
		passenger.setId(123);
		
		Passenger passenger2 = new Passenger();
		passenger2.setFirstName("Pushkar");
		passenger2.setLastName("Chauhan");
		passenger2.setId(123);
		
		System.out.println(passenger.equals(passenger2));
		
		

	}

}
