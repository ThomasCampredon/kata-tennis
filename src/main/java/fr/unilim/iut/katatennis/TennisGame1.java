package fr.unilim.iut.katatennis;

public class TennisGame1 {
	private Player player1; 
	private Player player2;
	private String score;


	public TennisGame1(String player1Name, String player2Name) {
		this.player1 = new Player(player1Name);
		this.player2 = new Player(player2Name);
		this.score = "";
	}


	public String getScore() {
		int tempScore = 0;
		if (thereIsEgality()) {
			score = scoreEgalite();
		} else if (aPlayerCanWin()) {
			int minusResult = player1.getScore() - player2.getScore();
			if (minusResult >= 1)
				score = "Advantage player1";
			else if (minusResult == -1)
				score = "Advantage player2";
			else if (minusResult >= 2)
				score = "Win for player1";
			else
				score = "Win for player2";
		} else {
			for (int i = 1; i < 3; i++) {
				if (i == 1)
					tempScore = player1.getScore();
				else {
					setScore(score+"-");
					tempScore = player1.getScore();
				}
				switch (tempScore) {
				case 0:
					setScore("Love");
					break;
				case 1:
					setScore("Fifteen");
					break;
				case 2:
					setScore("Thirty");
					break;
				case 3:
					setScore("Forty");
					break;
				}
			}
		}
		return score;
	}
	
	public void setScore(String scoreSentence) {
		this.score = scoreSentence;
	}


	private boolean thereIsEgality() {
		return player1.getScore() == player2.getScore();
	}

	

	private boolean aPlayerCanWin() {
		return player1.getScore() >= 4 || player2.getScore() >= 4;
	}

	
	private String scoreEgalite() {
		switch (player1.getScore()) {
		case 0:
			score = "Love-All";
			break;
		case 1:
			score = "Fifteen-All";
			break;
		case 2:
			score = "Thirty-All";
			break;
		default:
			score = "Deuce";
			break;
		}
		return score;
	}
}
