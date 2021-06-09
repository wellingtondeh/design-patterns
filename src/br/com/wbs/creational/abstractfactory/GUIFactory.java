package br.com.wbs.creational.abstractfactory;

public interface GUIFactory {
	
	Render createButton();
	Render createCombobox();
	Render createCheckbox();
	

}
