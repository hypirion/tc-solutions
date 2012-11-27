public class KiloMan {

	public int hitsTaken(int[] pattern, String jumps) {
		int N = pattern.length;
		int sum = 0;
		for (int i = 0; i < N; i++)
			if (jumps.charAt(i) == 'J')
				if (pattern[i] <= 2)
					continue;
				else
					sum++;
			else
				if (pattern[i] <= 2)
					sum++;
				else
					continue;
		return sum;
	}

}
