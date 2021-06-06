package br.com.wbs.creational.builder.java8;

public class GPSNavigator {

	private String route = "Rua Maria Joaquina da Silva, 551, Cidade das Neuzas, Neuzópolis, Brasil";
	
	public GPSNavigator() { }
	
	public GPSNavigator(String route) {
		this.route = route;
	}
	
	public void setRoute(String route) {
		this.route = route;
	}
	
	public String getRoute() {
		return route;
	}
	
}
