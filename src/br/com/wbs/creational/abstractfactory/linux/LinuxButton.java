package br.com.wbs.creational.abstractfactory.linux;

import br.com.wbs.creational.abstractfactory.Button;

public class LinuxButton implements Button {

	@Override
	public void paint() {
		System.out.println("Criando BUTTON do Linux");
	}

}
