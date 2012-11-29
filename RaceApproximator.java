public class RaceApproximator {

	public String timeToBeat(int d1, int t1, int d2, int t2, int d3) {
		int t3 = (int) (t1 * Math.exp(Math.log(t2/(double)t1)*Math.log(d1/(double)d3)/Math.log(d1/(double)d2)));
		return String.format("%d:%02d:%02d", t3 / (60*60), (t3/60)%60, t3%60);
	}

}
