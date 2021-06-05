package br.com.wbs.creational.singleton;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		while (true) {
			waitAndPrintObjectDateTime();
		}
	}
	
	private static void waitAndPrintObjectDateTime() throws InterruptedException {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getObjectCreatedAt());
		Thread.sleep(5000);
	}

}
