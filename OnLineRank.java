public class OnLineRank {

	public int calcRanks(int k, int[] a) {
		int N = a.length, sum = a.length;
		for (int i = 0; i < N; i++)
			for (int j = 1; j <= k && 0 <= i - j; j++)
				if (a[i] < a[i-j])
					sum++;
		return sum;
	}

}
