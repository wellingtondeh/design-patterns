package br.com.wbs.creational.builder;

public class App {

	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder builder = new CarBuilder();
		
		Car car = ((CarBuilder) director.buildAutomaticCityCar(builder)).getResult();
		car.setTripComputer(new TripComputer());
		car.setGpsNavigator(new GPSNavigator("Rua Abilio da Silva"));
		car.setFuel(100D);
		System.out.println(car);
		
		System.out.println("\n\n\n ==============================");
		
		print(director.buildAutomaticCityCar(builder));
		print(director.buildManualCityCar(builder));
		print(director.buildSportsCar(builder));
		print(director.buildSUVCar(builder));
	}
	
	private static void print(Builder builder) {
		System.out.println("******************************************");
		System.out.println(((CarBuilder) builder).getResult());
		System.out.println("******************************************");
		System.out.println("\n\n");
	}
}
