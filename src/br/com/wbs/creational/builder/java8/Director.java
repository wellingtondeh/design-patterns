package br.com.wbs.creational.builder.java8;

public class Director {
	
	private GenericBuilder<Car> carBuilder;
	
	public Director(GenericBuilder<Car> builder) {
		this.carBuilder = builder;
	}

	public Car buildSUV() {
		return carBuilder
					.with(Car::setCarType, CarType.SUV)
					.with(Car::setEngine, new Engine(5.0, 0.0, Boolean.TRUE))
					.with(Car::setFuel, 0D)
					.with(Car::setGpsNavigator, new GPSNavigator())
					.with(Car::setSeats, 7)
				.build();
	}
	
	public Car buidCityCar() {
		return carBuilder
					.with(Car::setCarType, CarType.CITY_CAR)
					.with(Car::setEngine, new Engine(1.4, 0.0, Boolean.TRUE))
					.with(Car::setFuel, 0D)
					.with(Car::setSeats, 5)
					.with(Car::setTransmission, Transmission.AUTOMATIC)
				.build();
	}
	
}
