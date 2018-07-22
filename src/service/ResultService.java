package service;

import java.sql.Connection;

import dao.ResultDao;
import model.Result;

public class ResultService {

	private Connection connection = null;
	public ResultService() {

	}

	public void createResult(Result result) {
		ResultDao dao = new ResultDao();

		this.connection = dao.createConnection();
		dao.create(result, connection);
		dao.closeConnection(connection);
		this.connection = null;
	}
}
