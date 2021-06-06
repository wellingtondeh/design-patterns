package br.com.wbs.creational.builder;

public class TripComputer {

	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void showFuelLevel() {
		System.out.println("Nível de combustível: " + car.getFuel());
	}
	
	
	public void showStatus() {
		String status = "Carro está desligado.";
		if (this.car.getEngine().isStarted()) {
			status = String.format("Carro ligado %s", car.getFuel() > 0D ? "pronto para sair" : ", mas falta abastecer");
		}
		
		System.out.println(status);
	}
	
}
