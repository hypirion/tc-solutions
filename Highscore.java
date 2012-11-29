public class Highscore {

	public int getRank(int[] scores, int newscore, int places) {
		int N = scores.length;
		int[] pos = new int[N];
		int prev = -1;
		for (int i = 0; i < N; i++)
			if (prev != scores[i]){
				prev = scores[i];
				pos[i] = i+1;
			}
			else 
				pos[i] = pos[i-1];
		for (int i = 0; i < N; i++)
			if (scores[i] < newscore)
				if (i == 0)
					return 1;
				else if (scores[i-1] == newscore)
					return pos[i-1];
				else
					return pos[i];
		if (N < places) {
			if (0 < N && scores[N-1] == newscore)
				return pos[N-1];
			else
				return N+1;
		}
		return -1;
	}

}
