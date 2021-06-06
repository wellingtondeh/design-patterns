package br.com.wbs.creational.builder.java8;

public class CruzeDirector {

	private GenericBuilder<Car> carBuilder;
	
	public CruzeDirector(GenericBuilder<Car> builder) {
		this.carBuilder = builder;
	}
	
	public Car buildLt() {
		return carBuilder
				.with(Car::setCarMaker, CarMaker.GM)
				.with(Car::setCarType, CarType.CITY_CAR)
				.with(Car::setEngine, new Engine(1.4, 0.0, Boolean.FALSE))
				.with(Car::setFuel, 0D)
				.with(Car::setSeats, 5)
			.build();
	}
	
	public Car buildLtz() {
		return carBuilder
				.with(Car::setCarMaker, CarMaker.GM)
				.with(Car::setCarType, CarType.CITY_CAR)
				.with(Car::setEngine, new Engine(5.0, 0.0, Boolean.TRUE))
				.with(Car::setFuel, 0D)
				.with(Car::setGpsNavigator, new GPSNavigator())
				.with(Car::setSeats, 5)
			.build();
	}
	
	public Car buildLtz2() {
		return carBuilder
				.with(Car::setCarMaker, CarMaker.GM)
				.with(Car::setCarType, CarType.CITY_CAR)
				.with(Car::setEngine, new Engine(5.0, 0.0, Boolean.TRUE))
				.with(Car::setFuel, 0D)
				.with(Car::setGpsNavigator, new GPSNavigator())
				.with(Car::setTripComputer, new TripComputer())
				.with(Car::setSeats, 5)
			.build();
	}
}
