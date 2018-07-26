package service;

import java.sql.Connection;
import java.util.List;

import dao.RelationDao;
import model.Relation;

public class RelationService {

	private Connection connection = null;
	public RelationService() {

	}


	public List<Relation> getRelation(int tournamentId) {
		RelationDao dao = new RelationDao();
		this.connection = dao.createConnection();
		List<Relation> relation = dao.findAllRelation(tournamentId,connection);
		this.connection = null;
		return relation;
	}
}
