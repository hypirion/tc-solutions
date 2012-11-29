public class MovingAverages {

	public int[] calculate(String[] times, int n) {
		int N = times.length, avgCount = N - n + 1;
		int[] avgs = new int[avgCount];
		for (int i = 0; i < avgCount; i++){
			int sum = 0;
			for (int j = 0; j < n; j++){
				String[] split = times[i+j].split(":",-1);
				int time = Integer.parseInt(split[0], 10) * 60 * 60 +
						   Integer.parseInt(split[1], 10) * 60 +
						   Integer.parseInt(split[2], 10);
				sum += time;
			}
			avgs[i] = sum/n;
		}
		return avgs;
	}

}
