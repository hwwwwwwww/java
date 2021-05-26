
public class ScoreKeeper {
	private int scoreTeamA;
	private int scoreTeamB;
	
	public ScoreKeeper() {
		this.scoreTeamA=0;
		this.scoreTeamB=0;
	}

	public void scoreTeamA1() {
		this.scoreTeamA+=1;
	}
	public void scoreTeamA2() {
		this.scoreTeamA+=2;
	}
	public void scoreTeamA3() {
		this.scoreTeamA+=3;
	}
	public void scoreTeamB1() {
		this.scoreTeamB+=1;
	}
	public void scoreTeamB2() {
		this.scoreTeamB+=2;
	}
	public void scoreTeamB3() {
		this.scoreTeamB+=3;
	}
	public String getScore() {
		return String.format("%03d", this.scoreTeamA)+":" + 
	    String.format("%03d", this.scoreTeamB);
		
	}

}
