package br.com.wbs.creational.abstractfactory.windows;

import br.com.wbs.creational.abstractfactory.Checkbox;

public class WindowsCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Criando CHECK BOX do Windows");
	}

}
