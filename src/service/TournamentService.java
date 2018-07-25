package service;

import java.sql.Connection;
import java.util.List;

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

	public List<Tournament> getTournament() {
		TournamentDao dao = new TournamentDao();
		this.connection = dao.createConnection();
		List<Tournament> tournament = dao.findAll(connection);
		this.connection = null;
		return tournament;
	}

	public Tournament getTournament(int tournamentId) {
		TournamentDao dao = new TournamentDao();
		this.connection = dao.createConnection();
		Tournament tournament = new Tournament();
		tournament = dao.findOne(tournamentId, connection);
		this.connection = null;
		return tournament;
	}

}
