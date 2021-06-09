package br.com.wbs.creational.abstractfactory.windows;

import br.com.wbs.creational.abstractfactory.Combobox;

public class WindowsCombobox implements Combobox {

	@Override
	public void paint() {
		System.out.println("Criando COMBO BOX do Windows");
	}

}
