package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Player;
import utility.DriverAccsessor;

public class PlayerDao extends DriverAccsessor{

	/*public User findOne(String userId,Connection connection) {
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
	}*/

	public void create(Player player,Connection connection) {
		try {
			String sql = "insert into Player(player_name,birthday,tall,weight,user_id,team) values (?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, player.getPlayer_name());
			statement.setString(2, player.getDate());
			statement.setString(3, player.getTall());
			statement.setString(4, player.getWeight());
			statement.setString(5, player.getUser_id());
			statement.setString(6, player.getTeam());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
