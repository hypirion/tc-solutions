public class Workshop {

	public int pictureFrames(int[] p) {
		int N = p.length;
		int c = 0;
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				for (int k = 0; k < N; k++){
					if (i != j && j != k && k != i &&
						p[i] + p[j] > p[k] &&
					    p[i] + p[k] > p[j] &&
					    p[k] + p[j] > p[i])
						c++;
				}
			}
		}
		return c/6;
	}

}
