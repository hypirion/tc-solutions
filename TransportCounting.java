public class TransportCounting {

	public int countBuses(int speed, int[] positions, int[] velocities, int time) {
		int N = positions.length;
		boolean[] met = new boolean[N];
		for (int i = 0; i < N; i++)
			if (positions[i] == 0)
				met[i] = true;
		for (int i = 0; i < N; i++)
			positions[i] -= time*(speed-velocities[i]);
		int sum = 0;
		for (int i = 0; i < N; i++)
			if (positions[i] <= 0 || met[i])
				sum++;
		return sum;
	}

}
