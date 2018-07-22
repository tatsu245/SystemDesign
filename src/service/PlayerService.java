package service;

import java.sql.Connection;

import dao.PlayerDao;
import model.Player;

public class PlayerService {

	private Connection connection = null;
	public PlayerService() {

	}

	public void createPlayer(Player player) {
		PlayerDao dao = new PlayerDao();

		this.connection = dao.createConnection();
		dao.create(player, connection);
		dao.closeConnection(connection);
		this.connection = null;
	}
}
