package controllers;

import java.util.InputMismatchException;
import java.util.List;

import DAO.RecipeDAO;
import DAO.UserDAO;
import DTO.RecipeDTO;
import DTO.UserDTO;

public class UserController extends Controller{
	private UserDAO userdao;
	private RecipeDAO recipedao;
	public UserController() {
		userdao = new UserDAO("recipe_admin_test", "a1234");
		recipedao = new RecipeDAO("recipe_admin_test", "a1234");
	}
	
	public boolean authenticate(String id, String password) {
		return userdao.checkUser(id, password);
	}
	
	public void createUser(String id, String password, String email, String language) throws InputMismatchException{
		userdao.createUser(id, password, email, language);
	}
	
	public List<RecipeDTO> getRecipes() {
		return recipedao.getRecipes();
	}
	
	public int getLikeCnt(int recipe_id) {
                        return recipedao.getLikeCnt(recipe_id);
                    }
}
