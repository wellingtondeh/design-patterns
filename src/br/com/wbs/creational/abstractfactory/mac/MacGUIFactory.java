package br.com.wbs.creational.abstractfactory.mac;

import br.com.wbs.creational.abstractfactory.GUIFactory;
import br.com.wbs.creational.abstractfactory.Render;

public class MacGUIFactory implements GUIFactory {

	@Override
	public Render createButton() {
		return new MacButton();
	}

	@Override
	public Render createCombobox() {
		return new MacCombobox();
	}

	@Override
	public Render createCheckbox() {
		return new MacCheckbox();
	}

}
