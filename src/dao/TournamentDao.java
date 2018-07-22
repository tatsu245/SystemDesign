package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Tournament;
import utility.DriverAccsessor;

public class TournamentDao extends DriverAccsessor{

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

	public void create(Tournament tournament,Connection connection) {
		try {
			String sql = "insert into Tournament(tournament_name,start_date,end_date,place,user_id,participant) values (?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, tournament.getTournament_name());
			statement.setString(2, tournament.getStart_date());
			statement.setString(3, tournament.getEnd_date());
			statement.setString(4, tournament.getPlace());
			statement.setString(5, tournament.getUser_id());
			statement.setString(6, tournament.getParticipant());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
