package br.com.wbs.creational.abstractfactory.windows;

import br.com.wbs.creational.abstractfactory.GUIFactory;
import br.com.wbs.creational.abstractfactory.Render;

public class WindowsGUIFactory implements GUIFactory {

	@Override
	public Render createButton() {
		return new WindowsButton();
	}

	@Override
	public Render createCombobox() {
		return new WindowsCombobox();
	}

	@Override
	public Render createCheckbox() {
		return new WindowsCheckbox();
	}

}
