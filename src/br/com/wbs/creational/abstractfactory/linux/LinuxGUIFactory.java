package br.com.wbs.creational.abstractfactory.linux;

import br.com.wbs.creational.abstractfactory.GUIFactory;
import br.com.wbs.creational.abstractfactory.Render;

public class LinuxGUIFactory implements GUIFactory {

	@Override
	public Render createButton() {
		return new LinuxButton();
	}

	@Override
	public Render createCombobox() {
		return new LinuxCombobox();
	}

	@Override
	public Render createCheckbox() {
		return new LinuxCheckbox();
	}

}
