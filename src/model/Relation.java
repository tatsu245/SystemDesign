package model;

public class Relation {
	private int tournament_id;
	private String tournament_name;
	private int player_id;
	private String player_name;
	private String team;

	public int getTournament_id() {
		return tournament_id;
	}
	public void setTournament_id(int tournament_id) {
		this.tournament_id = tournament_id;
	}
	public String getTournament_name() {
		return tournament_name;
	}
	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	public Relation(int tournament_id, String tournament_name, int player_id, String player_name, String team) {
	}

	public Relation() {
	}

}