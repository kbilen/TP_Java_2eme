package kebab;

import java.util.ArrayList;
import java.util.List;

public class Kebab {
	
    private List<Object> ingredients;

    public Kebab() {
        this.ingredients = new ArrayList<>();
    }

    public void ajouterIngredient(Object ingredient) {
        ingredients.add(ingredient);
    }

    public List<Object> listerLesIngredients() {
        return ingredients;
    }
}