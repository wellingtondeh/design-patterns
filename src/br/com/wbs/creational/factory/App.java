package br.com.wbs.creational.factory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class App {
	
	/* ================================================================================================================== */
	/* VARIÁVEIS PARA RESPEITAR AS REGRAS DE NEGOCIO NO QUAL OS NOVOS NÍVEIS POSSAM ENTRAR EM PRODUÇÃO NA DATA CORRETA.   */
	/* ABAIXO ESTÃO AS VARIAVÉIS DAS PONTUAÇÕES: SILVER, GOLDEN E PLATINIUM                                               */
	/* ================================================================================================================== */
	 
	/*
	 * Utilizado para registar e buscar um nível que não está no ENUM.
	 */
	private static final String SILVER = "SILVER";
	/*
	 * Utilizado para registar e buscar um nível que não está no ENUM.
	 */
	private static final String GOLDEN = "GOLDEN";
	/*
	 * Utilizado para registar e buscar um nível que não está no ENUM.
	 */
	private static final String PLATINIUM = "PLATINIUM";
	
	
	/* ================================================================================================================== */
	/* VARIÁVEIS PARA RESPEITAR AS REGRAS DE NEGOCIO NO QUAL OS NOVOS NÍVEIS POSSAM ENTRAR EM PRODUÇÃO NA DATA CORRETA.   */
	/* ABAIXO ESTÃO AS VARIAVÉIS DAS DATAS EM QUE O SILVER, GOLDEN E PLATINIUM DEVERÃO ENTRAR EM PRODUÇÃO                 */
	/* ================================================================================================================== */
	/*
	 * Data em que o prata (silver) entrará em "Produção".
	 * Caso queira verificar funcionando, coloque uma data futura.
	 */
	private static String activeSilverAt = "2019-06-12";

	/*
	 * Data em que o ouro (golden) entrará em "Produção".
	 * Caso queira verificar funcionando, coloque uma data futura.
	 */
	private static String activeGoldenAt = "2020-06-12";
	
	/*
	 * Data em que o platino (Platinium) entrará em "Produção".
	 * Caso queira verificar funcionando, coloque uma data futura.
	 */
	private static String activePlatiniumAt = "2021-06-12";
	
	public static void main(String[] args) {
		/*
		 * Registrando um novo nível que não estava previsto e precisava ser dinâmico,
		 * pois só poderá entrar em "PRODUÇÃO" a partir do dia 05/06/2021.
		 */
		TierFactory.register(SILVER,    isAfterOrEqualsToday(activeSilverAt)    ?   Silver::new : null);
		TierFactory.register(GOLDEN,    isAfterOrEqualsToday(activeGoldenAt)    ?   Golden::new : null);
		TierFactory.register(PLATINIUM, isAfterOrEqualsToday(activePlatiniumAt) ? Platinum::new : null);
		
		List<Tier> tiers =  Arrays.asList(
											TierFactory.getTier(TierEnum.MEMBER),
											TierFactory.getTier(TierEnum.BRONZE),
											TierFactory.getTier(SILVER),
											TierFactory.getTier(GOLDEN),
											TierFactory.getTier(PLATINIUM)
										);
		
		// Imprimirá as pontuações dos níveis.
		tiers.forEach(App::print);
	}
	
	private static boolean isAfterOrEqualsToday(String from) {
		return LocalDate.now().compareTo(LocalDate.from(DateTimeFormatter.ofPattern("yyyy-MM-dd").parse(from))) >= 0;
	}
	
	/*
	 * Metodo para imprimir as pontuações.
	 */
	private static void print(Tier tier) {
		if (Objects.isNull(tier)) {
			System.out.println("Pontuação desejada não está implementada ainda.");
		} else {
			System.out.printf(".:: Nível %s => %04d pontos ::.\n", tier.getClass().getSimpleName(), tier.getPromotionPoints());
		}
	}
	
}
