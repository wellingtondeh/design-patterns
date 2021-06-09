package br.com.wbs.creational.abstractfactory.windows;

import br.com.wbs.creational.abstractfactory.Button;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Criando BUTTON do Windows");

	}

}
