public class Soccer {

	public int maxPoints(int[] wins, int[] ties) {
		int max = 0;
		for (int i = 0; i < wins.length; i++)
			max = Math.max(max, wins[i]*3+ties[i]);
		return max;
	}

}
