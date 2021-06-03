
public class Score implements Scoreable {
	private int score;
	public Score(int score) throws IllegalArgumentException {
		if(score<0) {
			throw new IllegalArgumentException("score négatif");
		}
		this.score=score;
	}
	@Override
	public int getScore() {
		return this.score;
	}
	@Override
	public void one() {
		this.score+=1;
	}
	@Override
	public void two() {
		this.score+=2;
	}
	@Override
	public void three() {
		this.score+=3;
	}

}
