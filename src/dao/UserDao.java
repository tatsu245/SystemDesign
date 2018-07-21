package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import utility.DriverAccsessor;

public class UserDao extends DriverAccsessor{

	public User findOne(String userId,Connection connection) {
		try {
			String sql = "select * from User where user_id = ?";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userId);

			ResultSet rSet = statement.executeQuery();
			rSet.first();

			User user = new User();
			user.setUser_id(rSet.getString("user_id"));
			user.setUser_name(rSet.getString("user_name"));
			user.setStudent_number(rSet.getString("student_number"));
			user.setPassword(rSet.getString("password"));

			statement.close();
			rSet.close();

			return user;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void create(User user,Connection connection) {
		try {
			String sql = "insert into User(user_id,user_name,student_number,password) values (?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, user.getUser_id());
			statement.setString(2, user.getUser_name());
			statement.setString(3, user.getStudent_number());
			statement.setString(4, user.getPassword());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
