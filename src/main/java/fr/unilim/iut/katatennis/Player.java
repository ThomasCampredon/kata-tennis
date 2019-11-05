package fr.unilim.iut.katatennis;

public class Player {
	private int score;
	private String PlayerName;
	
	public Player(String PlayerName) {
		this.score = 0;
		this.PlayerName = PlayerName;
	}
	
	public Player(String PlayerName, int score) {
		this.score = score;
		this.PlayerName = PlayerName;
	}
	
	public void wonPoint() {
		this.score+=1;
	}
	
	

	
	

	public int getScore() {
		return score;
	}

	public void setScore(int scorePlayer) {
		this.score = scorePlayer;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	
	
}
