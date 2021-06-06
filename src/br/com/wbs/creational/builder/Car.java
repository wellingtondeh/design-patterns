package br.com.wbs.creational.builder;

import java.util.Objects;

public class Car {

	private CarType carType;
	private Integer seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	private Double fuel = 0D;

	public Car(	CarType carType, Integer seats, Engine engine, Transmission transmission, 
				TripComputer tripComputer, GPSNavigator gpsNavigator) {
		
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}

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
	
	@Override
	public String toString() {
		return 
		  "Tipo: " +  carType
		 +"\nQtde de Assentos: " + seats
		 + "\nMotor: " + engine
		 + "\nTransmissão: " +  transmission
		 + "\nComputador de Bordo: " + (Objects.isNull(tripComputer) ? "NÃO" : "SIM") 
		 + "\nGPS: " + gpsNavigator.getRoute()
		 + "\nCombustível: " + fuel;
	}

}
