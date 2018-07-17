package service;

import java.sql.Connection;

import dao.UserDao;
import model.User;

public class LoginService {

	private Connection connection = null;
	public LoginService() {
	}

	public User authenticate(String userId,String password) {
		UserDao dao = new UserDao();

		this.connection = dao.createConnection();
		User user = dao.findOne(userId, connection);
		dao.closeConnection(this.connection);

		this.connection = null;

		if(user == null) {
			return null;
		} else if(password.equals(user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}
}
