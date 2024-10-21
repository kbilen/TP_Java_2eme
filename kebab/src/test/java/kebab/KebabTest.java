package kebab;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class KebabTest {
	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Oignon OIGNON = new Oignon();
	private static final Tomate TOMATE = new Tomate();
	private static final Salade SALADE = new Salade();

	@Test
	void contient_bien_tous_les_ingredients_ajoutes_pendant_la_preparation() {
		
		Kebab kebabAgneau = new Kebabier()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(AGNEAU)
				.avec(PAIN)
				.avec(SAUCE)
				.prepareLeKebab();
		
		assertThat(kebabAgneau.listerLesIngredients()).containsExactly(SALADE,TOMATE
				,OIGNON,AGNEAU,PAIN,SAUCE);
	}
}
