package kebab;


public class Kebabier {
	
	private Kebab kebab;
	
	public Kebabier() {
	    this.kebab = new Kebab();
	}
	 
	public Kebab prepareLeKebab() {
	    return kebab;
	}
	
    public Kebabier avec(Object ingredient) {
        kebab.ajouterIngredient(ingredient);
        return this;
    }

}