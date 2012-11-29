public class Average {

	public int belowAvg(int[] math, int[] verbal) {
		int sum = 0, N = math.length;
		for (int n : math)
			sum += n;
		for (int n : verbal)
			sum += n;
		double avg = ((double)sum)/N;
		int c = 0;
		for (int i = 0; i < N; i++)
			if (math[i] + verbal[i] < avg)
				c++;
		return c;
	}

}
