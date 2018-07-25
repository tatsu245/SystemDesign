package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public List<Tournament> findAll(Connection connection) {
		try {
			String sql = "select * from Tournament";

			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			List<Tournament> tournamentList = new ArrayList<Tournament>();

			while(resultSet.next()) {
				Tournament tournament = new Tournament();
				tournament.setTournament_id(resultSet.getInt("tournament_id"));
				tournament.setTournament_name(resultSet.getString("tournament_name"));
				tournament.setStart_date(resultSet.getString("start_date"));
				tournament.setEnd_date(resultSet.getString("end_date"));
				tournament.setPlace(resultSet.getString("place"));
				tournament.setUser_id(resultSet.getString("user_id"));
				tournament.setParticipant(resultSet.getString("participant"));

				tournamentList.add(tournament);
			}
			statement.close();
			resultSet.close();

			return tournamentList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Tournament findOne(int tournamentId,Connection connection) {
		try {
			String sql = "select * from bbs where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, tournamentId);

			ResultSet resultSet = statement.executeQuery();
			resultSet.first();
			Tournament tournament = new Tournament();

			tournament.setTournament_id(resultSet.getInt("tournament_id"));
			tournament.setTournament_name(resultSet.getString("title"));
			tournament.setStart_date(resultSet.getString("description"));
			tournament.setEnd_date(resultSet.getString(""));
			tournament.setPlace(resultSet.getString(""));
			tournament.setUser_id(resultSet.getString("updated_at"));
			tournament.setParticipant(resultSet.getString(""));

			statement.close();
			resultSet.close();
			return tournament;
		} catch (SQLException e) {
			return null;
		}
	}
}
