package br.com.wbs.creational.abstractfactory.linux;

import br.com.wbs.creational.abstractfactory.Combobox;

public class LinuxCombobox implements Combobox {

	@Override
	public void paint() {
		System.out.println("Criando COMBO BOX do Linux");
	}

}
