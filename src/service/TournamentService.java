package service;

import java.sql.Connection;
import java.util.List;

import dao.TournamentDao;
import model.Relation;
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

	public Tournament getTournament(String tournamentName) {
		TournamentDao dao = new TournamentDao();
		this.connection = dao.createConnection();
		Tournament tournament = new Tournament();
		tournament = dao.findOne(tournamentName, connection);
		this.connection = null;
		return tournament;
	}

	/*public void createPlayerTournamentRelation(Tournament tournament) {
		TournamentDao dao = new TournamentDao();
		this.connection = dao.createConnection();
		dao.createRelation(tournament, connection);
		dao.closeConnection(connection);
		this.connection = null;
	}*/

	public List<Relation> getRelation(int tournamentId) {
		TournamentDao dao = new TournamentDao();
		this.connection = dao.createConnection();
		List<Relation> relation = dao.findAllRelation(tournamentId,connection);
		this.connection = null;
		return relation;
	}
}
