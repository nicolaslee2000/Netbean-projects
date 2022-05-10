package DTO;

public class IngredientDTO {

	private int ingredient_id;
	private String ingredient_name;
	private double calories_per_g;
	private double gram_per_ingredient;
	private Recipe_IngredientDTO recipe_ingredientDTO;
	
	public IngredientDTO() {
	}
	public int getIngredient_id() {
		return ingredient_id;
	}
	public void setIngredient_id(int ingredient_id) {
		this.ingredient_id = ingredient_id;
	}
	public String getIngredient_name() {
		return ingredient_name;
	}
	public void setIngredient_name(String ingredient_name) {
		this.ingredient_name = ingredient_name;
	}
	public double getCalories_per_g() {
		return calories_per_g;
	}
	public void setCalories_per_g(double calories_per_g) {
		this.calories_per_g = calories_per_g;
	}
	public double getGram_per_ingredient() {
		return gram_per_ingredient;
	}
	public void setGram_per_ingredient(double gram_per_ingredient) {
		this.gram_per_ingredient = gram_per_ingredient;
	}
	public Recipe_IngredientDTO getRecipe_ingredientDTO() {
		return recipe_ingredientDTO;
	}
	public void setRecipe_ingredientDTO(Recipe_IngredientDTO recipe_ingredientDTO) {
		this.recipe_ingredientDTO = recipe_ingredientDTO;
	}
	

}
