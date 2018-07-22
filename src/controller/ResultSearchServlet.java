package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Result;
import service.ResultSearchService;

@WebServlet("/result/search")
public class ResultSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ResultSearchServlet() {
        super();
    }
//戦績検索画面の表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result/resultSearch.jsp");
		dispatcher.forward(request, response);
	}

//戦績検索の処理を実行
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String playerName= request.getParameter("playerName");
		String tournamentName = request.getParameter("tournamentName");
		String opponentName = request.getParameter("opponentName");


		ResultSearchService resultSearchService = new ResultSearchService();

		Result result = resultSearchService.authenticate(playerName, tournamentName, opponentName);
		if(result==null) {
			request.setAttribute("ERROR","戦績が登録されていません");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		}else {

			getServletContext().getRequestDispatcher("/WEB-INF/jsp/result/resultShow.jsp").forward(request, response);

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
