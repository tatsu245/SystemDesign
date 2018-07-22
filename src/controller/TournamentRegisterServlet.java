package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Tournament;
import model.User;
import service.TournamentService;

@WebServlet("/tournament/register")
public class TournamentRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TournamentRegisterServlet() {
        super();
    }
//トーナメント登録画面の表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/tournament/tournamentRegister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String tournamentName = request.getParameter("tournamentName");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		String place = request.getParameter("place");
		//String userId = request.getParameter("userId");
		String participant = request.getParameter("participant");

		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");

		Tournament tournament = new Tournament();
		tournament.setTournament_name(tournamentName);
		tournament.setStart_date(startDate);
		tournament.setEnd_date(endDate);
		tournament.setPlace(place);

		tournament.setUser_id(user.getUser_id());
		tournament.setParticipant(participant);
		
		TournamentService TournamentService = new TournamentService();
		TournamentService.createTournament(tournament);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/tournament/tournamentRegister.jsp");
		dispatcher.forward(request, response);
	}

}
