public class BlockTower {

	public int getTallest(int[] a) {
		int N = a.length;
		int best = -1;
		for (int n = 0; n <= N; n++){
			int cur = 0;
			for (int i = 0; i < n; i++)
				if ((a[i] & 1) == 0)
					cur += a[i];
			for (int i = n; i < N; i++)
				if ((a[i] & 1) == 1)
					cur += a[i];
			best = Math.max(best, cur);
		}
		return best;
	}

}
