package service;

import java.sql.Connection;

import dao.ResultDao;
import model.Result;

public class ResultSearchService {

	private Connection connection = null;
	public ResultSearchService() {
	}

	public Result authenticate(String playerName,String tournamentName, String opponentName) {
		ResultDao dao = new ResultDao();

		this.connection = dao.createConnection();
		Result result = dao.findOne(playerName,tournamentName,opponentName,connection);
		dao.closeConnection(this.connection);

		this.connection = null;

		if(result == null) {
			return null;
		} else if(playerName.equals(result.getPlayer_name()) && tournamentName.equals(result.getTournament_name()) &&
				opponentName.equals(result.getOpponent_name())) {
			return result;
		} else {
			return null;
		}
	}
}
