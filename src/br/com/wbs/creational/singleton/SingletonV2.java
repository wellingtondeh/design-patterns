package br.com.wbs.creational.singleton;

import java.time.LocalDateTime;

/**
 * Regra de negócio: Precisa ter a data e hora em que o objeto foi criado. 
 * Não poderá deixar qualquer outra classe atualizar a data e hora.
 * 
 * @author Wellington de Barros Santos
 *
 */
public class SingletonV2 {
	
	/* Instancia do SingletonV2 para a classe. */
	private static SingletonV2 thisSingleton = new SingletonV2();
	private LocalDateTime objectCreatedAt = LocalDateTime.now();
	
	/*
	 * Classe não visivel aos clientes.
	 */
	private SingletonV2() {}
	
	public LocalDateTime getObjectCreatedAt() {
		return objectCreatedAt;
	}
	
	/**
	 * Cria uma instância única da classe Singleton.
	 * @return O objeto criado do singleton.
	 */
	public static SingletonV2 getInstance() {
		return thisSingleton;
	}
}
