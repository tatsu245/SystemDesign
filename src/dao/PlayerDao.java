package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Player;
import utility.DriverAccsessor;

public class PlayerDao extends DriverAccsessor{

	public Player findOne(String playerName,Connection connection) {
		try {
			String sql = "select * from Player where player_name = ?";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, playerName);

			ResultSet rSet = statement.executeQuery();
			rSet.first();

			Player player = new Player();
			player.setPlayer_name(rSet.getString("player_name"));
			player.setDate(rSet.getString("birthday"));
			player.setTall(rSet.getString("tall"));
			player.setWeight(rSet.getString("weight"));
			player.setTeam(rSet.getString("team"));

			statement.close();
			rSet.close();

			return player;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

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
