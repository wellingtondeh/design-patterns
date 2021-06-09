package br.com.wbs.creational.abstractfactory;

import java.util.Objects;
import java.util.Scanner;

import br.com.wbs.creational.abstractfactory.linux.LinuxGUIFactory;
import br.com.wbs.creational.abstractfactory.mac.MacGUIFactory;
import br.com.wbs.creational.abstractfactory.windows.WindowsGUIFactory;

public class App {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		AbstractFactory factory = null;
		Integer codigo = 0;
		
		do {
			System.out.println("Digite 1 para Windows / 2 para Linux / 3 para MacOS: ");
			codigo = scanner.nextInt();
			
			switch (codigo) {
			case 1:
				factory = new AbstractFactory(new WindowsGUIFactory());
				break;
			case 2:
				factory = new AbstractFactory(new LinuxGUIFactory());
				break;
			case 3:
				factory = new AbstractFactory(new MacGUIFactory());
				break;
			default:
				System.out.println("Código informado inválido! \n");
				break;
			}
	
			if (Objects.nonNull(factory)) {
				factory.paint();
			}
		} while(codigo < 0 || codigo > 3);
	}
	
}
