package service;

import java.sql.Connection;

import dao.TournamentDao;
import model.Tournament;

public class TournamentService {

	private Connection connection = null;
	public TournamentService() {

	}

	public void createTournament(Tournament tournament) {
		TournamentDao dao = new TournamentDao();

		this.connection = dao.createConnection();
		dao.create(tournament, connection);
		dao.closeConnection(connection);
		this.connection = null;
	}
}
