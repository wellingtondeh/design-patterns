package br.com.wbs.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/*
 * Fábrica do nível de pontuação. 
 */
public class TierFactory {

	/*
	 * HashMap para Registro das instancias das classes. Caso queira deixar algo
	 * mais fixo, pode-se prototipar: 
	 * Exemplo:
	 * Map<TierEnum, Supplier<? extends Tier>> registeredTiers = new HashMap<>()
	 */
	private static Map<Object, Supplier<? extends Tier>> registeredTiers = new HashMap<>();

	/*
	 * Aqui registra as instancias das classes dos produtos que já estão em "produção".
	 */
	static {
		registeredTiers.put(TierEnum.MEMBER, Member::new);
		registeredTiers.put(TierEnum.BRONZE, Bronze::new);
	}

	/*
	 * método para registrar as pontuações dinamicamente.
	 */
	public static void register(Object tier, Supplier<? extends Tier> supplier) {
		if (Objects.nonNull(supplier)) {
			registeredTiers.put(tier, supplier);
		}
	}

	/*
	 * Recupera a classe concreta de pontuação.
	 */
	public static Tier getTier(Object tier) {
		Supplier<? extends Tier> currentTier = registeredTiers.get(tier);
		return Objects.nonNull(currentTier) ? currentTier.get() : null;
	}
}
