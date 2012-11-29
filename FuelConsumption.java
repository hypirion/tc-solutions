public class FuelConsumption {

	public double maximalDistance(int[] velocities, int[] consumptions, int fuel) {
		int N = velocities.length;
		double max = 0;
		for (int i = 0; i < N; i++)
			max = Math.max(max, velocities[i]*fuel/((double)consumptions[i]));
		return max;
	}

}
