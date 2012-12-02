public class Straights {

	public int howMany(int[] hand, int k) {
		int sum = 0, N = hand.length;
		for (int i = 0; i <= N-k; i++){
			int max = 1;
			for (int j = 0; j < k; j++)
				max *= hand[i+j];
			sum += max;
		}
		return sum;
	}

}
