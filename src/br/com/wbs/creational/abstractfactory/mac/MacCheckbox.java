package br.com.wbs.creational.abstractfactory.mac;

import br.com.wbs.creational.abstractfactory.Checkbox;

public class MacCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Criando CHECK BOX do Mac");
	}

}
