package kebab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class KebabTest {
	
	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Oignon OIGNON = new Oignon();
	private static final Tomate TOMATE = new Tomate();
	private static final Salade SALADE = new Salade();
	
	
    private Kebab kebabAgneau;
    private Kebab kebabVegetarien;
    private Kebab kebabCrevette;
    private Kebab kebabThon;
    
    @BeforeEach
    void preparerLesKebabs() {
        // Préparation du Kebab Agneau
        kebabAgneau = new Kebabier()
                .avec(new Salade())
                .avec(new Tomate())
                .avec(new Oignon())
                .avec(new Agneau())
                .avec(new Pain())
                .avec(new Sauce())
                .prepareLeKebab();

        // Préparation du Kebab Végétarien
        kebabVegetarien = new Kebabier()
                .avec(new Salade())
                .avec(new Tomate())
                .avec(new Oignon())
                .avec(new Pain())
                .avec(new Sauce())
                .prepareLeKebab();

        // Préparation du Kebab Crevette
        kebabCrevette = new Kebabier()
                .avec(new Crevette())
                .avec(new Salade()) // Autre ingrédient
                .avec(new Fromage()) // Ajout de fromage
                .avec(new Sauce())
                .avec(new Pain())
                .prepareLeKebab();

        // Préparation du Kebab Thon
        kebabThon = new Kebabier()
                .avec(new Thon())
                .avec(new Salade()) // Autre ingrédient
                .avec(new Fromage()) // Ajout de fromage
                .avec(new Sauce())
                .avec(new Pain())
                .prepareLeKebab();
    }
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
