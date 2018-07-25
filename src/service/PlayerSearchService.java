package service;

import java.sql.Connection;

import dao.PlayerDao;
import model.Player;

public class PlayerSearchService {

	private Connection connection = null;
	public PlayerSearchService() {
	}

	public Player authenticate(String playerName) {
		PlayerDao dao = new PlayerDao();

		this.connection = dao.createConnection();
		Player player = dao.findOne(playerName,connection);
		dao.closeConnection(this.connection);

		this.connection = null;

		if(player == null) {
			return null;
		} else if(playerName.equals(player.getPlayer_name())) {
			return player;
		} else {
			return null;
		}
	}
}
