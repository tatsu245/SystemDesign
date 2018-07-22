package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Result;
import service.ResultService;

@WebServlet("/result/register")
public class ResultRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ResultRegisterServlet() {
        super();
    }
//戦績検索画面の表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result/resultRegister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String playerName = request.getParameter("playerName");
		String resultDate = request.getParameter("resultDate");
		String tournamentName = request.getParameter("tournamentName");
		String count = request.getParameter("count");
		String matchPlace = request.getParameter("matchPlace");
		String opponentName = request.getParameter("opponentName");
		String matchForm = request.getParameter("matchForm");

		Result result = new Result();
		result.setPlayer_name(playerName);
		result.setResult_date(resultDate);
		result.setTournament_name(tournamentName);
		result.setCount(count);
		result.setMatch_place(matchPlace);
		result.setOpponent_name(opponentName);
		result.setMatch_form(matchForm);
		ResultService ResultService = new ResultService();
		ResultService.createResult(result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result/resultRegister.jsp");
		dispatcher.forward(request, response);
	}

}
