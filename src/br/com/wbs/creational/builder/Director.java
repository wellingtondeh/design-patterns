package br.com.wbs.creational.builder;

public class Director {

	public Builder buildSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0D, Boolean.TRUE));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		
		return builder;
	}
	
	public Builder buildAutomaticCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(5);
		builder.setEngine(new Engine(1.4, 0D, Boolean.FALSE));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		
		return builder;
	}
	
	public Builder buildManualCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(5);
		builder.setEngine(new Engine(1.4, 0D, Boolean.FALSE));
		builder.setTransmission(Transmission.MANUAL);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
		
		return builder;
	}
	
	public Builder buildSUVCar(Builder builder) {
		builder.setCarType(CarType.SUV);
		builder.setSeats(7);
		builder.setEngine(new Engine(3.0, 0D, Boolean.TRUE));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
		
		return builder;
	}
	
}
