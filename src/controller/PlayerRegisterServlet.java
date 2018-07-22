package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Player;
import model.User;
import service.PlayerService;

@WebServlet("/player/register")
public class PlayerRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PlayerRegisterServlet() {
        super();
    }
//プレーヤー作成画面の表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/player/playerRegister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String playerName = request.getParameter("playerName");
		String birthday = request.getParameter("birthday");
		String tall = request.getParameter("tall");
		String weight = request.getParameter("weight");
		String userId = request.getParameter("userId");
		String team = request.getParameter("team");
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");

		Player player = new Player();
		player.setPlayer_name(playerName);
		player.setDate(birthday);
		player.setTall(tall);
		player.setWeight(weight);
		player.setUser_id(user.getUser_id());
		player.setTeam(team);
		PlayerService PlayerService = new PlayerService();
		PlayerService.createPlayer(player);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/player/playerRegister.jsp");
		dispatcher.forward(request, response);
	}

}
