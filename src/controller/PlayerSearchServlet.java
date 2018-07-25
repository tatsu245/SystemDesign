package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Player;
import service.PlayerSearchService;

@WebServlet("/player/search")
public class PlayerSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PlayerSearchServlet() {
        super();
    }
//選手検索画面の表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/player/playerSearch.jsp");
		dispatcher.forward(request, response);
	}

//選手検索の処理を実行
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String playerName= request.getParameter("playerName");

		PlayerSearchService playerSearchService = new PlayerSearchService();
		Player player = playerSearchService.authenticate(playerName);

		if(player==null) {
			request.setAttribute("ERROR","選手が登録されていません");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/menu.jsp").forward(request, response);
		}else {
			request.setAttribute("player", player);
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/player/playerShow.jsp").forward(request, response);

			/*HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("/hazelabBBS/bbs");*/
		}

		/*Result result = new Result();
		result.setResult_date(resultDate);
		result.setCount(count);
		result.setMatch_place(matchPlace);
		result.setTournament_id(tournamentId);
		result.setOpponent_name(opponentName);
		result.setMatch_form(matchForm);
		ResultService ResultService = new ResultService();
		ResultService.createResult(result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result/resultSearch.jsp");
		dispatcher.forward(request, response);*/
	}

}
