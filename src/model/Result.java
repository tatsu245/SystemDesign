package model;

public class Result {
	private int result_id;
	private String player_name;
	private String result_date;
	private String count;
	private String match_place;
	private String tournament_name;
	private String opponent_name;
	private String match_form;



	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getResult_date() {
		return result_date;
	}

	public void setResult_date(String result_date) {
		this.result_date = result_date;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getMatch_place() {
		return match_place;
	}

	public void setMatch_place(String match_place) {
		this.match_place = match_place;
	}

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public String getOpponent_name() {
		return opponent_name;
	}

	public void setOpponent_name(String opponent_name) {
		this.opponent_name = opponent_name;
	}

	public String getMatch_form() {
		return match_form;
	}

	public void setMatch_form(String match_form) {
		this.match_form = match_form;
	}

	public Result(int result_id, String result_date, int count, String match_place, int tournament_id,
			String opponent_name, String match_form) {
	}

	public Result() {
	}


}