package br.com.wbs.creational.abstractfactory.mac;

import br.com.wbs.creational.abstractfactory.Combobox;

public class MacCombobox implements Combobox {

	@Override
	public void paint() {
		System.out.println("Criando COMBO BOX do Mac");
	}

}
