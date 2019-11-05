package fr.unilim.iut.katatennis;

public class Player {
	private int scorePlayer;
	private String PlayerName;
	
	public Player(String PlayerName) {
		this.scorePlayer = 0;
		this.PlayerName = PlayerName;
	}

	public int getScorePlayer() {
		return scorePlayer;
	}

	public void setScorePlayer(int scorePlayer) {
		this.scorePlayer = scorePlayer;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	
	
}
