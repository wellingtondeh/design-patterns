package br.com.wbs.creational.singleton;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		Singleton singleton = Singleton.getInstance();
		
		while (true) {
			waitAndPrintObjectDateTime(singleton);
		}
	}
	
	private static void waitAndPrintObjectDateTime(Singleton singleton) throws InterruptedException {
		System.out.println(singleton.getObjectCreatedAt());
		Thread.sleep(5000);
	}

}
