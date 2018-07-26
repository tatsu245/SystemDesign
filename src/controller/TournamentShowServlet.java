package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tournament;
import service.TournamentService;

@WebServlet("/tournament/show")
public class TournamentShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TournamentShowServlet() {
        super();
    }

//大会一覧画面の表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TournamentService tournamentService = new TournamentService();
		List<Tournament> tournament = tournamentService.getTournament();

		request.setAttribute("tournament", tournament);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/tournament/tournamentShow.jsp");
		dispatcher.forward(request, response);
	}

//大会出場者の一覧の作成・表示
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		TournamentService tournamentService = new TournamentService();

		//Tournament tournament = tournamentService.getTournament(request.getParameter("id"));
		//tournamentService.createPlayerTournamentRelation(tournament);

		int id = Integer.parseInt(request.getParameter("id"));

		List<model.Relation> relation = tournamentService.getRelation(id);

		request.setAttribute("relation", relation);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/tournament/participantsListShow.jsp?id=id");
		dispatcher.forward(request, response);
	}

}
