package br.com.wbs.creational.builder.java8;

import java.util.Objects;

public class Car {

	private CarType carType;
	private Integer seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	private Double fuel = 0D;
	private CarMaker carMaker;

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public void setGpsNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Double getFuel() {
		return fuel;
	}

	public void setFuel(Double fuel) {
		this.fuel = fuel;
	}
	
	public CarMaker getCarMaker() {
		return carMaker;
	}
	
	public void setCarMaker(CarMaker carMaker) {
		this.carMaker = carMaker;
	}
	
	@Override
	public String toString() {
		return 
		  "Tipo: " +  carType
		 + "\nMarca: " + (Objects.isNull(carMaker) ? "SEM MARCA" : carMaker)
		 + "\nQtde de Assentos: " + seats
		 + "\nMotor: " + engine
		 + "\nTransmissão: " +  transmission
		 + "\nComputador de Bordo: " + (Objects.isNull(tripComputer) ? "NÃO" : "SIM") 
		 + "\nGPS: " + (Objects.isNull(gpsNavigator) ? "NÃO" : "SIM")
		 + "\nCombustível: " + fuel;
	}

}
