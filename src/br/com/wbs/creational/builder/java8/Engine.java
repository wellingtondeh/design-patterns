package br.com.wbs.creational.builder.java8;

public class Engine {
	private Double volume = 0D;
    private Double mileage = 0D;
    private Boolean started = Boolean.FALSE;
    private Boolean turbocharger = Boolean.FALSE;
    
	public Engine(Double volume, Double mileage, Boolean turbocharger) {
		this.volume = volume;
		this.mileage = mileage;
		this.turbocharger = turbocharger;
	}
    
	public void turnOn() {
		started = Boolean.TRUE;
	}
	
	public void turnOff() {
		started = Boolean.FALSE;
	}
	
	public void go(Double miliage) {
		if (started) {
			this.mileage += miliage;
		} else {
			System.err.println("Infelizmente não conseguimos seguir viagem sem você ligar o carro primeiro.");
		}
	}
	
	public Double getVolume() {
		return volume;
	}
	
	public Double getMileage() {
		return mileage;
	}

	public Boolean isStarted() {
		return started;
	}
	
	public Boolean isTurbocharger() {
		return turbocharger;
	}
	
	@Override
	public String toString() {
		return "Potência: " + volume + (turbocharger ? " (Turbo)" : "") + " está com " + mileage + " KM rodados";
	}
}
