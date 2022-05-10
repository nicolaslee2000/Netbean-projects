package DAO;

import controllers.UserController;

public class test02 {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO("recipe_admin_test", "a1234");
		UserController uctrl = new UserController();
	}
}
