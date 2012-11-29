public class Medici {

	public int winner(int[] fame, int[] fortune, int[] secrets) {
		int best = -1, besti = -1, N = fame.length;
		boolean dup = false;
		for (int i = 0; i < N; i++){
			int min = Math.min(Math.min(fame[i], fortune[i]), secrets[i]);
			if (best < min) {
				besti = i;
				best = min;
				dup = false;
			}
			else if (best == min)
				dup = true;
		}
		if (dup)
			return -1;
		else
			return besti;
	}

}
