package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import DTO.RecipeDTO;
import DTO.Recipe_likeDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecipeDAO extends DAO{

	public RecipeDAO(String username, String password) {
		super(username, password);
	}
	
	//Strong entities
	public void setIngredient(String name, double calPg) {
		updateTable("INSERT INTO ingredients(ingredient_name, calories_per_g) "
				+ "VALUES(?,?,?)", e -> {
					try {
						e.setString(1, name);
						e.setDouble(2, calPg);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				});
	}
	
	public void setIngredient(String name, double calPg, int gPingredient) {
		updateTable("INSERT INTO ingredients(ingredient_name, calories_per_g, gram_per_ingredient) "
				+ "VALUES(?,?,?)", e -> {
					try {
						e.setString(1, name);
						e.setDouble(2, calPg);
						e.setInt(3, gPingredient);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				});
	}
	
	public void setUnit(String unitname, int gPunit) {
		updateTable("INSERT INTO units VALUES(?,?)", e -> {
			try {
				e.setString(1, unitname);
				e.setInt(2, gPunit);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public void setRecipe(String name, String user_id, String recipe_content, Date published_date, int difficulty, int cost, int servings, String cooktime) {
		updateTable("INSERT INTO recipes(recipe_name, user_id, recipe_content, published_date, difficulty, cost, servings, cook_time)"
				+ " VALUES(?,?,?,?,?,?,?,?)", e -> {
					try {
						e.setString(1, name);
						e.setString(2, user_id);
						e.setString(3, recipe_content);
						e.setDate(4, published_date);
						e.setInt(5, difficulty);
						e.setInt(6, cost);
						e.setInt(7, servings);
						e.setString(8, cooktime);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				});
	}
	
	public void setCategory(String name) {
		updateTable("INSERT INTO categories VALUES("+name+")");
	}
	
	public int getRecipeId(String name, String user_id) {
		int recipe_id = ((RecipeDTO) readContent("SELECT recipe_id FROM recipes WHERE recipe_name = ? AND user_id = ?", e -> {
			try {
				e.setString(1, name);
				e.setString(2, user_id);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}, RecipeDTO.class).get(0)).getRecipe_id();
		return recipe_id;
	}

	
	//weak entities
	public void setRecipeIngredient(int recipe_id, String ingredient_name, int amount, String unit_name) {
		updateTable("INSERT INTO recipe_ingredients VALUES(?,?,?,?)", e -> {
			try {
				e.setInt(1, recipe_id);
				e.setString(2, ingredient_name);
				e.setInt(3, amount);
				e.setString(4, unit_name);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public void setRecipe_category(int recipe_id, String category_name) {
		updateTable("INSERT INTO recipe_categories VALUES(?,?)", e -> {
			try {
				e.setInt(1, recipe_id);
				e.setString(2, category_name);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
	}
	
	//reading content
	public List<RecipeDTO> getRecipes() {
		return readContent("SELECT * FROM recipes", RecipeDTO.class);
	}
        
                  public int getLikeCnt(int recipe_id) {
                           int cnt = readContent("SELECT * FROM recipe_likes WHERE recipe_id = ?", e -> {
                               try {
                                   e.setInt(1, recipe_id);
                               } catch (SQLException ex) {
                               }
                           }, Recipe_likeDTO.class).size();
                           return cnt;
                  }
	
}