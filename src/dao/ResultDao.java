package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Result;
import utility.DriverAccsessor;

public class ResultDao extends DriverAccsessor{

	public Result findOne(String playerName,String tournamentName,String opponentName,Connection connection) {
		try {
			String sql = "select * from Result where player_name and tournament_name and opponentName= ?";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, playerName);
			statement.setString(2, tournamentName);
			statement.setString(3, opponentName);

			ResultSet rSet = statement.executeQuery();
			rSet.first();

			Result result = new Result();
			result.setResult_id(rSet.getInt("result_id"));
			result.setPlayer_name(rSet.getString("player_name"));
			result.setTournament_name(rSet.getString("tournament_name"));
			result.setOpponent_name(rSet.getString("opponent_name"));

			statement.close();
			rSet.close();

			return result;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void create(Result result,Connection connection) {
		try {
			String sql = "insert into Result(player_name,result_date,tournament_name,count,match_place,opponent_name,match_form) values (?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, result.getPlayer_name());
			statement.setString(2, result.getResult_date());
			statement.setString(3, result.getTournament_name());
			statement.setString(4, result.getCount());
			statement.setString(5, result.getMatch_place());
			statement.setString(6, result.getOpponent_name());
			statement.setString(7, result.getMatch_form());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
