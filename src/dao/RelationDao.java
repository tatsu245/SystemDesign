package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Tournament;
import utility.DriverAccsessor;

public class RelationDao extends DriverAccsessor{



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

	/*public void createRelation(Tournament tournament,Connection connection) {
		try {
			String sql = "";

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
	}*/


	public List<model.Relation> findAllRelation(Connection connection) {
		try {
			String sql = "\"select * from Tournament innner join Result on Tournament.tournament_name = Result.tournament_name "
					+ "inner join Player on Result.player_name = Player.player_name where tournament_id = ?";

			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			List<model.Relation> relationList = new ArrayList<model.Relation>();

			while(resultSet.next()) {
				model.Relation relation = new model.Relation();
				relation.setTournament_id(resultSet.getInt("tournament_id"));
				relation.setTournament_name(resultSet.getString("tournament_name"));
				relation.setPlayer_id(resultSet.getInt("player_id"));
				relation.setPlayer_name(resultSet.getString("player_name"));
				relation.setTeam(resultSet.getString("team"));

				relationList.add(relation);
			}
			statement.close();
			resultSet.close();

			return relationList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}


	public Tournament findOne(int tournamentId,Connection connection) {
		try {
			String sql = "select * from Tournament where tournament_id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, tournamentId);

			ResultSet resultSet = statement.executeQuery();
			resultSet.first();
			Tournament tournament = new Tournament();

			tournament.setTournament_id(resultSet.getInt("tournament_id"));
			tournament.setTournament_name(resultSet.getString("tournament_name"));
			tournament.setStart_date(resultSet.getString("start_date"));
			tournament.setEnd_date(resultSet.getString("end_date"));
			tournament.setPlace(resultSet.getString("place"));
			tournament.setUser_id(resultSet.getString("user_id"));
			tournament.setParticipant(resultSet.getString("participant"));

			statement.close();
			resultSet.close();
			return tournament;
		} catch (SQLException e) {
			return null;
		}
	}

	public Tournament findOne(String tournamentName,Connection connection) {
		try {
			String sql = "select * from Tournament where tournament_name = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, tournamentName);

			ResultSet resultSet = statement.executeQuery();
			resultSet.first();
			Tournament tournament = new Tournament();

			tournament.setTournament_id(resultSet.getInt("tournament_id"));
			tournament.setTournament_name(resultSet.getString("tournament_name"));
			tournament.setStart_date(resultSet.getString("start_date"));
			tournament.setEnd_date(resultSet.getString("end_date"));
			tournament.setPlace(resultSet.getString("place"));
			tournament.setUser_id(resultSet.getString("user_id"));
			tournament.setParticipant(resultSet.getString("participant"));

			statement.close();
			resultSet.close();
			return tournament;
		} catch (SQLException e) {
			return null;
		}
	}
}
