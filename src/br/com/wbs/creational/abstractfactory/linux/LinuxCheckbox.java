package br.com.wbs.creational.abstractfactory.linux;

import br.com.wbs.creational.abstractfactory.Checkbox;

public class LinuxCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Criando CHECK BOX do Linux");
	}

}
