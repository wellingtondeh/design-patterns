package br.com.wbs.creational.builder;

public class CarBuilder implements Builder {
	
	private CarType carType;
	private Integer seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	

	@Override
	public void setCarType(CarType type) {
		this.carType = type;
	}

	@Override
	public void setSeats(Integer seats) {
		this.seats = seats; 
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}
	
	public Car getResult() {
		return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
	}

}
