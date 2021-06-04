package br.com.wbs.creational.singleton;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Regra de neg�cio: Precisa ter a data e hora em que o objeto foi criado. 
 * N�o poder� deixar qualquer outra classe atualizar a data e hora.
 * 
 * @author Wellington de Barros Santos
 *
 */
public class Singleton {
	
	private static Singleton thisSingleton;
	private LocalDateTime objectCreatedAt;
	
	
	private Singleton() {
		setObjectCreatedAt(LocalDateTime.now());
	}
	
	/*
	 * De acordo com a regra de neg�cio o "Set" entra em modo privado 
	 * para n�o deixar inserir um valor no atributo data e hora de cria��o do objeto.
	 */
	private void setObjectCreatedAt(LocalDateTime objectCreatedAt) {
		this.objectCreatedAt = objectCreatedAt;
	}
	
	public LocalDateTime getObjectCreatedAt() {
		return objectCreatedAt;
	}
	
	/**
	 * Cria uma inst�ncia �nica da classe Singleton.
	 * @return O objeto criado do singleton.
	 */
	public static Singleton getInstance() {
		// Verifica se o atributo "thisSingleton" ainda n�o possui nenhuma inst�ncia.
		if (Objects.isNull(thisSingleton)) {
			
			// inicia o atributo "thisSingleton"
			thisSingleton = new Singleton();
		}
		
		return thisSingleton;
	}
	

}
