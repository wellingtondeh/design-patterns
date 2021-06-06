package br.com.wbs.creational.builder.java8;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		GenericBuilder<Car> builder = GenericBuilder.of(Car::new);
		
		Director director = new Director(builder);
		CruzeDirector cruzeDirector = new CruzeDirector(builder);

		Arrays.asList(
						director.buildSUV(),
						director.buidCityCar(),
						cruzeDirector.buildLt(),
						cruzeDirector.buildLtz(),
						cruzeDirector.buildLtz2()
					 ).forEach(App::print);

	}
	
	public static void print(Car car) {
		System.out.println("***************************************");
		System.out.println(car);
		System.out.println("***************************************");
		System.out.println("\n\n");
	}
}
