public class ComputationalComplexity {

	public int fastestAlgo(int[] constant, int[] power, int[] logPower, int N) {
		int M = constant.length;
		double[] d = new double[M];
		for (int i = 0; i < M; i++)
			d[i] = constant[i]*Math.pow(N,power[i])*Math.pow(Math.log(N),logPower[i]);
		double m = Double.MAX_VALUE;
		for (double dd : d)
			if (m > dd)
				m = dd;
		for (int i = 0; i < M; i++)
			if (d[i] == m)
				return i;
		return -1;
	}

}
