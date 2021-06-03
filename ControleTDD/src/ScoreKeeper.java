public class ScoreKeeper {
	Scoreable teamA;
	Scoreable teamB;
	
	
	public ScoreKeeper() {
		this.teamA = new Score(0);
		this.teamB = new Score(0);
	}

	public void scoreTeamA1() {
		teamA.one();
	}
	public void scoreTeamA2() {
		teamA.two();
	}
	public void scoreTeamA3() {
		teamA.three();
	}
	public void scoreTeamB1() {
		teamB.one();
	}
	public void scoreTeamB2() {
		teamB.two();
	}
	public void scoreTeamB3() {
		teamB.three();
	}
	public String getScore() {
		return formatScore();
		 
	}
	public int getScoreTeamA() {
		return teamA.getScore();
	}
	public int getScoreTeamB() {
		return teamB.getScore();
	}	
		

	private String formatScore() {
		return String.format("%03d", getScoreTeamA())+":" + 
			    String.format("%03d", getScoreTeamB());
	}
}
