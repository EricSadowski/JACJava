// Eric Sadowski  2338165
public class DRPlayer {

	int points;
	int d1;
	int d2;

	
	  
	  public int roll() {
	  
	  d1 = (int) Math.floor(Math.random() * 6 + 1);
	  d2 = (int) Math.floor(Math.random() * 6 + 1);
	  return d1 + d2;
	  }
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public DRPlayer(int points) {

		this.points = points;
	}

}
