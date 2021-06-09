package br.com.wbs.creational.abstractfactory.mac;

import br.com.wbs.creational.abstractfactory.Button;

public class MacButton implements Button {

	@Override
	public void paint() {
		System.out.println("Criando BUTTON do Mac");
	}

}
