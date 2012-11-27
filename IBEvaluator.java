public class IBEvaluator {

	public int[] getSummary(int[] p, int[] a) {
		int N = p.length;
		int[] sum = new int[7];
		for (int i = 0; i < N; i++)
			sum[Math.abs(p[i]-a[i])]++;
		for (int i = 0; i < 7; i++)
			sum[i] = (sum[i] * 100) / N;
		return sum;
	}

}
