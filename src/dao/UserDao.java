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
			String sql = "select * from users where user_id = ?";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userId);

			ResultSet rSet = statement.executeQuery();
			rSet.first();

			User user = new User();
			user.setUser_name(rSet.getString("user_name"));
			user.setPassword(rSet.getString("password"));
			user.setUser_id(rSet.getString("user_id"));
			user.setStudent_number(rSet.getString("student_number"));

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
			String sql = "insert into users(user_id,user_name,password,student_number) values (?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, user.getUser_id());
			statement.setString(2, user.getUser_name());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getStudent_number());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
